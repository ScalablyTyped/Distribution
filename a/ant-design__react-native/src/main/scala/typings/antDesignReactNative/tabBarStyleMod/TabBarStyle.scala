package typings.antDesignReactNative.tabBarStyleMod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
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
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], badgeText = badgeText.asInstanceOf[js.Any], barIcon = barIcon.asInstanceOf[js.Any], barItem = barItem.asInstanceOf[js.Any], barItemSelected = barItemSelected.asInstanceOf[js.Any], barItemTitle = barItemTitle.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentItem = contentItem.asInstanceOf[js.Any], contentItemSelected = contentItemSelected.asInstanceOf[js.Any], tabbar = tabbar.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabBarStyle]
  }
}

