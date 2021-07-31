package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveTab extends StObject {
  
  var activeTab: Double
  
  var animated: Boolean
  
  var dynamicTabUnderlineWidth: Boolean
  
  def goToTab(): Unit
  
  var page: Double
  
  var tabBarActiveTextColor: String
  
  var tabBarBackgroundColor: String
  
  var tabBarInactiveTextColor: String
  
  var tabs: js.Array[scala.Nothing]
}
object ActiveTab {
  
  @scala.inline
  def apply(
    activeTab: Double,
    animated: Boolean,
    dynamicTabUnderlineWidth: Boolean,
    goToTab: () => Unit,
    page: Double,
    tabBarActiveTextColor: String,
    tabBarBackgroundColor: String,
    tabBarInactiveTextColor: String,
    tabs: js.Array[scala.Nothing]
  ): ActiveTab = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], dynamicTabUnderlineWidth = dynamicTabUnderlineWidth.asInstanceOf[js.Any], goToTab = js.Any.fromFunction0(goToTab), page = page.asInstanceOf[js.Any], tabBarActiveTextColor = tabBarActiveTextColor.asInstanceOf[js.Any], tabBarBackgroundColor = tabBarBackgroundColor.asInstanceOf[js.Any], tabBarInactiveTextColor = tabBarInactiveTextColor.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTab]
  }
  
  @scala.inline
  implicit class ActiveTabMutableBuilder[Self <: ActiveTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicTabUnderlineWidth(value: Boolean): Self = StObject.set(x, "dynamicTabUnderlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToTab(value: () => Unit): Self = StObject.set(x, "goToTab", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarActiveTextColor(value: String): Self = StObject.set(x, "tabBarActiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarBackgroundColor(value: String): Self = StObject.set(x, "tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarInactiveTextColor(value: String): Self = StObject.set(x, "tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabs(value: js.Array[scala.Nothing]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsVarargs(value: scala.Nothing*): Self = StObject.set(x, "tabs", js.Array(value :_*))
  }
}
