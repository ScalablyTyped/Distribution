package typings.arrayFrom

import typings.std.ArrayLike
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationMod {
  
  /* was `typeof Array.from` */
  @JSImport("array.from/implementation", JSImport.Namespace)
  @js.native
  def apply[T](iterable: ArrayLike[T]): js.Array[T] = js.native
  /**
    * Creates an array from an iterable object.
    * @param iterable An iterable object to convert to an array.
    */
  /* was `typeof Array.from` */
  @JSImport("array.from/implementation", JSImport.Namespace)
  @js.native
  def apply[T](iterable: Iterable[T]): js.Array[T] = js.native
  /* was `typeof Array.from` */
  @JSImport("array.from/implementation", JSImport.Namespace)
  @js.native
  def apply[T, U](iterable: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
  /* was `typeof Array.from` */
  @JSImport("array.from/implementation", JSImport.Namespace)
  @js.native
  def apply[T, U](iterable: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): js.Array[U] = js.native
  /**
    * Creates an array from an iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  /* was `typeof Array.from` */
  @JSImport("array.from/implementation", JSImport.Namespace)
  @js.native
  def apply[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
  /* was `typeof Array.from` */
  @JSImport("array.from/implementation", JSImport.Namespace)
  @js.native
  def apply[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): js.Array[U] = js.native
}
