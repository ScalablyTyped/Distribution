package typings.antdMobileRn.anon

import typings.antdMobileRn.antdMobileRnStrings._empty
import typings.antdMobileRn.antdMobileRnStrings.android
import typings.antdMobileRn.antdMobileRnStrings.bottom
import typings.antdMobileRn.antdMobileRnStrings.down
import typings.antdMobileRn.antdMobileRnStrings.empty
import typings.antdMobileRn.antdMobileRnStrings.horizontal
import typings.antdMobileRn.antdMobileRnStrings.ios
import typings.antdMobileRn.antdMobileRnStrings.middle
import typings.antdMobileRn.antdMobileRnStrings.top
import typings.antdMobileRn.antdMobileRnStrings.up
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd-mobile-rn.antd-mobile-rn/lib/list/ListItem.native.ListItemProps> */
@js.native
trait PartialListItemProps extends js.Object {
  var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var align: js.UndefOr[top | middle | bottom] = js.native
  var arrow: js.UndefOr[horizontal | down | up | empty | _empty] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var extra: js.UndefOr[ReactNode] = js.native
  var multipleLine: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  var onPressIn: js.UndefOr[js.Function0[Unit]] = js.native
  var onPressOut: js.UndefOr[js.Function0[Unit]] = js.native
  var platform: js.UndefOr[android | ios] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var styles: js.UndefOr[Arrow] = js.native
  var thumb: js.UndefOr[ReactNode | Null] = js.native
  var wrap: js.UndefOr[Boolean] = js.native
}

object PartialListItemProps {
  @scala.inline
  def apply(): PartialListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemProps]
  }
  @scala.inline
  implicit class PartialListItemPropsOps[Self <: PartialListItemProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: top | middle | bottom): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setArrow(value: horizontal | down | up | empty | _empty): Self = this.set("arrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExtra(value: ReactNode): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setMultipleLine(value: Boolean): Self = this.set("multipleLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleLine: Self = this.set("multipleLine", js.undefined)
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnPressIn(value: () => Unit): Self = this.set("onPressIn", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPressIn: Self = this.set("onPressIn", js.undefined)
    @scala.inline
    def setOnPressOut(value: () => Unit): Self = this.set("onPressOut", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPressOut: Self = this.set("onPressOut", js.undefined)
    @scala.inline
    def setPlatform(value: android | ios): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setStyles(value: Arrow): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setThumb(value: ReactNode): Self = this.set("thumb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumb: Self = this.set("thumb", js.undefined)
    @scala.inline
    def setThumbNull: Self = this.set("thumb", null)
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}

