package typings.atAntDashDesignReactDashNative.esTabsStyleTabsMod

import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsStyle extends js.Object {
  var bottomTabBarSplitLine: ViewStyle
  var container: ViewStyle
  var topTabBarSplitLine: ViewStyle
}

object TabsStyle {
  @scala.inline
  def apply(bottomTabBarSplitLine: ViewStyle, container: ViewStyle, topTabBarSplitLine: ViewStyle): TabsStyle = {
    val __obj = js.Dynamic.literal(bottomTabBarSplitLine = bottomTabBarSplitLine.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], topTabBarSplitLine = topTabBarSplitLine.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabsStyle]
  }
}

