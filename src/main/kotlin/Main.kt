fun main() {
    println(sumNUm(listOf()

// val cities = listOf("New York","Durban","Dublin","Pretoria")
//    println(cities)
//
//
//    val friends = mutableListOf("Hawa","Hannah","Mary","Glory","Amanda")
//    println(friends)
//    friends.add("Mutava")
//    friends.add("Pearl")
//    friends.add("Casey")
//    friends.add("Christine")
//    friends.add("Kur")
//    friends.addAll(listOf("Abraham","Philip","Nduta","Adam"))
//    println(friends)
//
//    friends.remove("Abraham")
////    println(friends)
//    friends.removeAt(10)
//    println(friends)
//    println(friends[10])
}

//Write a function that takes in a list of 5 integers
//and returns the sum of the element at odd indices

fun sumOfNumber(numbers: List<Int>): Int {
    var result = 0
    for (x in numbers.indices) {
        if (x % 2 != 0) {
            result += numbers[x]
        }
    }
    return result
}


fun sumNUm(number: List<Int>): Int {
    var num1 = number.get(1)
    var num2 = number.get(3)
    var sum = num1 + num2
    return sum
}

fun oddNum(number: List<Int>){
}

fun oddIdxSum(nums: List<Int>): Unit = Unit