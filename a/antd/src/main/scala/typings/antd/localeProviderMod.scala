package typings.antd

import typings.antd.anon.Back
import typings.antd.anon.Copied
import typings.antd.anon.DefaultValidateMessages
import typings.antd.anon.Localeexistbooleanundefin
import typings.antd.anon.PartialTransferLocale
import typings.antd.anon.Preview
import typings.antd.anon.`3`
import typings.antd.emptyMod.TransferLocale
import typings.antd.generatePickerMod.PickerLocale
import typings.antd.localeMod.ModalLocale
import typings.antd.purePanelMod.PopconfirmLocale
import typings.antd.tableInterfaceMod.TableLocale
import typings.antd.uploadInterfaceMod.UploadLocale
import typings.memoizeOne.mod.MemoizedFn
import typings.rcPagination.mod.PaginationLocale
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeProviderMod {
  
  @JSImport("antd/lib/locale-provider", JSImport.Default)
  @js.native
  open class default protected () extends LocaleProvider {
    def this(props: LocaleProviderProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd/lib/locale-provider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/locale-provider", "default.defaultProps")
    @js.native
    def defaultProps: `3` = js.native
    inline def defaultProps_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
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
    
    var Transfer: js.UndefOr[PartialTransferLocale] = js.undefined
    
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
      
      inline def setTransfer(value: PartialTransferLocale): Self = StObject.set(x, "Transfer", value.asInstanceOf[js.Any])
      
      inline def setTransferUndefined: Self = StObject.set(x, "Transfer", js.undefined)
      
      inline def setUpload(value: UploadLocale): Self = StObject.set(x, "Upload", value.asInstanceOf[js.Any])
      
      inline def setUploadUndefined: Self = StObject.set(x, "Upload", js.undefined)
    }
  }
  
  @js.native
  trait LocaleProvider extends Component[LocaleProviderProps, Any, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MLocaleProvider(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MLocaleProvider(prevProps: LocaleProviderProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MLocaleProvider(): Unit = js.native
    
    var getMemoizedContextValue: MemoizedFn[js.Function1[/* localeValue */ Locale, Localeexistbooleanundefin]] = js.native
  }
  
  trait LocaleProviderProps extends StObject {
    
    var _ANT_MARK__ : js.UndefOr[String] = js.undefined
    
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
      
      inline def set_ANT_MARK__(value: String): Self = StObject.set(x, "_ANT_MARK__", value.asInstanceOf[js.Any])
      
      inline def set_ANT_MARK__Undefined: Self = StObject.set(x, "_ANT_MARK__", js.undefined)
    }
  }
}
