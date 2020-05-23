package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerLocaleDismissText extends js.Object {
  var DatePickerLocale: Calendar
  var dismissText: String
  var extra: String
  var okText: String
}

object DatePickerLocaleDismissText {
  @scala.inline
  def apply(DatePickerLocale: Calendar, dismissText: String, extra: String, okText: String): DatePickerLocaleDismissText = {
    val __obj = js.Dynamic.literal(DatePickerLocale = DatePickerLocale.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerLocaleDismissText]
  }
}

