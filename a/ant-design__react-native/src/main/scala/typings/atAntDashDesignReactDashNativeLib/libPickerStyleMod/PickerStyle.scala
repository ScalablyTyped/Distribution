package typings
package atAntDashDesignReactDashNativeLib.libPickerStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerStyle extends js.Object {
  var actionText: reactDashNativeLib.reactDashNativeMod.TextStyle
  var dismissText: reactDashNativeLib.reactDashNativeMod.TextStyle
  var header: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var headerItem: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var modal: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var okText: reactDashNativeLib.reactDashNativeMod.TextStyle
  var title: reactDashNativeLib.reactDashNativeMod.TextStyle
}

object PickerStyle {
  @scala.inline
  def apply(
    actionText: reactDashNativeLib.reactDashNativeMod.TextStyle,
    dismissText: reactDashNativeLib.reactDashNativeMod.TextStyle,
    header: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    headerItem: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    modal: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    okText: reactDashNativeLib.reactDashNativeMod.TextStyle,
    title: reactDashNativeLib.reactDashNativeMod.TextStyle
  ): PickerStyle = {
    val __obj = js.Dynamic.literal(actionText = actionText, dismissText = dismissText, header = header, headerItem = headerItem, modal = modal, okText = okText, title = title)
  
    __obj.asInstanceOf[PickerStyle]
  }
}

