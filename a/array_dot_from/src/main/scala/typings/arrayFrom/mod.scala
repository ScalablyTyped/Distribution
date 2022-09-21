package typings.arrayFrom

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates an array from an array-like or iterable object.
  * @param iterable An iterable object to convert to an array.
  * @param mapfn A mapping function to call on every element of the array.
  * @param thisArg Value of `this` used to invoke the mapfn.
  */
/* Inlined {None <T>(arrayLike : std.ArrayLike<T>): std.Array<T>, None <T, U>(arrayLike : std.ArrayLike<T>, mapfn : (v : T, k : number): U): std.Array<U>, None <T, U>(arrayLike : std.ArrayLike<T>, mapfn : (v : T, k : number): U, thisArg : any): std.Array<U>, None <T>(iterable : std.Iterable<T>): std.Array<T>, None <T>(iterable : std.ArrayLike<T>): std.Array<T>, None <T, U>(iterable : std.Iterable<T>, mapfn : (v : T, k : number): U): std.Array<U>, None <T, U>(iterable : std.ArrayLike<T>, mapfn : (v : T, k : number): U): std.Array<U>, None <T, U>(iterable : std.Iterable<T>, mapfn : (v : T, k : number): U, thisArg : any): std.Array<U>, None <T, U>(iterable : std.ArrayLike<T>, mapfn : (v : T, k : number): U, thisArg : any): std.Array<U>} & { readonly getPolyfill :(): typeof ArrayFrom,  readonly implementation :{None <T>(arrayLike : std.ArrayLike<T>): std.Array<T>, None <T, U>(arrayLike : std.ArrayLike<T>, mapfn : (v : T, k : number): U): std.Array<U>, None <T, U>(arrayLike : std.ArrayLike<T>, mapfn : (v : T, k : number): U, thisArg : any): std.Array<U>, None <T>(iterable : std.Iterable<T>): std.Array<T>, None <T>(iterable : std.ArrayLike<T>): std.Array<T>, None <T, U>(iterable : std.Iterable<T>, mapfn : (v : T, k : number): U): std.Array<U>, None <T, U>(iterable : std.ArrayLike<T>, mapfn : (v : T, k : number): U): std.Array<U>, None <T, U>(iterable : std.Iterable<T>, mapfn : (v : T, k : number): U, thisArg : any): std.Array<U>, None <T, U>(iterable : std.ArrayLike<T>, mapfn : (v : T, k : number): U, thisArg : any): std.Array<U>},  readonly shim :(): typeof ArrayFrom} */
object mod {
  
  inline def apply[T](arrayLike: ArrayLike[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(arrayLike.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def apply[T](iterable: js.Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].apply(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  inline def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): js.Array[U] = (^.asInstanceOf[js.Dynamic].apply(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  inline def apply[T, U](iterable: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  inline def apply[T, U](iterable: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): js.Array[U] = (^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  @JSImport("array.from", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the optimal `Array.from` implementation to use.
    */
  inline def getPolyfill(): /* import warning: importer.ImportType#apply Failed type conversion: typeof ArrayFrom */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolyfill")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: typeof ArrayFrom */ js.Any]
  
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  inline def implementation[T](arrayLike: ArrayLike[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(arrayLike.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  inline def implementation[T](iterable: js.Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  inline def implementation[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  inline def implementation[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  inline def implementation[T, U](iterable: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(iterable.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  inline def implementation[T, U](iterable: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(iterable.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  inline def shim(): /* import warning: importer.ImportType#apply Failed type conversion: typeof ArrayFrom */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shim")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: typeof ArrayFrom */ js.Any]
}
