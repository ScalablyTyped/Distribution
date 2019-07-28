package typings.atAntDashDesignColors.libMod

import org.scalablytyped.runtime.NumberDictionary
import typings.atAntDashDesignColors.atAntDashDesignColorsNumbers.`0`
import typings.atAntDashDesignColors.atAntDashDesignColorsNumbers.`1`
import typings.atAntDashDesignColors.atAntDashDesignColorsNumbers.`2`
import typings.atAntDashDesignColors.atAntDashDesignColorsNumbers.`3`
import typings.atAntDashDesignColors.atAntDashDesignColorsNumbers.`4`
import typings.atAntDashDesignColors.atAntDashDesignColorsNumbers.`5`
import typings.atAntDashDesignColors.atAntDashDesignColorsNumbers.`6`
import typings.atAntDashDesignColors.atAntDashDesignColorsNumbers.`7`
import typings.std.Anon_CopyWithin
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/colors/lib", "purple")
@js.native
object purple extends /* n */ NumberDictionary[String] {
  /** Iterator */
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[String]] = js.native
  /**
    * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
    */
  var length: Double = js.native
  var primary: js.UndefOr[String] = js.native
  /**
    * Returns an object whose properties have the value 'true'
    * when they will be absent when used in a 'with' statement.
    */
  @JSName(scala.scalajs.js.Symbol.unscopables)
  var unscopables: js.Function0[Anon_CopyWithin] = js.native
  /**
    * Combines two or more arrays.
    * @param items Additional items to add to the end of array1.
    */
  def concat(items: (js.Array[String] | String)*): js.Array[String] = js.native
  /**
    * Returns the this object after copying a section of the array identified by start and end
    * to the same array starting at position target
    * @param target If target is negative, it is treated as length+target where length is the
    * length of the array.
    * @param start If start is negative, it is treated as length+start. If end is negative, it
    * is treated as length+end.
    * @param end If not specified, length of the this object is used as its default value.
    */
  def copyWithin(target: Double, start: Double): this.type = js.native
  def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
  /**
    * Returns an iterable of key, value pairs for every entry in the array
    */
  def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
  /**
    * Determines whether all the members of an array satisfy the specified test.
    * @param callbackfn A function that accepts up to three arguments. The every method calls the callbackfn function for each element in array1 until the callbackfn returns false, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def every(callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
  def every(
    callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
    thisArg: js.Any
  ): Boolean = js.native
  /**
    * Returns the this object after filling the section identified by start and end with value
    * @param value value to fill array section with
    * @param start index to start filling the array at. If start is negative, it is treated as
    * length+start where length is the length of the array.
    * @param end index to stop filling the array at. If end is negative, it is treated as
    * length+end.
    */
  def fill(value: String): this.type = js.native
  def fill(value: String, start: Double): this.type = js.native
  def fill(value: String, start: Double, end: Double): this.type = js.native
  /**
    * Returns the elements of an array that meet the condition specified in a callback function.
    * @param callbackfn A function that accepts up to three arguments. The filter method calls the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def filter(callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): js.Array[String] = js.native
  def filter(
    callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
    thisArg: js.Any
  ): js.Array[String] = js.native
  /**
    * Returns the elements of an array that meet the condition specified in a callback function.
    * @param callbackfn A function that accepts up to three arguments. The filter method calls the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  @JSName("filter")
  def filter_S_String[S /* <: String */](
    callbackfn: js.Function3[
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      /* is S */ Boolean
    ]
  ): js.Array[S] = js.native
  @JSName("filter")
  def filter_S_String[S /* <: String */](
    callbackfn: js.Function3[
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      /* is S */ Boolean
    ],
    thisArg: js.Any
  ): js.Array[S] = js.native
  def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): js.UndefOr[String] = js.native
  def find(
    predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _],
    thisArg: js.Any
  ): js.UndefOr[String] = js.native
  /**
    * Returns the value of the first element in the array where predicate is true, and undefined
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found, find
    * immediately returns that element value. Otherwise, find returns undefined.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def find[S /* <: String */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ String, 
      /* index */ Double, 
      /* obj */ js.Array[String], 
      /* is S */ Boolean
    ]
  ): js.UndefOr[S] = js.native
  def find[S /* <: String */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ String, 
      /* index */ Double, 
      /* obj */ js.Array[String], 
      /* is S */ Boolean
    ],
    thisArg: js.Any
  ): js.UndefOr[S] = js.native
  /**
    * Returns the index of the first element in the array where predicate is true, and -1
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found,
    * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): Double = js.native
  def findIndex(
    predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _],
    thisArg: js.Any
  ): Double = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth. If no depth is provided, flat method defaults to the depth of 1.
    *
    * @param depth The maximum recursion depth
    */
  def flat[U](): js.Array[_] = js.native
  def flat[U](depth: Double): js.Array[_] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  def flat[U](`this`: js.Array[js.Array[U]]): js.Array[U] = js.native
  /**
    * Calls a defined callback function on each element of an array. Then, flattens the result into
    * a new array.
    * This is identical to a map followed by flat with depth 1.
    *
    * @param callback A function that accepts up to three arguments. The flatMap method calls the
    * callback function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callback function. If
    * thisArg is omitted, undefined is used as the this value.
    */
  def flatMap[U, This](
    callback: js.ThisFunction3[
      /* this */ This, 
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      U | js.Array[U]
    ]
  ): js.Array[U] = js.native
  def flatMap[U, This](
    callback: js.ThisFunction3[
      /* this */ This, 
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      U | js.Array[U]
    ],
    thisArg: This
  ): js.Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_0[U](`this`: js.Array[U], depth: `0`): js.Array[U] = js.native
  @JSName("flat")
  def flat_1[U](`this`: js.Array[js.Array[U]], depth: `1`): js.Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_2[U](`this`: js.Array[js.Array[js.Array[U]]], depth: `2`): js.Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_3[U](`this`: js.Array[js.Array[js.Array[js.Array[U]]]], depth: `3`): js.Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_4[U](`this`: js.Array[js.Array[js.Array[js.Array[js.Array[U]]]]], depth: `4`): js.Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_5[U](`this`: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[U]]]]]], depth: `5`): js.Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_6[U](`this`: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[U]]]]]]], depth: `6`): js.Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_7[U](
    `this`: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[U]]]]]]]],
    depth: `7`
  ): js.Array[U] = js.native
  /**
    * Performs the specified action for each element in an array.
    * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
    * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def forEach(
    callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
    thisArg: js.Any
  ): Unit = js.native
  /**
    * Determines whether an array includes a certain element, returning true or false as appropriate.
    * @param searchElement The element to search for.
    * @param fromIndex The position in this array at which to begin searching for searchElement.
    */
  def includes(searchElement: String): Boolean = js.native
  def includes(searchElement: String, fromIndex: Double): Boolean = js.native
  /**
    * Returns the index of the first occurrence of a value in an array.
    * @param searchElement The value to locate in the array.
    * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
    */
  def indexOf(searchElement: String): Double = js.native
  def indexOf(searchElement: String, fromIndex: Double): Double = js.native
  /**
    * Adds all the elements of an array separated by the specified separator string.
    * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
    */
  def join(): String = js.native
  def join(separator: String): String = js.native
  /**
    * Returns an iterable of keys in the array
    */
  def keys(): IterableIterator[Double] = js.native
  /**
    * Returns the index of the last occurrence of a specified value in an array.
    * @param searchElement The value to locate in the array.
    * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
    */
  def lastIndexOf(searchElement: String): Double = js.native
  def lastIndexOf(searchElement: String, fromIndex: Double): Double = js.native
  /**
    * Calls a defined callback function on each element of an array, and returns an array that contains the results.
    * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
  def map[U](
    callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
    thisArg: js.Any
  ): js.Array[U] = js.native
  /**
    * Removes the last element from an array and returns it.
    */
  def pop(): js.UndefOr[String] = js.native
  /**
    * Appends new elements to an array, and returns the new length of the array.
    * @param items New elements of the Array.
    */
  def push(items: String*): Double = js.native
  /**
    * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ String, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      String
    ]
  ): String = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ String, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      String
    ],
    initialValue: String
  ): String = js.native
  /**
    * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduce[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      U
    ],
    initialValue: U
  ): U = js.native
  /**
    * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ String, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      String
    ]
  ): String = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ String, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      String
    ],
    initialValue: String
  ): String = js.native
  /**
    * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduceRight[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      U
    ],
    initialValue: U
  ): U = js.native
  /**
    * Reverses the elements in an Array.
    */
  def reverse(): js.Array[String] = js.native
  /**
    * Removes the first element from an array and returns it.
    */
  def shift(): js.UndefOr[String] = js.native
  /**
    * Returns a section of an array.
    * @param start The beginning of the specified portion of the array.
    * @param end The end of the specified portion of the array.
    */
  def slice(): js.Array[String] = js.native
  def slice(start: Double): js.Array[String] = js.native
  def slice(start: Double, end: Double): js.Array[String] = js.native
  /**
    * Determines whether the specified callback function returns true for any element of an array.
    * @param callbackfn A function that accepts up to three arguments. The some method calls the callbackfn function for each element in array1 until the callbackfn returns true, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def some(callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
  def some(
    callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
    thisArg: js.Any
  ): Boolean = js.native
  /**
    * Sorts an array.
    * @param compareFn The name of the function used to determine the order of the elements. If omitted, the elements are sorted in ascending, ASCII character order.
    */
  def sort(): this.type = js.native
  def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
  /**
    * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
    * @param start The zero-based location in the array from which to start removing elements.
    * @param deleteCount The number of elements to remove.
    */
  def splice(start: Double): js.Array[String] = js.native
  def splice(start: Double, deleteCount: Double): js.Array[String] = js.native
  /**
    * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
    * @param start The zero-based location in the array from which to start removing elements.
    * @param deleteCount The number of elements to remove.
    * @param items Elements to insert into the array in place of the deleted elements.
    */
  def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = js.native
  /**
    * Inserts new elements at the start of an array.
    * @param items  Elements to insert at the start of the Array.
    */
  def unshift(items: String*): Double = js.native
  /**
    * Returns an iterable of values in the array
    */
  def values(): IterableIterator[String] = js.native
}

