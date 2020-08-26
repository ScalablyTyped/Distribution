package typings.antdMobileRn.checkboxStyleIndexNativeMod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckboxStyle extends js.Object {
  var agreeItem: ViewStyle = js.native
  var agreeItemCheckbox: ViewStyle = js.native
  var checkboxItemCheckbox: ViewStyle = js.native
  var icon: ViewStyle = js.native
  var iconRight: ViewStyle = js.native
  var wrapper: ViewStyle = js.native
}

object ICheckboxStyle {
  @scala.inline
  def apply(
    agreeItem: ViewStyle,
    agreeItemCheckbox: ViewStyle,
    checkboxItemCheckbox: ViewStyle,
    icon: ViewStyle,
    iconRight: ViewStyle,
    wrapper: ViewStyle
  ): ICheckboxStyle = {
    val __obj = js.Dynamic.literal(agreeItem = agreeItem.asInstanceOf[js.Any], agreeItemCheckbox = agreeItemCheckbox.asInstanceOf[js.Any], checkboxItemCheckbox = checkboxItemCheckbox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconRight = iconRight.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxStyle]
  }
  @scala.inline
  implicit class ICheckboxStyleOps[Self <: ICheckboxStyle] (val x: Self) extends AnyVal {
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
    def setAgreeItem(value: ViewStyle): Self = this.set("agreeItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgreeItemCheckbox(value: ViewStyle): Self = this.set("agreeItemCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckboxItemCheckbox(value: ViewStyle): Self = this.set("checkboxItemCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: ViewStyle): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconRight(value: ViewStyle): Self = this.set("iconRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapper(value: ViewStyle): Self = this.set("wrapper", value.asInstanceOf[js.Any])
  }
  
}

