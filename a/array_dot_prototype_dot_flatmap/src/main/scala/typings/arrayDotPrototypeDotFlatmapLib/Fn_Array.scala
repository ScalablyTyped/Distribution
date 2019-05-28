package typings
package arrayDotPrototypeDotFlatmapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Array extends js.Object {
  def apply[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ scala.Double, /* array */ Array[A], Array[B]]
  ): Array[B] = js.native
  def apply[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[/* this */ T, /* x */ A, /* index */ scala.Double, /* array */ Array[A], Array[B]],
    thisArg: T
  ): Array[B] = js.native
}

