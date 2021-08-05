package typings.antd

import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinMod {
  
  @JSImport("antd/lib/spin", JSImport.Default)
  @js.native
  class default protected () extends Spin {
    def this(props: SpinProps) = this()
  }
  object default {
    
    @JSImport("antd/lib/spin", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd/lib/spin", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/spin", "default.defaultProps.size")
      @js.native
      def size: small | large | typings.antd.antdStrings.default = js.native
      inline def size_=(x: small | large | typings.antd.antdStrings.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/spin", "default.defaultProps.spinning")
      @js.native
      def spinning: Boolean = js.native
      inline def spinning_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spinning")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/spin", "default.defaultProps.wrapperClassName")
      @js.native
      def wrapperClassName: String = js.native
      inline def wrapperClassName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapperClassName")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def setDefaultIndicator(indicator: ReactNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultIndicator")(indicator.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  trait Spin
    extends Component[SpinProps, SpinState, js.Any] {
    
    def cancelExistingSpin(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSpin(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSpin(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSpin(): Unit = js.native
    
    def debouncifyUpdateSpinning(): Unit = js.native
    def debouncifyUpdateSpinning(props: SpinProps): Unit = js.native
    
    def isNestedPattern(): Boolean = js.native
    
    def originalUpdateSpinning(): Unit = js.native
    
    def renderSpin(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
    
    def updateSpinning(): Unit = js.native
  }
  
  type SpinIndicator = ReactElement
  
  trait SpinProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var indicator: js.UndefOr[SpinIndicator] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[SpinSize] = js.undefined
    
    var spinning: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tip: js.UndefOr[String] = js.undefined
    
    var wrapperClassName: js.UndefOr[String] = js.undefined
  }
  object SpinProps {
    
    inline def apply(): SpinProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinProps]
    }
    
    extension [Self <: SpinProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setIndicator(value: SpinIndicator): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSize(value: SpinSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpinning(value: Boolean): Self = StObject.set(x, "spinning", value.asInstanceOf[js.Any])
      
      inline def setSpinningUndefined: Self = StObject.set(x, "spinning", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTip(value: String): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      inline def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      inline def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.small
    - typings.antd.antdStrings.default
    - typings.antd.antdStrings.large
  */
  trait SpinSize extends StObject
  
  trait SpinState extends StObject {
    
    var notCssAnimationSupported: js.UndefOr[Boolean] = js.undefined
    
    var spinning: js.UndefOr[Boolean] = js.undefined
  }
  object SpinState {
    
    inline def apply(): SpinState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinState]
    }
    
    extension [Self <: SpinState](x: Self) {
      
      inline def setNotCssAnimationSupported(value: Boolean): Self = StObject.set(x, "notCssAnimationSupported", value.asInstanceOf[js.Any])
      
      inline def setNotCssAnimationSupportedUndefined: Self = StObject.set(x, "notCssAnimationSupported", js.undefined)
      
      inline def setSpinning(value: Boolean): Self = StObject.set(x, "spinning", value.asInstanceOf[js.Any])
      
      inline def setSpinningUndefined: Self = StObject.set(x, "spinning", js.undefined)
    }
  }
}
