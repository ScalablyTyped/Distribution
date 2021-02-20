package typings.arrayPrototypeFlatmap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[A, B, T /* <: js.UndefOr[js.Object] */](
      xs: ReadonlyArray[A],
      fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], ReadonlyArray[B]]
    ): Array[B] = js.native
    def apply[A, B, T /* <: js.UndefOr[js.Object] */](
      xs: ReadonlyArray[A],
      fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], ReadonlyArray[B]],
      thisArg: T
    ): Array[B] = js.native
  }
}
