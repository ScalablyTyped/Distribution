package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastStyleMod {
  
  @JSImport("@ant-design/react-native/lib/toast/style", JSImport.Default)
  @js.native
  def default(theme: Theme): ToastStyle = js.native
  
  @js.native
  trait ToastStyle extends StObject {
    
    var centering: ViewStyle = js.native
    
    var container: ViewStyle = js.native
    
    var content: TextStyle = js.native
    
    var iconToast: ViewStyle = js.native
    
    var image: TextStyle = js.native
    
    var innerContainer: ViewStyle = js.native
    
    var innerWrap: ViewStyle = js.native
    
    var textToast: ViewStyle = js.native
  }
  object ToastStyle {
    
    @scala.inline
    def apply(
      centering: ViewStyle,
      container: ViewStyle,
      content: TextStyle,
      iconToast: ViewStyle,
      image: TextStyle,
      innerContainer: ViewStyle,
      innerWrap: ViewStyle,
      textToast: ViewStyle
    ): ToastStyle = {
      val __obj = js.Dynamic.literal(centering = centering.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], iconToast = iconToast.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], innerWrap = innerWrap.asInstanceOf[js.Any], textToast = textToast.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastStyle]
    }
    
    @scala.inline
    implicit class ToastStyleMutableBuilder[Self <: ToastStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCentering(value: ViewStyle): Self = StObject.set(x, "centering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: TextStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconToast(value: ViewStyle): Self = StObject.set(x, "iconToast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: TextStyle): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerContainer(value: ViewStyle): Self = StObject.set(x, "innerContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerWrap(value: ViewStyle): Self = StObject.set(x, "innerWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextToast(value: ViewStyle): Self = StObject.set(x, "textToast", value.asInstanceOf[js.Any])
    }
  }
}
