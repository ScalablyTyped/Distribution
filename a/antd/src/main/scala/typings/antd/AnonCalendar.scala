package typings.antd

import typings.antd.localeMod.ModalLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalendar extends js.Object {
  var Calendar: js.UndefOr[js.Object] = js.undefined
  var DatePicker: js.UndefOr[js.Object] = js.undefined
  var Modal: js.UndefOr[ModalLocale] = js.undefined
  var Pagination: js.UndefOr[js.Object] = js.undefined
  var Popconfirm: js.UndefOr[js.Object] = js.undefined
  var Select: js.UndefOr[js.Object] = js.undefined
  var Table: js.UndefOr[js.Object] = js.undefined
  var TimePicker: js.UndefOr[js.Object] = js.undefined
  var Transfer: js.UndefOr[js.Object] = js.undefined
  var Upload: js.UndefOr[js.Object] = js.undefined
  var exist: Boolean
  var locale: String
}

object AnonCalendar {
  @scala.inline
  def apply(
    exist: Boolean,
    locale: String,
    Calendar: js.Object = null,
    DatePicker: js.Object = null,
    Modal: ModalLocale = null,
    Pagination: js.Object = null,
    Popconfirm: js.Object = null,
    Select: js.Object = null,
    Table: js.Object = null,
    TimePicker: js.Object = null,
    Transfer: js.Object = null,
    Upload: js.Object = null
  ): AnonCalendar = {
    val __obj = js.Dynamic.literal(exist = exist.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    if (Calendar != null) __obj.updateDynamic("Calendar")(Calendar.asInstanceOf[js.Any])
    if (DatePicker != null) __obj.updateDynamic("DatePicker")(DatePicker.asInstanceOf[js.Any])
    if (Modal != null) __obj.updateDynamic("Modal")(Modal.asInstanceOf[js.Any])
    if (Pagination != null) __obj.updateDynamic("Pagination")(Pagination.asInstanceOf[js.Any])
    if (Popconfirm != null) __obj.updateDynamic("Popconfirm")(Popconfirm.asInstanceOf[js.Any])
    if (Select != null) __obj.updateDynamic("Select")(Select.asInstanceOf[js.Any])
    if (Table != null) __obj.updateDynamic("Table")(Table.asInstanceOf[js.Any])
    if (TimePicker != null) __obj.updateDynamic("TimePicker")(TimePicker.asInstanceOf[js.Any])
    if (Transfer != null) __obj.updateDynamic("Transfer")(Transfer.asInstanceOf[js.Any])
    if (Upload != null) __obj.updateDynamic("Upload")(Upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalendar]
  }
}

