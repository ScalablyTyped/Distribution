package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelTextCancelTextContainer extends js.Object {
  var cancelText: RegisteredStyle[TextStyle]
  var cancelTextContainer: RegisteredStyle[ViewStyle]
  var input: RegisteredStyle[TextStyle]
  var inputWrapper: RegisteredStyle[ViewStyle]
  var search: RegisteredStyle[TextStyle]
  var wrapper: RegisteredStyle[ViewStyle]
}

object Anon_CancelTextCancelTextContainer {
  @scala.inline
  def apply(
    cancelText: RegisteredStyle[TextStyle],
    cancelTextContainer: RegisteredStyle[ViewStyle],
    input: RegisteredStyle[TextStyle],
    inputWrapper: RegisteredStyle[ViewStyle],
    search: RegisteredStyle[TextStyle],
    wrapper: RegisteredStyle[ViewStyle]
  ): Anon_CancelTextCancelTextContainer = {
    val __obj = js.Dynamic.literal(cancelText = cancelText, cancelTextContainer = cancelTextContainer, input = input, inputWrapper = inputWrapper, search = search, wrapper = wrapper)
  
    __obj.asInstanceOf[Anon_CancelTextCancelTextContainer]
  }
}

