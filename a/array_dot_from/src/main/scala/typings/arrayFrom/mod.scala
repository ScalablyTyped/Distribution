package typings.arrayFrom

import typings.std.ArrayLike
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates an array from an array-like or iterable object.
  * @param iterable An iterable object to convert to an array.
  * @param mapfn A mapping function to call on every element of the array.
  * @param thisArg Value of `this` used to invoke the mapfn.
  */
/* Inlined {None <T>(arrayLike : std.ArrayLike<T>): std.Array<T>, None <T, U>(arrayLike : std.ArrayLike<T>, mapfn : (v : T, k : number): U): std.Array<U>, None <T, U>(arrayLike : std.ArrayLike<T>, mapfn : (v : T, k : number): U, thisArg : any): std.Array<U>, None <T>(iterable : std.Iterable<T>): std.Array<T>, None <T>(iterable : std.ArrayLike<T>): std.Array<T>, None <T, U>(iterable : std.Iterable<T>, mapfn : (v : T, k : number): U): std.Array<U>, None <T, U>(iterable : std.ArrayLike<T>, mapfn : (v : T, k : number): U): std.Array<U>, None <T, U>(iterable : std.Iterable<T>, mapfn : (v : T, k : number): U, thisArg : any): std.Array<U>, None <T, U>(iterable : std.ArrayLike<T>, mapfn : (v : T, k : number): U, thisArg : any): std.Array<U>} & { readonly getPolyfill :(): typeof ArrayFrom,  readonly implementation :{None <T>(arrayLike : std.ArrayLike<T>): std.Array<T>, None <T, U>(arrayLike : std.ArrayLike<T>, mapfn : (v : T, k : number): U): std.Array<U>, None <T, U>(arrayLike : std.ArrayLike<T>, mapfn : (v : T, k : number): U, thisArg : any): std.Array<U>, None <T>(iterable : std.Iterable<T>): std.Array<T>, None <T>(iterable : std.ArrayLike<T>): std.Array<T>, None <T, U>(iterable : std.Iterable<T>, mapfn : (v : T, k : number): U): std.Array<U>, None <T, U>(iterable : std.ArrayLike<T>, mapfn : (v : T, k : number): U): std.Array<U>, None <T, U>(iterable : std.Iterable<T>, mapfn : (v : T, k : number): U, thisArg : any): std.Array<U>, None <T, U>(iterable : std.ArrayLike<T>, mapfn : (v : T, k : number): U, thisArg : any): std.Array<U>},  readonly shim :(): typeof ArrayFrom} */
object mod {
  
  @JSImport("array.from", JSImport.Namespace)
  @js.native
  def apply[T](arrayLike: ArrayLike[T]): js.Array[T] = js.native
  @JSImport("array.from", JSImport.Namespace)
  @js.native
  def apply[T](iterable: Iterable[T]): js.Array[T] = js.native
  @JSImport("array.from", JSImport.Namespace)
  @js.native
  def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
  @JSImport("array.from", JSImport.Namespace)
  @js.native
  def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): js.Array[U] = js.native
  @JSImport("array.from", JSImport.Namespace)
  @js.native
  def apply[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
  @JSImport("array.from", JSImport.Namespace)
  @js.native
  def apply[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): js.Array[U] = js.native
  
  /**
    * Gets the optimal `Array.from` implementation to use.
    */
  @JSImport("array.from", "getPolyfill")
  @js.native
  def getPolyfill(): /* import warning: importer.ImportType#apply Failed type conversion: typeof ArrayFrom */ js.Any = js.native
  
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  @JSImport("array.from", "implementation")
  @js.native
  def implementation[T](arrayLike: ArrayLike[T]): js.Array[T] = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  @JSImport("array.from", "implementation")
  @js.native
  def implementation[T](iterable: Iterable[T]): js.Array[T] = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  @JSImport("array.from", "implementation")
  @js.native
  def implementation[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  @JSImport("array.from", "implementation")
  @js.native
  def implementation[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): js.Array[U] = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  @JSImport("array.from", "implementation")
  @js.native
  def implementation[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  @JSImport("array.from", "implementation")
  @js.native
  def implementation[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): js.Array[U] = js.native
  
  @JSImport("array.from", "shim")
  @js.native
  def shim(): /* import warning: importer.ImportType#apply Failed type conversion: typeof ArrayFrom */ js.Any = js.native
}
