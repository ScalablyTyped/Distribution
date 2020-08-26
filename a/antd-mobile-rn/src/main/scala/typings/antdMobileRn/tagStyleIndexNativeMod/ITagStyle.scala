package typings.antdMobileRn.tagStyleIndexNativeMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITagStyle extends js.Object {
  var activeText: TextStyle = js.native
  var activeWrap: ViewStyle = js.native
  var close: ViewStyle = js.native
  var closeAndroid: ViewStyle = js.native
  var closeIOS: ViewStyle = js.native
  var closeText: TextStyle = js.native
  var closeTransform: ViewStyle = js.native
  var disabledText: TextStyle = js.native
  var disabledWrap: ViewStyle = js.native
  var normalText: TextStyle = js.native
  var normalWrap: ViewStyle = js.native
  var tag: ViewStyle = js.native
  var text: TextStyle = js.native
  var textSmall: TextStyle = js.native
  var wrap: ViewStyle = js.native
  var wrapSmall: ViewStyle = js.native
}

object ITagStyle {
  @scala.inline
  def apply(
    activeText: TextStyle,
    activeWrap: ViewStyle,
    close: ViewStyle,
    closeAndroid: ViewStyle,
    closeIOS: ViewStyle,
    closeText: TextStyle,
    closeTransform: ViewStyle,
    disabledText: TextStyle,
    disabledWrap: ViewStyle,
    normalText: TextStyle,
    normalWrap: ViewStyle,
    tag: ViewStyle,
    text: TextStyle,
    textSmall: TextStyle,
    wrap: ViewStyle,
    wrapSmall: ViewStyle
  ): ITagStyle = {
    val __obj = js.Dynamic.literal(activeText = activeText.asInstanceOf[js.Any], activeWrap = activeWrap.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], closeAndroid = closeAndroid.asInstanceOf[js.Any], closeIOS = closeIOS.asInstanceOf[js.Any], closeText = closeText.asInstanceOf[js.Any], closeTransform = closeTransform.asInstanceOf[js.Any], disabledText = disabledText.asInstanceOf[js.Any], disabledWrap = disabledWrap.asInstanceOf[js.Any], normalText = normalText.asInstanceOf[js.Any], normalWrap = normalWrap.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textSmall = textSmall.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], wrapSmall = wrapSmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagStyle]
  }
  @scala.inline
  implicit class ITagStyleOps[Self <: ITagStyle] (val x: Self) extends AnyVal {
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
    def setActiveText(value: TextStyle): Self = this.set("activeText", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveWrap(value: ViewStyle): Self = this.set("activeWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: ViewStyle): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseAndroid(value: ViewStyle): Self = this.set("closeAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseIOS(value: ViewStyle): Self = this.set("closeIOS", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseText(value: TextStyle): Self = this.set("closeText", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseTransform(value: ViewStyle): Self = this.set("closeTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabledText(value: TextStyle): Self = this.set("disabledText", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabledWrap(value: ViewStyle): Self = this.set("disabledWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalText(value: TextStyle): Self = this.set("normalText", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalWrap(value: ViewStyle): Self = this.set("normalWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: ViewStyle): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: TextStyle): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextSmall(value: TextStyle): Self = this.set("textSmall", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrap(value: ViewStyle): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapSmall(value: ViewStyle): Self = this.set("wrapSmall", value.asInstanceOf[js.Any])
  }
  
}

