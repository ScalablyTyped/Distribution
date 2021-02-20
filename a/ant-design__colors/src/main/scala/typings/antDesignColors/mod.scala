package typings.antDesignColors

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignColors.anon.Arraystringprimarystringu
import typings.antDesignColors.generateMod.Opts
import typings.std.FlatArray
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Array<string> & {  primary :string | undefined} */
  object blue {
    
    @JSImport("@ant-design/colors", "blue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    @JSImport("@ant-design/colors", "blue.concat")
    @js.native
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
    @JSImport("@ant-design/colors", "blue.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "blue.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @JSImport("@ant-design/colors", "blue.entries")
    @js.native
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "blue.every")
    @js.native
    def every(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "blue.every")
    @js.native
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "blue.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSImport("@ant-design/colors", "blue.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @JSImport("@ant-design/colors", "blue.fill")
    @js.native
    def fill(value: String): this.type = js.native
    @JSImport("@ant-design/colors", "blue.fill")
    @js.native
    def fill(value: String, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    @JSImport("@ant-design/colors", "blue.fill")
    @js.native
    def fill(value: String, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "blue.fill")
    @js.native
    def fill(value: String, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "blue.filter")
    @js.native
    def filter(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "blue.filter")
    @js.native
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): js.Array[String] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "blue.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSImport("@ant-design/colors", "blue.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = js.native
    
    @JSImport("@ant-design/colors", "blue.find")
    @js.native
    def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): js.UndefOr[String] = js.native
    @JSImport("@ant-design/colors", "blue.find")
    @js.native
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
    @JSImport("@ant-design/colors", "blue.find")
    @js.native
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSImport("@ant-design/colors", "blue.find")
    @js.native
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
    @JSImport("@ant-design/colors", "blue.findIndex")
    @js.native
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): Double = js.native
    @JSImport("@ant-design/colors", "blue.findIndex")
    @js.native
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _],
      thisArg: js.Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @JSImport("@ant-design/colors", "blue.flat")
    @js.native
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    @JSImport("@ant-design/colors", "blue.flat")
    @js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
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
    @JSImport("@ant-design/colors", "blue.flatMap")
    @js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "blue.flatMap")
    @js.native
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
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "blue.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    @JSImport("@ant-design/colors", "blue.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @JSImport("@ant-design/colors", "blue.includes")
    @js.native
    def includes(searchElement: String): Boolean = js.native
    @JSImport("@ant-design/colors", "blue.includes")
    @js.native
    def includes(searchElement: String, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @JSImport("@ant-design/colors", "blue.indexOf")
    @js.native
    def indexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "blue.indexOf")
    @js.native
    def indexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @JSImport("@ant-design/colors", "blue.join")
    @js.native
    def join(): String = js.native
    @JSImport("@ant-design/colors", "blue.join")
    @js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    @JSImport("@ant-design/colors", "blue.keys")
    @js.native
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @JSImport("@ant-design/colors", "blue.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "blue.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    @JSImport("@ant-design/colors", "blue.length")
    @js.native
    def length: Double = js.native
    @scala.inline
    def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "blue.map")
    @js.native
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "blue.map")
    @js.native
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "blue.pop")
    @js.native
    def pop(): js.UndefOr[String] = js.native
    
    @JSImport("@ant-design/colors", "blue.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @JSImport("@ant-design/colors", "blue.push")
    @js.native
    def push(items: String*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @JSImport("@ant-design/colors", "blue.reduce")
    @js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "blue.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "blue.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "blue.reduceRight")
    @js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "blue.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "blue.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "blue.reverse")
    @js.native
    def reverse(): js.Array[String] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "blue.shift")
    @js.native
    def shift(): js.UndefOr[String] = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @JSImport("@ant-design/colors", "blue.slice")
    @js.native
    def slice(): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "blue.slice")
    @js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "blue.slice")
    @js.native
    def slice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "blue.slice")
    @js.native
    def slice(start: Double, end: Double): js.Array[String] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "blue.some")
    @js.native
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "blue.some")
    @js.native
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @JSImport("@ant-design/colors", "blue.sort")
    @js.native
    def sort(): this.type = js.native
    @JSImport("@ant-design/colors", "blue.sort")
    @js.native
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @JSImport("@ant-design/colors", "blue.splice")
    @js.native
    def splice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "blue.splice")
    @js.native
    def splice(start: Double, deleteCount: Double): js.Array[String] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @JSImport("@ant-design/colors", "blue.splice")
    @js.native
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = js.native
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @JSImport("@ant-design/colors", "blue.toLocaleString")
    @js.native
    def toLocaleString_(): String = js.native
    
    /**
      * Returns a string representation of an array.
      */
    @JSImport("@ant-design/colors", "blue.toString")
    @js.native
    def toString_(): String = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @JSImport("@ant-design/colors", "blue.unshift")
    @js.native
    def unshift(items: String*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    @JSImport("@ant-design/colors", "blue.values")
    @js.native
    def values(): IterableIterator[String] = js.native
  }
  
  /* Inlined std.Array<string> & {  primary :string | undefined} */
  object cyan {
    
    @JSImport("@ant-design/colors", "cyan")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    @JSImport("@ant-design/colors", "cyan.concat")
    @js.native
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
    @JSImport("@ant-design/colors", "cyan.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "cyan.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @JSImport("@ant-design/colors", "cyan.entries")
    @js.native
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "cyan.every")
    @js.native
    def every(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "cyan.every")
    @js.native
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "cyan.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSImport("@ant-design/colors", "cyan.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @JSImport("@ant-design/colors", "cyan.fill")
    @js.native
    def fill(value: String): this.type = js.native
    @JSImport("@ant-design/colors", "cyan.fill")
    @js.native
    def fill(value: String, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    @JSImport("@ant-design/colors", "cyan.fill")
    @js.native
    def fill(value: String, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "cyan.fill")
    @js.native
    def fill(value: String, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "cyan.filter")
    @js.native
    def filter(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "cyan.filter")
    @js.native
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): js.Array[String] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "cyan.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSImport("@ant-design/colors", "cyan.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = js.native
    
    @JSImport("@ant-design/colors", "cyan.find")
    @js.native
    def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): js.UndefOr[String] = js.native
    @JSImport("@ant-design/colors", "cyan.find")
    @js.native
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
    @JSImport("@ant-design/colors", "cyan.find")
    @js.native
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSImport("@ant-design/colors", "cyan.find")
    @js.native
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
    @JSImport("@ant-design/colors", "cyan.findIndex")
    @js.native
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): Double = js.native
    @JSImport("@ant-design/colors", "cyan.findIndex")
    @js.native
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _],
      thisArg: js.Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @JSImport("@ant-design/colors", "cyan.flat")
    @js.native
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    @JSImport("@ant-design/colors", "cyan.flat")
    @js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
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
    @JSImport("@ant-design/colors", "cyan.flatMap")
    @js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "cyan.flatMap")
    @js.native
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
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "cyan.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    @JSImport("@ant-design/colors", "cyan.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @JSImport("@ant-design/colors", "cyan.includes")
    @js.native
    def includes(searchElement: String): Boolean = js.native
    @JSImport("@ant-design/colors", "cyan.includes")
    @js.native
    def includes(searchElement: String, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @JSImport("@ant-design/colors", "cyan.indexOf")
    @js.native
    def indexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "cyan.indexOf")
    @js.native
    def indexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @JSImport("@ant-design/colors", "cyan.join")
    @js.native
    def join(): String = js.native
    @JSImport("@ant-design/colors", "cyan.join")
    @js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    @JSImport("@ant-design/colors", "cyan.keys")
    @js.native
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @JSImport("@ant-design/colors", "cyan.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "cyan.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    @JSImport("@ant-design/colors", "cyan.length")
    @js.native
    def length: Double = js.native
    @scala.inline
    def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "cyan.map")
    @js.native
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "cyan.map")
    @js.native
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "cyan.pop")
    @js.native
    def pop(): js.UndefOr[String] = js.native
    
    @JSImport("@ant-design/colors", "cyan.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @JSImport("@ant-design/colors", "cyan.push")
    @js.native
    def push(items: String*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @JSImport("@ant-design/colors", "cyan.reduce")
    @js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "cyan.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "cyan.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "cyan.reduceRight")
    @js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "cyan.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "cyan.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "cyan.reverse")
    @js.native
    def reverse(): js.Array[String] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "cyan.shift")
    @js.native
    def shift(): js.UndefOr[String] = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @JSImport("@ant-design/colors", "cyan.slice")
    @js.native
    def slice(): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "cyan.slice")
    @js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "cyan.slice")
    @js.native
    def slice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "cyan.slice")
    @js.native
    def slice(start: Double, end: Double): js.Array[String] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "cyan.some")
    @js.native
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "cyan.some")
    @js.native
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @JSImport("@ant-design/colors", "cyan.sort")
    @js.native
    def sort(): this.type = js.native
    @JSImport("@ant-design/colors", "cyan.sort")
    @js.native
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @JSImport("@ant-design/colors", "cyan.splice")
    @js.native
    def splice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "cyan.splice")
    @js.native
    def splice(start: Double, deleteCount: Double): js.Array[String] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @JSImport("@ant-design/colors", "cyan.splice")
    @js.native
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = js.native
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @JSImport("@ant-design/colors", "cyan.toLocaleString")
    @js.native
    def toLocaleString_(): String = js.native
    
    /**
      * Returns a string representation of an array.
      */
    @JSImport("@ant-design/colors", "cyan.toString")
    @js.native
    def toString_(): String = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @JSImport("@ant-design/colors", "cyan.unshift")
    @js.native
    def unshift(items: String*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    @JSImport("@ant-design/colors", "cyan.values")
    @js.native
    def values(): IterableIterator[String] = js.native
  }
  
  /* Inlined std.Array<string> & {  primary :string | undefined} */
  object geekblue {
    
    @JSImport("@ant-design/colors", "geekblue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    @JSImport("@ant-design/colors", "geekblue.concat")
    @js.native
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
    @JSImport("@ant-design/colors", "geekblue.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "geekblue.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @JSImport("@ant-design/colors", "geekblue.entries")
    @js.native
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "geekblue.every")
    @js.native
    def every(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "geekblue.every")
    @js.native
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "geekblue.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSImport("@ant-design/colors", "geekblue.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @JSImport("@ant-design/colors", "geekblue.fill")
    @js.native
    def fill(value: String): this.type = js.native
    @JSImport("@ant-design/colors", "geekblue.fill")
    @js.native
    def fill(value: String, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    @JSImport("@ant-design/colors", "geekblue.fill")
    @js.native
    def fill(value: String, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "geekblue.fill")
    @js.native
    def fill(value: String, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "geekblue.filter")
    @js.native
    def filter(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "geekblue.filter")
    @js.native
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): js.Array[String] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "geekblue.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSImport("@ant-design/colors", "geekblue.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = js.native
    
    @JSImport("@ant-design/colors", "geekblue.find")
    @js.native
    def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): js.UndefOr[String] = js.native
    @JSImport("@ant-design/colors", "geekblue.find")
    @js.native
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
    @JSImport("@ant-design/colors", "geekblue.find")
    @js.native
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSImport("@ant-design/colors", "geekblue.find")
    @js.native
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
    @JSImport("@ant-design/colors", "geekblue.findIndex")
    @js.native
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): Double = js.native
    @JSImport("@ant-design/colors", "geekblue.findIndex")
    @js.native
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _],
      thisArg: js.Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @JSImport("@ant-design/colors", "geekblue.flat")
    @js.native
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    @JSImport("@ant-design/colors", "geekblue.flat")
    @js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
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
    @JSImport("@ant-design/colors", "geekblue.flatMap")
    @js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "geekblue.flatMap")
    @js.native
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
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "geekblue.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    @JSImport("@ant-design/colors", "geekblue.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @JSImport("@ant-design/colors", "geekblue.includes")
    @js.native
    def includes(searchElement: String): Boolean = js.native
    @JSImport("@ant-design/colors", "geekblue.includes")
    @js.native
    def includes(searchElement: String, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @JSImport("@ant-design/colors", "geekblue.indexOf")
    @js.native
    def indexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "geekblue.indexOf")
    @js.native
    def indexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @JSImport("@ant-design/colors", "geekblue.join")
    @js.native
    def join(): String = js.native
    @JSImport("@ant-design/colors", "geekblue.join")
    @js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    @JSImport("@ant-design/colors", "geekblue.keys")
    @js.native
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @JSImport("@ant-design/colors", "geekblue.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "geekblue.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    @JSImport("@ant-design/colors", "geekblue.length")
    @js.native
    def length: Double = js.native
    @scala.inline
    def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "geekblue.map")
    @js.native
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "geekblue.map")
    @js.native
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "geekblue.pop")
    @js.native
    def pop(): js.UndefOr[String] = js.native
    
    @JSImport("@ant-design/colors", "geekblue.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @JSImport("@ant-design/colors", "geekblue.push")
    @js.native
    def push(items: String*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @JSImport("@ant-design/colors", "geekblue.reduce")
    @js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "geekblue.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "geekblue.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "geekblue.reduceRight")
    @js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "geekblue.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "geekblue.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "geekblue.reverse")
    @js.native
    def reverse(): js.Array[String] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "geekblue.shift")
    @js.native
    def shift(): js.UndefOr[String] = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @JSImport("@ant-design/colors", "geekblue.slice")
    @js.native
    def slice(): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "geekblue.slice")
    @js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "geekblue.slice")
    @js.native
    def slice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "geekblue.slice")
    @js.native
    def slice(start: Double, end: Double): js.Array[String] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "geekblue.some")
    @js.native
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "geekblue.some")
    @js.native
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @JSImport("@ant-design/colors", "geekblue.sort")
    @js.native
    def sort(): this.type = js.native
    @JSImport("@ant-design/colors", "geekblue.sort")
    @js.native
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @JSImport("@ant-design/colors", "geekblue.splice")
    @js.native
    def splice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "geekblue.splice")
    @js.native
    def splice(start: Double, deleteCount: Double): js.Array[String] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @JSImport("@ant-design/colors", "geekblue.splice")
    @js.native
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = js.native
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @JSImport("@ant-design/colors", "geekblue.toLocaleString")
    @js.native
    def toLocaleString_(): String = js.native
    
    /**
      * Returns a string representation of an array.
      */
    @JSImport("@ant-design/colors", "geekblue.toString")
    @js.native
    def toString_(): String = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @JSImport("@ant-design/colors", "geekblue.unshift")
    @js.native
    def unshift(items: String*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    @JSImport("@ant-design/colors", "geekblue.values")
    @js.native
    def values(): IterableIterator[String] = js.native
  }
  
  @JSImport("@ant-design/colors", "generate")
  @js.native
  def generate(color: String): js.Array[String] = js.native
  @JSImport("@ant-design/colors", "generate")
  @js.native
  def generate(color: String, opts: Opts): js.Array[String] = js.native
  
  /* Inlined std.Array<string> & {  primary :string | undefined} */
  object gold {
    
    @JSImport("@ant-design/colors", "gold")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    @JSImport("@ant-design/colors", "gold.concat")
    @js.native
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
    @JSImport("@ant-design/colors", "gold.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "gold.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @JSImport("@ant-design/colors", "gold.entries")
    @js.native
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "gold.every")
    @js.native
    def every(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "gold.every")
    @js.native
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "gold.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSImport("@ant-design/colors", "gold.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @JSImport("@ant-design/colors", "gold.fill")
    @js.native
    def fill(value: String): this.type = js.native
    @JSImport("@ant-design/colors", "gold.fill")
    @js.native
    def fill(value: String, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    @JSImport("@ant-design/colors", "gold.fill")
    @js.native
    def fill(value: String, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "gold.fill")
    @js.native
    def fill(value: String, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "gold.filter")
    @js.native
    def filter(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "gold.filter")
    @js.native
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): js.Array[String] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "gold.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSImport("@ant-design/colors", "gold.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = js.native
    
    @JSImport("@ant-design/colors", "gold.find")
    @js.native
    def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): js.UndefOr[String] = js.native
    @JSImport("@ant-design/colors", "gold.find")
    @js.native
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
    @JSImport("@ant-design/colors", "gold.find")
    @js.native
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSImport("@ant-design/colors", "gold.find")
    @js.native
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
    @JSImport("@ant-design/colors", "gold.findIndex")
    @js.native
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): Double = js.native
    @JSImport("@ant-design/colors", "gold.findIndex")
    @js.native
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _],
      thisArg: js.Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @JSImport("@ant-design/colors", "gold.flat")
    @js.native
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    @JSImport("@ant-design/colors", "gold.flat")
    @js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
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
    @JSImport("@ant-design/colors", "gold.flatMap")
    @js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "gold.flatMap")
    @js.native
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
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "gold.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    @JSImport("@ant-design/colors", "gold.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @JSImport("@ant-design/colors", "gold.includes")
    @js.native
    def includes(searchElement: String): Boolean = js.native
    @JSImport("@ant-design/colors", "gold.includes")
    @js.native
    def includes(searchElement: String, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @JSImport("@ant-design/colors", "gold.indexOf")
    @js.native
    def indexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "gold.indexOf")
    @js.native
    def indexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @JSImport("@ant-design/colors", "gold.join")
    @js.native
    def join(): String = js.native
    @JSImport("@ant-design/colors", "gold.join")
    @js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    @JSImport("@ant-design/colors", "gold.keys")
    @js.native
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @JSImport("@ant-design/colors", "gold.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "gold.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    @JSImport("@ant-design/colors", "gold.length")
    @js.native
    def length: Double = js.native
    @scala.inline
    def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "gold.map")
    @js.native
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "gold.map")
    @js.native
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "gold.pop")
    @js.native
    def pop(): js.UndefOr[String] = js.native
    
    @JSImport("@ant-design/colors", "gold.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @JSImport("@ant-design/colors", "gold.push")
    @js.native
    def push(items: String*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @JSImport("@ant-design/colors", "gold.reduce")
    @js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "gold.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "gold.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "gold.reduceRight")
    @js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "gold.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "gold.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "gold.reverse")
    @js.native
    def reverse(): js.Array[String] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "gold.shift")
    @js.native
    def shift(): js.UndefOr[String] = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @JSImport("@ant-design/colors", "gold.slice")
    @js.native
    def slice(): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "gold.slice")
    @js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "gold.slice")
    @js.native
    def slice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "gold.slice")
    @js.native
    def slice(start: Double, end: Double): js.Array[String] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "gold.some")
    @js.native
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "gold.some")
    @js.native
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @JSImport("@ant-design/colors", "gold.sort")
    @js.native
    def sort(): this.type = js.native
    @JSImport("@ant-design/colors", "gold.sort")
    @js.native
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @JSImport("@ant-design/colors", "gold.splice")
    @js.native
    def splice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "gold.splice")
    @js.native
    def splice(start: Double, deleteCount: Double): js.Array[String] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @JSImport("@ant-design/colors", "gold.splice")
    @js.native
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = js.native
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @JSImport("@ant-design/colors", "gold.toLocaleString")
    @js.native
    def toLocaleString_(): String = js.native
    
    /**
      * Returns a string representation of an array.
      */
    @JSImport("@ant-design/colors", "gold.toString")
    @js.native
    def toString_(): String = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @JSImport("@ant-design/colors", "gold.unshift")
    @js.native
    def unshift(items: String*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    @JSImport("@ant-design/colors", "gold.values")
    @js.native
    def values(): IterableIterator[String] = js.native
  }
  
  /* Inlined std.Array<string> & {  primary :string | undefined} */
  object green {
    
    @JSImport("@ant-design/colors", "green")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    @JSImport("@ant-design/colors", "green.concat")
    @js.native
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
    @JSImport("@ant-design/colors", "green.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "green.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @JSImport("@ant-design/colors", "green.entries")
    @js.native
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "green.every")
    @js.native
    def every(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "green.every")
    @js.native
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "green.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSImport("@ant-design/colors", "green.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @JSImport("@ant-design/colors", "green.fill")
    @js.native
    def fill(value: String): this.type = js.native
    @JSImport("@ant-design/colors", "green.fill")
    @js.native
    def fill(value: String, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    @JSImport("@ant-design/colors", "green.fill")
    @js.native
    def fill(value: String, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "green.fill")
    @js.native
    def fill(value: String, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "green.filter")
    @js.native
    def filter(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "green.filter")
    @js.native
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): js.Array[String] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "green.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSImport("@ant-design/colors", "green.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = js.native
    
    @JSImport("@ant-design/colors", "green.find")
    @js.native
    def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): js.UndefOr[String] = js.native
    @JSImport("@ant-design/colors", "green.find")
    @js.native
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
    @JSImport("@ant-design/colors", "green.find")
    @js.native
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSImport("@ant-design/colors", "green.find")
    @js.native
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
    @JSImport("@ant-design/colors", "green.findIndex")
    @js.native
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): Double = js.native
    @JSImport("@ant-design/colors", "green.findIndex")
    @js.native
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _],
      thisArg: js.Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @JSImport("@ant-design/colors", "green.flat")
    @js.native
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    @JSImport("@ant-design/colors", "green.flat")
    @js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
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
    @JSImport("@ant-design/colors", "green.flatMap")
    @js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "green.flatMap")
    @js.native
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
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "green.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    @JSImport("@ant-design/colors", "green.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @JSImport("@ant-design/colors", "green.includes")
    @js.native
    def includes(searchElement: String): Boolean = js.native
    @JSImport("@ant-design/colors", "green.includes")
    @js.native
    def includes(searchElement: String, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @JSImport("@ant-design/colors", "green.indexOf")
    @js.native
    def indexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "green.indexOf")
    @js.native
    def indexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @JSImport("@ant-design/colors", "green.join")
    @js.native
    def join(): String = js.native
    @JSImport("@ant-design/colors", "green.join")
    @js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    @JSImport("@ant-design/colors", "green.keys")
    @js.native
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @JSImport("@ant-design/colors", "green.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "green.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    @JSImport("@ant-design/colors", "green.length")
    @js.native
    def length: Double = js.native
    @scala.inline
    def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "green.map")
    @js.native
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "green.map")
    @js.native
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "green.pop")
    @js.native
    def pop(): js.UndefOr[String] = js.native
    
    @JSImport("@ant-design/colors", "green.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @JSImport("@ant-design/colors", "green.push")
    @js.native
    def push(items: String*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @JSImport("@ant-design/colors", "green.reduce")
    @js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "green.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "green.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "green.reduceRight")
    @js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "green.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "green.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "green.reverse")
    @js.native
    def reverse(): js.Array[String] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "green.shift")
    @js.native
    def shift(): js.UndefOr[String] = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @JSImport("@ant-design/colors", "green.slice")
    @js.native
    def slice(): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "green.slice")
    @js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "green.slice")
    @js.native
    def slice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "green.slice")
    @js.native
    def slice(start: Double, end: Double): js.Array[String] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "green.some")
    @js.native
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "green.some")
    @js.native
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @JSImport("@ant-design/colors", "green.sort")
    @js.native
    def sort(): this.type = js.native
    @JSImport("@ant-design/colors", "green.sort")
    @js.native
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @JSImport("@ant-design/colors", "green.splice")
    @js.native
    def splice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "green.splice")
    @js.native
    def splice(start: Double, deleteCount: Double): js.Array[String] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @JSImport("@ant-design/colors", "green.splice")
    @js.native
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = js.native
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @JSImport("@ant-design/colors", "green.toLocaleString")
    @js.native
    def toLocaleString_(): String = js.native
    
    /**
      * Returns a string representation of an array.
      */
    @JSImport("@ant-design/colors", "green.toString")
    @js.native
    def toString_(): String = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @JSImport("@ant-design/colors", "green.unshift")
    @js.native
    def unshift(items: String*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    @JSImport("@ant-design/colors", "green.values")
    @js.native
    def values(): IterableIterator[String] = js.native
  }
  
  /* Inlined std.Array<string> & {  primary :string | undefined} */
  object grey {
    
    @JSImport("@ant-design/colors", "grey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    @JSImport("@ant-design/colors", "grey.concat")
    @js.native
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
    @JSImport("@ant-design/colors", "grey.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "grey.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @JSImport("@ant-design/colors", "grey.entries")
    @js.native
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "grey.every")
    @js.native
    def every(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "grey.every")
    @js.native
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "grey.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSImport("@ant-design/colors", "grey.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @JSImport("@ant-design/colors", "grey.fill")
    @js.native
    def fill(value: String): this.type = js.native
    @JSImport("@ant-design/colors", "grey.fill")
    @js.native
    def fill(value: String, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    @JSImport("@ant-design/colors", "grey.fill")
    @js.native
    def fill(value: String, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "grey.fill")
    @js.native
    def fill(value: String, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "grey.filter")
    @js.native
    def filter(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "grey.filter")
    @js.native
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): js.Array[String] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "grey.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSImport("@ant-design/colors", "grey.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = js.native
    
    @JSImport("@ant-design/colors", "grey.find")
    @js.native
    def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): js.UndefOr[String] = js.native
    @JSImport("@ant-design/colors", "grey.find")
    @js.native
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
    @JSImport("@ant-design/colors", "grey.find")
    @js.native
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSImport("@ant-design/colors", "grey.find")
    @js.native
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
    @JSImport("@ant-design/colors", "grey.findIndex")
    @js.native
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): Double = js.native
    @JSImport("@ant-design/colors", "grey.findIndex")
    @js.native
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _],
      thisArg: js.Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @JSImport("@ant-design/colors", "grey.flat")
    @js.native
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    @JSImport("@ant-design/colors", "grey.flat")
    @js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
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
    @JSImport("@ant-design/colors", "grey.flatMap")
    @js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "grey.flatMap")
    @js.native
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
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "grey.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    @JSImport("@ant-design/colors", "grey.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @JSImport("@ant-design/colors", "grey.includes")
    @js.native
    def includes(searchElement: String): Boolean = js.native
    @JSImport("@ant-design/colors", "grey.includes")
    @js.native
    def includes(searchElement: String, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @JSImport("@ant-design/colors", "grey.indexOf")
    @js.native
    def indexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "grey.indexOf")
    @js.native
    def indexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @JSImport("@ant-design/colors", "grey.join")
    @js.native
    def join(): String = js.native
    @JSImport("@ant-design/colors", "grey.join")
    @js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    @JSImport("@ant-design/colors", "grey.keys")
    @js.native
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @JSImport("@ant-design/colors", "grey.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "grey.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    @JSImport("@ant-design/colors", "grey.length")
    @js.native
    def length: Double = js.native
    @scala.inline
    def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "grey.map")
    @js.native
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "grey.map")
    @js.native
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "grey.pop")
    @js.native
    def pop(): js.UndefOr[String] = js.native
    
    @JSImport("@ant-design/colors", "grey.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @JSImport("@ant-design/colors", "grey.push")
    @js.native
    def push(items: String*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @JSImport("@ant-design/colors", "grey.reduce")
    @js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "grey.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "grey.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "grey.reduceRight")
    @js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "grey.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "grey.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "grey.reverse")
    @js.native
    def reverse(): js.Array[String] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "grey.shift")
    @js.native
    def shift(): js.UndefOr[String] = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @JSImport("@ant-design/colors", "grey.slice")
    @js.native
    def slice(): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "grey.slice")
    @js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "grey.slice")
    @js.native
    def slice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "grey.slice")
    @js.native
    def slice(start: Double, end: Double): js.Array[String] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "grey.some")
    @js.native
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "grey.some")
    @js.native
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @JSImport("@ant-design/colors", "grey.sort")
    @js.native
    def sort(): this.type = js.native
    @JSImport("@ant-design/colors", "grey.sort")
    @js.native
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @JSImport("@ant-design/colors", "grey.splice")
    @js.native
    def splice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "grey.splice")
    @js.native
    def splice(start: Double, deleteCount: Double): js.Array[String] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @JSImport("@ant-design/colors", "grey.splice")
    @js.native
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = js.native
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @JSImport("@ant-design/colors", "grey.toLocaleString")
    @js.native
    def toLocaleString_(): String = js.native
    
    /**
      * Returns a string representation of an array.
      */
    @JSImport("@ant-design/colors", "grey.toString")
    @js.native
    def toString_(): String = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @JSImport("@ant-design/colors", "grey.unshift")
    @js.native
    def unshift(items: String*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    @JSImport("@ant-design/colors", "grey.values")
    @js.native
    def values(): IterableIterator[String] = js.native
  }
  
  /* Inlined std.Array<string> & {  primary :string | undefined} */
  object lime {
    
    @JSImport("@ant-design/colors", "lime")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    @JSImport("@ant-design/colors", "lime.concat")
    @js.native
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
    @JSImport("@ant-design/colors", "lime.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "lime.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @JSImport("@ant-design/colors", "lime.entries")
    @js.native
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "lime.every")
    @js.native
    def every(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "lime.every")
    @js.native
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "lime.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSImport("@ant-design/colors", "lime.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @JSImport("@ant-design/colors", "lime.fill")
    @js.native
    def fill(value: String): this.type = js.native
    @JSImport("@ant-design/colors", "lime.fill")
    @js.native
    def fill(value: String, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    @JSImport("@ant-design/colors", "lime.fill")
    @js.native
    def fill(value: String, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "lime.fill")
    @js.native
    def fill(value: String, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "lime.filter")
    @js.native
    def filter(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "lime.filter")
    @js.native
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): js.Array[String] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "lime.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSImport("@ant-design/colors", "lime.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = js.native
    
    @JSImport("@ant-design/colors", "lime.find")
    @js.native
    def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): js.UndefOr[String] = js.native
    @JSImport("@ant-design/colors", "lime.find")
    @js.native
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
    @JSImport("@ant-design/colors", "lime.find")
    @js.native
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSImport("@ant-design/colors", "lime.find")
    @js.native
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
    @JSImport("@ant-design/colors", "lime.findIndex")
    @js.native
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): Double = js.native
    @JSImport("@ant-design/colors", "lime.findIndex")
    @js.native
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _],
      thisArg: js.Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @JSImport("@ant-design/colors", "lime.flat")
    @js.native
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    @JSImport("@ant-design/colors", "lime.flat")
    @js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
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
    @JSImport("@ant-design/colors", "lime.flatMap")
    @js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "lime.flatMap")
    @js.native
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
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "lime.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    @JSImport("@ant-design/colors", "lime.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @JSImport("@ant-design/colors", "lime.includes")
    @js.native
    def includes(searchElement: String): Boolean = js.native
    @JSImport("@ant-design/colors", "lime.includes")
    @js.native
    def includes(searchElement: String, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @JSImport("@ant-design/colors", "lime.indexOf")
    @js.native
    def indexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "lime.indexOf")
    @js.native
    def indexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @JSImport("@ant-design/colors", "lime.join")
    @js.native
    def join(): String = js.native
    @JSImport("@ant-design/colors", "lime.join")
    @js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    @JSImport("@ant-design/colors", "lime.keys")
    @js.native
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @JSImport("@ant-design/colors", "lime.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "lime.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    @JSImport("@ant-design/colors", "lime.length")
    @js.native
    def length: Double = js.native
    @scala.inline
    def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "lime.map")
    @js.native
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "lime.map")
    @js.native
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "lime.pop")
    @js.native
    def pop(): js.UndefOr[String] = js.native
    
    @JSImport("@ant-design/colors", "lime.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @JSImport("@ant-design/colors", "lime.push")
    @js.native
    def push(items: String*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @JSImport("@ant-design/colors", "lime.reduce")
    @js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "lime.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "lime.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "lime.reduceRight")
    @js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "lime.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "lime.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "lime.reverse")
    @js.native
    def reverse(): js.Array[String] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "lime.shift")
    @js.native
    def shift(): js.UndefOr[String] = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @JSImport("@ant-design/colors", "lime.slice")
    @js.native
    def slice(): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "lime.slice")
    @js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "lime.slice")
    @js.native
    def slice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "lime.slice")
    @js.native
    def slice(start: Double, end: Double): js.Array[String] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "lime.some")
    @js.native
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "lime.some")
    @js.native
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @JSImport("@ant-design/colors", "lime.sort")
    @js.native
    def sort(): this.type = js.native
    @JSImport("@ant-design/colors", "lime.sort")
    @js.native
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @JSImport("@ant-design/colors", "lime.splice")
    @js.native
    def splice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "lime.splice")
    @js.native
    def splice(start: Double, deleteCount: Double): js.Array[String] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @JSImport("@ant-design/colors", "lime.splice")
    @js.native
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = js.native
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @JSImport("@ant-design/colors", "lime.toLocaleString")
    @js.native
    def toLocaleString_(): String = js.native
    
    /**
      * Returns a string representation of an array.
      */
    @JSImport("@ant-design/colors", "lime.toString")
    @js.native
    def toString_(): String = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @JSImport("@ant-design/colors", "lime.unshift")
    @js.native
    def unshift(items: String*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    @JSImport("@ant-design/colors", "lime.values")
    @js.native
    def values(): IterableIterator[String] = js.native
  }
  
  /* Inlined std.Array<string> & {  primary :string | undefined} */
  object magenta {
    
    @JSImport("@ant-design/colors", "magenta")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    @JSImport("@ant-design/colors", "magenta.concat")
    @js.native
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
    @JSImport("@ant-design/colors", "magenta.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "magenta.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @JSImport("@ant-design/colors", "magenta.entries")
    @js.native
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "magenta.every")
    @js.native
    def every(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "magenta.every")
    @js.native
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "magenta.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSImport("@ant-design/colors", "magenta.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @JSImport("@ant-design/colors", "magenta.fill")
    @js.native
    def fill(value: String): this.type = js.native
    @JSImport("@ant-design/colors", "magenta.fill")
    @js.native
    def fill(value: String, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    @JSImport("@ant-design/colors", "magenta.fill")
    @js.native
    def fill(value: String, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "magenta.fill")
    @js.native
    def fill(value: String, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "magenta.filter")
    @js.native
    def filter(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "magenta.filter")
    @js.native
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): js.Array[String] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "magenta.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSImport("@ant-design/colors", "magenta.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = js.native
    
    @JSImport("@ant-design/colors", "magenta.find")
    @js.native
    def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): js.UndefOr[String] = js.native
    @JSImport("@ant-design/colors", "magenta.find")
    @js.native
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
    @JSImport("@ant-design/colors", "magenta.find")
    @js.native
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSImport("@ant-design/colors", "magenta.find")
    @js.native
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
    @JSImport("@ant-design/colors", "magenta.findIndex")
    @js.native
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): Double = js.native
    @JSImport("@ant-design/colors", "magenta.findIndex")
    @js.native
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _],
      thisArg: js.Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @JSImport("@ant-design/colors", "magenta.flat")
    @js.native
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    @JSImport("@ant-design/colors", "magenta.flat")
    @js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
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
    @JSImport("@ant-design/colors", "magenta.flatMap")
    @js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "magenta.flatMap")
    @js.native
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
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "magenta.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    @JSImport("@ant-design/colors", "magenta.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @JSImport("@ant-design/colors", "magenta.includes")
    @js.native
    def includes(searchElement: String): Boolean = js.native
    @JSImport("@ant-design/colors", "magenta.includes")
    @js.native
    def includes(searchElement: String, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @JSImport("@ant-design/colors", "magenta.indexOf")
    @js.native
    def indexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "magenta.indexOf")
    @js.native
    def indexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @JSImport("@ant-design/colors", "magenta.join")
    @js.native
    def join(): String = js.native
    @JSImport("@ant-design/colors", "magenta.join")
    @js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    @JSImport("@ant-design/colors", "magenta.keys")
    @js.native
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @JSImport("@ant-design/colors", "magenta.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "magenta.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    @JSImport("@ant-design/colors", "magenta.length")
    @js.native
    def length: Double = js.native
    @scala.inline
    def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "magenta.map")
    @js.native
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "magenta.map")
    @js.native
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "magenta.pop")
    @js.native
    def pop(): js.UndefOr[String] = js.native
    
    @JSImport("@ant-design/colors", "magenta.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @JSImport("@ant-design/colors", "magenta.push")
    @js.native
    def push(items: String*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @JSImport("@ant-design/colors", "magenta.reduce")
    @js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "magenta.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "magenta.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "magenta.reduceRight")
    @js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "magenta.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "magenta.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "magenta.reverse")
    @js.native
    def reverse(): js.Array[String] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "magenta.shift")
    @js.native
    def shift(): js.UndefOr[String] = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @JSImport("@ant-design/colors", "magenta.slice")
    @js.native
    def slice(): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "magenta.slice")
    @js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "magenta.slice")
    @js.native
    def slice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "magenta.slice")
    @js.native
    def slice(start: Double, end: Double): js.Array[String] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "magenta.some")
    @js.native
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "magenta.some")
    @js.native
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @JSImport("@ant-design/colors", "magenta.sort")
    @js.native
    def sort(): this.type = js.native
    @JSImport("@ant-design/colors", "magenta.sort")
    @js.native
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @JSImport("@ant-design/colors", "magenta.splice")
    @js.native
    def splice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "magenta.splice")
    @js.native
    def splice(start: Double, deleteCount: Double): js.Array[String] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @JSImport("@ant-design/colors", "magenta.splice")
    @js.native
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = js.native
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @JSImport("@ant-design/colors", "magenta.toLocaleString")
    @js.native
    def toLocaleString_(): String = js.native
    
    /**
      * Returns a string representation of an array.
      */
    @JSImport("@ant-design/colors", "magenta.toString")
    @js.native
    def toString_(): String = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @JSImport("@ant-design/colors", "magenta.unshift")
    @js.native
    def unshift(items: String*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    @JSImport("@ant-design/colors", "magenta.values")
    @js.native
    def values(): IterableIterator[String] = js.native
  }
  
  /* Inlined std.Array<string> & {  primary :string | undefined} */
  object orange {
    
    @JSImport("@ant-design/colors", "orange")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    @JSImport("@ant-design/colors", "orange.concat")
    @js.native
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
    @JSImport("@ant-design/colors", "orange.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "orange.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @JSImport("@ant-design/colors", "orange.entries")
    @js.native
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "orange.every")
    @js.native
    def every(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "orange.every")
    @js.native
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "orange.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSImport("@ant-design/colors", "orange.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @JSImport("@ant-design/colors", "orange.fill")
    @js.native
    def fill(value: String): this.type = js.native
    @JSImport("@ant-design/colors", "orange.fill")
    @js.native
    def fill(value: String, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    @JSImport("@ant-design/colors", "orange.fill")
    @js.native
    def fill(value: String, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "orange.fill")
    @js.native
    def fill(value: String, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "orange.filter")
    @js.native
    def filter(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "orange.filter")
    @js.native
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): js.Array[String] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "orange.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSImport("@ant-design/colors", "orange.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = js.native
    
    @JSImport("@ant-design/colors", "orange.find")
    @js.native
    def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): js.UndefOr[String] = js.native
    @JSImport("@ant-design/colors", "orange.find")
    @js.native
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
    @JSImport("@ant-design/colors", "orange.find")
    @js.native
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSImport("@ant-design/colors", "orange.find")
    @js.native
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
    @JSImport("@ant-design/colors", "orange.findIndex")
    @js.native
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): Double = js.native
    @JSImport("@ant-design/colors", "orange.findIndex")
    @js.native
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _],
      thisArg: js.Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @JSImport("@ant-design/colors", "orange.flat")
    @js.native
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    @JSImport("@ant-design/colors", "orange.flat")
    @js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
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
    @JSImport("@ant-design/colors", "orange.flatMap")
    @js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "orange.flatMap")
    @js.native
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
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "orange.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    @JSImport("@ant-design/colors", "orange.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @JSImport("@ant-design/colors", "orange.includes")
    @js.native
    def includes(searchElement: String): Boolean = js.native
    @JSImport("@ant-design/colors", "orange.includes")
    @js.native
    def includes(searchElement: String, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @JSImport("@ant-design/colors", "orange.indexOf")
    @js.native
    def indexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "orange.indexOf")
    @js.native
    def indexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @JSImport("@ant-design/colors", "orange.join")
    @js.native
    def join(): String = js.native
    @JSImport("@ant-design/colors", "orange.join")
    @js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    @JSImport("@ant-design/colors", "orange.keys")
    @js.native
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @JSImport("@ant-design/colors", "orange.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "orange.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    @JSImport("@ant-design/colors", "orange.length")
    @js.native
    def length: Double = js.native
    @scala.inline
    def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "orange.map")
    @js.native
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "orange.map")
    @js.native
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "orange.pop")
    @js.native
    def pop(): js.UndefOr[String] = js.native
    
    @JSImport("@ant-design/colors", "orange.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @JSImport("@ant-design/colors", "orange.push")
    @js.native
    def push(items: String*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @JSImport("@ant-design/colors", "orange.reduce")
    @js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "orange.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "orange.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "orange.reduceRight")
    @js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "orange.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "orange.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "orange.reverse")
    @js.native
    def reverse(): js.Array[String] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "orange.shift")
    @js.native
    def shift(): js.UndefOr[String] = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @JSImport("@ant-design/colors", "orange.slice")
    @js.native
    def slice(): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "orange.slice")
    @js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "orange.slice")
    @js.native
    def slice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "orange.slice")
    @js.native
    def slice(start: Double, end: Double): js.Array[String] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "orange.some")
    @js.native
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "orange.some")
    @js.native
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @JSImport("@ant-design/colors", "orange.sort")
    @js.native
    def sort(): this.type = js.native
    @JSImport("@ant-design/colors", "orange.sort")
    @js.native
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @JSImport("@ant-design/colors", "orange.splice")
    @js.native
    def splice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "orange.splice")
    @js.native
    def splice(start: Double, deleteCount: Double): js.Array[String] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @JSImport("@ant-design/colors", "orange.splice")
    @js.native
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = js.native
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @JSImport("@ant-design/colors", "orange.toLocaleString")
    @js.native
    def toLocaleString_(): String = js.native
    
    /**
      * Returns a string representation of an array.
      */
    @JSImport("@ant-design/colors", "orange.toString")
    @js.native
    def toString_(): String = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @JSImport("@ant-design/colors", "orange.unshift")
    @js.native
    def unshift(items: String*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    @JSImport("@ant-design/colors", "orange.values")
    @js.native
    def values(): IterableIterator[String] = js.native
  }
  
  @JSImport("@ant-design/colors", "presetDarkPalettes")
  @js.native
  val presetDarkPalettes: PalettesProps = js.native
  
  @JSImport("@ant-design/colors", "presetPalettes")
  @js.native
  val presetPalettes: PalettesProps = js.native
  
  /* Inlined std.Array<string> & {  primary :string | undefined} */
  object purple {
    
    @JSImport("@ant-design/colors", "purple")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    @JSImport("@ant-design/colors", "purple.concat")
    @js.native
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
    @JSImport("@ant-design/colors", "purple.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "purple.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @JSImport("@ant-design/colors", "purple.entries")
    @js.native
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "purple.every")
    @js.native
    def every(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "purple.every")
    @js.native
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "purple.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSImport("@ant-design/colors", "purple.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @JSImport("@ant-design/colors", "purple.fill")
    @js.native
    def fill(value: String): this.type = js.native
    @JSImport("@ant-design/colors", "purple.fill")
    @js.native
    def fill(value: String, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    @JSImport("@ant-design/colors", "purple.fill")
    @js.native
    def fill(value: String, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "purple.fill")
    @js.native
    def fill(value: String, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "purple.filter")
    @js.native
    def filter(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "purple.filter")
    @js.native
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): js.Array[String] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "purple.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSImport("@ant-design/colors", "purple.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = js.native
    
    @JSImport("@ant-design/colors", "purple.find")
    @js.native
    def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): js.UndefOr[String] = js.native
    @JSImport("@ant-design/colors", "purple.find")
    @js.native
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
    @JSImport("@ant-design/colors", "purple.find")
    @js.native
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSImport("@ant-design/colors", "purple.find")
    @js.native
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
    @JSImport("@ant-design/colors", "purple.findIndex")
    @js.native
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): Double = js.native
    @JSImport("@ant-design/colors", "purple.findIndex")
    @js.native
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _],
      thisArg: js.Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @JSImport("@ant-design/colors", "purple.flat")
    @js.native
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    @JSImport("@ant-design/colors", "purple.flat")
    @js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
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
    @JSImport("@ant-design/colors", "purple.flatMap")
    @js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "purple.flatMap")
    @js.native
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
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "purple.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    @JSImport("@ant-design/colors", "purple.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @JSImport("@ant-design/colors", "purple.includes")
    @js.native
    def includes(searchElement: String): Boolean = js.native
    @JSImport("@ant-design/colors", "purple.includes")
    @js.native
    def includes(searchElement: String, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @JSImport("@ant-design/colors", "purple.indexOf")
    @js.native
    def indexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "purple.indexOf")
    @js.native
    def indexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @JSImport("@ant-design/colors", "purple.join")
    @js.native
    def join(): String = js.native
    @JSImport("@ant-design/colors", "purple.join")
    @js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    @JSImport("@ant-design/colors", "purple.keys")
    @js.native
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @JSImport("@ant-design/colors", "purple.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "purple.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    @JSImport("@ant-design/colors", "purple.length")
    @js.native
    def length: Double = js.native
    @scala.inline
    def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "purple.map")
    @js.native
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "purple.map")
    @js.native
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "purple.pop")
    @js.native
    def pop(): js.UndefOr[String] = js.native
    
    @JSImport("@ant-design/colors", "purple.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @JSImport("@ant-design/colors", "purple.push")
    @js.native
    def push(items: String*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @JSImport("@ant-design/colors", "purple.reduce")
    @js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "purple.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "purple.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "purple.reduceRight")
    @js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "purple.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "purple.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "purple.reverse")
    @js.native
    def reverse(): js.Array[String] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "purple.shift")
    @js.native
    def shift(): js.UndefOr[String] = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @JSImport("@ant-design/colors", "purple.slice")
    @js.native
    def slice(): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "purple.slice")
    @js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "purple.slice")
    @js.native
    def slice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "purple.slice")
    @js.native
    def slice(start: Double, end: Double): js.Array[String] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "purple.some")
    @js.native
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "purple.some")
    @js.native
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @JSImport("@ant-design/colors", "purple.sort")
    @js.native
    def sort(): this.type = js.native
    @JSImport("@ant-design/colors", "purple.sort")
    @js.native
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @JSImport("@ant-design/colors", "purple.splice")
    @js.native
    def splice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "purple.splice")
    @js.native
    def splice(start: Double, deleteCount: Double): js.Array[String] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @JSImport("@ant-design/colors", "purple.splice")
    @js.native
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = js.native
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @JSImport("@ant-design/colors", "purple.toLocaleString")
    @js.native
    def toLocaleString_(): String = js.native
    
    /**
      * Returns a string representation of an array.
      */
    @JSImport("@ant-design/colors", "purple.toString")
    @js.native
    def toString_(): String = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @JSImport("@ant-design/colors", "purple.unshift")
    @js.native
    def unshift(items: String*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    @JSImport("@ant-design/colors", "purple.values")
    @js.native
    def values(): IterableIterator[String] = js.native
  }
  
  /* Inlined std.Array<string> & {  primary :string | undefined} */
  object red {
    
    @JSImport("@ant-design/colors", "red")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    @JSImport("@ant-design/colors", "red.concat")
    @js.native
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
    @JSImport("@ant-design/colors", "red.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "red.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @JSImport("@ant-design/colors", "red.entries")
    @js.native
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "red.every")
    @js.native
    def every(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "red.every")
    @js.native
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "red.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSImport("@ant-design/colors", "red.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @JSImport("@ant-design/colors", "red.fill")
    @js.native
    def fill(value: String): this.type = js.native
    @JSImport("@ant-design/colors", "red.fill")
    @js.native
    def fill(value: String, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    @JSImport("@ant-design/colors", "red.fill")
    @js.native
    def fill(value: String, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "red.fill")
    @js.native
    def fill(value: String, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "red.filter")
    @js.native
    def filter(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "red.filter")
    @js.native
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): js.Array[String] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "red.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSImport("@ant-design/colors", "red.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = js.native
    
    @JSImport("@ant-design/colors", "red.find")
    @js.native
    def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): js.UndefOr[String] = js.native
    @JSImport("@ant-design/colors", "red.find")
    @js.native
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
    @JSImport("@ant-design/colors", "red.find")
    @js.native
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSImport("@ant-design/colors", "red.find")
    @js.native
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
    @JSImport("@ant-design/colors", "red.findIndex")
    @js.native
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): Double = js.native
    @JSImport("@ant-design/colors", "red.findIndex")
    @js.native
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _],
      thisArg: js.Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @JSImport("@ant-design/colors", "red.flat")
    @js.native
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    @JSImport("@ant-design/colors", "red.flat")
    @js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
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
    @JSImport("@ant-design/colors", "red.flatMap")
    @js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "red.flatMap")
    @js.native
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
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "red.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    @JSImport("@ant-design/colors", "red.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @JSImport("@ant-design/colors", "red.includes")
    @js.native
    def includes(searchElement: String): Boolean = js.native
    @JSImport("@ant-design/colors", "red.includes")
    @js.native
    def includes(searchElement: String, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @JSImport("@ant-design/colors", "red.indexOf")
    @js.native
    def indexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "red.indexOf")
    @js.native
    def indexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @JSImport("@ant-design/colors", "red.join")
    @js.native
    def join(): String = js.native
    @JSImport("@ant-design/colors", "red.join")
    @js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    @JSImport("@ant-design/colors", "red.keys")
    @js.native
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @JSImport("@ant-design/colors", "red.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "red.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    @JSImport("@ant-design/colors", "red.length")
    @js.native
    def length: Double = js.native
    @scala.inline
    def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "red.map")
    @js.native
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "red.map")
    @js.native
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "red.pop")
    @js.native
    def pop(): js.UndefOr[String] = js.native
    
    @JSImport("@ant-design/colors", "red.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @JSImport("@ant-design/colors", "red.push")
    @js.native
    def push(items: String*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @JSImport("@ant-design/colors", "red.reduce")
    @js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "red.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "red.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "red.reduceRight")
    @js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "red.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "red.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "red.reverse")
    @js.native
    def reverse(): js.Array[String] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "red.shift")
    @js.native
    def shift(): js.UndefOr[String] = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @JSImport("@ant-design/colors", "red.slice")
    @js.native
    def slice(): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "red.slice")
    @js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "red.slice")
    @js.native
    def slice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "red.slice")
    @js.native
    def slice(start: Double, end: Double): js.Array[String] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "red.some")
    @js.native
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "red.some")
    @js.native
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @JSImport("@ant-design/colors", "red.sort")
    @js.native
    def sort(): this.type = js.native
    @JSImport("@ant-design/colors", "red.sort")
    @js.native
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @JSImport("@ant-design/colors", "red.splice")
    @js.native
    def splice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "red.splice")
    @js.native
    def splice(start: Double, deleteCount: Double): js.Array[String] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @JSImport("@ant-design/colors", "red.splice")
    @js.native
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = js.native
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @JSImport("@ant-design/colors", "red.toLocaleString")
    @js.native
    def toLocaleString_(): String = js.native
    
    /**
      * Returns a string representation of an array.
      */
    @JSImport("@ant-design/colors", "red.toString")
    @js.native
    def toString_(): String = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @JSImport("@ant-design/colors", "red.unshift")
    @js.native
    def unshift(items: String*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    @JSImport("@ant-design/colors", "red.values")
    @js.native
    def values(): IterableIterator[String] = js.native
  }
  
  /* Inlined std.Array<string> & {  primary :string | undefined} */
  object volcano {
    
    @JSImport("@ant-design/colors", "volcano")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    @JSImport("@ant-design/colors", "volcano.concat")
    @js.native
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
    @JSImport("@ant-design/colors", "volcano.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "volcano.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @JSImport("@ant-design/colors", "volcano.entries")
    @js.native
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "volcano.every")
    @js.native
    def every(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "volcano.every")
    @js.native
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "volcano.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSImport("@ant-design/colors", "volcano.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @JSImport("@ant-design/colors", "volcano.fill")
    @js.native
    def fill(value: String): this.type = js.native
    @JSImport("@ant-design/colors", "volcano.fill")
    @js.native
    def fill(value: String, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    @JSImport("@ant-design/colors", "volcano.fill")
    @js.native
    def fill(value: String, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "volcano.fill")
    @js.native
    def fill(value: String, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "volcano.filter")
    @js.native
    def filter(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "volcano.filter")
    @js.native
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): js.Array[String] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "volcano.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSImport("@ant-design/colors", "volcano.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = js.native
    
    @JSImport("@ant-design/colors", "volcano.find")
    @js.native
    def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): js.UndefOr[String] = js.native
    @JSImport("@ant-design/colors", "volcano.find")
    @js.native
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
    @JSImport("@ant-design/colors", "volcano.find")
    @js.native
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSImport("@ant-design/colors", "volcano.find")
    @js.native
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
    @JSImport("@ant-design/colors", "volcano.findIndex")
    @js.native
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): Double = js.native
    @JSImport("@ant-design/colors", "volcano.findIndex")
    @js.native
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _],
      thisArg: js.Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @JSImport("@ant-design/colors", "volcano.flat")
    @js.native
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    @JSImport("@ant-design/colors", "volcano.flat")
    @js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
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
    @JSImport("@ant-design/colors", "volcano.flatMap")
    @js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "volcano.flatMap")
    @js.native
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
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "volcano.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    @JSImport("@ant-design/colors", "volcano.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @JSImport("@ant-design/colors", "volcano.includes")
    @js.native
    def includes(searchElement: String): Boolean = js.native
    @JSImport("@ant-design/colors", "volcano.includes")
    @js.native
    def includes(searchElement: String, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @JSImport("@ant-design/colors", "volcano.indexOf")
    @js.native
    def indexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "volcano.indexOf")
    @js.native
    def indexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @JSImport("@ant-design/colors", "volcano.join")
    @js.native
    def join(): String = js.native
    @JSImport("@ant-design/colors", "volcano.join")
    @js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    @JSImport("@ant-design/colors", "volcano.keys")
    @js.native
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @JSImport("@ant-design/colors", "volcano.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "volcano.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    @JSImport("@ant-design/colors", "volcano.length")
    @js.native
    def length: Double = js.native
    @scala.inline
    def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "volcano.map")
    @js.native
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "volcano.map")
    @js.native
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "volcano.pop")
    @js.native
    def pop(): js.UndefOr[String] = js.native
    
    @JSImport("@ant-design/colors", "volcano.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @JSImport("@ant-design/colors", "volcano.push")
    @js.native
    def push(items: String*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @JSImport("@ant-design/colors", "volcano.reduce")
    @js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "volcano.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "volcano.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "volcano.reduceRight")
    @js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "volcano.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "volcano.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "volcano.reverse")
    @js.native
    def reverse(): js.Array[String] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "volcano.shift")
    @js.native
    def shift(): js.UndefOr[String] = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @JSImport("@ant-design/colors", "volcano.slice")
    @js.native
    def slice(): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "volcano.slice")
    @js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "volcano.slice")
    @js.native
    def slice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "volcano.slice")
    @js.native
    def slice(start: Double, end: Double): js.Array[String] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "volcano.some")
    @js.native
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "volcano.some")
    @js.native
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @JSImport("@ant-design/colors", "volcano.sort")
    @js.native
    def sort(): this.type = js.native
    @JSImport("@ant-design/colors", "volcano.sort")
    @js.native
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @JSImport("@ant-design/colors", "volcano.splice")
    @js.native
    def splice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "volcano.splice")
    @js.native
    def splice(start: Double, deleteCount: Double): js.Array[String] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @JSImport("@ant-design/colors", "volcano.splice")
    @js.native
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = js.native
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @JSImport("@ant-design/colors", "volcano.toLocaleString")
    @js.native
    def toLocaleString_(): String = js.native
    
    /**
      * Returns a string representation of an array.
      */
    @JSImport("@ant-design/colors", "volcano.toString")
    @js.native
    def toString_(): String = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @JSImport("@ant-design/colors", "volcano.unshift")
    @js.native
    def unshift(items: String*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    @JSImport("@ant-design/colors", "volcano.values")
    @js.native
    def values(): IterableIterator[String] = js.native
  }
  
  /* Inlined std.Array<string> & {  primary :string | undefined} */
  object yellow {
    
    @JSImport("@ant-design/colors", "yellow")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    @JSImport("@ant-design/colors", "yellow.concat")
    @js.native
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
    @JSImport("@ant-design/colors", "yellow.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "yellow.copyWithin")
    @js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @JSImport("@ant-design/colors", "yellow.entries")
    @js.native
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "yellow.every")
    @js.native
    def every(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "yellow.every")
    @js.native
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "yellow.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSImport("@ant-design/colors", "yellow.every")
    @js.native
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @JSImport("@ant-design/colors", "yellow.fill")
    @js.native
    def fill(value: String): this.type = js.native
    @JSImport("@ant-design/colors", "yellow.fill")
    @js.native
    def fill(value: String, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    @JSImport("@ant-design/colors", "yellow.fill")
    @js.native
    def fill(value: String, start: Double): this.type = js.native
    @JSImport("@ant-design/colors", "yellow.fill")
    @js.native
    def fill(value: String, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "yellow.filter")
    @js.native
    def filter(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "yellow.filter")
    @js.native
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): js.Array[String] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "yellow.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSImport("@ant-design/colors", "yellow.filter")
    @js.native
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = js.native
    
    @JSImport("@ant-design/colors", "yellow.find")
    @js.native
    def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): js.UndefOr[String] = js.native
    @JSImport("@ant-design/colors", "yellow.find")
    @js.native
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
    @JSImport("@ant-design/colors", "yellow.find")
    @js.native
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSImport("@ant-design/colors", "yellow.find")
    @js.native
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
    @JSImport("@ant-design/colors", "yellow.findIndex")
    @js.native
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _]): Double = js.native
    @JSImport("@ant-design/colors", "yellow.findIndex")
    @js.native
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], _],
      thisArg: js.Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @JSImport("@ant-design/colors", "yellow.flat")
    @js.native
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    @JSImport("@ant-design/colors", "yellow.flat")
    @js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
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
    @JSImport("@ant-design/colors", "yellow.flatMap")
    @js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "yellow.flatMap")
    @js.native
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
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "yellow.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    @JSImport("@ant-design/colors", "yellow.forEach")
    @js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @JSImport("@ant-design/colors", "yellow.includes")
    @js.native
    def includes(searchElement: String): Boolean = js.native
    @JSImport("@ant-design/colors", "yellow.includes")
    @js.native
    def includes(searchElement: String, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @JSImport("@ant-design/colors", "yellow.indexOf")
    @js.native
    def indexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "yellow.indexOf")
    @js.native
    def indexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @JSImport("@ant-design/colors", "yellow.join")
    @js.native
    def join(): String = js.native
    @JSImport("@ant-design/colors", "yellow.join")
    @js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    @JSImport("@ant-design/colors", "yellow.keys")
    @js.native
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @JSImport("@ant-design/colors", "yellow.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String): Double = js.native
    @JSImport("@ant-design/colors", "yellow.lastIndexOf")
    @js.native
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    @JSImport("@ant-design/colors", "yellow.length")
    @js.native
    def length: Double = js.native
    @scala.inline
    def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "yellow.map")
    @js.native
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
    @JSImport("@ant-design/colors", "yellow.map")
    @js.native
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "yellow.pop")
    @js.native
    def pop(): js.UndefOr[String] = js.native
    
    @JSImport("@ant-design/colors", "yellow.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @JSImport("@ant-design/colors", "yellow.push")
    @js.native
    def push(items: String*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @JSImport("@ant-design/colors", "yellow.reduce")
    @js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "yellow.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "yellow.reduce")
    @js.native
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
    @JSImport("@ant-design/colors", "yellow.reduceRight")
    @js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSImport("@ant-design/colors", "yellow.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "yellow.reduceRight")
    @js.native
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
    @JSImport("@ant-design/colors", "yellow.reverse")
    @js.native
    def reverse(): js.Array[String] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    @JSImport("@ant-design/colors", "yellow.shift")
    @js.native
    def shift(): js.UndefOr[String] = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @JSImport("@ant-design/colors", "yellow.slice")
    @js.native
    def slice(): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "yellow.slice")
    @js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "yellow.slice")
    @js.native
    def slice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "yellow.slice")
    @js.native
    def slice(start: Double, end: Double): js.Array[String] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @JSImport("@ant-design/colors", "yellow.some")
    @js.native
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _]): Boolean = js.native
    @JSImport("@ant-design/colors", "yellow.some")
    @js.native
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], _],
      thisArg: js.Any
    ): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @JSImport("@ant-design/colors", "yellow.sort")
    @js.native
    def sort(): this.type = js.native
    @JSImport("@ant-design/colors", "yellow.sort")
    @js.native
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @JSImport("@ant-design/colors", "yellow.splice")
    @js.native
    def splice(start: Double): js.Array[String] = js.native
    @JSImport("@ant-design/colors", "yellow.splice")
    @js.native
    def splice(start: Double, deleteCount: Double): js.Array[String] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @JSImport("@ant-design/colors", "yellow.splice")
    @js.native
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = js.native
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @JSImport("@ant-design/colors", "yellow.toLocaleString")
    @js.native
    def toLocaleString_(): String = js.native
    
    /**
      * Returns a string representation of an array.
      */
    @JSImport("@ant-design/colors", "yellow.toString")
    @js.native
    def toString_(): String = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @JSImport("@ant-design/colors", "yellow.unshift")
    @js.native
    def unshift(items: String*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    @JSImport("@ant-design/colors", "yellow.values")
    @js.native
    def values(): IterableIterator[String] = js.native
  }
  
  type PalettesProps = StringDictionary[Arraystringprimarystringu]
}
