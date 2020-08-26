package typings.antDesignReactNative.radioItemMod

import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.radioPropsTypeMod.RadioItemPropsType
import typings.antDesignReactNative.radioStyleMod.RadioStyle
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioItemNativeProps
  extends RadioItemPropsType
     with WithThemeStyles[RadioStyle] {
  var radioStyle: js.UndefOr[StyleProp[ImageStyle]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object RadioItemNativeProps {
  @scala.inline
  def apply(): RadioItemNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioItemNativeProps]
  }
  @scala.inline
  implicit class RadioItemNativePropsOps[Self <: RadioItemNativeProps] (val x: Self) extends AnyVal {
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
    def setRadioStyle(value: StyleProp[ImageStyle]): Self = this.set("radioStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadioStyle: Self = this.set("radioStyle", js.undefined)
    @scala.inline
    def setRadioStyleNull: Self = this.set("radioStyle", null)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

