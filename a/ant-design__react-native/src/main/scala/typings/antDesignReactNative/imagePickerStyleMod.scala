package typings.antDesignReactNative

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagePickerStyleMod {
  
  @JSImport("@ant-design/react-native/lib/image-picker/style", JSImport.Default)
  @js.native
  def default(): ImagePickerStyle = js.native
  
  @js.native
  trait ImagePickerStyle extends StObject {
    
    var closeText: TextStyle = js.native
    
    var closeWrap: ViewStyle = js.native
    
    var container: ViewStyle = js.native
    
    var image: ImageStyle = js.native
    
    var item: ViewStyle = js.native
    
    var plusText: TextStyle = js.native
    
    var plusWrap: ViewStyle = js.native
    
    var plusWrapHighlight: ViewStyle = js.native
    
    var plusWrapNormal: ViewStyle = js.native
    
    var size: ImageStyle = js.native
  }
  object ImagePickerStyle {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ImagePickerStyleMutableBuilder[Self <: ImagePickerStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseText(value: TextStyle): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseWrap(value: ViewStyle): Self = StObject.set(x, "closeWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: ImageStyle): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: ViewStyle): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlusText(value: TextStyle): Self = StObject.set(x, "plusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlusWrap(value: ViewStyle): Self = StObject.set(x, "plusWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlusWrapHighlight(value: ViewStyle): Self = StObject.set(x, "plusWrapHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlusWrapNormal(value: ViewStyle): Self = StObject.set(x, "plusWrapNormal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: ImageStyle): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
