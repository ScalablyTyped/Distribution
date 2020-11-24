package typings.arrayFrom

import typings.std.ArrayLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("array.from", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[T](arrayLike: ArrayLike[T]): js.Array[T] = js.native
  def apply[T](iterable: Iterable[T]): js.Array[T] = js.native
  def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
  def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): js.Array[U] = js.native
  def apply[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
  def apply[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): js.Array[U] = js.native
  
  /**
    * Gets the optimal `Array.from` implementation to use.
    */
  def getPolyfill(): /* import warning: importer.ImportType#apply Failed type conversion: typeof ArrayFrom */ js.Any = js.native
  
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  def implementation[T](arrayLike: ArrayLike[T]): js.Array[T] = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  def implementation[T](iterable: Iterable[T]): js.Array[T] = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  def implementation[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  def implementation[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): js.Array[U] = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  def implementation[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of `this` used to invoke the mapfn.
    */
  def implementation[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): js.Array[U] = js.native
  
  def shim(): /* import warning: importer.ImportType#apply Failed type conversion: typeof ArrayFrom */ js.Any = js.native
}
