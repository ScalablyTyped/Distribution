package typings.antd.generatePickerMod

import typings.antd.timePickerMod.TimePickerLocale
import typings.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  lang  :rc-picker.rc-picker/lib/interface.Locale & antd.antd/lib/date-picker/generatePicker.AdditionalPickerLocaleLangProps,   timePickerLocale  :antd.antd/lib/time-picker.TimePickerLocale} & antd.antd/lib/date-picker/generatePicker.AdditionalPickerLocaleProps */
trait PickerLocale extends js.Object {
  var dateFormat: js.UndefOr[String] = js.undefined
  var dateTimeFormat: js.UndefOr[String] = js.undefined
  var lang: Locale with AdditionalPickerLocaleLangProps
  var monthFormat: js.UndefOr[String] = js.undefined
  var timePickerLocale: TimePickerLocale
  var weekFormat: js.UndefOr[String] = js.undefined
}

object PickerLocale {
  @scala.inline
  def apply(
    lang: Locale with AdditionalPickerLocaleLangProps,
    timePickerLocale: TimePickerLocale,
    dateFormat: String = null,
    dateTimeFormat: String = null,
    monthFormat: String = null,
    weekFormat: String = null
  ): PickerLocale = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], timePickerLocale = timePickerLocale.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dateTimeFormat != null) __obj.updateDynamic("dateTimeFormat")(dateTimeFormat.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (weekFormat != null) __obj.updateDynamic("weekFormat")(weekFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerLocale]
  }
}

