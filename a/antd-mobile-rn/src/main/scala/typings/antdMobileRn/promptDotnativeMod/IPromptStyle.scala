package typings.antdMobileRn.promptDotnativeMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPromptStyle extends js.Object {
  var input: TextStyle
  var inputFirst: ViewStyle
  var inputGroup: ViewStyle
  var inputLast: ViewStyle
  var inputWrapper: ViewStyle
  var message: TextStyle
}

object IPromptStyle {
  @scala.inline
  def apply(
    input: TextStyle,
    inputFirst: ViewStyle,
    inputGroup: ViewStyle,
    inputLast: ViewStyle,
    inputWrapper: ViewStyle,
    message: TextStyle
  ): IPromptStyle = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], inputFirst = inputFirst.asInstanceOf[js.Any], inputGroup = inputGroup.asInstanceOf[js.Any], inputLast = inputLast.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPromptStyle]
  }
}

