package task;

import java.util.Scanner;

public class dom2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Imput number:");
        int number = scanner.nextInt();

        String result = number % 5 <= 0? "Even" : "Odd";
        System.out.println("The number is:" +result);

    }
}
