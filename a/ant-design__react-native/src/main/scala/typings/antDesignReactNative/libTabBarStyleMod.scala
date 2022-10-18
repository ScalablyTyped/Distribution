package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabBarStyleMod {
  
  @JSImport("@ant-design/react-native/lib/tab-bar/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): TabBarStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[TabBarStyle]
  
  trait TabBarStyle extends StObject {
    
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
    
    inline def apply(
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
    
    extension [Self <: TabBarStyle](x: Self) {
      
      inline def setBadge(value: ViewStyle): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeText(value: TextStyle): Self = StObject.set(x, "badgeText", value.asInstanceOf[js.Any])
      
      inline def setBarIcon(value: ImageStyle): Self = StObject.set(x, "barIcon", value.asInstanceOf[js.Any])
      
      inline def setBarItem(value: ViewStyle): Self = StObject.set(x, "barItem", value.asInstanceOf[js.Any])
      
      inline def setBarItemSelected(value: ViewStyle): Self = StObject.set(x, "barItemSelected", value.asInstanceOf[js.Any])
      
      inline def setBarItemTitle(value: TextStyle): Self = StObject.set(x, "barItemTitle", value.asInstanceOf[js.Any])
      
      inline def setContent(value: ViewStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentItem(value: ViewStyle): Self = StObject.set(x, "contentItem", value.asInstanceOf[js.Any])
      
      inline def setContentItemSelected(value: ViewStyle): Self = StObject.set(x, "contentItemSelected", value.asInstanceOf[js.Any])
      
      inline def setTabbar(value: ViewStyle): Self = StObject.set(x, "tabbar", value.asInstanceOf[js.Any])
      
      inline def setTabs(value: ViewStyle): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    }
  }
}
