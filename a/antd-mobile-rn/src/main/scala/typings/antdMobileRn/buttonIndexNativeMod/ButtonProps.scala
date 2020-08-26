package typings.antdMobileRn.buttonIndexNativeMod

import typings.antdMobileRn.anon.Container
import typings.antdMobileRn.antdMobileRnStrings.ghost
import typings.antdMobileRn.antdMobileRnStrings.large
import typings.antdMobileRn.antdMobileRnStrings.primary
import typings.antdMobileRn.antdMobileRnStrings.small
import typings.antdMobileRn.antdMobileRnStrings.warning
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TouchableHighlightProps
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.antdMobileRn.buttonPropsTypeMod.ButtonPropsType because var conflicts: disabled. Inlined `type`, size, loading */ @js.native
trait ButtonProps extends TouchableHighlightProps {
  var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[js.Function1[/* _ */ js.UndefOr[js.Any], Unit]] = js.native
  var size: js.UndefOr[large | small] = js.native
  var styles: js.UndefOr[Container] = js.native
  var `type`: js.UndefOr[primary | warning | ghost] = js.native
}

object ButtonProps {
  @scala.inline
  def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  @scala.inline
  implicit class ButtonPropsOps[Self <: ButtonProps] (val x: Self) extends AnyVal {
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
    def setActiveStyle(value: StyleProp[ViewStyle]): Self = this.set("activeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveStyle: Self = this.set("activeStyle", js.undefined)
    @scala.inline
    def setActiveStyleNull: Self = this.set("activeStyle", null)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setOnClick(value: /* _ */ js.UndefOr[js.Any] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setSize(value: large | small): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyles(value: Container): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setType(value: primary | warning | ghost): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

