package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerTab extends js.Object {
  var container: RegisteredStyle[ViewStyle]
  var tab: RegisteredStyle[ViewStyle]
  var tabs: RegisteredStyle[ViewStyle]
  var textStyle: RegisteredStyle[TextStyle]
  var underline: RegisteredStyle[ViewStyle]
}

object Anon_ContainerTab {
  @scala.inline
  def apply(
    container: RegisteredStyle[ViewStyle],
    tab: RegisteredStyle[ViewStyle],
    tabs: RegisteredStyle[ViewStyle],
    textStyle: RegisteredStyle[TextStyle],
    underline: RegisteredStyle[ViewStyle]
  ): Anon_ContainerTab = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContainerTab]
  }
}

