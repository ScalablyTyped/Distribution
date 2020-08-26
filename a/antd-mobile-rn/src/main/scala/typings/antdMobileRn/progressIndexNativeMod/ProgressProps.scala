package typings.antdMobileRn.progressIndexNativeMod

import typings.antdMobileRn.progressPropsTypeMod.ProgressPropsType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressProps extends ProgressPropsType {
  var barStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var styles: js.UndefOr[js.Any] = js.native
  var wrapWidth: js.UndefOr[Double] = js.native
}

object ProgressProps {
  @scala.inline
  def apply(): ProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressProps]
  }
  @scala.inline
  implicit class ProgressPropsOps[Self <: ProgressProps] (val x: Self) extends AnyVal {
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
    def setBarStyle(value: StyleProp[ViewStyle]): Self = this.set("barStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarStyle: Self = this.set("barStyle", js.undefined)
    @scala.inline
    def setBarStyleNull: Self = this.set("barStyle", null)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setWrapWidth(value: Double): Self = this.set("wrapWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapWidth: Self = this.set("wrapWidth", js.undefined)
  }
  
}

