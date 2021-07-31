package typings.antd

import typings.antd.anon.AutoComplete
import typings.antd.anon.Ghost
import typings.antd.anon.RequiredMark
import typings.antd.anon.Size
import typings.antd.localeProviderMod.Locale
import typings.antd.renderEmptyMod.RenderEmptyHandler
import typings.react.mod.ClassicComponentClass
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.FC
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configProviderContextMod {
  
  @JSImport("antd/lib/config-provider/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/lib/config-provider/context", "ConfigConsumer")
  @js.native
  val ConfigConsumer: Consumer[ConfigConsumerProps] = js.native
  
  @JSImport("antd/lib/config-provider/context", "ConfigContext")
  @js.native
  val ConfigContext: Context[ConfigConsumerProps] = js.native
  
  @scala.inline
  def withConfigConsumer[ExportProps /* <: BasicExportProps */](config: ConsumerConfig): js.Function1[/* Component */ IReactComponent[js.Any], FC[ExportProps] & js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("withConfigConsumer")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ IReactComponent[js.Any], FC[ExportProps] & js.Any]]
  
  trait BasicExportProps extends StObject {
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object BasicExportProps {
    
    @scala.inline
    def apply(): BasicExportProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicExportProps]
    }
    
    @scala.inline
    implicit class BasicExportPropsMutableBuilder[Self <: BasicExportProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  trait CSPConfig extends StObject {
    
    var nonce: js.UndefOr[String] = js.undefined
  }
  object CSPConfig {
    
    @scala.inline
    def apply(): CSPConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSPConfig]
    }
    
    @scala.inline
    implicit class CSPConfigMutableBuilder[Self <: CSPConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
  
  @js.native
  trait ConfigConsumerProps extends StObject {
    
    var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.native
    
    var csp: js.UndefOr[CSPConfig] = js.native
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    var dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.native
    
    var form: js.UndefOr[RequiredMark] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
    
    def getPrefixCls(): String = js.native
    def getPrefixCls(suffixCls: String): String = js.native
    def getPrefixCls(suffixCls: String, customizePrefixCls: String): String = js.native
    def getPrefixCls(suffixCls: Unit, customizePrefixCls: String): String = js.native
    
    var getTargetContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    var input: js.UndefOr[AutoComplete] = js.native
    
    var locale: js.UndefOr[Locale] = js.native
    
    var pageHeader: js.UndefOr[Ghost] = js.native
    
    var renderEmpty: RenderEmptyHandler = js.native
    
    var rootPrefixCls: js.UndefOr[String] = js.native
    
    var space: js.UndefOr[Size] = js.native
    
    var virtual: js.UndefOr[Boolean] = js.native
  }
  
  trait ConsumerConfig extends StObject {
    
    var prefixCls: String
  }
  object ConsumerConfig {
    
    @scala.inline
    def apply(prefixCls: String): ConsumerConfig = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsumerConfig]
    }
    
    @scala.inline
    implicit class ConsumerConfigMutableBuilder[Self <: ConsumerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.ltr
    - typings.antd.antdStrings.rtl
    - scala.Unit
  */
  type DirectionType = js.UndefOr[_DirectionType]
  
  type IReactComponent[P] = FC[P] | (ComponentClass[P, ComponentState]) | ClassicComponentClass[P]
  
  trait _DirectionType extends StObject
}
