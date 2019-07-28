package typings.atAntDashDesignReactDashNative.esTabsStyleMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarStyle extends js.Object {
  var container: ViewStyle
  var tab: ViewStyle
  var tabs: ViewStyle
  var textStyle: TextStyle
  var underline: ViewStyle
}

object TabBarStyle {
  @scala.inline
  def apply(container: ViewStyle, tab: ViewStyle, tabs: ViewStyle, textStyle: TextStyle, underline: ViewStyle): TabBarStyle = {
    val __obj = js.Dynamic.literal(container = container, tab = tab, tabs = tabs, textStyle = textStyle, underline = underline)
  
    __obj.asInstanceOf[TabBarStyle]
  }
}

