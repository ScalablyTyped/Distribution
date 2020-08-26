package typings.antdMobileRn.switchIndexNativeMod

import typings.antdMobileRn.switchPropsTypeMod.SwitchPropsType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntmSwitchProps extends SwitchPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object AntmSwitchProps {
  @scala.inline
  def apply(): AntmSwitchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AntmSwitchProps]
  }
  @scala.inline
  implicit class AntmSwitchPropsOps[Self <: AntmSwitchProps] (val x: Self) extends AnyVal {
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
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

