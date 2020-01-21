package typings.antDesignReactNative

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerDisabledStepTextColor extends js.Object {
  var container: RegisteredStyle[ViewStyle]
  var disabledStepTextColor: RegisteredStyle[TextStyle]
  var highlightStepBorderColor: RegisteredStyle[ViewStyle]
  var highlightStepTextColor: RegisteredStyle[TextStyle]
  var input: RegisteredStyle[TextStyle]
  var stepDisabled: RegisteredStyle[ViewStyle]
  var stepText: RegisteredStyle[TextStyle]
  var stepWrap: RegisteredStyle[ViewStyle]
}

object AnonContainerDisabledStepTextColor {
  @scala.inline
  def apply(
    container: RegisteredStyle[ViewStyle],
    disabledStepTextColor: RegisteredStyle[TextStyle],
    highlightStepBorderColor: RegisteredStyle[ViewStyle],
    highlightStepTextColor: RegisteredStyle[TextStyle],
    input: RegisteredStyle[TextStyle],
    stepDisabled: RegisteredStyle[ViewStyle],
    stepText: RegisteredStyle[TextStyle],
    stepWrap: RegisteredStyle[ViewStyle]
  ): AnonContainerDisabledStepTextColor = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], disabledStepTextColor = disabledStepTextColor.asInstanceOf[js.Any], highlightStepBorderColor = highlightStepBorderColor.asInstanceOf[js.Any], highlightStepTextColor = highlightStepTextColor.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], stepDisabled = stepDisabled.asInstanceOf[js.Any], stepText = stepText.asInstanceOf[js.Any], stepWrap = stepWrap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContainerDisabledStepTextColor]
  }
}

