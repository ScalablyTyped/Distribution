package typings.antdMobileRn.modalNativeMod

import typings.antdMobileRn.modalPropsTypeMod.ModalPropsType
import typings.antdMobileRn.modalStyleIndexNativeMod.IModalStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalNativeProps extends ModalPropsType[TextStyle] {
  var bodyStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var styles: js.UndefOr[IModalStyle] = js.native
}

object IModalNativeProps {
  @scala.inline
  def apply(visible: Boolean): IModalNativeProps = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalNativeProps]
  }
  @scala.inline
  implicit class IModalNativePropsOps[Self <: IModalNativeProps] (val x: Self) extends AnyVal {
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
    def setBodyStyle(value: StyleProp[ViewStyle]): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
    @scala.inline
    def setBodyStyleNull: Self = this.set("bodyStyle", null)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setStyles(value: IModalStyle): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

