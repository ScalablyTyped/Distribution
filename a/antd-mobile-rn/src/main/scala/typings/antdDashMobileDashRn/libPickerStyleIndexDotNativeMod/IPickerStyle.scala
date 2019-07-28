package typings.antdDashMobileDashRn.libPickerStyleIndexDotNativeMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerStyle extends js.Object {
  var actionText: TextStyle
  var header: ViewStyle
  var headerItem: ViewStyle
  var modal: ViewStyle
  var title: TextStyle
}

object IPickerStyle {
  @scala.inline
  def apply(
    actionText: TextStyle,
    header: ViewStyle,
    headerItem: ViewStyle,
    modal: ViewStyle,
    title: TextStyle
  ): IPickerStyle = {
    val __obj = js.Dynamic.literal(actionText = actionText, header = header, headerItem = headerItem, modal = modal, title = title)
  
    __obj.asInstanceOf[IPickerStyle]
  }
}

