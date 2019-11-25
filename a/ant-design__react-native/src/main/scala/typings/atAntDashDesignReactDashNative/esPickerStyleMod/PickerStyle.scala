package typings.atAntDashDesignReactDashNative.esPickerStyleMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerStyle extends js.Object {
  var actionText: TextStyle
  var dismissText: TextStyle
  var header: ViewStyle
  var headerItem: ViewStyle
  var modal: ViewStyle
  var okText: TextStyle
  var title: TextStyle
}

object PickerStyle {
  @scala.inline
  def apply(
    actionText: TextStyle,
    dismissText: TextStyle,
    header: ViewStyle,
    headerItem: ViewStyle,
    modal: ViewStyle,
    okText: TextStyle,
    title: TextStyle
  ): PickerStyle = {
    val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerItem = headerItem.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickerStyle]
  }
}

