package typings.arrayPrototypeFlatmap.mod

import typings.arrayPrototypeFlatmap.Array
import typings.arrayPrototypeFlatmap.FnArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatMap extends js.Object {
  @JSName("implementation")
  var implementation_Original: FnArray = js.native
  def apply[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], Array[B]]
  ): Array[B] = js.native
  def apply[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], Array[B]],
    thisArg: T
  ): Array[B] = js.native
  def getPolyfill(): FnArray = js.native
  def implementation[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], Array[B]]
  ): Array[B] = js.native
  def implementation[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ Array[A], Array[B]],
    thisArg: T
  ): Array[B] = js.native
  def shim(): FnArray = js.native
}

