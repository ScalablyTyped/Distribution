package typings.antdMobileRn

import typings.antdMobileRn.anon.AppearTransition
import typings.antdMobileRn.libProgressPropsTypeMod.ProgressPropsType
import typings.react.mod.Component
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProgressIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/progress/index.native", JSImport.Default)
  @js.native
  open class default protected () extends Progress {
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
    inline def defaultProps_=(x: AppearTransition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Progress extends Component[ProgressProps, Any, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MProgress(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MProgress(nextProps: ProgressProps): Unit = js.native
    
    def getWidth(): Double = js.native
    def getWidth(percent: Double): Double = js.native
    
    def normalPercent(): Any = js.native
    def normalPercent(percent: Double): Any = js.native
    
    def onLayout(e: LayoutChangeEvent): Unit = js.native
  }
  
  trait ProgressProps
    extends StObject
       with ProgressPropsType {
    
    var barStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[Any] = js.undefined
    
    var wrapWidth: js.UndefOr[Double] = js.undefined
  }
  object ProgressProps {
    
    inline def apply(): ProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressProps] (val x: Self) extends AnyVal {
      
      inline def setBarStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
      
      inline def setBarStyleNull: Self = StObject.set(x, "barStyle", null)
      
      inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setWrapWidth(value: Double): Self = StObject.set(x, "wrapWidth", value.asInstanceOf[js.Any])
      
      inline def setWrapWidthUndefined: Self = StObject.set(x, "wrapWidth", js.undefined)
    }
  }
}
