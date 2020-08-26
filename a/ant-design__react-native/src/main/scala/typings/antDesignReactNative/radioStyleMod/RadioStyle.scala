package typings.antDesignReactNative.radioStyleMod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioStyle extends js.Object {
  var icon: ImageStyle = js.native
  var radioItem: ViewStyle = js.native
  var radioItemContent: TextStyle = js.native
  var radioItemContentDisable: TextStyle = js.native
  var radioItemRadio: ViewStyle = js.native
  var wrapper: ViewStyle = js.native
}

object RadioStyle {
  @scala.inline
  def apply(
    icon: ImageStyle,
    radioItem: ViewStyle,
    radioItemContent: TextStyle,
    radioItemContentDisable: TextStyle,
    radioItemRadio: ViewStyle,
    wrapper: ViewStyle
  ): RadioStyle = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], radioItem = radioItem.asInstanceOf[js.Any], radioItemContent = radioItemContent.asInstanceOf[js.Any], radioItemContentDisable = radioItemContentDisable.asInstanceOf[js.Any], radioItemRadio = radioItemRadio.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioStyle]
  }
  @scala.inline
  implicit class RadioStyleOps[Self <: RadioStyle] (val x: Self) extends AnyVal {
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
    def setIcon(value: ImageStyle): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadioItem(value: ViewStyle): Self = this.set("radioItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadioItemContent(value: TextStyle): Self = this.set("radioItemContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadioItemContentDisable(value: TextStyle): Self = this.set("radioItemContentDisable", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadioItemRadio(value: ViewStyle): Self = this.set("radioItemRadio", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapper(value: ViewStyle): Self = this.set("wrapper", value.asInstanceOf[js.Any])
  }
  
}

