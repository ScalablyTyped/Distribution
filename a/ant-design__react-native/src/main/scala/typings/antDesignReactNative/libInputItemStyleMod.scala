package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputItemStyleMod {
  
  @JSImport("@ant-design/react-native/lib/input-item/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): InputItemStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[InputItemStyle]
  
  trait InputItemStyle extends StObject {
    
    var clear: ViewStyle
    
    var container: ViewStyle
    
    var errorIcon: ViewStyle
    
    var extra: TextStyle
    
    var input: TextStyle
    
    var inputDisabled: TextStyle
    
    var inputErrorColor: TextStyle
    
    var text: TextStyle
  }
  object InputItemStyle {
    
    inline def apply(
      clear: ViewStyle,
      container: ViewStyle,
      errorIcon: ViewStyle,
      extra: TextStyle,
      input: TextStyle,
      inputDisabled: TextStyle,
      inputErrorColor: TextStyle,
      text: TextStyle
    ): InputItemStyle = {
      val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputDisabled = inputDisabled.asInstanceOf[js.Any], inputErrorColor = inputErrorColor.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputItemStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputItemStyle] (val x: Self) extends AnyVal {
      
      inline def setClear(value: ViewStyle): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setErrorIcon(value: ViewStyle): Self = StObject.set(x, "errorIcon", value.asInstanceOf[js.Any])
      
      inline def setExtra(value: TextStyle): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setInput(value: TextStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputDisabled(value: TextStyle): Self = StObject.set(x, "inputDisabled", value.asInstanceOf[js.Any])
      
      inline def setInputErrorColor(value: TextStyle): Self = StObject.set(x, "inputErrorColor", value.asInstanceOf[js.Any])
      
      inline def setText(value: TextStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
