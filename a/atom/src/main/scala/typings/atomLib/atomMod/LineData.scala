package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineData extends js.Object {
  /** Number indicating the zero-indexed buffer index of a line. */
  var bufferRow: scala.Double
  /** Number indicating the zero-indexed screen index. */
  var screenRow: scala.Double
}

object LineData {
  @scala.inline
  def apply(bufferRow: scala.Double, screenRow: scala.Double): LineData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bufferRow")(bufferRow)
    __obj.updateDynamic("screenRow")(screenRow)
    __obj.asInstanceOf[LineData]
  }
}

