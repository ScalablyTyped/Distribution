package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Calendar extends js.Object {
  var Calendar: js.UndefOr[js.Object] = js.undefined
  var DatePicker: js.UndefOr[js.Object] = js.undefined
  var Modal: js.UndefOr[antdLib.esModalLocaleMod.ModalLocale] = js.undefined
  var Pagination: js.UndefOr[js.Object] = js.undefined
  var Popconfirm: js.UndefOr[js.Object] = js.undefined
  var Select: js.UndefOr[js.Object] = js.undefined
  var Table: js.UndefOr[js.Object] = js.undefined
  var TimePicker: js.UndefOr[js.Object] = js.undefined
  var Transfer: js.UndefOr[js.Object] = js.undefined
  var Upload: js.UndefOr[js.Object] = js.undefined
  var exist: scala.Boolean
  var locale: java.lang.String
}

object Anon_Calendar {
  @scala.inline
  def apply(
    exist: scala.Boolean,
    locale: java.lang.String,
    Calendar: js.Object = null,
    DatePicker: js.Object = null,
    Modal: antdLib.esModalLocaleMod.ModalLocale = null,
    Pagination: js.Object = null,
    Popconfirm: js.Object = null,
    Select: js.Object = null,
    Table: js.Object = null,
    TimePicker: js.Object = null,
    Transfer: js.Object = null,
    Upload: js.Object = null
  ): Anon_Calendar = {
    val __obj = js.Dynamic.literal(exist = exist, locale = locale)
    if (Calendar != null) __obj.updateDynamic("Calendar")(Calendar)
    if (DatePicker != null) __obj.updateDynamic("DatePicker")(DatePicker)
    if (Modal != null) __obj.updateDynamic("Modal")(Modal)
    if (Pagination != null) __obj.updateDynamic("Pagination")(Pagination)
    if (Popconfirm != null) __obj.updateDynamic("Popconfirm")(Popconfirm)
    if (Select != null) __obj.updateDynamic("Select")(Select)
    if (Table != null) __obj.updateDynamic("Table")(Table)
    if (TimePicker != null) __obj.updateDynamic("TimePicker")(TimePicker)
    if (Transfer != null) __obj.updateDynamic("Transfer")(Transfer)
    if (Upload != null) __obj.updateDynamic("Upload")(Upload)
    __obj.asInstanceOf[Anon_Calendar]
  }
}

