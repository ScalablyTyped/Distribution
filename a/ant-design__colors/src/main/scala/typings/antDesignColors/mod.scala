package typings.antDesignColors

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignColors.anon.Arraystringprimarystringu
import typings.antDesignColors.generateMod.Opts
import typings.std.FlatArray
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ant-design/colors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Array<string> & {  primary :string | undefined} */
  object blue {
    
    @JSImport("@ant-design/colors", "blue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    @scala.inline
    def concat(items: (js.Array[String] | String)*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    @scala.inline
    def copyWithin(target: Double, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def copyWithin(target: Double, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @scala.inline
    def entries(): IterableIterator[js.Tuple2[Double, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, String]]]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @scala.inline
    def fill(value: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Unit, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S]]
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S]]
    
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @scala.inline
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[js.Array[FlatArray[A, D]]]
    @scala.inline
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(depth.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatArray[A, D]]]
    
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
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @scala.inline
    def includes(searchElement: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def includes(searchElement: String, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @scala.inline
    def indexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def indexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @scala.inline
    def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
    @scala.inline
    def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns an iterable of keys in the array
      */
    @scala.inline
    def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @scala.inline
    def lastIndexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    @scala.inline
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Removes the last element from an array and returns it.
      */
    @scala.inline
    def pop(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[String]]
    
    @JSImport("@ant-design/colors", "blue.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @scala.inline
    def push(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Reverses the elements in an Array.
      */
    @scala.inline
    def reverse(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[String]]
    
    /**
      * Removes the first element from an array and returns it.
      */
    @scala.inline
    def shift(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[String]]
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @scala.inline
    def slice(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Unit, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @scala.inline
    def sort(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[this.type]
    @scala.inline
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @scala.inline
    def splice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def splice(start: Double, deleteCount: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @scala.inline
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @scala.inline
    def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
    
    /**
      * Returns a string representation of an array.
      */
    @scala.inline
    def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @scala.inline
    def unshift(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns an iterable of values in the array
      */
    @scala.inline
    def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
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
    @scala.inline
    def concat(items: (js.Array[String] | String)*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    @scala.inline
    def copyWithin(target: Double, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def copyWithin(target: Double, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @scala.inline
    def entries(): IterableIterator[js.Tuple2[Double, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, String]]]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @scala.inline
    def fill(value: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Unit, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S]]
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S]]
    
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @scala.inline
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[js.Array[FlatArray[A, D]]]
    @scala.inline
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(depth.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatArray[A, D]]]
    
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
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @scala.inline
    def includes(searchElement: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def includes(searchElement: String, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @scala.inline
    def indexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def indexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @scala.inline
    def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
    @scala.inline
    def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns an iterable of keys in the array
      */
    @scala.inline
    def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @scala.inline
    def lastIndexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    @scala.inline
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Removes the last element from an array and returns it.
      */
    @scala.inline
    def pop(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[String]]
    
    @JSImport("@ant-design/colors", "cyan.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @scala.inline
    def push(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Reverses the elements in an Array.
      */
    @scala.inline
    def reverse(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[String]]
    
    /**
      * Removes the first element from an array and returns it.
      */
    @scala.inline
    def shift(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[String]]
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @scala.inline
    def slice(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Unit, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @scala.inline
    def sort(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[this.type]
    @scala.inline
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @scala.inline
    def splice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def splice(start: Double, deleteCount: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @scala.inline
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @scala.inline
    def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
    
    /**
      * Returns a string representation of an array.
      */
    @scala.inline
    def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @scala.inline
    def unshift(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns an iterable of values in the array
      */
    @scala.inline
    def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
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
    @scala.inline
    def concat(items: (js.Array[String] | String)*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    @scala.inline
    def copyWithin(target: Double, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def copyWithin(target: Double, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @scala.inline
    def entries(): IterableIterator[js.Tuple2[Double, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, String]]]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @scala.inline
    def fill(value: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Unit, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S]]
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S]]
    
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @scala.inline
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[js.Array[FlatArray[A, D]]]
    @scala.inline
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(depth.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatArray[A, D]]]
    
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
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @scala.inline
    def includes(searchElement: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def includes(searchElement: String, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @scala.inline
    def indexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def indexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @scala.inline
    def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
    @scala.inline
    def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns an iterable of keys in the array
      */
    @scala.inline
    def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @scala.inline
    def lastIndexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    @scala.inline
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Removes the last element from an array and returns it.
      */
    @scala.inline
    def pop(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[String]]
    
    @JSImport("@ant-design/colors", "geekblue.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @scala.inline
    def push(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Reverses the elements in an Array.
      */
    @scala.inline
    def reverse(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[String]]
    
    /**
      * Removes the first element from an array and returns it.
      */
    @scala.inline
    def shift(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[String]]
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @scala.inline
    def slice(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Unit, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @scala.inline
    def sort(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[this.type]
    @scala.inline
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @scala.inline
    def splice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def splice(start: Double, deleteCount: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @scala.inline
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @scala.inline
    def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
    
    /**
      * Returns a string representation of an array.
      */
    @scala.inline
    def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @scala.inline
    def unshift(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns an iterable of values in the array
      */
    @scala.inline
    def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
  }
  
  @scala.inline
  def generate(color: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(color.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def generate(color: String, opts: Opts): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /* Inlined std.Array<string> & {  primary :string | undefined} */
  object gold {
    
    @JSImport("@ant-design/colors", "gold")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    @scala.inline
    def concat(items: (js.Array[String] | String)*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    @scala.inline
    def copyWithin(target: Double, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def copyWithin(target: Double, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @scala.inline
    def entries(): IterableIterator[js.Tuple2[Double, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, String]]]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @scala.inline
    def fill(value: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Unit, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S]]
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S]]
    
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @scala.inline
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[js.Array[FlatArray[A, D]]]
    @scala.inline
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(depth.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatArray[A, D]]]
    
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
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @scala.inline
    def includes(searchElement: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def includes(searchElement: String, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @scala.inline
    def indexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def indexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @scala.inline
    def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
    @scala.inline
    def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns an iterable of keys in the array
      */
    @scala.inline
    def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @scala.inline
    def lastIndexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    @scala.inline
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Removes the last element from an array and returns it.
      */
    @scala.inline
    def pop(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[String]]
    
    @JSImport("@ant-design/colors", "gold.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @scala.inline
    def push(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Reverses the elements in an Array.
      */
    @scala.inline
    def reverse(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[String]]
    
    /**
      * Removes the first element from an array and returns it.
      */
    @scala.inline
    def shift(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[String]]
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @scala.inline
    def slice(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Unit, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @scala.inline
    def sort(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[this.type]
    @scala.inline
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @scala.inline
    def splice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def splice(start: Double, deleteCount: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @scala.inline
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @scala.inline
    def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
    
    /**
      * Returns a string representation of an array.
      */
    @scala.inline
    def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @scala.inline
    def unshift(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns an iterable of values in the array
      */
    @scala.inline
    def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
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
    @scala.inline
    def concat(items: (js.Array[String] | String)*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    @scala.inline
    def copyWithin(target: Double, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def copyWithin(target: Double, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @scala.inline
    def entries(): IterableIterator[js.Tuple2[Double, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, String]]]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @scala.inline
    def fill(value: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Unit, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S]]
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S]]
    
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @scala.inline
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[js.Array[FlatArray[A, D]]]
    @scala.inline
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(depth.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatArray[A, D]]]
    
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
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @scala.inline
    def includes(searchElement: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def includes(searchElement: String, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @scala.inline
    def indexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def indexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @scala.inline
    def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
    @scala.inline
    def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns an iterable of keys in the array
      */
    @scala.inline
    def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @scala.inline
    def lastIndexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    @scala.inline
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Removes the last element from an array and returns it.
      */
    @scala.inline
    def pop(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[String]]
    
    @JSImport("@ant-design/colors", "green.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @scala.inline
    def push(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Reverses the elements in an Array.
      */
    @scala.inline
    def reverse(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[String]]
    
    /**
      * Removes the first element from an array and returns it.
      */
    @scala.inline
    def shift(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[String]]
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @scala.inline
    def slice(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Unit, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @scala.inline
    def sort(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[this.type]
    @scala.inline
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @scala.inline
    def splice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def splice(start: Double, deleteCount: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @scala.inline
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @scala.inline
    def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
    
    /**
      * Returns a string representation of an array.
      */
    @scala.inline
    def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @scala.inline
    def unshift(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns an iterable of values in the array
      */
    @scala.inline
    def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
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
    @scala.inline
    def concat(items: (js.Array[String] | String)*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    @scala.inline
    def copyWithin(target: Double, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def copyWithin(target: Double, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @scala.inline
    def entries(): IterableIterator[js.Tuple2[Double, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, String]]]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @scala.inline
    def fill(value: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Unit, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S]]
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S]]
    
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @scala.inline
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[js.Array[FlatArray[A, D]]]
    @scala.inline
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(depth.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatArray[A, D]]]
    
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
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @scala.inline
    def includes(searchElement: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def includes(searchElement: String, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @scala.inline
    def indexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def indexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @scala.inline
    def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
    @scala.inline
    def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns an iterable of keys in the array
      */
    @scala.inline
    def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @scala.inline
    def lastIndexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    @scala.inline
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Removes the last element from an array and returns it.
      */
    @scala.inline
    def pop(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[String]]
    
    @JSImport("@ant-design/colors", "grey.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @scala.inline
    def push(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Reverses the elements in an Array.
      */
    @scala.inline
    def reverse(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[String]]
    
    /**
      * Removes the first element from an array and returns it.
      */
    @scala.inline
    def shift(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[String]]
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @scala.inline
    def slice(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Unit, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @scala.inline
    def sort(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[this.type]
    @scala.inline
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @scala.inline
    def splice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def splice(start: Double, deleteCount: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @scala.inline
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @scala.inline
    def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
    
    /**
      * Returns a string representation of an array.
      */
    @scala.inline
    def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @scala.inline
    def unshift(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns an iterable of values in the array
      */
    @scala.inline
    def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
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
    @scala.inline
    def concat(items: (js.Array[String] | String)*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    @scala.inline
    def copyWithin(target: Double, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def copyWithin(target: Double, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @scala.inline
    def entries(): IterableIterator[js.Tuple2[Double, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, String]]]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @scala.inline
    def fill(value: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Unit, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S]]
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S]]
    
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @scala.inline
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[js.Array[FlatArray[A, D]]]
    @scala.inline
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(depth.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatArray[A, D]]]
    
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
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @scala.inline
    def includes(searchElement: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def includes(searchElement: String, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @scala.inline
    def indexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def indexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @scala.inline
    def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
    @scala.inline
    def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns an iterable of keys in the array
      */
    @scala.inline
    def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @scala.inline
    def lastIndexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    @scala.inline
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Removes the last element from an array and returns it.
      */
    @scala.inline
    def pop(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[String]]
    
    @JSImport("@ant-design/colors", "lime.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @scala.inline
    def push(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Reverses the elements in an Array.
      */
    @scala.inline
    def reverse(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[String]]
    
    /**
      * Removes the first element from an array and returns it.
      */
    @scala.inline
    def shift(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[String]]
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @scala.inline
    def slice(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Unit, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @scala.inline
    def sort(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[this.type]
    @scala.inline
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @scala.inline
    def splice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def splice(start: Double, deleteCount: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @scala.inline
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @scala.inline
    def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
    
    /**
      * Returns a string representation of an array.
      */
    @scala.inline
    def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @scala.inline
    def unshift(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns an iterable of values in the array
      */
    @scala.inline
    def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
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
    @scala.inline
    def concat(items: (js.Array[String] | String)*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    @scala.inline
    def copyWithin(target: Double, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def copyWithin(target: Double, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @scala.inline
    def entries(): IterableIterator[js.Tuple2[Double, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, String]]]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @scala.inline
    def fill(value: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Unit, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S]]
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S]]
    
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @scala.inline
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[js.Array[FlatArray[A, D]]]
    @scala.inline
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(depth.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatArray[A, D]]]
    
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
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @scala.inline
    def includes(searchElement: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def includes(searchElement: String, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @scala.inline
    def indexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def indexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @scala.inline
    def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
    @scala.inline
    def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns an iterable of keys in the array
      */
    @scala.inline
    def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @scala.inline
    def lastIndexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    @scala.inline
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Removes the last element from an array and returns it.
      */
    @scala.inline
    def pop(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[String]]
    
    @JSImport("@ant-design/colors", "magenta.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @scala.inline
    def push(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Reverses the elements in an Array.
      */
    @scala.inline
    def reverse(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[String]]
    
    /**
      * Removes the first element from an array and returns it.
      */
    @scala.inline
    def shift(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[String]]
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @scala.inline
    def slice(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Unit, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @scala.inline
    def sort(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[this.type]
    @scala.inline
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @scala.inline
    def splice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def splice(start: Double, deleteCount: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @scala.inline
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @scala.inline
    def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
    
    /**
      * Returns a string representation of an array.
      */
    @scala.inline
    def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @scala.inline
    def unshift(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns an iterable of values in the array
      */
    @scala.inline
    def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
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
    @scala.inline
    def concat(items: (js.Array[String] | String)*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    @scala.inline
    def copyWithin(target: Double, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def copyWithin(target: Double, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @scala.inline
    def entries(): IterableIterator[js.Tuple2[Double, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, String]]]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @scala.inline
    def fill(value: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Unit, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S]]
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S]]
    
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @scala.inline
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[js.Array[FlatArray[A, D]]]
    @scala.inline
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(depth.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatArray[A, D]]]
    
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
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @scala.inline
    def includes(searchElement: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def includes(searchElement: String, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @scala.inline
    def indexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def indexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @scala.inline
    def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
    @scala.inline
    def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns an iterable of keys in the array
      */
    @scala.inline
    def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @scala.inline
    def lastIndexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    @scala.inline
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Removes the last element from an array and returns it.
      */
    @scala.inline
    def pop(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[String]]
    
    @JSImport("@ant-design/colors", "orange.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @scala.inline
    def push(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Reverses the elements in an Array.
      */
    @scala.inline
    def reverse(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[String]]
    
    /**
      * Removes the first element from an array and returns it.
      */
    @scala.inline
    def shift(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[String]]
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @scala.inline
    def slice(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Unit, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @scala.inline
    def sort(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[this.type]
    @scala.inline
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @scala.inline
    def splice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def splice(start: Double, deleteCount: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @scala.inline
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @scala.inline
    def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
    
    /**
      * Returns a string representation of an array.
      */
    @scala.inline
    def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @scala.inline
    def unshift(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns an iterable of values in the array
      */
    @scala.inline
    def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
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
    @scala.inline
    def concat(items: (js.Array[String] | String)*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    @scala.inline
    def copyWithin(target: Double, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def copyWithin(target: Double, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @scala.inline
    def entries(): IterableIterator[js.Tuple2[Double, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, String]]]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @scala.inline
    def fill(value: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Unit, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S]]
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S]]
    
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @scala.inline
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[js.Array[FlatArray[A, D]]]
    @scala.inline
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(depth.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatArray[A, D]]]
    
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
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @scala.inline
    def includes(searchElement: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def includes(searchElement: String, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @scala.inline
    def indexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def indexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @scala.inline
    def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
    @scala.inline
    def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns an iterable of keys in the array
      */
    @scala.inline
    def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @scala.inline
    def lastIndexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    @scala.inline
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Removes the last element from an array and returns it.
      */
    @scala.inline
    def pop(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[String]]
    
    @JSImport("@ant-design/colors", "purple.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @scala.inline
    def push(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Reverses the elements in an Array.
      */
    @scala.inline
    def reverse(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[String]]
    
    /**
      * Removes the first element from an array and returns it.
      */
    @scala.inline
    def shift(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[String]]
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @scala.inline
    def slice(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Unit, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @scala.inline
    def sort(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[this.type]
    @scala.inline
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @scala.inline
    def splice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def splice(start: Double, deleteCount: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @scala.inline
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @scala.inline
    def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
    
    /**
      * Returns a string representation of an array.
      */
    @scala.inline
    def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @scala.inline
    def unshift(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns an iterable of values in the array
      */
    @scala.inline
    def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
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
    @scala.inline
    def concat(items: (js.Array[String] | String)*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    @scala.inline
    def copyWithin(target: Double, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def copyWithin(target: Double, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @scala.inline
    def entries(): IterableIterator[js.Tuple2[Double, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, String]]]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @scala.inline
    def fill(value: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Unit, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S]]
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S]]
    
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @scala.inline
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[js.Array[FlatArray[A, D]]]
    @scala.inline
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(depth.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatArray[A, D]]]
    
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
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @scala.inline
    def includes(searchElement: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def includes(searchElement: String, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @scala.inline
    def indexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def indexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @scala.inline
    def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
    @scala.inline
    def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns an iterable of keys in the array
      */
    @scala.inline
    def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @scala.inline
    def lastIndexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    @scala.inline
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Removes the last element from an array and returns it.
      */
    @scala.inline
    def pop(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[String]]
    
    @JSImport("@ant-design/colors", "red.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @scala.inline
    def push(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Reverses the elements in an Array.
      */
    @scala.inline
    def reverse(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[String]]
    
    /**
      * Removes the first element from an array and returns it.
      */
    @scala.inline
    def shift(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[String]]
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @scala.inline
    def slice(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Unit, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @scala.inline
    def sort(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[this.type]
    @scala.inline
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @scala.inline
    def splice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def splice(start: Double, deleteCount: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @scala.inline
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @scala.inline
    def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
    
    /**
      * Returns a string representation of an array.
      */
    @scala.inline
    def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @scala.inline
    def unshift(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns an iterable of values in the array
      */
    @scala.inline
    def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
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
    @scala.inline
    def concat(items: (js.Array[String] | String)*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    @scala.inline
    def copyWithin(target: Double, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def copyWithin(target: Double, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @scala.inline
    def entries(): IterableIterator[js.Tuple2[Double, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, String]]]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @scala.inline
    def fill(value: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Unit, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S]]
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S]]
    
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @scala.inline
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[js.Array[FlatArray[A, D]]]
    @scala.inline
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(depth.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatArray[A, D]]]
    
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
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @scala.inline
    def includes(searchElement: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def includes(searchElement: String, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @scala.inline
    def indexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def indexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @scala.inline
    def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
    @scala.inline
    def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns an iterable of keys in the array
      */
    @scala.inline
    def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @scala.inline
    def lastIndexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    @scala.inline
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Removes the last element from an array and returns it.
      */
    @scala.inline
    def pop(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[String]]
    
    @JSImport("@ant-design/colors", "volcano.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @scala.inline
    def push(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Reverses the elements in an Array.
      */
    @scala.inline
    def reverse(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[String]]
    
    /**
      * Removes the first element from an array and returns it.
      */
    @scala.inline
    def shift(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[String]]
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @scala.inline
    def slice(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Unit, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @scala.inline
    def sort(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[this.type]
    @scala.inline
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @scala.inline
    def splice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def splice(start: Double, deleteCount: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @scala.inline
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @scala.inline
    def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
    
    /**
      * Returns a string representation of an array.
      */
    @scala.inline
    def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @scala.inline
    def unshift(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns an iterable of values in the array
      */
    @scala.inline
    def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
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
    @scala.inline
    def concat(items: (js.Array[String] | String)*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    @scala.inline
    def copyWithin(target: Double, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def copyWithin(target: Double, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    @scala.inline
    def entries(): IterableIterator[js.Tuple2[Double, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, String]]]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
    @scala.inline
    def every_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    @scala.inline
    def fill(value: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Double, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    @scala.inline
    def fill(value: String, start: Unit, end: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S]]
    @scala.inline
    def filter_S_String[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.Array[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S]]
    
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
    @scala.inline
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    @scala.inline
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[js.Array[FlatArray[A, D]]]
    @scala.inline
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(depth.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatArray[A, D]]]
    
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
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    @scala.inline
    def includes(searchElement: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def includes(searchElement: String, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    @scala.inline
    def indexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def indexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    @scala.inline
    def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
    @scala.inline
    def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns an iterable of keys in the array
      */
    @scala.inline
    def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
    
    /**
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    @scala.inline
    def lastIndexOf(searchElement: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    @scala.inline
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    @scala.inline
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: js.Any
    ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
    
    /**
      * Removes the last element from an array and returns it.
      */
    @scala.inline
    def pop(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[String]]
    
    @JSImport("@ant-design/colors", "yellow.primary")
    @js.native
    def primary: js.UndefOr[String] = js.native
    @scala.inline
    def primary_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    @scala.inline
    def push(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @scala.inline
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    /**
      * Reverses the elements in an Array.
      */
    @scala.inline
    def reverse(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[String]]
    
    /**
      * Removes the first element from an array and returns it.
      */
    @scala.inline
    def shift(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[String]]
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    @scala.inline
    def slice(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Double, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def slice(start: Unit, end: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any]
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], js.Any],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    @scala.inline
    def sort(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[this.type]
    @scala.inline
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    @scala.inline
    def splice(start: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def splice(start: Double, deleteCount: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    @scala.inline
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
      */
    @scala.inline
    def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
    
    /**
      * Returns a string representation of an array.
      */
    @scala.inline
    def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    @scala.inline
    def unshift(items: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns an iterable of values in the array
      */
    @scala.inline
    def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
  }
  
  type PalettesProps = StringDictionary[Arraystringprimarystringu]
}
