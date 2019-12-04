package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemItemLeftRadius extends js.Object {
  var item: RegisteredStyle[ViewStyle]
  var itemLeftRadius: RegisteredStyle[ViewStyle]
  var itemRightRadius: RegisteredStyle[ViewStyle]
  var itemText: RegisteredStyle[TextStyle]
  var segment: RegisteredStyle[ViewStyle]
}

object Anon_ItemItemLeftRadius {
  @scala.inline
  def apply(
    item: RegisteredStyle[ViewStyle],
    itemLeftRadius: RegisteredStyle[ViewStyle],
    itemRightRadius: RegisteredStyle[ViewStyle],
    itemText: RegisteredStyle[TextStyle],
    segment: RegisteredStyle[ViewStyle]
  ): Anon_ItemItemLeftRadius = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemLeftRadius = itemLeftRadius.asInstanceOf[js.Any], itemRightRadius = itemRightRadius.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemItemLeftRadius]
  }
}

