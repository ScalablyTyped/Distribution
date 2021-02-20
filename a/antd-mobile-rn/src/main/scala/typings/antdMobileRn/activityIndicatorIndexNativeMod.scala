package typings.antdMobileRn

import typings.antdMobileRn.activityIndicatorPropsTypeMod.ActivityIndicatorPropTypes
import typings.antdMobileRn.anon.Animating
import typings.antdMobileRn.styleIndexDotnativeMod.IActivityIndicatorStyle
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activityIndicatorIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/activity-indicator/index.native", JSImport.Default)
  @js.native
  class default () extends RNActivityIndicator
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/activity-indicator/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/activity-indicator/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Animating = js.native
    @scala.inline
    def defaultProps_=(x: Animating): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ActivityIndicatorNativeProps extends ActivityIndicatorPropTypes {
    
    var color: js.UndefOr[String] = js.native
    
    var styles: js.UndefOr[IActivityIndicatorStyle] = js.native
  }
  object ActivityIndicatorNativeProps {
    
    @scala.inline
    def apply(): ActivityIndicatorNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivityIndicatorNativeProps]
    }
    
    @scala.inline
    implicit class ActivityIndicatorNativePropsMutableBuilder[Self <: ActivityIndicatorNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setStyles(value: IActivityIndicatorStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait RNActivityIndicator
    extends Component[ActivityIndicatorNativeProps, js.Any, js.Any] {
    
    def _renderSpinner(): Element = js.native
    
    def _renderToast(): Element = js.native
  }
}
