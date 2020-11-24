package typings.arrayPrototypeFlatmap.mod

import typings.arrayPrototypeFlatmap.Array
import typings.arrayPrototypeFlatmap.ReadonlyArray
import typings.arrayPrototypeFlatmap.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlatMap extends js.Object {
  
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
