package typings.antDesignReactNative

import typings.antDesignReactNative.activityIndicatorStyleMod.ActivityIndicatorStyle
import typings.antDesignReactNative.anon.Animating
import typings.antDesignReactNative.antDesignReactNativeStrings.large
import typings.antDesignReactNative.antDesignReactNativeStrings.small
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activityIndicatorMod {
  
  @JSImport("@ant-design/react-native/lib/activity-indicator", JSImport.Default)
  @js.native
  class default () extends RNActivityIndicator
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/activity-indicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/activity-indicator", "default.defaultProps")
    @js.native
    def defaultProps: Animating = js.native
    @scala.inline
    def defaultProps_=(x: Animating): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ActivityIndicatorNativeProps extends WithThemeStyles[ActivityIndicatorStyle] {
    
    var animating: js.UndefOr[Boolean] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[large | small] = js.native
    
    @JSName("styles")
    var styles_ActivityIndicatorNativeProps: js.UndefOr[ActivityIndicatorStyle] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var toast: js.UndefOr[Boolean] = js.native
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
      def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyles(value: ActivityIndicatorStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setToast(value: Boolean): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastUndefined: Self = StObject.set(x, "toast", js.undefined)
    }
  }
  
  @js.native
  trait RNActivityIndicator
    extends Component[ActivityIndicatorNativeProps, js.Any, js.Any] {
    
    def _renderSpinner(): Element = js.native
    
    def _renderToast(): Element = js.native
  }
}
