package typings.antdDashMobileDashRn.libTabDashBarStyleIndexDotNativeMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabBarStyle extends js.Object {
  var badge: ViewStyle
  var badgeText: TextStyle
  var barIcon: ViewStyle
  var barItem: ViewStyle
  var barItemSelected: ViewStyle
  var barItemTitle: TextStyle
  var content: ViewStyle
  var contentItem: ViewStyle
  var contentItemSelected: ViewStyle
  var tabbar: ViewStyle
  var tabs: ViewStyle
}

object ITabBarStyle {
  @scala.inline
  def apply(
    badge: ViewStyle,
    badgeText: TextStyle,
    barIcon: ViewStyle,
    barItem: ViewStyle,
    barItemSelected: ViewStyle,
    barItemTitle: TextStyle,
    content: ViewStyle,
    contentItem: ViewStyle,
    contentItemSelected: ViewStyle,
    tabbar: ViewStyle,
    tabs: ViewStyle
  ): ITabBarStyle = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], badgeText = badgeText.asInstanceOf[js.Any], barIcon = barIcon.asInstanceOf[js.Any], barItem = barItem.asInstanceOf[js.Any], barItemSelected = barItemSelected.asInstanceOf[js.Any], barItemTitle = barItemTitle.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentItem = contentItem.asInstanceOf[js.Any], contentItemSelected = contentItemSelected.asInstanceOf[js.Any], tabbar = tabbar.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITabBarStyle]
  }
}

