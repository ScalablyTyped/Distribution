package typings.arrayFrom

import typings.std.ArrayLike
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](arrayLike: ArrayLike[T]): js.Array[T] = js.native
    def apply[T](iterable: Iterable[T]): js.Array[T] = js.native
    def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
    def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): js.Array[U] = js.native
    def apply[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
    def apply[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): js.Array[U] = js.native
  }
}
