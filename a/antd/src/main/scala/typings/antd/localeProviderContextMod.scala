package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.Back
import typings.antd.anon.Copied
import typings.antd.anon.DefaultValidateMessages
import typings.antd.anon.PartialTransferLocale
import typings.antd.anon.Preview
import typings.antd.emptyMod.TransferLocale
import typings.antd.generatePickerMod.PickerLocale
import typings.antd.localeMod.ModalLocale
import typings.antd.purePanelMod.PopconfirmLocale
import typings.antd.tableInterfaceMod.TableLocale
import typings.antd.uploadInterfaceMod.UploadLocale
import typings.rcPagination.mod.PaginationLocale
import typings.react.mod.Context
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeProviderContextMod extends Shortcut {
  
  @JSImport("antd/lib/locale-provider/context", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[LocaleContextProps]] = js.native
  
  /* Inlined std.Partial<antd.antd/lib/locale-provider.Locale> & {  exist :boolean | undefined} */
  trait LocaleContextProps extends StObject {
    
    var Calendar: js.UndefOr[Record[String, Any]] = js.undefined
    
    var DatePicker: js.UndefOr[PickerLocale] = js.undefined
    
    var Empty: js.UndefOr[TransferLocale] = js.undefined
    
    var Form: js.UndefOr[DefaultValidateMessages] = js.undefined
    
    var Icon: js.UndefOr[Record[String, Any]] = js.undefined
    
    var Image: js.UndefOr[Preview] = js.undefined
    
    var Modal: js.UndefOr[ModalLocale] = js.undefined
    
    var PageHeader: js.UndefOr[Back] = js.undefined
    
    var Pagination: js.UndefOr[PaginationLocale] = js.undefined
    
    var Popconfirm: js.UndefOr[PopconfirmLocale] = js.undefined
    
    var Select: js.UndefOr[Record[String, Any]] = js.undefined
    
    var Table: js.UndefOr[TableLocale] = js.undefined
    
    var Text: js.UndefOr[Copied] = js.undefined
    
    var TimePicker: js.UndefOr[Record[String, Any]] = js.undefined
    
    var Transfer: js.UndefOr[PartialTransferLocale] = js.undefined
    
    var Upload: js.UndefOr[UploadLocale] = js.undefined
    
    var exist: js.UndefOr[Boolean] = js.undefined
    
    var global: js.UndefOr[Record[String, Any]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
  }
  object LocaleContextProps {
    
    inline def apply(): LocaleContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocaleContextProps]
    }
    
    extension [Self <: LocaleContextProps](x: Self) {
      
      inline def setCalendar(value: Record[String, Any]): Self = StObject.set(x, "Calendar", value.asInstanceOf[js.Any])
      
      inline def setCalendarUndefined: Self = StObject.set(x, "Calendar", js.undefined)
      
      inline def setDatePicker(value: PickerLocale): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
      
      inline def setDatePickerUndefined: Self = StObject.set(x, "DatePicker", js.undefined)
      
      inline def setEmpty(value: TransferLocale): Self = StObject.set(x, "Empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "Empty", js.undefined)
      
      inline def setExist(value: Boolean): Self = StObject.set(x, "exist", value.asInstanceOf[js.Any])
      
      inline def setExistUndefined: Self = StObject.set(x, "exist", js.undefined)
      
      inline def setForm(value: DefaultValidateMessages): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "Form", js.undefined)
      
      inline def setGlobal(value: Record[String, Any]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setIcon(value: Record[String, Any]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
      
      inline def setImage(value: Preview): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setModal(value: ModalLocale): Self = StObject.set(x, "Modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "Modal", js.undefined)
      
      inline def setPageHeader(value: Back): Self = StObject.set(x, "PageHeader", value.asInstanceOf[js.Any])
      
      inline def setPageHeaderUndefined: Self = StObject.set(x, "PageHeader", js.undefined)
      
      inline def setPagination(value: PaginationLocale): Self = StObject.set(x, "Pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationUndefined: Self = StObject.set(x, "Pagination", js.undefined)
      
      inline def setPopconfirm(value: PopconfirmLocale): Self = StObject.set(x, "Popconfirm", value.asInstanceOf[js.Any])
      
      inline def setPopconfirmUndefined: Self = StObject.set(x, "Popconfirm", js.undefined)
      
      inline def setSelect(value: Record[String, Any]): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
      
      inline def setTable(value: TableLocale): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
      
      inline def setText(value: Copied): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
      
      inline def setTimePicker(value: Record[String, Any]): Self = StObject.set(x, "TimePicker", value.asInstanceOf[js.Any])
      
      inline def setTimePickerUndefined: Self = StObject.set(x, "TimePicker", js.undefined)
      
      inline def setTransfer(value: PartialTransferLocale): Self = StObject.set(x, "Transfer", value.asInstanceOf[js.Any])
      
      inline def setTransferUndefined: Self = StObject.set(x, "Transfer", js.undefined)
      
      inline def setUpload(value: UploadLocale): Self = StObject.set(x, "Upload", value.asInstanceOf[js.Any])
      
      inline def setUploadUndefined: Self = StObject.set(x, "Upload", js.undefined)
    }
  }
  
  type _To = Context[js.UndefOr[LocaleContextProps]]
  
  /* This means you don't have to write `default`, but can instead just say `localeProviderContextMod.foo` */
  override def _to: Context[js.UndefOr[LocaleContextProps]] = default
}
