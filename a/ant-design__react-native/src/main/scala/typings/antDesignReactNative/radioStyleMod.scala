package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioStyleMod {
  
  @JSImport("@ant-design/react-native/lib/radio/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(theme: Theme): RadioStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[RadioStyle]
  
  trait RadioStyle extends StObject {
    
    var icon: ImageStyle
    
    var radioItem: ViewStyle
    
    var radioItemContent: TextStyle
    
    var radioItemContentDisable: TextStyle
    
    var radioItemRadio: ViewStyle
    
    var wrapper: ViewStyle
  }
  object RadioStyle {
    
    @scala.inline
    def apply(
      icon: ImageStyle,
      radioItem: ViewStyle,
      radioItemContent: TextStyle,
      radioItemContentDisable: TextStyle,
      radioItemRadio: ViewStyle,
      wrapper: ViewStyle
    ): RadioStyle = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], radioItem = radioItem.asInstanceOf[js.Any], radioItemContent = radioItemContent.asInstanceOf[js.Any], radioItemContentDisable = radioItemContentDisable.asInstanceOf[js.Any], radioItemRadio = radioItemRadio.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioStyle]
    }
    
    @scala.inline
    implicit class RadioStyleMutableBuilder[Self <: RadioStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: ImageStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioItem(value: ViewStyle): Self = StObject.set(x, "radioItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioItemContent(value: TextStyle): Self = StObject.set(x, "radioItemContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioItemContentDisable(value: TextStyle): Self = StObject.set(x, "radioItemContentDisable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioItemRadio(value: ViewStyle): Self = StObject.set(x, "radioItemRadio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: ViewStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
