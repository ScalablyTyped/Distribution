package typings.antDesignReactNative

import typings.antDesignReactNative.anon.AppearTransition
import typings.antDesignReactNative.antDesignReactNativeStrings.fixed
import typings.antDesignReactNative.antDesignReactNativeStrings.normal
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.progressStyleMod.ProgressStyle
import typings.react.mod.Component
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressMod {
  
  @JSImport("@ant-design/react-native/lib/progress", JSImport.Default)
  @js.native
  class default protected () extends Progress {
    def this(props: ProgressProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/progress", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/progress", "default.defaultProps")
    @js.native
    def defaultProps: AppearTransition = js.native
    @scala.inline
    def defaultProps_=(x: AppearTransition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Progress
    extends Component[ProgressProps, js.Any, js.Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MProgress(nextProps: ProgressProps): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MProgress(): Unit = js.native
    
    def getWidth(): Double = js.native
    def getWidth(percent: Double): Double = js.native
    
    def normalPercent(): js.Any = js.native
    def normalPercent(percent: Double): js.Any = js.native
    
    def onLayout(e: LayoutChangeEvent): Unit = js.native
  }
  
  @js.native
  trait ProgressProps extends WithThemeStyles[ProgressStyle] {
    
    var appearTransition: js.UndefOr[Boolean] = js.native
    
    var barStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var percent: js.UndefOr[Double] = js.native
    
    var position: js.UndefOr[fixed | normal] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var unfilled: js.UndefOr[Boolean] = js.native
    
    var wrapWidth: js.UndefOr[Double] = js.native
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
      def setAppearTransition(value: Boolean): Self = StObject.set(x, "appearTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearTransitionUndefined: Self = StObject.set(x, "appearTransition", js.undefined)
      
      @scala.inline
      def setBarStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarStyleNull: Self = StObject.set(x, "barStyle", null)
      
      @scala.inline
      def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setPosition(value: fixed | normal): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUnfilled(value: Boolean): Self = StObject.set(x, "unfilled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnfilledUndefined: Self = StObject.set(x, "unfilled", js.undefined)
      
      @scala.inline
      def setWrapWidth(value: Double): Self = StObject.set(x, "wrapWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapWidthUndefined: Self = StObject.set(x, "wrapWidth", js.undefined)
    }
  }
}
