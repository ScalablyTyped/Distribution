package typings.antDesignReactNative.anon

import typings.antDesignReactNative.antDesignReactNativeStrings.bottom
import typings.antDesignReactNative.antDesignReactNativeStrings.top
import typings.antDesignReactNative.tabsPropsTypeMod.TabData
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animated extends js.Object {
  
  var activeTab: Double = js.native
  
  var animated: Boolean = js.native
  
  var goToTab: js.Any = js.native
  
  var instanceId: Double = js.native
  
  var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.native
  
  var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, ReactNode]] = js.native
  
  var renderUnderline: js.UndefOr[js.Function1[/* style */ js.Any, ReactNode]] = js.native
  
  var tabBarActiveTextColor: js.UndefOr[String] = js.native
  
  var tabBarBackgroundColor: js.UndefOr[String] = js.native
  
  var tabBarInactiveTextColor: js.UndefOr[String] = js.native
  
  var tabBarPosition: js.UndefOr[top | bottom] = js.native
  
  var tabBarTextStyle: StyleProp[TextStyle] = js.native
  
  var tabBarUnderlineStyle: StyleProp[ViewStyle] = js.native
  
  var tabs: js.Array[TabData] = js.native
}
object Animated {
  
  @scala.inline
  def apply(activeTab: Double, animated: Boolean, goToTab: js.Any, instanceId: Double, tabs: js.Array[TabData]): Animated = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = goToTab.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animated]
  }
  
  @scala.inline
  implicit class AnimatedOps[Self <: Animated] (val x: Self) extends AnyVal {
    
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
    def setActiveTab(value: Double): Self = this.set("activeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToTab(value: js.Any): Self = this.set("goToTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: Double): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsVarargs(value: TabData*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: js.Array[TabData]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTabClick(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = this.set("onTabClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnTabClick: Self = this.set("onTabClick", js.undefined)
    
    @scala.inline
    def setRenderTab(value: /* tab */ TabData => ReactNode): Self = this.set("renderTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderTab: Self = this.set("renderTab", js.undefined)
    
    @scala.inline
    def setRenderUnderline(value: /* style */ js.Any => ReactNode): Self = this.set("renderUnderline", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderUnderline: Self = this.set("renderUnderline", js.undefined)
    
    @scala.inline
    def setTabBarActiveTextColor(value: String): Self = this.set("tabBarActiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarActiveTextColor: Self = this.set("tabBarActiveTextColor", js.undefined)
    
    @scala.inline
    def setTabBarBackgroundColor(value: String): Self = this.set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarBackgroundColor: Self = this.set("tabBarBackgroundColor", js.undefined)
    
    @scala.inline
    def setTabBarInactiveTextColor(value: String): Self = this.set("tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarInactiveTextColor: Self = this.set("tabBarInactiveTextColor", js.undefined)
    
    @scala.inline
    def setTabBarPosition(value: top | bottom): Self = this.set("tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarPosition: Self = this.set("tabBarPosition", js.undefined)
    
    @scala.inline
    def setTabBarTextStyle(value: StyleProp[TextStyle]): Self = this.set("tabBarTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarTextStyle: Self = this.set("tabBarTextStyle", js.undefined)
    
    @scala.inline
    def setTabBarTextStyleNull: Self = this.set("tabBarTextStyle", null)
    
    @scala.inline
    def setTabBarUnderlineStyle(value: StyleProp[ViewStyle]): Self = this.set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarUnderlineStyle: Self = this.set("tabBarUnderlineStyle", js.undefined)
    
    @scala.inline
    def setTabBarUnderlineStyleNull: Self = this.set("tabBarUnderlineStyle", null)
  }
}
