package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarStyleMod {
  
  @JSImport("@ant-design/react-native/lib/tab-bar/style", JSImport.Default)
  @js.native
  def default(theme: Theme): TabBarStyle = js.native
  
  @js.native
  trait TabBarStyle extends StObject {
    
    var badge: ViewStyle = js.native
    
    var badgeText: TextStyle = js.native
    
    var barIcon: ImageStyle = js.native
    
    var barItem: ViewStyle = js.native
    
    var barItemSelected: ViewStyle = js.native
    
    var barItemTitle: TextStyle = js.native
    
    var content: ViewStyle = js.native
    
    var contentItem: ViewStyle = js.native
    
    var contentItemSelected: ViewStyle = js.native
    
    var tabbar: ViewStyle = js.native
    
    var tabs: ViewStyle = js.native
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
    
    @scala.inline
    implicit class TabBarStyleMutableBuilder[Self <: TabBarStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: ViewStyle): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeText(value: TextStyle): Self = StObject.set(x, "badgeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarIcon(value: ImageStyle): Self = StObject.set(x, "barIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarItem(value: ViewStyle): Self = StObject.set(x, "barItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarItemSelected(value: ViewStyle): Self = StObject.set(x, "barItemSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarItemTitle(value: TextStyle): Self = StObject.set(x, "barItemTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: ViewStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentItem(value: ViewStyle): Self = StObject.set(x, "contentItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentItemSelected(value: ViewStyle): Self = StObject.set(x, "contentItemSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabbar(value: ViewStyle): Self = StObject.set(x, "tabbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs(value: ViewStyle): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    }
  }
}
