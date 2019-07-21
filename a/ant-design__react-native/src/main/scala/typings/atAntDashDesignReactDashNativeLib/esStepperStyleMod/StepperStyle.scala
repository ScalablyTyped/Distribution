package typings
package atAntDashDesignReactDashNativeLib.esStepperStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperStyle extends js.Object {
  var container: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var disabledStepTextColor: reactDashNativeLib.reactDashNativeMod.TextStyle
  var highlightStepBorderColor: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var highlightStepTextColor: reactDashNativeLib.reactDashNativeMod.TextStyle
  var input: reactDashNativeLib.reactDashNativeMod.TextStyle
  var stepDisabled: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var stepText: reactDashNativeLib.reactDashNativeMod.TextStyle
  var stepWrap: reactDashNativeLib.reactDashNativeMod.ViewStyle
}

object StepperStyle {
  @scala.inline
  def apply(
    container: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    disabledStepTextColor: reactDashNativeLib.reactDashNativeMod.TextStyle,
    highlightStepBorderColor: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    highlightStepTextColor: reactDashNativeLib.reactDashNativeMod.TextStyle,
    input: reactDashNativeLib.reactDashNativeMod.TextStyle,
    stepDisabled: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    stepText: reactDashNativeLib.reactDashNativeMod.TextStyle,
    stepWrap: reactDashNativeLib.reactDashNativeMod.ViewStyle
  ): StepperStyle = {
    val __obj = js.Dynamic.literal(container = container, disabledStepTextColor = disabledStepTextColor, highlightStepBorderColor = highlightStepBorderColor, highlightStepTextColor = highlightStepTextColor, input = input, stepDisabled = stepDisabled, stepText = stepText, stepWrap = stepWrap)
  
    __obj.asInstanceOf[StepperStyle]
  }
}

