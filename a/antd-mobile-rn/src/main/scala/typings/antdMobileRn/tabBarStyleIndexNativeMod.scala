package typings.antdMobileRn

import typings.antdMobileRn.anon.BorderColorBorderStyle
import typings.antdMobileRn.anon.BottomHeight
import typings.antdMobileRn.anon.ColorTextAlign
import typings.antdMobileRn.anon.FlexJustifyContent
import typings.antdMobileRn.anon.FlexNumber
import typings.antdMobileRn.anon.HeightNull
import typings.antdMobileRn.anon.MarginTopNumber
import typings.antdMobileRn.anon.MarginTopWidth
import typings.antdMobileRn.anon.MinWidth
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/tab-bar/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/tab-bar/style/index.native", "default.badge")
    @js.native
    def badge: MinWidth = js.native
    
    @JSImport("antd-mobile-rn/lib/tab-bar/style/index.native", "default.badgeText")
    @js.native
    def badgeText: ColorTextAlign = js.native
    @scala.inline
    def badgeText_=(x: ColorTextAlign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("badgeText")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def badge_=(x: MinWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("badge")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/tab-bar/style/index.native", "default.barIcon")
    @js.native
    def barIcon: MarginTopWidth = js.native
    @scala.inline
    def barIcon_=(x: MarginTopWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("barIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/tab-bar/style/index.native", "default.barItem")
    @js.native
    def barItem: FlexJustifyContent = js.native
    
    @JSImport("antd-mobile-rn/lib/tab-bar/style/index.native", "default.barItemTitle")
    @js.native
    def barItemTitle: MarginTopNumber = js.native
    @scala.inline
    def barItemTitle_=(x: MarginTopNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("barItemTitle")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def barItem_=(x: FlexJustifyContent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("barItem")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/tab-bar/style/index.native", "default.content")
    @js.native
    def content: FlexNumber = js.native
    
    @JSImport("antd-mobile-rn/lib/tab-bar/style/index.native", "default.contentItem")
    @js.native
    def contentItem: BottomHeight = js.native
    
    @JSImport("antd-mobile-rn/lib/tab-bar/style/index.native", "default.contentItemSelected")
    @js.native
    def contentItemSelected: HeightNull = js.native
    @scala.inline
    def contentItemSelected_=(x: HeightNull): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentItemSelected")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def contentItem_=(x: BottomHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentItem")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def content_=(x: FlexNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/tab-bar/style/index.native", "default.tabbar")
    @js.native
    def tabbar: FlexNumber = js.native
    @scala.inline
    def tabbar_=(x: FlexNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabbar")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/tab-bar/style/index.native", "default.tabs")
    @js.native
    def tabs: BorderColorBorderStyle = js.native
    @scala.inline
    def tabs_=(x: BorderColorBorderStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabs")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ITabBarStyle extends StObject {
    
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
    implicit class ITabBarStyleMutableBuilder[Self <: ITabBarStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: ViewStyle): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeText(value: TextStyle): Self = StObject.set(x, "badgeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarIcon(value: ViewStyle): Self = StObject.set(x, "barIcon", value.asInstanceOf[js.Any])
      
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
