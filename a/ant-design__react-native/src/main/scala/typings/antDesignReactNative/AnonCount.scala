package typings.antDesignReactNative

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var container: RegisteredStyle[ViewStyle]
  var count: RegisteredStyle[ViewStyle]
  var errorIcon: RegisteredStyle[ViewStyle]
  var icon: RegisteredStyle[ViewStyle]
  var input: RegisteredStyle[TextStyle]
}

object AnonCount {
  @scala.inline
  def apply(
    container: RegisteredStyle[ViewStyle],
    count: RegisteredStyle[ViewStyle],
    errorIcon: RegisteredStyle[ViewStyle],
    icon: RegisteredStyle[ViewStyle],
    input: RegisteredStyle[TextStyle]
  ): AnonCount = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCount]
  }
}

