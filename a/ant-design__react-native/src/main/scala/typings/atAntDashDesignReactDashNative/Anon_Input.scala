package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Input extends js.Object {
  var input: RegisteredStyle[TextStyle]
  var inputFirst: RegisteredStyle[ViewStyle]
  var inputGroup: RegisteredStyle[ViewStyle]
  var inputLast: RegisteredStyle[ViewStyle]
  var inputWrapper: RegisteredStyle[ViewStyle]
  var message: RegisteredStyle[TextStyle]
}

object Anon_Input {
  @scala.inline
  def apply(
    input: RegisteredStyle[TextStyle],
    inputFirst: RegisteredStyle[ViewStyle],
    inputGroup: RegisteredStyle[ViewStyle],
    inputLast: RegisteredStyle[ViewStyle],
    inputWrapper: RegisteredStyle[ViewStyle],
    message: RegisteredStyle[TextStyle]
  ): Anon_Input = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], inputFirst = inputFirst.asInstanceOf[js.Any], inputGroup = inputGroup.asInstanceOf[js.Any], inputLast = inputLast.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Input]
  }
}

