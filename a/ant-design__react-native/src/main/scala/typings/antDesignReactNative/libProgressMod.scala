package typings.antDesignReactNative

import typings.antDesignReactNative.anon.AppearTransition
import typings.antDesignReactNative.antDesignReactNativeStrings.fixed
import typings.antDesignReactNative.antDesignReactNativeStrings.normal
import typings.antDesignReactNative.libProgressStyleMod.ProgressStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProgressMod {
  
  @JSImport("@ant-design/react-native/lib/progress", JSImport.Default)
  @js.native
  open class default protected () extends Progress {
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
    inline def defaultProps_=(x: AppearTransition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Progress extends Component[ProgressProps, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MProgress(nextProps: ProgressProps): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MProgress(): Unit = js.native
    
    def getWidth(): Double = js.native
    def getWidth(percent: Double): Double = js.native
    
    def normalPercent(): Any = js.native
    def normalPercent(percent: Double): Any = js.native
    
    def onLayout(e: LayoutChangeEvent): Unit = js.native
  }
  
  trait ProgressProps
    extends StObject
       with WithThemeStyles[ProgressStyle] {
    
    var appearTransition: js.UndefOr[Boolean] = js.undefined
    
    var barStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var percent: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[fixed | normal] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var unfilled: js.UndefOr[Boolean] = js.undefined
    
    var wrapWidth: js.UndefOr[Double] = js.undefined
  }
  object ProgressProps {
    
    inline def apply(): ProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressProps]
    }
    
    extension [Self <: ProgressProps](x: Self) {
      
      inline def setAppearTransition(value: Boolean): Self = StObject.set(x, "appearTransition", value.asInstanceOf[js.Any])
      
      inline def setAppearTransitionUndefined: Self = StObject.set(x, "appearTransition", js.undefined)
      
      inline def setBarStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
      
      inline def setBarStyleNull: Self = StObject.set(x, "barStyle", null)
      
      inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setPosition(value: fixed | normal): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUnfilled(value: Boolean): Self = StObject.set(x, "unfilled", value.asInstanceOf[js.Any])
      
      inline def setUnfilledUndefined: Self = StObject.set(x, "unfilled", js.undefined)
      
      inline def setWrapWidth(value: Double): Self = StObject.set(x, "wrapWidth", value.asInstanceOf[js.Any])
      
      inline def setWrapWidthUndefined: Self = StObject.set(x, "wrapWidth", js.undefined)
    }
  }
}
