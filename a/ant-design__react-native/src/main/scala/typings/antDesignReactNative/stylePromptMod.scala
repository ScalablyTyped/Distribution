package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylePromptMod {
  
  @JSImport("@ant-design/react-native/lib/modal/style/prompt", JSImport.Default)
  @js.native
  def default(variables: Theme): PromptStyle = js.native
  
  @js.native
  trait PromptStyle extends StObject {
    
    var input: TextStyle = js.native
    
    var inputFirst: ViewStyle = js.native
    
    var inputGroup: ViewStyle = js.native
    
    var inputLast: ViewStyle = js.native
    
    var inputWrapper: ViewStyle = js.native
    
    var message: TextStyle = js.native
  }
  object PromptStyle {
    
    @scala.inline
    def apply(
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
    implicit class PromptStyleMutableBuilder[Self <: PromptStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: TextStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFirst(value: ViewStyle): Self = StObject.set(x, "inputFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputGroup(value: ViewStyle): Self = StObject.set(x, "inputGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputLast(value: ViewStyle): Self = StObject.set(x, "inputLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputWrapper(value: ViewStyle): Self = StObject.set(x, "inputWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: TextStyle): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
