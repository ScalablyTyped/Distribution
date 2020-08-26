package typings.androiduix.android.widget.NumberPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwoDigitFormatter extends Formatter

object TwoDigitFormatter {
  @scala.inline
  def apply(format: Double => String): TwoDigitFormatter = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format))
    __obj.asInstanceOf[TwoDigitFormatter]
  }
}

