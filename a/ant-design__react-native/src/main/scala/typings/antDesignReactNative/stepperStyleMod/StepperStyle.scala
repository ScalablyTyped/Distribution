package typings.antDesignReactNative.stepperStyleMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepperStyle extends js.Object {
  
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
  implicit class StepperStyleOps[Self <: StepperStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledStepTextColor(value: TextStyle): Self = this.set("disabledStepTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightStepBorderColor(value: ViewStyle): Self = this.set("highlightStepBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightStepTextColor(value: TextStyle): Self = this.set("highlightStepTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: TextStyle): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepDisabled(value: ViewStyle): Self = this.set("stepDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepText(value: TextStyle): Self = this.set("stepText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepWrap(value: ViewStyle): Self = this.set("stepWrap", value.asInstanceOf[js.Any])
  }
}
