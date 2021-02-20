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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinMod {
  
  @JSImport("antd/lib/spin", JSImport.Default)
  @js.native
  class default protected () extends Spin {
    def this(props: SpinProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd/lib/spin", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/spin", "default.defaultProps.size")
      @js.native
      def size: small | large | typings.antd.antdStrings.default = js.native
      @scala.inline
      def size_=(x: small | large | typings.antd.antdStrings.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/spin", "default.defaultProps.spinning")
      @js.native
      def spinning: Boolean = js.native
      @scala.inline
      def spinning_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spinning")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/spin", "default.defaultProps.wrapperClassName")
      @js.native
      def wrapperClassName: String = js.native
      @scala.inline
      def wrapperClassName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapperClassName")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("antd/lib/spin", "default.setDefaultIndicator")
    @js.native
    def setDefaultIndicator(indicator: ReactNode): Unit = js.native
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
  
  @js.native
  trait SpinProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var indicator: js.UndefOr[SpinIndicator] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[SpinSize] = js.native
    
    var spinning: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tip: js.UndefOr[String] = js.native
    
    var wrapperClassName: js.UndefOr[String] = js.native
  }
  object SpinProps {
    
    @scala.inline
    def apply(): SpinProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinProps]
    }
    
    @scala.inline
    implicit class SpinPropsMutableBuilder[Self <: SpinProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setIndicator(value: SpinIndicator): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSize(value: SpinSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSpinning(value: Boolean): Self = StObject.set(x, "spinning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinningUndefined: Self = StObject.set(x, "spinning", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTip(value: String): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      @scala.inline
      def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.small
    - typings.antd.antdStrings.default
    - typings.antd.antdStrings.large
  */
  trait SpinSize extends StObject
  
  @js.native
  trait SpinState extends StObject {
    
    var notCssAnimationSupported: js.UndefOr[Boolean] = js.native
    
    var spinning: js.UndefOr[Boolean] = js.native
  }
  object SpinState {
    
    @scala.inline
    def apply(): SpinState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinState]
    }
    
    @scala.inline
    implicit class SpinStateMutableBuilder[Self <: SpinState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotCssAnimationSupported(value: Boolean): Self = StObject.set(x, "notCssAnimationSupported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotCssAnimationSupportedUndefined: Self = StObject.set(x, "notCssAnimationSupported", js.undefined)
      
      @scala.inline
      def setSpinning(value: Boolean): Self = StObject.set(x, "spinning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinningUndefined: Self = StObject.set(x, "spinning", js.undefined)
    }
  }
}
