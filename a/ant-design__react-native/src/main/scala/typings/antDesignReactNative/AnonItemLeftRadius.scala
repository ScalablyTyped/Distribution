package typings.antDesignReactNative

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemLeftRadius extends js.Object {
  var item: RegisteredStyle[ViewStyle]
  var itemLeftRadius: RegisteredStyle[ViewStyle]
  var itemRightRadius: RegisteredStyle[ViewStyle]
  var itemText: RegisteredStyle[TextStyle]
  var segment: RegisteredStyle[ViewStyle]
}

object AnonItemLeftRadius {
  @scala.inline
  def apply(
    item: RegisteredStyle[ViewStyle],
    itemLeftRadius: RegisteredStyle[ViewStyle],
    itemRightRadius: RegisteredStyle[ViewStyle],
    itemText: RegisteredStyle[TextStyle],
    segment: RegisteredStyle[ViewStyle]
  ): AnonItemLeftRadius = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemLeftRadius = itemLeftRadius.asInstanceOf[js.Any], itemRightRadius = itemRightRadius.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemLeftRadius]
  }
}

