package typings.arrayPrototypeFlatmap.mod

import typings.arrayPrototypeFlatmap.Array
import typings.arrayPrototypeFlatmap.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatMap extends js.Object {
  @JSName("implementation")
  var implementation_Original: FnCall = js.native
  def apply[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], Array[B]]
  ): Array[B] = js.native
  def apply[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], Array[B]],
    thisArg: T
  ): Array[B] = js.native
  def getPolyfill(): FnCall = js.native
  def implementation[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], Array[B]]
  ): Array[B] = js.native
  def implementation[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], Array[B]],
    thisArg: T
  ): Array[B] = js.native
  def shim(): FnCall = js.native
}

