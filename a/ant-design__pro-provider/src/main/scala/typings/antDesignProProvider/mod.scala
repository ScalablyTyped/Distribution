package typings.antDesignProProvider

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProProvider.anon.Intl
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ReactText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ant-design/pro-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-provider", JSImport.Default)
  @js.native
  val default: Context[Intl] = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(ConfigProvider) */ @JSImport("@ant-design/pro-provider", "ConfigConsumer")
  @js.native
  val ConfigConsumer: Consumer[Intl] = js.native
  
  /**
    *  如果没有配置 locale，这里组件会根据 antd 的 key 来自动选择
    * @param param0
    */
  @JSImport("@ant-design/pro-provider", "ConfigProviderWrap")
  @js.native
  val ConfigProviderWrap: FC[js.Object] = js.native
  
  @JSImport("@ant-design/pro-provider", "arEGIntl")
  @js.native
  val arEGIntl: IntlType = js.native
  
  /**
    * 创建一个操作函数
    * @param locale
    * @param localeMap
    */
  @scala.inline
  def createIntl(locale: String, localeMap: StringDictionary[js.Any]): IntlType = (^.asInstanceOf[js.Dynamic].applyDynamic("createIntl")(locale.asInstanceOf[js.Any], localeMap.asInstanceOf[js.Any])).asInstanceOf[IntlType]
  
  @JSImport("@ant-design/pro-provider", "enUSIntl")
  @js.native
  val enUSIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "esESIntl")
  @js.native
  val esESIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "frFRIntl")
  @js.native
  val frFRIntl: IntlType = js.native
  
  object intlMap {
    
    @JSImport("@ant-design/pro-provider", "intlMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/pro-provider", "intlMap.ar-EG")
    @js.native
    def arEG: IntlType = js.native
    
    @scala.inline
    def arEG_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar-EG")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.en-US")
    @js.native
    def enUS: IntlType = js.native
    
    @scala.inline
    def enUS_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("en-US")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.es-ES")
    @js.native
    def esES: IntlType = js.native
    
    @scala.inline
    def esES_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("es-ES")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.fr-FR")
    @js.native
    def frFR: IntlType = js.native
    
    @scala.inline
    def frFR_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fr-FR")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.it-IT")
    @js.native
    def itIT: IntlType = js.native
    
    @scala.inline
    def itIT_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("it-IT")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.js-JP")
    @js.native
    def jsJP: IntlType = js.native
    
    @scala.inline
    def jsJP_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("js-JP")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.ko-KR")
    @js.native
    def koKR: IntlType = js.native
    
    @scala.inline
    def koKR_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ko-KR")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.ms-MY")
    @js.native
    def msMY: IntlType = js.native
    
    @scala.inline
    def msMY_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ms-MY")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.pt-BR")
    @js.native
    def ptBR: IntlType = js.native
    
    @scala.inline
    def ptBR_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pt-BR")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.ru-RU")
    @js.native
    def ruRU: IntlType = js.native
    
    @scala.inline
    def ruRU_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ru-RU")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.vi-VN")
    @js.native
    def viVN: IntlType = js.native
    
    @scala.inline
    def viVN_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vi-VN")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.zh-CN")
    @js.native
    def zhCN: IntlType = js.native
    
    @scala.inline
    def zhCN_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zh-CN")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.zh-TW")
    @js.native
    def zhTW: IntlType = js.native
    
    @scala.inline
    def zhTW_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zh-TW")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ant-design/pro-provider", "intlMapKeys")
  @js.native
  val intlMapKeys: js.Array[String] = js.native
  
  @JSImport("@ant-design/pro-provider", "itITIntl")
  @js.native
  val itITIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "jaJPIntl")
  @js.native
  val jaJPIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "koKRIntl")
  @js.native
  val koKRIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "msMYIntl")
  @js.native
  val msMYIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "ptBRIntl")
  @js.native
  val ptBRIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "ruRUIntl")
  @js.native
  val ruRUIntl: IntlType = js.native
  
  @scala.inline
  def useIntl(): IntlType = ^.asInstanceOf[js.Dynamic].applyDynamic("useIntl")().asInstanceOf[IntlType]
  
  @JSImport("@ant-design/pro-provider", "viVNIntl")
  @js.native
  val viVNIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "zhCNIntl")
  @js.native
  val zhCNIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "zhTWIntl")
  @js.native
  val zhTWIntl: IntlType = js.native
  
  trait IntlType extends StObject {
    
    def getMessage(id: String, defaultMessage: String): String
    
    var locale: String
  }
  object IntlType {
    
    @scala.inline
    def apply(getMessage: (String, String) => String, locale: String): IntlType = {
      val __obj = js.Dynamic.literal(getMessage = js.Any.fromFunction2(getMessage), locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntlType]
    }
    
    @scala.inline
    implicit class IntlTypeMutableBuilder[Self <: IntlType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetMessage(value: (String, String) => String): Self = StObject.set(x, "getMessage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  type ParamsType = StringDictionary[ReactText | js.Array[ReactText]]
}
