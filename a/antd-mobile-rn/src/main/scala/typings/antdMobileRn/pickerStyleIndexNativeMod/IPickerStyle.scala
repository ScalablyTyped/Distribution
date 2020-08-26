package typings.antdMobileRn.pickerStyleIndexNativeMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPickerStyle extends js.Object {
  var actionText: TextStyle = js.native
  var header: ViewStyle = js.native
  var headerItem: ViewStyle = js.native
  var modal: ViewStyle = js.native
  var title: TextStyle = js.native
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
  @scala.inline
  implicit class IPickerStyleOps[Self <: IPickerStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionText(value: TextStyle): Self = this.set("actionText", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: ViewStyle): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderItem(value: ViewStyle): Self = this.set("headerItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setModal(value: ViewStyle): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: TextStyle): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

