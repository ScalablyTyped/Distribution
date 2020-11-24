package typings.antdMobileRn.tabBarStyleIndexNativeMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITabBarStyle extends js.Object {
  
  var badge: ViewStyle = js.native
  
  var badgeText: TextStyle = js.native
  
  var barIcon: ViewStyle = js.native
  
  var barItem: ViewStyle = js.native
  
  var barItemSelected: ViewStyle = js.native
  
  var barItemTitle: TextStyle = js.native
  
  var content: ViewStyle = js.native
  
  var contentItem: ViewStyle = js.native
  
  var contentItemSelected: ViewStyle = js.native
  
  var tabbar: ViewStyle = js.native
  
  var tabs: ViewStyle = js.native
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
  
  @scala.inline
  implicit class ITabBarStyleOps[Self <: ITabBarStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBadge(value: ViewStyle): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeText(value: TextStyle): Self = this.set("badgeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarIcon(value: ViewStyle): Self = this.set("barIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarItem(value: ViewStyle): Self = this.set("barItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarItemSelected(value: ViewStyle): Self = this.set("barItemSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarItemTitle(value: TextStyle): Self = this.set("barItemTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: ViewStyle): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentItem(value: ViewStyle): Self = this.set("contentItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentItemSelected(value: ViewStyle): Self = this.set("contentItemSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabbar(value: ViewStyle): Self = this.set("tabbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabs(value: ViewStyle): Self = this.set("tabs", value.asInstanceOf[js.Any])
  }
}
