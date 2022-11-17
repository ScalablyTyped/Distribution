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
  
  object LocaleComponentName {
    
    inline def Calendar: "Calendar" = "Calendar".asInstanceOf["Calendar"]
    
    inline def DatePicker: "DatePicker" = "DatePicker".asInstanceOf["DatePicker"]
    
    inline def Empty: "Empty" = "Empty".asInstanceOf["Empty"]
    
    inline def Form: "Form" = "Form".asInstanceOf["Form"]
    
    inline def Icon: "Icon" = "Icon".asInstanceOf["Icon"]
    
    inline def Image: "Image" = "Image".asInstanceOf["Image"]
    
    inline def Modal: "Modal" = "Modal".asInstanceOf["Modal"]
    
    inline def PageHeader: "PageHeader" = "PageHeader".asInstanceOf["PageHeader"]
    
    inline def Pagination: "Pagination" = "Pagination".asInstanceOf["Pagination"]
    
    inline def Popconfirm: "Popconfirm" = "Popconfirm".asInstanceOf["Popconfirm"]
    
    inline def Select: "Select" = "Select".asInstanceOf["Select"]
    
    inline def Table: "Table" = "Table".asInstanceOf["Table"]
    
    inline def Text: "Text" = "Text".asInstanceOf["Text"]
    
    inline def TimePicker: "TimePicker" = "TimePicker".asInstanceOf["TimePicker"]
    
    inline def Transfer: "Transfer" = "Transfer".asInstanceOf["Transfer"]
    
    inline def Upload: "Upload" = "Upload".asInstanceOf["Upload"]
    
    inline def global: "global" = "global".asInstanceOf["global"]
  }
  /* Inlined std.Exclude<keyof antd.antd/lib/locale-provider.Locale, 'locale'> */
  type LocaleComponentName = "PageHeader" | "Empty" | "Text" | "Pagination" | "global" | "Form" | "Select" | "Modal" | "Icon" | "TimePicker" | "Image" | "Transfer" | "Table" | "DatePicker" | "Calendar" | "Upload" | "Popconfirm"
  
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
    
    extension [Self <: LocaleReceiverProps[?], C /* <: LocaleComponentName */](x: Self & LocaleReceiverProps[C]) {
      
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
