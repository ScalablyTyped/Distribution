package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateTimeFormat extends js.Object {
  var dateFormat: String
  var dateTimeFormat: String
  var lang: AnonClear
  var monthFormat: String
  var timePickerLocale: AnonPlaceholderString
  var weekFormat: String
}

object AnonDateTimeFormat {
  @scala.inline
  def apply(
    dateFormat: String,
    dateTimeFormat: String,
    lang: AnonClear,
    monthFormat: String,
    timePickerLocale: AnonPlaceholderString,
    weekFormat: String
  ): AnonDateTimeFormat = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], monthFormat = monthFormat.asInstanceOf[js.Any], timePickerLocale = timePickerLocale.asInstanceOf[js.Any], weekFormat = weekFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDateTimeFormat]
  }
}

