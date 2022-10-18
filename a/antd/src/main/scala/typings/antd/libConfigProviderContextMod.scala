package typings.antd

import typings.antd.anon.AutoComplete
import typings.antd.anon.Colon
import typings.antd.anon.Ghost
import typings.antd.anon.ShowSizeChanger
import typings.antd.anon.Size
import typings.antd.libConfigProviderDefaultRenderEmptyMod.RenderEmptyHandler
import typings.antd.libLocaleProviderMod.Locale
import typings.react.mod.ComponentType
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.FC
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigProviderContextMod {
  
  @JSImport("antd/lib/config-provider/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/lib/config-provider/context", "ConfigConsumer")
  @js.native
  val ConfigConsumer: Consumer[ConfigConsumerProps] = js.native
  
  @JSImport("antd/lib/config-provider/context", "ConfigContext")
  @js.native
  val ConfigContext: Context[ConfigConsumerProps] = js.native
  
  inline def withConfigConsumer[ExportProps /* <: BasicExportProps */](config: ConsumerConfig): js.Function1[/* Component */ ComponentType[ExportProps], FC[ExportProps] & Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("withConfigConsumer")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ ComponentType[ExportProps], FC[ExportProps] & Any]]
  
  trait BasicExportProps extends StObject {
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object BasicExportProps {
    
    inline def apply(): BasicExportProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicExportProps]
    }
    
    extension [Self <: BasicExportProps](x: Self) {
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  trait CSPConfig extends StObject {
    
    var nonce: js.UndefOr[String] = js.undefined
  }
  object CSPConfig {
    
    inline def apply(): CSPConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSPConfig]
    }
    
    extension [Self <: CSPConfig](x: Self) {
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
  
  @js.native
  trait ConfigConsumerProps extends StObject {
    
    var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.native
    
    var csp: js.UndefOr[CSPConfig] = js.native
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    var dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.native
    
    var form: js.UndefOr[Colon] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ js.UndefOr[HTMLElement], HTMLElement]] = js.native
    
    def getPrefixCls(): String = js.native
    def getPrefixCls(suffixCls: String): String = js.native
    def getPrefixCls(suffixCls: String, customizePrefixCls: String): String = js.native
    def getPrefixCls(suffixCls: Unit, customizePrefixCls: String): String = js.native
    
    var getTargetContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    var iconPrefixCls: js.UndefOr[String] = js.native
    
    var input: js.UndefOr[AutoComplete] = js.native
    
    var locale: js.UndefOr[Locale] = js.native
    
    var pageHeader: js.UndefOr[Ghost] = js.native
    
    var pagination: js.UndefOr[ShowSizeChanger] = js.native
    
    var renderEmpty: js.UndefOr[RenderEmptyHandler] = js.native
    
    var rootPrefixCls: js.UndefOr[String] = js.native
    
    var space: js.UndefOr[Size] = js.native
    
    var virtual: js.UndefOr[Boolean] = js.native
  }
  
  trait ConsumerConfig extends StObject {
    
    var prefixCls: String
  }
  object ConsumerConfig {
    
    inline def apply(prefixCls: String): ConsumerConfig = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsumerConfig]
    }
    
    extension [Self <: ConsumerConfig](x: Self) {
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.ltr
    - typings.antd.antdStrings.rtl
    - scala.Unit
  */
  type DirectionType = js.UndefOr[_DirectionType]
  
  trait Theme extends StObject {
    
    var errorColor: js.UndefOr[String] = js.undefined
    
    var infoColor: js.UndefOr[String] = js.undefined
    
    var primaryColor: js.UndefOr[String] = js.undefined
    
    var processingColor: js.UndefOr[String] = js.undefined
    
    var successColor: js.UndefOr[String] = js.undefined
    
    var warningColor: js.UndefOr[String] = js.undefined
  }
  object Theme {
    
    inline def apply(): Theme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setErrorColor(value: String): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      inline def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      inline def setInfoColor(value: String): Self = StObject.set(x, "infoColor", value.asInstanceOf[js.Any])
      
      inline def setInfoColorUndefined: Self = StObject.set(x, "infoColor", js.undefined)
      
      inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      inline def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      inline def setProcessingColor(value: String): Self = StObject.set(x, "processingColor", value.asInstanceOf[js.Any])
      
      inline def setProcessingColorUndefined: Self = StObject.set(x, "processingColor", js.undefined)
      
      inline def setSuccessColor(value: String): Self = StObject.set(x, "successColor", value.asInstanceOf[js.Any])
      
      inline def setSuccessColorUndefined: Self = StObject.set(x, "successColor", js.undefined)
      
      inline def setWarningColor(value: String): Self = StObject.set(x, "warningColor", value.asInstanceOf[js.Any])
      
      inline def setWarningColorUndefined: Self = StObject.set(x, "warningColor", js.undefined)
    }
  }
  
  trait _DirectionType extends StObject
}
