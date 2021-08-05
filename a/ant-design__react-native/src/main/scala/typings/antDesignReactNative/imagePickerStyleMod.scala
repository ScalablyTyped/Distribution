package typings.antDesignReactNative

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagePickerStyleMod {
  
  @JSImport("@ant-design/react-native/lib/image-picker/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ImagePickerStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ImagePickerStyle]
  
  trait ImagePickerStyle extends StObject {
    
    var closeText: TextStyle
    
    var closeWrap: ViewStyle
    
    var container: ViewStyle
    
    var image: ImageStyle
    
    var item: ViewStyle
    
    var plusText: TextStyle
    
    var plusWrap: ViewStyle
    
    var plusWrapHighlight: ViewStyle
    
    var plusWrapNormal: ViewStyle
    
    var size: ImageStyle
  }
  object ImagePickerStyle {
    
    inline def apply(
      closeText: TextStyle,
      closeWrap: ViewStyle,
      container: ViewStyle,
      image: ImageStyle,
      item: ViewStyle,
      plusText: TextStyle,
      plusWrap: ViewStyle,
      plusWrapHighlight: ViewStyle,
      plusWrapNormal: ViewStyle,
      size: ImageStyle
    ): ImagePickerStyle = {
      val __obj = js.Dynamic.literal(closeText = closeText.asInstanceOf[js.Any], closeWrap = closeWrap.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], plusText = plusText.asInstanceOf[js.Any], plusWrap = plusWrap.asInstanceOf[js.Any], plusWrapHighlight = plusWrapHighlight.asInstanceOf[js.Any], plusWrapNormal = plusWrapNormal.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImagePickerStyle]
    }
    
    extension [Self <: ImagePickerStyle](x: Self) {
      
      inline def setCloseText(value: TextStyle): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
      
      inline def setCloseWrap(value: ViewStyle): Self = StObject.set(x, "closeWrap", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setImage(value: ImageStyle): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setItem(value: ViewStyle): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setPlusText(value: TextStyle): Self = StObject.set(x, "plusText", value.asInstanceOf[js.Any])
      
      inline def setPlusWrap(value: ViewStyle): Self = StObject.set(x, "plusWrap", value.asInstanceOf[js.Any])
      
      inline def setPlusWrapHighlight(value: ViewStyle): Self = StObject.set(x, "plusWrapHighlight", value.asInstanceOf[js.Any])
      
      inline def setPlusWrapNormal(value: ViewStyle): Self = StObject.set(x, "plusWrapNormal", value.asInstanceOf[js.Any])
      
      inline def setSize(value: ImageStyle): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
