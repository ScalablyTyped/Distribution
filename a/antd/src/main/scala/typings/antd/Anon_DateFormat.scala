package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateFormat extends js.Object {
  var dateFormat: String
  var dateTimeFormat: String
  var lang: js.Any
  var monthFormat: String
  var timePickerLocale: Anon_Placeholder
  var weekFormat: String
}

object Anon_DateFormat {
  @scala.inline
  def apply(
    dateFormat: String,
    dateTimeFormat: String,
    lang: js.Any,
    monthFormat: String,
    timePickerLocale: Anon_Placeholder,
    weekFormat: String
  ): Anon_DateFormat = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], monthFormat = monthFormat.asInstanceOf[js.Any], timePickerLocale = timePickerLocale.asInstanceOf[js.Any], weekFormat = weekFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DateFormat]
  }
}

