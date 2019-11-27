package typings.arrayDotPrototypeDotFlatmap.arrayDotPrototypeDotFlatmapMod

import typings.arrayDotPrototypeDotFlatmap.Fn_Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatMap extends js.Object {
  @JSName("implementation")
  var implementation_Original: Fn_Array = js.native
  def apply[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ js.Array[A], js.Array[B]]
  ): js.Array[B] = js.native
  def apply[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ js.Array[A], js.Array[B]],
    thisArg: T
  ): js.Array[B] = js.native
  def getPolyfill(): Fn_Array = js.native
  def implementation[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ js.Array[A], js.Array[B]]
  ): js.Array[B] = js.native
  def implementation[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ Double, /* array */ js.Array[A], js.Array[B]],
    thisArg: T
  ): js.Array[B] = js.native
  def shim(): Fn_Array = js.native
}

