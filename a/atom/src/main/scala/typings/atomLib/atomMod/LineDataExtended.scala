package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineDataExtended extends LineData {
  /** Boolean that is true if a fold may be created here. */
  var foldable: scala.Boolean
  /** Number the maximum number of digits necessary to represent any known screen row. */
  var maxDigits: scala.Double
  /** Boolean if this screen row is the soft-wrapped continuation of the same buffer row. */
  var softWrapped: scala.Boolean
}

object LineDataExtended {
  @scala.inline
  def apply(
    bufferRow: scala.Double,
    foldable: scala.Boolean,
    maxDigits: scala.Double,
    screenRow: scala.Double,
    softWrapped: scala.Boolean
  ): LineDataExtended = {
    val __obj = js.Dynamic.literal(bufferRow = bufferRow, foldable = foldable, maxDigits = maxDigits, screenRow = screenRow, softWrapped = softWrapped)
  
    __obj.asInstanceOf[LineDataExtended]
  }
}

