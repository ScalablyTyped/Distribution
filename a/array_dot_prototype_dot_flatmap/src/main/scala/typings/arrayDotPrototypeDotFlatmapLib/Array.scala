package typings
package arrayDotPrototypeDotFlatmapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array[T] extends js.Object {
  def flatMap[U, R /* <: js.UndefOr[js.Object] */](
    fn: js.ThisFunction3[/* this */ R, /* x */ T, /* index */ scala.Double, /* array */ this.type, Array[U]]
  ): Array[U] = js.native
  def flatMap[U, R /* <: js.UndefOr[js.Object] */](
    fn: js.ThisFunction3[/* this */ R, /* x */ T, /* index */ scala.Double, /* array */ this.type, Array[U]],
    thisArg: R
  ): Array[U] = js.native
}

