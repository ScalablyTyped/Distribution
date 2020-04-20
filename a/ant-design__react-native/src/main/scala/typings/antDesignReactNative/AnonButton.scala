package typings.antDesignReactNative

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButton extends js.Object {
  var button: RegisteredStyle[ViewStyle]
  var buttonWrap: RegisteredStyle[ViewStyle]
  var img: RegisteredStyle[ImageStyle]
  var imgWrap: RegisteredStyle[ViewStyle]
  var message: RegisteredStyle[ViewStyle]
  var messageText: RegisteredStyle[TextStyle]
  var result: RegisteredStyle[ViewStyle]
  var title: RegisteredStyle[ViewStyle]
  var titleText: RegisteredStyle[TextStyle]
}

object AnonButton {
  @scala.inline
  def apply(
    button: RegisteredStyle[ViewStyle],
    buttonWrap: RegisteredStyle[ViewStyle],
    img: RegisteredStyle[ImageStyle],
    imgWrap: RegisteredStyle[ViewStyle],
    message: RegisteredStyle[ViewStyle],
    messageText: RegisteredStyle[TextStyle],
    result: RegisteredStyle[ViewStyle],
    title: RegisteredStyle[ViewStyle],
    titleText: RegisteredStyle[TextStyle]
  ): AnonButton = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonWrap = buttonWrap.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], imgWrap = imgWrap.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButton]
  }
}

