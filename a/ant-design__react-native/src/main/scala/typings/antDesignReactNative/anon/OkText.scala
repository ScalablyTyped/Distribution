package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OkText extends js.Object {
  var DatePickerLocale: Calendar
  var dismissText: String
  var extra: String
  var okText: String
}

object OkText {
  @scala.inline
  def apply(DatePickerLocale: Calendar, dismissText: String, extra: String, okText: String): OkText = {
    val __obj = js.Dynamic.literal(DatePickerLocale = DatePickerLocale.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OkText]
  }
}

