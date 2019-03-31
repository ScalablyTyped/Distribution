package typings
package antdDashMobileDashRnLib.libPickerStyleIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerStyle extends js.Object {
  var actionText: reactDashNativeLib.reactDashNativeMod.TextStyle
  var header: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var headerItem: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var modal: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var title: reactDashNativeLib.reactDashNativeMod.TextStyle
}

object IPickerStyle {
  @scala.inline
  def apply(
    actionText: reactDashNativeLib.reactDashNativeMod.TextStyle,
    header: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    headerItem: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    modal: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    title: reactDashNativeLib.reactDashNativeMod.TextStyle
  ): IPickerStyle = {
    val __obj = js.Dynamic.literal(actionText = actionText, header = header, headerItem = headerItem, modal = modal, title = title)
  
    __obj.asInstanceOf[IPickerStyle]
  }
}

