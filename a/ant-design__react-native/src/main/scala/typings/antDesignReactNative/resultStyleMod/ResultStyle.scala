package typings.antDesignReactNative.resultStyleMod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultStyle extends js.Object {
  var button: ViewStyle = js.native
  var buttonWrap: ViewStyle = js.native
  var img: ImageStyle = js.native
  var imgWrap: ViewStyle = js.native
  var message: ViewStyle = js.native
  var messageText: TextStyle = js.native
  var result: ViewStyle = js.native
  var title: ViewStyle = js.native
  var titleText: TextStyle = js.native
}

object ResultStyle {
  @scala.inline
  def apply(
    button: ViewStyle,
    buttonWrap: ViewStyle,
    img: ImageStyle,
    imgWrap: ViewStyle,
    message: ViewStyle,
    messageText: TextStyle,
    result: ViewStyle,
    title: ViewStyle,
    titleText: TextStyle
  ): ResultStyle = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonWrap = buttonWrap.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], imgWrap = imgWrap.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultStyle]
  }
  @scala.inline
  implicit class ResultStyleOps[Self <: ResultStyle] (val x: Self) extends AnyVal {
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
    def setButton(value: ViewStyle): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonWrap(value: ViewStyle): Self = this.set("buttonWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setImg(value: ImageStyle): Self = this.set("img", value.asInstanceOf[js.Any])
    @scala.inline
    def setImgWrap(value: ViewStyle): Self = this.set("imgWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: ViewStyle): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageText(value: TextStyle): Self = this.set("messageText", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: ViewStyle): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: ViewStyle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleText(value: TextStyle): Self = this.set("titleText", value.asInstanceOf[js.Any])
  }
  
}

