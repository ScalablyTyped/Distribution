package typings.antDesignReactNative

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainer extends js.Object {
  var container: RegisteredStyle[ViewStyle]
  var innerContainer: RegisteredStyle[ViewStyle]
  var spinner: RegisteredStyle[ViewStyle]
  var tip: RegisteredStyle[TextStyle]
  var toast: RegisteredStyle[TextStyle]
  var wrapper: RegisteredStyle[ViewStyle]
}

object AnonContainer {
  @scala.inline
  def apply(
    container: RegisteredStyle[ViewStyle],
    innerContainer: RegisteredStyle[ViewStyle],
    spinner: RegisteredStyle[ViewStyle],
    tip: RegisteredStyle[TextStyle],
    toast: RegisteredStyle[TextStyle],
    wrapper: RegisteredStyle[ViewStyle]
  ): AnonContainer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], spinner = spinner.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainer]
  }
}

