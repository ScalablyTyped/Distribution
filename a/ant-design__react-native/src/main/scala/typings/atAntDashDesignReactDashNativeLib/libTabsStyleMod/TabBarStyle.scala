package typings
package atAntDashDesignReactDashNativeLib.libTabsStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarStyle extends js.Object {
  var container: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var tab: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var tabs: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var textStyle: reactDashNativeLib.reactDashNativeMod.TextStyle
  var underline: reactDashNativeLib.reactDashNativeMod.ViewStyle
}

object TabBarStyle {
  @scala.inline
  def apply(
    container: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    tab: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    tabs: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    textStyle: reactDashNativeLib.reactDashNativeMod.TextStyle,
    underline: reactDashNativeLib.reactDashNativeMod.ViewStyle
  ): TabBarStyle = {
    val __obj = js.Dynamic.literal(container = container, tab = tab, tabs = tabs, textStyle = textStyle, underline = underline)
  
    __obj.asInstanceOf[TabBarStyle]
  }
}

