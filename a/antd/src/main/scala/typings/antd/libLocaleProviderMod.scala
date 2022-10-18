package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.Back
import typings.antd.anon.Copied
import typings.antd.anon.DefaultValidateMessages
import typings.antd.anon.Preview
import typings.antd.libDatePickerGeneratePickerMod.PickerLocale
import typings.antd.libEmptyMod.TransferLocale
import typings.antd.libModalLocaleMod.ModalLocale
import typings.antd.libPopconfirmPurePanelMod.PopconfirmLocale
import typings.antd.libTableInterfaceMod.TableLocale
import typings.antd.libUploadInterfaceMod.UploadLocale
import typings.rcPagination.mod.PaginationLocale
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLocaleProviderMod extends Shortcut {
  
  @JSImport("antd/lib/locale-provider", JSImport.Default)
  @js.native
  val default: FC[LocaleProviderProps] = js.native
  
  @JSImport("antd/lib/locale-provider", "ANT_MARK")
  @js.native
  val ANT_MARK: /* "internalMark" */ String = js.native
  
  trait Locale extends StObject {
    
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
    
    var Transfer: js.UndefOr[typings.antd.libTransferMod.TransferLocale] = js.undefined
    
    var Upload: js.UndefOr[UploadLocale] = js.undefined
    
    var global: js.UndefOr[Record[String, Any]] = js.undefined
    
    var locale: String
  }
  object Locale {
    
    inline def apply(locale: String): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setCalendar(value: Record[String, Any]): Self = StObject.set(x, "Calendar", value.asInstanceOf[js.Any])
      
      inline def setCalendarUndefined: Self = StObject.set(x, "Calendar", js.undefined)
      
      inline def setDatePicker(value: PickerLocale): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
      
      inline def setDatePickerUndefined: Self = StObject.set(x, "DatePicker", js.undefined)
      
      inline def setEmpty(value: TransferLocale): Self = StObject.set(x, "Empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "Empty", js.undefined)
      
      inline def setForm(value: DefaultValidateMessages): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "Form", js.undefined)
      
      inline def setGlobal(value: Record[String, Any]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setIcon(value: Record[String, Any]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
      
      inline def setImage(value: Preview): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
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
      
      inline def setTransfer(value: typings.antd.libTransferMod.TransferLocale): Self = StObject.set(x, "Transfer", value.asInstanceOf[js.Any])
      
      inline def setTransferUndefined: Self = StObject.set(x, "Transfer", js.undefined)
      
      inline def setUpload(value: UploadLocale): Self = StObject.set(x, "Upload", value.asInstanceOf[js.Any])
      
      inline def setUploadUndefined: Self = StObject.set(x, "Upload", js.undefined)
    }
  }
  
  trait LocaleProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var locale: Locale
  }
  object LocaleProviderProps {
    
    inline def apply(locale: Locale): LocaleProviderProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleProviderProps]
    }
    
    extension [Self <: LocaleProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[LocaleProviderProps]
  
  /* This means you don't have to write `default`, but can instead just say `libLocaleProviderMod.foo` */
  override def _to: FC[LocaleProviderProps] = default
}
