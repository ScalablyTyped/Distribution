package typings.antd.generatePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalPickerLocaleLangProps extends js.Object {
  var monthPlaceholder: js.UndefOr[String] = js.native
  var placeholder: String = js.native
  var quarterPlaceholder: js.UndefOr[String] = js.native
  var rangeMonthPlaceholder: js.UndefOr[js.Tuple2[String, String]] = js.native
  var rangePlaceholder: js.UndefOr[js.Tuple2[String, String]] = js.native
  var rangeWeekPlaceholder: js.UndefOr[js.Tuple2[String, String]] = js.native
  var rangeYearPlaceholder: js.UndefOr[js.Tuple2[String, String]] = js.native
  var weekPlaceholder: js.UndefOr[String] = js.native
  var yearPlaceholder: js.UndefOr[String] = js.native
}

object AdditionalPickerLocaleLangProps {
  @scala.inline
  def apply(placeholder: String): AdditionalPickerLocaleLangProps = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalPickerLocaleLangProps]
  }
  @scala.inline
  implicit class AdditionalPickerLocaleLangPropsOps[Self <: AdditionalPickerLocaleLangProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthPlaceholder(value: String): Self = this.set("monthPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthPlaceholder: Self = this.set("monthPlaceholder", js.undefined)
    @scala.inline
    def setQuarterPlaceholder(value: String): Self = this.set("quarterPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuarterPlaceholder: Self = this.set("quarterPlaceholder", js.undefined)
    @scala.inline
    def setRangeMonthPlaceholder(value: js.Tuple2[String, String]): Self = this.set("rangeMonthPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeMonthPlaceholder: Self = this.set("rangeMonthPlaceholder", js.undefined)
    @scala.inline
    def setRangePlaceholder(value: js.Tuple2[String, String]): Self = this.set("rangePlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangePlaceholder: Self = this.set("rangePlaceholder", js.undefined)
    @scala.inline
    def setRangeWeekPlaceholder(value: js.Tuple2[String, String]): Self = this.set("rangeWeekPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeWeekPlaceholder: Self = this.set("rangeWeekPlaceholder", js.undefined)
    @scala.inline
    def setRangeYearPlaceholder(value: js.Tuple2[String, String]): Self = this.set("rangeYearPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeYearPlaceholder: Self = this.set("rangeYearPlaceholder", js.undefined)
    @scala.inline
    def setWeekPlaceholder(value: String): Self = this.set("weekPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekPlaceholder: Self = this.set("weekPlaceholder", js.undefined)
    @scala.inline
    def setYearPlaceholder(value: String): Self = this.set("yearPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearPlaceholder: Self = this.set("yearPlaceholder", js.undefined)
  }
  
}

