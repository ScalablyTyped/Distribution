package typings.antdMobileRn

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveTextColor extends js.Object {
  var activeTextColor: String
  var inactiveTextColor: String
  var tab: ViewStyle
  var tabs: ViewStyle
  var textStyle: ViewStyle
  var underline: ViewStyle
}

object AnonActiveTextColor {
  @scala.inline
  def apply(
    activeTextColor: String,
    inactiveTextColor: String,
    tab: ViewStyle,
    tabs: ViewStyle,
    textStyle: ViewStyle,
    underline: ViewStyle
  ): AnonActiveTextColor = {
    val __obj = js.Dynamic.literal(activeTextColor = activeTextColor.asInstanceOf[js.Any], inactiveTextColor = inactiveTextColor.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActiveTextColor]
  }
}

