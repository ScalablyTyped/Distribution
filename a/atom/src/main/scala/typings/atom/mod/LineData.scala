package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineData extends js.Object {
  /** Number indicating the zero-indexed buffer index of a line. */
  var bufferRow: Double
  /** Number indicating the zero-indexed screen index. */
  var screenRow: Double
}

object LineData {
  @scala.inline
  def apply(bufferRow: Double, screenRow: Double): LineData = {
    val __obj = js.Dynamic.literal(bufferRow = bufferRow.asInstanceOf[js.Any], screenRow = screenRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineData]
  }
}

