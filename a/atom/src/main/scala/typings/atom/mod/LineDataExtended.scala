package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineDataExtended extends LineData {
  /** Boolean that is true if a fold may be created here. */
  var foldable: Boolean = js.native
  /** Number the maximum number of digits necessary to represent any known screen row. */
  var maxDigits: Double = js.native
  /** Boolean if this screen row is the soft-wrapped continuation of the same buffer row. */
  var softWrapped: Boolean = js.native
}

object LineDataExtended {
  @scala.inline
  def apply(bufferRow: Double, foldable: Boolean, maxDigits: Double, screenRow: Double, softWrapped: Boolean): LineDataExtended = {
    val __obj = js.Dynamic.literal(bufferRow = bufferRow.asInstanceOf[js.Any], foldable = foldable.asInstanceOf[js.Any], maxDigits = maxDigits.asInstanceOf[js.Any], screenRow = screenRow.asInstanceOf[js.Any], softWrapped = softWrapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineDataExtended]
  }
  @scala.inline
  implicit class LineDataExtendedOps[Self <: LineDataExtended] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFoldable(value: Boolean): Self = this.set("foldable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxDigits(value: Double): Self = this.set("maxDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoftWrapped(value: Boolean): Self = this.set("softWrapped", value.asInstanceOf[js.Any])
  }
  
}

