package typings.antdMobileRn.badgeStyleIndexNativeMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBadgeStyle extends js.Object {
  var dot: ViewStyle = js.native
  var dotSizelarge: ViewStyle = js.native
  var text: TextStyle = js.native
  var textCorner: ViewStyle = js.native
  var textCornerWrap: ViewStyle = js.native
  var textCornerlarge: ViewStyle = js.native
  var textDom: ViewStyle = js.native
  var wrap: ViewStyle = js.native
}

object IBadgeStyle {
  @scala.inline
  def apply(
    dot: ViewStyle,
    dotSizelarge: ViewStyle,
    text: TextStyle,
    textCorner: ViewStyle,
    textCornerWrap: ViewStyle,
    textCornerlarge: ViewStyle,
    textDom: ViewStyle,
    wrap: ViewStyle
  ): IBadgeStyle = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], dotSizelarge = dotSizelarge.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textCorner = textCorner.asInstanceOf[js.Any], textCornerWrap = textCornerWrap.asInstanceOf[js.Any], textCornerlarge = textCornerlarge.asInstanceOf[js.Any], textDom = textDom.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBadgeStyle]
  }
  @scala.inline
  implicit class IBadgeStyleOps[Self <: IBadgeStyle] (val x: Self) extends AnyVal {
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
    def setDot(value: ViewStyle): Self = this.set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def setDotSizelarge(value: ViewStyle): Self = this.set("dotSizelarge", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: TextStyle): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextCorner(value: ViewStyle): Self = this.set("textCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextCornerWrap(value: ViewStyle): Self = this.set("textCornerWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextCornerlarge(value: ViewStyle): Self = this.set("textCornerlarge", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextDom(value: ViewStyle): Self = this.set("textDom", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrap(value: ViewStyle): Self = this.set("wrap", value.asInstanceOf[js.Any])
  }
  
}

