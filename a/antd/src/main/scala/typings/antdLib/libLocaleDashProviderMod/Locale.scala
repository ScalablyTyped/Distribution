package typings
package antdLib.libLocaleDashProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var Calendar: js.UndefOr[js.Object] = js.undefined
  var DatePicker: js.UndefOr[js.Object] = js.undefined
  var Modal: js.UndefOr[antdLib.libModalLocaleMod.ModalLocale] = js.undefined
  var Pagination: js.UndefOr[js.Object] = js.undefined
  var Popconfirm: js.UndefOr[js.Object] = js.undefined
  var Select: js.UndefOr[js.Object] = js.undefined
  var Table: js.UndefOr[js.Object] = js.undefined
  var TimePicker: js.UndefOr[js.Object] = js.undefined
  var Transfer: js.UndefOr[js.Object] = js.undefined
  var Upload: js.UndefOr[js.Object] = js.undefined
  var locale: java.lang.String
}

object Locale {
  @scala.inline
  def apply(
    locale: java.lang.String,
    Calendar: js.Object = null,
    DatePicker: js.Object = null,
    Modal: antdLib.libModalLocaleMod.ModalLocale = null,
    Pagination: js.Object = null,
    Popconfirm: js.Object = null,
    Select: js.Object = null,
    Table: js.Object = null,
    TimePicker: js.Object = null,
    Transfer: js.Object = null,
    Upload: js.Object = null
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale)
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
    __obj.asInstanceOf[Locale]
  }
}

