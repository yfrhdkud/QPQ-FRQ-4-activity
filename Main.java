import java.util.Scanner;

public class Main {
        public int[] removeDuplicates(int[] arr){
            int[] result = new int[arr.length];
            int index = 0;

            for(int i = 0; i < arr.length;i++){
                boolean duplicate = false;

                for(int j = 0; j < index; j++){
                    if (arr[i] == result[j]) {
                        duplicate  =true;
                        break;
                    }
                }
                
                if (!duplicate) {
                    result[index] = arr[i];
                    index++;
                }
            }

            int[] trimmedResult = new int[index];
            for(int i = 0; i<index;i++){
                trimmedResult[i] = result[i];
            }
            return trimmedResult;
        }

        public static void main(String[] args) {
            try(Scanner scan = new Scanner(System.in)){
                System.out.print("Enter the number of elements: ");
                int n = scan.nextInt();

                int[] arr = new int[n];

                System.out.println("Enter the elements: ");
                for(int i = 0; i < n; i++){
                    arr[i] = scan.nextInt();
                }

                Main obj = new Main();
                int[] result = obj.removeDuplicates(arr);
                
                System.out.println("Array after removing duplicate elements: ");
                for(int value :  result){
                    System.out.print(value + " ");
                }
            }
        }
}
