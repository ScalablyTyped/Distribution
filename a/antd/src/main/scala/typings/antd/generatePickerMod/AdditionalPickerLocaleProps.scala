package typings.antd.generatePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalPickerLocaleProps extends js.Object {
  var dateFormat: js.UndefOr[String] = js.undefined
  var dateTimeFormat: js.UndefOr[String] = js.undefined
  var monthFormat: js.UndefOr[String] = js.undefined
  var weekFormat: js.UndefOr[String] = js.undefined
}

object AdditionalPickerLocaleProps {
  @scala.inline
  def apply(
    dateFormat: String = null,
    dateTimeFormat: String = null,
    monthFormat: String = null,
    weekFormat: String = null
  ): AdditionalPickerLocaleProps = {
    val __obj = js.Dynamic.literal()
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dateTimeFormat != null) __obj.updateDynamic("dateTimeFormat")(dateTimeFormat.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (weekFormat != null) __obj.updateDynamic("weekFormat")(weekFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalPickerLocaleProps]
  }
}

