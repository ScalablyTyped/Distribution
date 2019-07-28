package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClearContainer extends js.Object {
  var clear: RegisteredStyle[ViewStyle]
  var container: RegisteredStyle[ViewStyle]
  var errorIcon: RegisteredStyle[ViewStyle]
  var extra: RegisteredStyle[TextStyle]
  var input: RegisteredStyle[TextStyle]
  var inputDisabled: RegisteredStyle[TextStyle]
  var inputErrorColor: RegisteredStyle[TextStyle]
  var text: RegisteredStyle[TextStyle]
}

object Anon_ClearContainer {
  @scala.inline
  def apply(
    clear: RegisteredStyle[ViewStyle],
    container: RegisteredStyle[ViewStyle],
    errorIcon: RegisteredStyle[ViewStyle],
    extra: RegisteredStyle[TextStyle],
    input: RegisteredStyle[TextStyle],
    inputDisabled: RegisteredStyle[TextStyle],
    inputErrorColor: RegisteredStyle[TextStyle],
    text: RegisteredStyle[TextStyle]
  ): Anon_ClearContainer = {
    val __obj = js.Dynamic.literal(clear = clear, container = container, errorIcon = errorIcon, extra = extra, input = input, inputDisabled = inputDisabled, inputErrorColor = inputErrorColor, text = text)
  
    __obj.asInstanceOf[Anon_ClearContainer]
  }
}

