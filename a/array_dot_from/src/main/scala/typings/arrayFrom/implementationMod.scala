package typings.arrayFrom

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationMod {
  
  /**
    * Creates an array from an iterable object.
    * @param iterable An iterable object to convert to an array.
    */
  /* standard es2015.iterable */
  /* was `typeof Array.from` */
  inline def apply[T](iterable: js.Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  /* was `typeof Array.from` */
  inline def apply[T](iterable: ArrayLike[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  /**
    * Creates an array from an iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  /* standard es2015.iterable */
  /* was `typeof Array.from` */
  inline def apply[T, U](iterable: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  /* was `typeof Array.from` */
  inline def apply[T, U](iterable: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): js.Array[U] = (^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  /* was `typeof Array.from` */
  inline def apply[T, U](iterable: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  /* was `typeof Array.from` */
  inline def apply[T, U](iterable: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): js.Array[U] = (^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  @JSImport("array.from/implementation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
