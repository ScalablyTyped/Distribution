package typings.antDesignReactNative

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerTab extends js.Object {
  var container: RegisteredStyle[ViewStyle]
  var tab: RegisteredStyle[ViewStyle]
  var tabs: RegisteredStyle[ViewStyle]
  var textStyle: RegisteredStyle[TextStyle]
  var underline: RegisteredStyle[ViewStyle]
}

object AnonContainerTab {
  @scala.inline
  def apply(
    container: RegisteredStyle[ViewStyle],
    tab: RegisteredStyle[ViewStyle],
    tabs: RegisteredStyle[ViewStyle],
    textStyle: RegisteredStyle[TextStyle],
    underline: RegisteredStyle[ViewStyle]
  ): AnonContainerTab = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContainerTab]
  }
}

