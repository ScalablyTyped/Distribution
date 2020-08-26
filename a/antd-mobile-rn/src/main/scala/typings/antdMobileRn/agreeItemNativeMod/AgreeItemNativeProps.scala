package typings.antdMobileRn.agreeItemNativeMod

import typings.antdMobileRn.checkboxPropsTypeMod.CheckboxPropsType
import typings.antdMobileRn.checkboxStyleIndexNativeMod.ICheckboxStyle
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgreeItemNativeProps extends CheckboxPropsType {
  var checkboxStyle: js.UndefOr[StyleProp[ImageStyle]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var styles: js.UndefOr[ICheckboxStyle] = js.native
}

object AgreeItemNativeProps {
  @scala.inline
  def apply(): AgreeItemNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgreeItemNativeProps]
  }
  @scala.inline
  implicit class AgreeItemNativePropsOps[Self <: AgreeItemNativeProps] (val x: Self) extends AnyVal {
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
    def setCheckboxStyle(value: StyleProp[ImageStyle]): Self = this.set("checkboxStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxStyle: Self = this.set("checkboxStyle", js.undefined)
    @scala.inline
    def setCheckboxStyleNull: Self = this.set("checkboxStyle", null)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setStyles(value: ICheckboxStyle): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

