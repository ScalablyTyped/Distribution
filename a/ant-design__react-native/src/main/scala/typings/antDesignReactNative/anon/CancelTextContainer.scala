package typings.antDesignReactNative.anon

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelTextContainer extends js.Object {
  var cancelText: RegisteredStyle[TextStyle]
  var cancelTextContainer: RegisteredStyle[ViewStyle]
  var input: RegisteredStyle[TextStyle]
  var inputWrapper: RegisteredStyle[ViewStyle]
  var search: RegisteredStyle[TextStyle]
  var wrapper: RegisteredStyle[ViewStyle]
}

object CancelTextContainer {
  @scala.inline
  def apply(
    cancelText: RegisteredStyle[TextStyle],
    cancelTextContainer: RegisteredStyle[ViewStyle],
    input: RegisteredStyle[TextStyle],
    inputWrapper: RegisteredStyle[ViewStyle],
    search: RegisteredStyle[TextStyle],
    wrapper: RegisteredStyle[ViewStyle]
  ): CancelTextContainer = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], cancelTextContainer = cancelTextContainer.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTextContainer]
  }
}

