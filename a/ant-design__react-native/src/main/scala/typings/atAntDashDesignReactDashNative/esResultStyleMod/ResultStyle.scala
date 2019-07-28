package typings.atAntDashDesignReactDashNative.esResultStyleMod

import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
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
    val __obj = js.Dynamic.literal(button = button, buttonWrap = buttonWrap, img = img, imgWrap = imgWrap, message = message, messageText = messageText, result = result, title = title, titleText = titleText)
  
    __obj.asInstanceOf[ResultStyle]
  }
}

