package typings.antdMobileRn

import typings.antdMobileRn.anon.Animating
import typings.antdMobileRn.libActivityIndicatorPropsTypeMod.ActivityIndicatorPropTypes
import typings.antdMobileRn.libActivityIndicatorStyleIndexDotnativeMod.IActivityIndicatorStyle
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libActivityIndicatorIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/activity-indicator/index.native", JSImport.Default)
  @js.native
  open class default () extends RNActivityIndicator
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/activity-indicator/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/activity-indicator/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Animating = js.native
    inline def defaultProps_=(x: Animating): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ActivityIndicatorNativeProps
    extends StObject
       with ActivityIndicatorPropTypes {
    
    var color: js.UndefOr[String] = js.undefined
    
    var styles: js.UndefOr[IActivityIndicatorStyle] = js.undefined
  }
  object ActivityIndicatorNativeProps {
    
    inline def apply(): ActivityIndicatorNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivityIndicatorNativeProps]
    }
    
    extension [Self <: ActivityIndicatorNativeProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setStyles(value: IActivityIndicatorStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait RNActivityIndicator extends Component[ActivityIndicatorNativeProps, Any, Any] {
    
    def _renderSpinner(): Element = js.native
    
    def _renderToast(): Element = js.native
  }
}
