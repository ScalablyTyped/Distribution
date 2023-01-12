package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToastStyleMod {
  
  @JSImport("@ant-design/react-native/lib/toast/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): ToastStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[ToastStyle]
  
  trait ToastStyle extends StObject {
    
    var centering: ViewStyle
    
    var container: ViewStyle
    
    var content: TextStyle
    
    var iconToast: ViewStyle
    
    var image: TextStyle
    
    var innerContainer: ViewStyle
    
    var innerWrap: ViewStyle
    
    var textToast: ViewStyle
  }
  object ToastStyle {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: ToastStyle] (val x: Self) extends AnyVal {
      
      inline def setCentering(value: ViewStyle): Self = StObject.set(x, "centering", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContent(value: TextStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setIconToast(value: ViewStyle): Self = StObject.set(x, "iconToast", value.asInstanceOf[js.Any])
      
      inline def setImage(value: TextStyle): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setInnerContainer(value: ViewStyle): Self = StObject.set(x, "innerContainer", value.asInstanceOf[js.Any])
      
      inline def setInnerWrap(value: ViewStyle): Self = StObject.set(x, "innerWrap", value.asInstanceOf[js.Any])
      
      inline def setTextToast(value: ViewStyle): Self = StObject.set(x, "textToast", value.asInstanceOf[js.Any])
    }
  }
}
