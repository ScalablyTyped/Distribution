package typings.antd

import typings.antd.libLocaleProviderMod.Locale
import typings.react.mod.ReactElement
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLocaleProviderLocaleReceiverMod {
  
  @JSImport("antd/lib/locale-provider/LocaleReceiver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[C /* <: LocaleComponentName */](props: LocaleReceiverProps[C]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useLocaleReceiver[C /* <: LocaleComponentName */](componentName: C): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocaleReceiver")(componentName.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
  ]]
  inline def useLocaleReceiver[C /* <: LocaleComponentName */](
    componentName: C,
    defaultLocale: /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocaleReceiver")(componentName.asInstanceOf[js.Any], defaultLocale.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
  ]]
  inline def useLocaleReceiver[C /* <: LocaleComponentName */](
    componentName: C,
    defaultLocale: js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
    ]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocaleReceiver")(componentName.asInstanceOf[js.Any], defaultLocale.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
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
  
  trait LocaleReceiverProps[C /* <: LocaleComponentName */] extends StObject {
    
    def children(
      locale: NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
        ],
      localeCode: String,
      fullLocale: Locale
    ): ReactElement
    
    var componentName: js.UndefOr[C] = js.undefined
    
    var defaultLocale: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any) | (js.Function0[
          /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
        ])
      ] = js.undefined
  }
  object LocaleReceiverProps {
    
    inline def apply[C /* <: LocaleComponentName */](
      children: (NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
        ], String, Locale) => ReactElement
    ): LocaleReceiverProps[C] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children))
      __obj.asInstanceOf[LocaleReceiverProps[C]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocaleReceiverProps[?], C /* <: LocaleComponentName */] (val x: Self & LocaleReceiverProps[C]) extends AnyVal {
      
      inline def setChildren(
        value: (NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
            ], String, Locale) => ReactElement
      ): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setComponentName(value: C): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
      
      inline def setDefaultLocale(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any) | (js.Function0[
              /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
            ])
      ): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleFunction0(
        value: () => /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
      ): Self = StObject.set(x, "defaultLocale", js.Any.fromFunction0(value))
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    }
  }
}
