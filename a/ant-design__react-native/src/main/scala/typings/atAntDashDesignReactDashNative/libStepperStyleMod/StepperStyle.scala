package typings.atAntDashDesignReactDashNative.libStepperStyleMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
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
    val __obj = js.Dynamic.literal(container = container, disabledStepTextColor = disabledStepTextColor, highlightStepBorderColor = highlightStepBorderColor, highlightStepTextColor = highlightStepTextColor, input = input, stepDisabled = stepDisabled, stepText = stepText, stepWrap = stepWrap)
  
    __obj.asInstanceOf[StepperStyle]
  }
}

