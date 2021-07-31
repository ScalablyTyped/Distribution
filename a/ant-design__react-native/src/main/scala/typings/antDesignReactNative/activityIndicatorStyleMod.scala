package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activityIndicatorStyleMod {
  
  @JSImport("@ant-design/react-native/lib/activity-indicator/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(theme: Theme): ActivityIndicatorStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[ActivityIndicatorStyle]
  
  trait ActivityIndicatorStyle extends StObject {
    
    var container: ViewStyle
    
    var innerContainer: ViewStyle
    
    var spinner: ViewStyle
    
    var tip: TextStyle
    
    var toast: TextStyle
    
    var wrapper: ViewStyle
  }
  object ActivityIndicatorStyle {
    
    @scala.inline
    def apply(
      container: ViewStyle,
      innerContainer: ViewStyle,
      spinner: ViewStyle,
      tip: TextStyle,
      toast: TextStyle,
      wrapper: ViewStyle
    ): ActivityIndicatorStyle = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], spinner = spinner.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActivityIndicatorStyle]
    }
    
    @scala.inline
    implicit class ActivityIndicatorStyleMutableBuilder[Self <: ActivityIndicatorStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerContainer(value: ViewStyle): Self = StObject.set(x, "innerContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinner(value: ViewStyle): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTip(value: TextStyle): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToast(value: TextStyle): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: ViewStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
