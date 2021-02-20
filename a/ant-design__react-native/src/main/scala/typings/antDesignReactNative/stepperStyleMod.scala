package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperStyleMod {
  
  @JSImport("@ant-design/react-native/lib/stepper/style", JSImport.Default)
  @js.native
  def default(theme: Theme): StepperStyle = js.native
  
  @js.native
  trait StepperStyle extends StObject {
    
    var container: ViewStyle = js.native
    
    var disabledStepTextColor: TextStyle = js.native
    
    var highlightStepBorderColor: ViewStyle = js.native
    
    var highlightStepTextColor: TextStyle = js.native
    
    var input: TextStyle = js.native
    
    var stepDisabled: ViewStyle = js.native
    
    var stepText: TextStyle = js.native
    
    var stepWrap: ViewStyle = js.native
  }
  object StepperStyle {
    
    @scala.inline
    def apply(
      container: ViewStyle,
      disabledStepTextColor: TextStyle,
      highlightStepBorderColor: ViewStyle,
      highlightStepTextColor: TextStyle,
      input: TextStyle,
      stepDisabled: ViewStyle,
      stepText: TextStyle,
      stepWrap: ViewStyle
    ): StepperStyle = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], disabledStepTextColor = disabledStepTextColor.asInstanceOf[js.Any], highlightStepBorderColor = highlightStepBorderColor.asInstanceOf[js.Any], highlightStepTextColor = highlightStepTextColor.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], stepDisabled = stepDisabled.asInstanceOf[js.Any], stepText = stepText.asInstanceOf[js.Any], stepWrap = stepWrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepperStyle]
    }
    
    @scala.inline
    implicit class StepperStyleMutableBuilder[Self <: StepperStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStepTextColor(value: TextStyle): Self = StObject.set(x, "disabledStepTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightStepBorderColor(value: ViewStyle): Self = StObject.set(x, "highlightStepBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightStepTextColor(value: TextStyle): Self = StObject.set(x, "highlightStepTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: TextStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepDisabled(value: ViewStyle): Self = StObject.set(x, "stepDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepText(value: TextStyle): Self = StObject.set(x, "stepText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepWrap(value: ViewStyle): Self = StObject.set(x, "stepWrap", value.asInstanceOf[js.Any])
    }
  }
}
