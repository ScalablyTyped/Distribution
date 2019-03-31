package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DatePickerDatePickerView extends js.Object {
  var DatePicker: js.UndefOr[js.Object] = js.undefined
  var DatePickerView: js.UndefOr[js.Object] = js.undefined
  var InputItem: js.UndefOr[js.Object] = js.undefined
  var Pagination: js.UndefOr[js.Object] = js.undefined
  var exist: scala.Boolean
}

object Anon_DatePickerDatePickerView {
  @scala.inline
  def apply(
    exist: scala.Boolean,
    DatePicker: js.Object = null,
    DatePickerView: js.Object = null,
    InputItem: js.Object = null,
    Pagination: js.Object = null
  ): Anon_DatePickerDatePickerView = {
    val __obj = js.Dynamic.literal(exist = exist)
    if (DatePicker != null) __obj.updateDynamic("DatePicker")(DatePicker)
    if (DatePickerView != null) __obj.updateDynamic("DatePickerView")(DatePickerView)
    if (InputItem != null) __obj.updateDynamic("InputItem")(InputItem)
    if (Pagination != null) __obj.updateDynamic("Pagination")(Pagination)
    __obj.asInstanceOf[Anon_DatePickerDatePickerView]
  }
}

