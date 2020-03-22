package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLangTimePickerLocale extends js.Object {
  var lang: AnonDayFormat
  var timePickerLocale: AnonPlaceholderString
}

object AnonLangTimePickerLocale {
  @scala.inline
  def apply(lang: AnonDayFormat, timePickerLocale: AnonPlaceholderString): AnonLangTimePickerLocale = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], timePickerLocale = timePickerLocale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLangTimePickerLocale]
  }
}

