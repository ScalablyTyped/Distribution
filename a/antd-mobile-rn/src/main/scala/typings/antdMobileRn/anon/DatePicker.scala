package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePicker extends js.Object {
  var DatePicker: js.UndefOr[js.Object] = js.native
  var DatePickerView: js.UndefOr[js.Object] = js.native
  var InputItem: js.UndefOr[js.Object] = js.native
  var Modal: js.UndefOr[js.Object] = js.native
  var Pagination: js.UndefOr[js.Object] = js.native
}

object DatePicker {
  @scala.inline
  def apply(): DatePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePicker]
  }
  @scala.inline
  implicit class DatePickerOps[Self <: DatePicker] (val x: Self) extends AnyVal {
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
    def setModal(value: js.Object): Self = this.set("Modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("Modal", js.undefined)
    @scala.inline
    def setPagination(value: js.Object): Self = this.set("Pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagination: Self = this.set("Pagination", js.undefined)
  }
  
}

