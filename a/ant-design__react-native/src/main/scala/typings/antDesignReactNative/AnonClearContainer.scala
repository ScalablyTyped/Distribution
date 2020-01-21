package typings.antDesignReactNative

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClearContainer extends js.Object {
  var clear: RegisteredStyle[ViewStyle]
  var container: RegisteredStyle[ViewStyle]
  var errorIcon: RegisteredStyle[ViewStyle]
  var extra: RegisteredStyle[TextStyle]
  var input: RegisteredStyle[TextStyle]
  var inputDisabled: RegisteredStyle[TextStyle]
  var inputErrorColor: RegisteredStyle[TextStyle]
  var text: RegisteredStyle[TextStyle]
}

object AnonClearContainer {
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
  ): AnonClearContainer = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputDisabled = inputDisabled.asInstanceOf[js.Any], inputErrorColor = inputErrorColor.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClearContainer]
  }
}

