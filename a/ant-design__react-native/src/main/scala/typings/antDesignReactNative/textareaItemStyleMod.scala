package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textareaItemStyleMod {
  
  @JSImport("@ant-design/react-native/lib/textarea-item/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(theme: Theme): TextareaItemStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[TextareaItemStyle]
  
  trait TextareaItemStyle extends StObject {
    
    var container: ViewStyle
    
    var count: ViewStyle
    
    var countText: TextStyle
    
    var errorIcon: ViewStyle
    
    var icon: ViewStyle
    
    var input: TextStyle
  }
  object TextareaItemStyle {
    
    @scala.inline
    def apply(
      container: ViewStyle,
      count: ViewStyle,
      countText: TextStyle,
      errorIcon: ViewStyle,
      icon: ViewStyle,
      input: TextStyle
    ): TextareaItemStyle = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], countText = countText.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextareaItemStyle]
    }
    
    @scala.inline
    implicit class TextareaItemStyleMutableBuilder[Self <: TextareaItemStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCount(value: ViewStyle): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountText(value: TextStyle): Self = StObject.set(x, "countText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorIcon(value: ViewStyle): Self = StObject.set(x, "errorIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: ViewStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: TextStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
}
