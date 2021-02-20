package typings.antd

import typings.antd.anon.DefaultValidateMessages
import typings.antd.anon.PartialTransferLocale
import typings.antd.anon.`0`
import typings.antd.emptyMod.TransferLocale
import typings.antd.generatePickerMod.PickerLocale
import typings.antd.localeMod.ModalLocale
import typings.antd.paginationPaginationMod.PaginationLocale
import typings.antd.popconfirmMod.PopconfirmLocale
import typings.antd.tableInterfaceMod.TableLocale
import typings.antd.uploadInterfaceMod.UploadLocale
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeProviderMod {
  
  @JSImport("antd/lib/locale-provider", JSImport.Default)
  @js.native
  class default protected () extends LocaleProvider {
    def this(props: LocaleProviderProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd/lib/locale-provider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/locale-provider", "default.defaultProps")
    @js.native
    def defaultProps: `0` = js.native
    @scala.inline
    def defaultProps_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd/lib/locale-provider", "ANT_MARK")
  @js.native
  val ANT_MARK: /* "internalMark" */ String = js.native
  
  @js.native
  trait Locale extends StObject {
    
    var Calendar: js.UndefOr[js.Object] = js.native
    
    var DatePicker: js.UndefOr[PickerLocale] = js.native
    
    var Empty: js.UndefOr[TransferLocale] = js.native
    
    var Form: js.UndefOr[DefaultValidateMessages] = js.native
    
    var Icon: js.UndefOr[js.Object] = js.native
    
    var Modal: js.UndefOr[ModalLocale] = js.native
    
    var PageHeader: js.UndefOr[js.Object] = js.native
    
    var Pagination: js.UndefOr[PaginationLocale] = js.native
    
    var Popconfirm: js.UndefOr[PopconfirmLocale] = js.native
    
    var Select: js.UndefOr[js.Object] = js.native
    
    var Table: js.UndefOr[TableLocale] = js.native
    
    var Text: js.UndefOr[js.Object] = js.native
    
    var TimePicker: js.UndefOr[js.Object] = js.native
    
    var Transfer: js.UndefOr[PartialTransferLocale] = js.native
    
    var Upload: js.UndefOr[UploadLocale] = js.native
    
    var global: js.UndefOr[js.Object] = js.native
    
    var locale: String = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(locale: String): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalendar(value: js.Object): Self = StObject.set(x, "Calendar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarUndefined: Self = StObject.set(x, "Calendar", js.undefined)
      
      @scala.inline
      def setDatePicker(value: PickerLocale): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePickerUndefined: Self = StObject.set(x, "DatePicker", js.undefined)
      
      @scala.inline
      def setEmpty(value: TransferLocale): Self = StObject.set(x, "Empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "Empty", js.undefined)
      
      @scala.inline
      def setForm(value: DefaultValidateMessages): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "Form", js.undefined)
      
      @scala.inline
      def setGlobal(value: js.Object): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setIcon(value: js.Object): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal(value: ModalLocale): Self = StObject.set(x, "Modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "Modal", js.undefined)
      
      @scala.inline
      def setPageHeader(value: js.Object): Self = StObject.set(x, "PageHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageHeaderUndefined: Self = StObject.set(x, "PageHeader", js.undefined)
      
      @scala.inline
      def setPagination(value: PaginationLocale): Self = StObject.set(x, "Pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "Pagination", js.undefined)
      
      @scala.inline
      def setPopconfirm(value: PopconfirmLocale): Self = StObject.set(x, "Popconfirm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopconfirmUndefined: Self = StObject.set(x, "Popconfirm", js.undefined)
      
      @scala.inline
      def setSelect(value: js.Object): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
      
      @scala.inline
      def setTable(value: TableLocale): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
      
      @scala.inline
      def setText(value: js.Object): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
      
      @scala.inline
      def setTimePicker(value: js.Object): Self = StObject.set(x, "TimePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePickerUndefined: Self = StObject.set(x, "TimePicker", js.undefined)
      
      @scala.inline
      def setTransfer(value: PartialTransferLocale): Self = StObject.set(x, "Transfer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferUndefined: Self = StObject.set(x, "Transfer", js.undefined)
      
      @scala.inline
      def setUpload(value: UploadLocale): Self = StObject.set(x, "Upload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadUndefined: Self = StObject.set(x, "Upload", js.undefined)
    }
  }
  
  @js.native
  trait LocaleProvider
    extends Component[LocaleProviderProps, js.Any, js.Any] {
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MLocaleProvider(prevProps: LocaleProviderProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MLocaleProvider(): Unit = js.native
  }
  
  @js.native
  trait LocaleProviderProps extends StObject {
    
    var _ANT_MARK__ : js.UndefOr[String] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var locale: Locale = js.native
  }
  object LocaleProviderProps {
    
    @scala.inline
    def apply(locale: Locale): LocaleProviderProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleProviderProps]
    }
    
    @scala.inline
    implicit class LocaleProviderPropsMutableBuilder[Self <: LocaleProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_ANT_MARK__(value: String): Self = StObject.set(x, "_ANT_MARK__", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_ANT_MARK__Undefined: Self = StObject.set(x, "_ANT_MARK__", js.undefined)
    }
  }
}
