package typings.atom.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineDataExtended extends LineData {
  /** Boolean that is true if a fold may be created here. */
  var foldable: Boolean
  /** Number the maximum number of digits necessary to represent any known screen row. */
  var maxDigits: Double
  /** Boolean if this screen row is the soft-wrapped continuation of the same buffer row. */
  var softWrapped: Boolean
}

object LineDataExtended {
  @scala.inline
  def apply(bufferRow: Double, foldable: Boolean, maxDigits: Double, screenRow: Double, softWrapped: Boolean): LineDataExtended = {
    val __obj = js.Dynamic.literal(bufferRow = bufferRow, foldable = foldable, maxDigits = maxDigits, screenRow = screenRow, softWrapped = softWrapped)
  
    __obj.asInstanceOf[LineDataExtended]
  }
}

