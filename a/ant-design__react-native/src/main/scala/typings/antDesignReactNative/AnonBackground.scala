package typings.antDesignReactNative

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackground extends js.Object {
  var arrow: RegisteredStyle[ViewStyle]
  var background: RegisteredStyle[ViewStyle]
  var content: RegisteredStyle[ViewStyle]
}

object AnonBackground {
  @scala.inline
  def apply(
    arrow: RegisteredStyle[ViewStyle],
    background: RegisteredStyle[ViewStyle],
    content: RegisteredStyle[ViewStyle]
  ): AnonBackground = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBackground]
  }
}

