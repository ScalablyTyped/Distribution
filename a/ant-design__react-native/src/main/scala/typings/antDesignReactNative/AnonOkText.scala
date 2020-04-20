package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOkText extends js.Object {
  var DatePickerLocale: AnonCalendar
  var dismissText: String
  var extra: String
  var okText: String
}

object AnonOkText {
  @scala.inline
  def apply(DatePickerLocale: AnonCalendar, dismissText: String, extra: String, okText: String): AnonOkText = {
    val __obj = js.Dynamic.literal(DatePickerLocale = DatePickerLocale.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOkText]
  }
}

