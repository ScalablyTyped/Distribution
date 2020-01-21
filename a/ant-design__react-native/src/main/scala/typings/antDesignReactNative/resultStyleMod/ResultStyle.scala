package typings.antDesignReactNative.resultStyleMod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultStyle extends js.Object {
  var button: ViewStyle
  var buttonWrap: ViewStyle
  var img: ImageStyle
  var imgWrap: ViewStyle
  var message: ViewStyle
  var messageText: TextStyle
  var result: ViewStyle
  var title: ViewStyle
  var titleText: TextStyle
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
}

