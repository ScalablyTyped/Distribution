package typings.arrayPrototypeFlatmap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationMod {
  
  inline def apply[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: ReadonlyArray[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], ReadonlyArray[B]]
  ): Array[B] = (^.asInstanceOf[js.Dynamic].apply(xs.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Array[B]]
  inline def apply[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: ReadonlyArray[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], ReadonlyArray[B]],
    thisArg: T
  ): Array[B] = (^.asInstanceOf[js.Dynamic].apply(xs.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Array[B]]
  
  @JSImport("array.prototype.flatmap/implementation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
