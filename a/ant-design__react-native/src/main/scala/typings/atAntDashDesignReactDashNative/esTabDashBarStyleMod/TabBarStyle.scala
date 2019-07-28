package typings.atAntDashDesignReactDashNative.esTabDashBarStyleMod

import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarStyle extends js.Object {
  var badge: ViewStyle
  var badgeText: TextStyle
  var barIcon: ImageStyle
  var barItem: ViewStyle
  var barItemSelected: ViewStyle
  var barItemTitle: TextStyle
  var content: ViewStyle
  var contentItem: ViewStyle
  var contentItemSelected: ViewStyle
  var tabbar: ViewStyle
  var tabs: ViewStyle
}

object TabBarStyle {
  @scala.inline
  def apply(
    badge: ViewStyle,
    badgeText: TextStyle,
    barIcon: ImageStyle,
    barItem: ViewStyle,
    barItemSelected: ViewStyle,
    barItemTitle: TextStyle,
    content: ViewStyle,
    contentItem: ViewStyle,
    contentItemSelected: ViewStyle,
    tabbar: ViewStyle,
    tabs: ViewStyle
  ): TabBarStyle = {
    val __obj = js.Dynamic.literal(badge = badge, badgeText = badgeText, barIcon = barIcon, barItem = barItem, barItemSelected = barItemSelected, barItemTitle = barItemTitle, content = content, contentItem = contentItem, contentItemSelected = contentItemSelected, tabbar = tabbar, tabs = tabs)
  
    __obj.asInstanceOf[TabBarStyle]
  }
}

