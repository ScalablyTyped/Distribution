package typings.antdMobileRn.flexNativeMod

import typings.antdMobileRn.flexPropsTypeMod.FlexPropsType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexProps extends FlexPropsType {
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.native
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  var onPressIn: js.UndefOr[js.Function0[Unit]] = js.native
  var onPressOut: js.UndefOr[js.Function0[Unit]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object FlexProps {
  @scala.inline
  def apply(): FlexProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexProps]
  }
  @scala.inline
  implicit class FlexPropsOps[Self <: FlexProps] (val x: Self) extends AnyVal {
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
    def setOnLongPress(value: () => Unit): Self = this.set("onLongPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setOnPressIn(value: () => Unit): Self = this.set("onPressIn", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPressIn: Self = this.set("onPressIn", js.undefined)
    @scala.inline
    def setOnPressOut(value: () => Unit): Self = this.set("onPressOut", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPressOut: Self = this.set("onPressOut", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

