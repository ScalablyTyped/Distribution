package typings.antDesignReactNative.stepperStyleMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperStyle extends js.Object {
  var container: ViewStyle
  var disabledStepTextColor: TextStyle
  var highlightStepBorderColor: ViewStyle
  var highlightStepTextColor: TextStyle
  var input: TextStyle
  var stepDisabled: ViewStyle
  var stepText: TextStyle
  var stepWrap: ViewStyle
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
}

