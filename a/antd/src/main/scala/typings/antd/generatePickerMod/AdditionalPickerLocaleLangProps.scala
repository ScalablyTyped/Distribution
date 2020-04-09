package typings.antd.generatePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalPickerLocaleLangProps extends js.Object {
  var monthPlaceholder: js.UndefOr[String] = js.undefined
  var placeholder: String
  var quarterPlaceholder: js.UndefOr[String] = js.undefined
  var rangeMonthPlaceholder: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var rangePlaceholder: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var rangeWeekPlaceholder: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var rangeYearPlaceholder: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var weekPlaceholder: js.UndefOr[String] = js.undefined
  var yearPlaceholder: js.UndefOr[String] = js.undefined
}

object AdditionalPickerLocaleLangProps {
  @scala.inline
  def apply(
    placeholder: String,
    monthPlaceholder: String = null,
    quarterPlaceholder: String = null,
    rangeMonthPlaceholder: js.Tuple2[String, String] = null,
    rangePlaceholder: js.Tuple2[String, String] = null,
    rangeWeekPlaceholder: js.Tuple2[String, String] = null,
    rangeYearPlaceholder: js.Tuple2[String, String] = null,
    weekPlaceholder: String = null,
    yearPlaceholder: String = null
  ): AdditionalPickerLocaleLangProps = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    if (monthPlaceholder != null) __obj.updateDynamic("monthPlaceholder")(monthPlaceholder.asInstanceOf[js.Any])
    if (quarterPlaceholder != null) __obj.updateDynamic("quarterPlaceholder")(quarterPlaceholder.asInstanceOf[js.Any])
    if (rangeMonthPlaceholder != null) __obj.updateDynamic("rangeMonthPlaceholder")(rangeMonthPlaceholder.asInstanceOf[js.Any])
    if (rangePlaceholder != null) __obj.updateDynamic("rangePlaceholder")(rangePlaceholder.asInstanceOf[js.Any])
    if (rangeWeekPlaceholder != null) __obj.updateDynamic("rangeWeekPlaceholder")(rangeWeekPlaceholder.asInstanceOf[js.Any])
    if (rangeYearPlaceholder != null) __obj.updateDynamic("rangeYearPlaceholder")(rangeYearPlaceholder.asInstanceOf[js.Any])
    if (weekPlaceholder != null) __obj.updateDynamic("weekPlaceholder")(weekPlaceholder.asInstanceOf[js.Any])
    if (yearPlaceholder != null) __obj.updateDynamic("yearPlaceholder")(yearPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalPickerLocaleLangProps]
  }
}

