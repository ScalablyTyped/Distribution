package typings.antdMobileRn.pickerStyleIndexNativeMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
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
    val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerItem = headerItem.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPickerStyle]
  }
}

