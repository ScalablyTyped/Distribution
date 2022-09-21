package typings.antd

import typings.antd.anon.ComponentName
import typings.antd.localeProviderContextMod.LocaleContextProps
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeReceiverMod {
  
  @JSImport("antd/lib/locale-provider/LocaleReceiver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/lib/locale-provider/LocaleReceiver", JSImport.Default)
  @js.native
  open class default[C /* <: LocaleComponentName */] () extends LocaleReceiver[C]
  /* static members */
  object default {
    
    @JSImport("antd/lib/locale-provider/LocaleReceiver", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/locale-provider/LocaleReceiver", "default.contextType")
    @js.native
    def contextType: Context[js.UndefOr[LocaleContextProps]] = js.native
    inline def contextType_=(x: Context[js.UndefOr[LocaleContextProps]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/locale-provider/LocaleReceiver", "default.defaultProps")
    @js.native
    def defaultProps: ComponentName = js.native
    inline def defaultProps_=(x: ComponentName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def useLocaleReceiver[T /* <: LocaleComponentName */](componentName: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[T] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocaleReceiver")(componentName.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[T] */ js.Any
  ]]
  inline def useLocaleReceiver[T /* <: LocaleComponentName */](
    componentName: T,
    defaultLocale: /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[T] */ js.Any
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[T] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocaleReceiver")(componentName.asInstanceOf[js.Any], defaultLocale.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[T] */ js.Any
  ]]
  inline def useLocaleReceiver[T /* <: LocaleComponentName */](componentName: T, defaultLocale: js.Function): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[T] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocaleReceiver")(componentName.asInstanceOf[js.Any], defaultLocale.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[T] */ js.Any
  ]]
  
  /* Inlined std.Exclude<keyof antd.antd/lib/locale-provider.Locale, 'locale'> */
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.PageHeader
    - typings.antd.antdStrings.Empty
    - typings.antd.antdStrings.Text
    - typings.antd.antdStrings.Pagination
    - typings.antd.antdStrings.global
    - typings.antd.antdStrings.Form
    - typings.antd.antdStrings.Select
    - typings.antd.antdStrings.Modal
    - typings.antd.antdStrings.Icon
    - typings.antd.antdStrings.TimePicker
    - typings.antd.antdStrings.Image
    - typings.antd.antdStrings.Transfer
    - typings.antd.antdStrings.Table
    - typings.antd.antdStrings.DatePicker
    - typings.antd.antdStrings.Calendar
    - typings.antd.antdStrings.Upload
    - typings.antd.antdStrings.Popconfirm
  */
  trait LocaleComponentName extends StObject
  object LocaleComponentName {
    
    inline def Calendar: typings.antd.antdStrings.Calendar = "Calendar".asInstanceOf[typings.antd.antdStrings.Calendar]
    
    inline def DatePicker: typings.antd.antdStrings.DatePicker = "DatePicker".asInstanceOf[typings.antd.antdStrings.DatePicker]
    
    inline def Empty: typings.antd.antdStrings.Empty = "Empty".asInstanceOf[typings.antd.antdStrings.Empty]
    
    inline def Form: typings.antd.antdStrings.Form = "Form".asInstanceOf[typings.antd.antdStrings.Form]
    
    inline def Icon: typings.antd.antdStrings.Icon = "Icon".asInstanceOf[typings.antd.antdStrings.Icon]
    
    inline def Image: typings.antd.antdStrings.Image = "Image".asInstanceOf[typings.antd.antdStrings.Image]
    
    inline def Modal: typings.antd.antdStrings.Modal = "Modal".asInstanceOf[typings.antd.antdStrings.Modal]
    
    inline def PageHeader: typings.antd.antdStrings.PageHeader = "PageHeader".asInstanceOf[typings.antd.antdStrings.PageHeader]
    
    inline def Pagination: typings.antd.antdStrings.Pagination = "Pagination".asInstanceOf[typings.antd.antdStrings.Pagination]
    
    inline def Popconfirm: typings.antd.antdStrings.Popconfirm = "Popconfirm".asInstanceOf[typings.antd.antdStrings.Popconfirm]
    
    inline def Select: typings.antd.antdStrings.Select = "Select".asInstanceOf[typings.antd.antdStrings.Select]
    
    inline def Table: typings.antd.antdStrings.Table = "Table".asInstanceOf[typings.antd.antdStrings.Table]
    
    inline def Text: typings.antd.antdStrings.Text = "Text".asInstanceOf[typings.antd.antdStrings.Text]
    
    inline def TimePicker: typings.antd.antdStrings.TimePicker = "TimePicker".asInstanceOf[typings.antd.antdStrings.TimePicker]
    
    inline def Transfer: typings.antd.antdStrings.Transfer = "Transfer".asInstanceOf[typings.antd.antdStrings.Transfer]
    
    inline def Upload: typings.antd.antdStrings.Upload = "Upload".asInstanceOf[typings.antd.antdStrings.Upload]
    
    inline def global: typings.antd.antdStrings.global = "global".asInstanceOf[typings.antd.antdStrings.global]
  }
  
  @js.native
  trait LocaleReceiver[C /* <: LocaleComponentName */]
    extends Component[LocaleReceiverProps[C], js.Object, Any] {
    
    @JSName("context")
    var context_LocaleReceiver: LocaleContextProps = js.native
    
    def getLocale(): /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any = js.native
    
    def getLocaleCode(): js.UndefOr[String] = js.native
  }
  
  @js.native
  trait LocaleReceiverProps[C /* <: LocaleComponentName */] extends StObject {
    
    def children(
      locale: /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
    ): ReactNode = js.native
    def children(
      locale: /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any,
      localeCode: String
    ): ReactNode = js.native
    def children(
      locale: /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any,
      localeCode: String,
      fullLocale: js.Object
    ): ReactNode = js.native
    def children(
      locale: /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any,
      localeCode: Unit,
      fullLocale: js.Object
    ): ReactNode = js.native
    
    var componentName: C = js.native
    
    var defaultLocale: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any) | (js.Function0[
          /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
        ])
      ] = js.native
  }
}
