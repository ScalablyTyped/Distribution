package typings.atom.mod

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
    val __obj = js.Dynamic.literal(bufferRow = bufferRow.asInstanceOf[js.Any], foldable = foldable.asInstanceOf[js.Any], maxDigits = maxDigits.asInstanceOf[js.Any], screenRow = screenRow.asInstanceOf[js.Any], softWrapped = softWrapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineDataExtended]
  }
}

