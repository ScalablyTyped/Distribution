package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DatePicker extends js.Object {
  var DatePicker: js.UndefOr[js.Object] = js.undefined
  var DatePickerView: js.UndefOr[js.Object] = js.undefined
  var InputItem: js.UndefOr[js.Object] = js.undefined
  var Pagination: js.UndefOr[js.Object] = js.undefined
}

object Anon_DatePicker {
  @scala.inline
  def apply(
    DatePicker: js.Object = null,
    DatePickerView: js.Object = null,
    InputItem: js.Object = null,
    Pagination: js.Object = null
  ): Anon_DatePicker = {
    val __obj = js.Dynamic.literal()
    if (DatePicker != null) __obj.updateDynamic("DatePicker")(DatePicker.asInstanceOf[js.Any])
    if (DatePickerView != null) __obj.updateDynamic("DatePickerView")(DatePickerView.asInstanceOf[js.Any])
    if (InputItem != null) __obj.updateDynamic("InputItem")(InputItem.asInstanceOf[js.Any])
    if (Pagination != null) __obj.updateDynamic("Pagination")(Pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DatePicker]
  }
}

