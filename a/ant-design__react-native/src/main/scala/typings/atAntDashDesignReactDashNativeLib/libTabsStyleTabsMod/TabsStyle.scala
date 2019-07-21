package typings
package atAntDashDesignReactDashNativeLib.libTabsStyleTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsStyle extends js.Object {
  var bottomTabBarSplitLine: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var container: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var topTabBarSplitLine: reactDashNativeLib.reactDashNativeMod.ViewStyle
}

object TabsStyle {
  @scala.inline
  def apply(
    bottomTabBarSplitLine: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    container: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    topTabBarSplitLine: reactDashNativeLib.reactDashNativeMod.ViewStyle
  ): TabsStyle = {
    val __obj = js.Dynamic.literal(bottomTabBarSplitLine = bottomTabBarSplitLine, container = container, topTabBarSplitLine = topTabBarSplitLine)
  
    __obj.asInstanceOf[TabsStyle]
  }
}

