package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Button extends js.Object {
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

object Anon_Button {
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
  ): Anon_Button = {
    val __obj = js.Dynamic.literal(button = button, buttonWrap = buttonWrap, img = img, imgWrap = imgWrap, message = message, messageText = messageText, result = result, title = title, titleText = titleText)
  
    __obj.asInstanceOf[Anon_Button]
  }
}

