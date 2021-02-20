package typings.arrayPrototypeFlatmap

import org.scalablytyped.runtime.Shortcut
import typings.arrayPrototypeFlatmap.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("array.prototype.flatmap", JSImport.Namespace)
  @js.native
  val ^ : FlatMap = js.native
  
  @js.native
  trait FlatMap extends StObject {
    
    def apply[A, B, T /* <: js.UndefOr[js.Object] */](
      xs: ReadonlyArray[A],
      fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], ReadonlyArray[B]]
    ): Array[B] = js.native
    def apply[A, B, T /* <: js.UndefOr[js.Object] */](
      xs: ReadonlyArray[A],
      fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], ReadonlyArray[B]],
      thisArg: T
    ): Array[B] = js.native
    
    def getPolyfill(): FnCall = js.native
    
    def implementation[A, B, T /* <: js.UndefOr[js.Object] */](
      xs: ReadonlyArray[A],
      fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], ReadonlyArray[B]]
    ): Array[B] = js.native
    def implementation[A, B, T /* <: js.UndefOr[js.Object] */](
      xs: ReadonlyArray[A],
      fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], ReadonlyArray[B]],
      thisArg: T
    ): Array[B] = js.native
    @JSName("implementation")
    var implementation_Original: FnCall = js.native
    
    def shim(): FnCall = js.native
  }
  
  type _To = FlatMap
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FlatMap = ^
}
