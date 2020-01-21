package typings.antDesignReactNative

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrowBackground extends js.Object {
  var arrow: RegisteredStyle[ViewStyle]
  var background: RegisteredStyle[ViewStyle]
  var content: RegisteredStyle[ViewStyle]
}

object AnonArrowBackground {
  @scala.inline
  def apply(
    arrow: RegisteredStyle[ViewStyle],
    background: RegisteredStyle[ViewStyle],
    content: RegisteredStyle[ViewStyle]
  ): AnonArrowBackground = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArrowBackground]
  }
}

