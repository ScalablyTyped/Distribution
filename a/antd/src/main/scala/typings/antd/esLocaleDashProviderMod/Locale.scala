package typings.antd.esLocaleDashProviderMod

import typings.antd.esModalLocaleMod.ModalLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
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
  var locale: String
}

object Locale {
  @scala.inline
  def apply(
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
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[Locale]
  }
}

