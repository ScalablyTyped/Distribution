package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerView extends js.Object {
  var DatePicker: js.UndefOr[js.Object] = js.native
  var DatePickerView: js.UndefOr[js.Object] = js.native
  var InputItem: js.UndefOr[js.Object] = js.native
  var Pagination: js.UndefOr[js.Object] = js.native
  var exist: Boolean = js.native
}

object DatePickerView {
  @scala.inline
  def apply(exist: Boolean): DatePickerView = {
    val __obj = js.Dynamic.literal(exist = exist.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerView]
  }
  @scala.inline
  implicit class DatePickerViewOps[Self <: DatePickerView] (val x: Self) extends AnyVal {
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
    def setExist(value: Boolean): Self = this.set("exist", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatePicker(value: js.Object): Self = this.set("DatePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatePicker: Self = this.set("DatePicker", js.undefined)
    @scala.inline
    def setDatePickerView(value: js.Object): Self = this.set("DatePickerView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatePickerView: Self = this.set("DatePickerView", js.undefined)
    @scala.inline
    def setInputItem(value: js.Object): Self = this.set("InputItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputItem: Self = this.set("InputItem", js.undefined)
    @scala.inline
    def setPagination(value: js.Object): Self = this.set("Pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagination: Self = this.set("Pagination", js.undefined)
  }
  
}

