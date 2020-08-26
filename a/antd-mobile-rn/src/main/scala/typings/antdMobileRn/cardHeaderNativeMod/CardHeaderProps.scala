package typings.antdMobileRn.cardHeaderNativeMod

import typings.antdMobileRn.cardPropsTypeMod.CardHeaderPropsType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardHeaderProps extends CardHeaderPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var styles: js.UndefOr[js.Any] = js.native
  var thumbStyle: js.UndefOr[StyleProp[ImageStyle]] = js.native
}

object CardHeaderProps {
  @scala.inline
  def apply(): CardHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardHeaderProps]
  }
  @scala.inline
  implicit class CardHeaderPropsOps[Self <: CardHeaderProps] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setThumbStyle(value: StyleProp[ImageStyle]): Self = this.set("thumbStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbStyle: Self = this.set("thumbStyle", js.undefined)
    @scala.inline
    def setThumbStyleNull: Self = this.set("thumbStyle", null)
  }
  
}

