package typings.atom.atomMod

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
    val __obj = js.Dynamic.literal(bufferRow = bufferRow, screenRow = screenRow)
  
    __obj.asInstanceOf[LineData]
  }
}

