package typings.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatePickerView extends js.Object {
  var DatePicker: js.UndefOr[js.Object] = js.undefined
  var DatePickerView: js.UndefOr[js.Object] = js.undefined
  var InputItem: js.UndefOr[js.Object] = js.undefined
  var Modal: js.UndefOr[js.Object] = js.undefined
  var Pagination: js.UndefOr[js.Object] = js.undefined
  var exist: Boolean
}

object AnonDatePickerView {
  @scala.inline
  def apply(
    exist: Boolean,
    DatePicker: js.Object = null,
    DatePickerView: js.Object = null,
    InputItem: js.Object = null,
    Modal: js.Object = null,
    Pagination: js.Object = null
  ): AnonDatePickerView = {
    val __obj = js.Dynamic.literal(exist = exist.asInstanceOf[js.Any])
    if (DatePicker != null) __obj.updateDynamic("DatePicker")(DatePicker.asInstanceOf[js.Any])
    if (DatePickerView != null) __obj.updateDynamic("DatePickerView")(DatePickerView.asInstanceOf[js.Any])
    if (InputItem != null) __obj.updateDynamic("InputItem")(InputItem.asInstanceOf[js.Any])
    if (Modal != null) __obj.updateDynamic("Modal")(Modal.asInstanceOf[js.Any])
    if (Pagination != null) __obj.updateDynamic("Pagination")(Pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDatePickerView]
  }
}

