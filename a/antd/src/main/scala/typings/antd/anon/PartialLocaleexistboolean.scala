package typings.antd.anon

import typings.antd.emptyMod.TransferLocale
import typings.antd.generatePickerMod.PickerLocale
import typings.antd.localeMod.ModalLocale
import typings.antd.paginationPaginationMod.PaginationLocale
import typings.antd.popconfirmMod.PopconfirmLocale
import typings.antd.tableInterfaceMod.TableLocale
import typings.antd.uploadInterfaceMod.UploadLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/locale-provider.Locale> & {  exist ? :boolean | undefined} */
trait PartialLocaleexistboolean extends js.Object {
  var Calendar: js.UndefOr[js.Object] = js.undefined
  var DatePicker: js.UndefOr[PickerLocale] = js.undefined
  var Empty: js.UndefOr[TransferLocale] = js.undefined
  var Form: js.UndefOr[DefaultValidateMessages] = js.undefined
  var Icon: js.UndefOr[js.Object] = js.undefined
  var Modal: js.UndefOr[ModalLocale] = js.undefined
  var PageHeader: js.UndefOr[js.Object] = js.undefined
  var Pagination: js.UndefOr[PaginationLocale] = js.undefined
  var Popconfirm: js.UndefOr[PopconfirmLocale] = js.undefined
  var Select: js.UndefOr[js.Object] = js.undefined
  var Table: js.UndefOr[TableLocale] = js.undefined
  var Text: js.UndefOr[js.Object] = js.undefined
  var TimePicker: js.UndefOr[js.Object] = js.undefined
  var Transfer: js.UndefOr[PartialTransferLocale] = js.undefined
  var Upload: js.UndefOr[UploadLocale] = js.undefined
  var exist: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[js.Object] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
}

object PartialLocaleexistboolean {
  @scala.inline
  def apply(
    Calendar: js.Object = null,
    DatePicker: PickerLocale = null,
    Empty: TransferLocale = null,
    Form: DefaultValidateMessages = null,
    Icon: js.Object = null,
    Modal: ModalLocale = null,
    PageHeader: js.Object = null,
    Pagination: PaginationLocale = null,
    Popconfirm: PopconfirmLocale = null,
    Select: js.Object = null,
    Table: TableLocale = null,
    Text: js.Object = null,
    TimePicker: js.Object = null,
    Transfer: PartialTransferLocale = null,
    Upload: UploadLocale = null,
    exist: js.UndefOr[Boolean] = js.undefined,
    global: js.Object = null,
    locale: String = null
  ): PartialLocaleexistboolean = {
    val __obj = js.Dynamic.literal()
    if (Calendar != null) __obj.updateDynamic("Calendar")(Calendar.asInstanceOf[js.Any])
    if (DatePicker != null) __obj.updateDynamic("DatePicker")(DatePicker.asInstanceOf[js.Any])
    if (Empty != null) __obj.updateDynamic("Empty")(Empty.asInstanceOf[js.Any])
    if (Form != null) __obj.updateDynamic("Form")(Form.asInstanceOf[js.Any])
    if (Icon != null) __obj.updateDynamic("Icon")(Icon.asInstanceOf[js.Any])
    if (Modal != null) __obj.updateDynamic("Modal")(Modal.asInstanceOf[js.Any])
    if (PageHeader != null) __obj.updateDynamic("PageHeader")(PageHeader.asInstanceOf[js.Any])
    if (Pagination != null) __obj.updateDynamic("Pagination")(Pagination.asInstanceOf[js.Any])
    if (Popconfirm != null) __obj.updateDynamic("Popconfirm")(Popconfirm.asInstanceOf[js.Any])
    if (Select != null) __obj.updateDynamic("Select")(Select.asInstanceOf[js.Any])
    if (Table != null) __obj.updateDynamic("Table")(Table.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text.asInstanceOf[js.Any])
    if (TimePicker != null) __obj.updateDynamic("TimePicker")(TimePicker.asInstanceOf[js.Any])
    if (Transfer != null) __obj.updateDynamic("Transfer")(Transfer.asInstanceOf[js.Any])
    if (Upload != null) __obj.updateDynamic("Upload")(Upload.asInstanceOf[js.Any])
    if (!js.isUndefined(exist)) __obj.updateDynamic("exist")(exist.get.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLocaleexistboolean]
  }
}

