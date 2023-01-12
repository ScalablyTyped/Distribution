package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalStylePromptMod {
  
  @JSImport("@ant-design/react-native/lib/modal/style/prompt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(variables: Theme): PromptStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(variables.asInstanceOf[js.Any]).asInstanceOf[PromptStyle]
  
  trait PromptStyle extends StObject {
    
    var input: TextStyle
    
    var inputFirst: ViewStyle
    
    var inputGroup: ViewStyle
    
    var inputLast: ViewStyle
    
    var inputWrapper: ViewStyle
    
    var message: TextStyle
  }
  object PromptStyle {
    
    inline def apply(
      input: TextStyle,
      inputFirst: ViewStyle,
      inputGroup: ViewStyle,
      inputLast: ViewStyle,
      inputWrapper: ViewStyle,
      message: TextStyle
    ): PromptStyle = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], inputFirst = inputFirst.asInstanceOf[js.Any], inputGroup = inputGroup.asInstanceOf[js.Any], inputLast = inputLast.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromptStyle] (val x: Self) extends AnyVal {
      
      inline def setInput(value: TextStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputFirst(value: ViewStyle): Self = StObject.set(x, "inputFirst", value.asInstanceOf[js.Any])
      
      inline def setInputGroup(value: ViewStyle): Self = StObject.set(x, "inputGroup", value.asInstanceOf[js.Any])
      
      inline def setInputLast(value: ViewStyle): Self = StObject.set(x, "inputLast", value.asInstanceOf[js.Any])
      
      inline def setInputWrapper(value: ViewStyle): Self = StObject.set(x, "inputWrapper", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: TextStyle): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
