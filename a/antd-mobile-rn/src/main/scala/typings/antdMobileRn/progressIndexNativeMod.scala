package typings.antdMobileRn

import typings.antdMobileRn.anon.AppearTransition
import typings.antdMobileRn.progressPropsTypeMod.ProgressPropsType
import typings.react.mod.Component
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/progress/index.native", JSImport.Default)
  @js.native
  class default protected () extends Progress {
    def this(props: ProgressProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/progress/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/progress/index.native", "default.defaultProps")
    @js.native
    def defaultProps: AppearTransition = js.native
    @scala.inline
    def defaultProps_=(x: AppearTransition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Progress
    extends Component[ProgressProps, js.Any, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MProgress(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MProgress(nextProps: ProgressProps): Unit = js.native
    
    def getWidth(): Double = js.native
    def getWidth(percent: Double): Double = js.native
    
    def normalPercent(): js.Any = js.native
    def normalPercent(percent: Double): js.Any = js.native
    
    def onLayout(e: LayoutChangeEvent): Unit = js.native
  }
  
  trait ProgressProps
    extends StObject
       with ProgressPropsType {
    
    var barStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[js.Any] = js.undefined
    
    var wrapWidth: js.UndefOr[Double] = js.undefined
  }
  object ProgressProps {
    
    @scala.inline
    def apply(): ProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressProps]
    }
    
    @scala.inline
    implicit class ProgressPropsMutableBuilder[Self <: ProgressProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBarStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarStyleNull: Self = StObject.set(x, "barStyle", null)
      
      @scala.inline
      def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setWrapWidth(value: Double): Self = StObject.set(x, "wrapWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapWidthUndefined: Self = StObject.set(x, "wrapWidth", js.undefined)
    }
  }
}
