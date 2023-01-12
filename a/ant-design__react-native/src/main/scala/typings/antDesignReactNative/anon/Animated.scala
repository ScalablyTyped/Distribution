package typings.antDesignReactNative.anon

import typings.antDesignReactNative.antDesignReactNativeStrings.bottom
import typings.antDesignReactNative.antDesignReactNativeStrings.top
import typings.antDesignReactNative.libTabsPropsTypeMod.TabData
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animated extends StObject {
  
  var activeTab: Double
  
  var animated: Boolean
  
  var goToTab: Any
  
  var instanceId: Double
  
  var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.undefined
  
  var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, ReactNode]] = js.undefined
  
  var renderUnderline: js.UndefOr[js.Function1[/* style */ Any, ReactNode]] = js.undefined
  
  var tabBarActiveTextColor: js.UndefOr[String] = js.undefined
  
  var tabBarBackgroundColor: js.UndefOr[String] = js.undefined
  
  var tabBarInactiveTextColor: js.UndefOr[String] = js.undefined
  
  var tabBarPosition: js.UndefOr[top | bottom] = js.undefined
  
  var tabBarTextStyle: StyleProp[TextStyle]
  
  var tabBarUnderlineStyle: StyleProp[ViewStyle]
  
  var tabs: js.Array[TabData]
}
object Animated {
  
  inline def apply(activeTab: Double, animated: Boolean, goToTab: Any, instanceId: Double, tabs: js.Array[TabData]): Animated = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = goToTab.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Animated] (val x: Self) extends AnyVal {
    
    inline def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setGoToTab(value: Any): Self = StObject.set(x, "goToTab", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: Double): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setOnTabClick(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = StObject.set(x, "onTabClick", js.Any.fromFunction2(value))
    
    inline def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
    
    inline def setRenderTab(value: /* tab */ TabData => ReactNode): Self = StObject.set(x, "renderTab", js.Any.fromFunction1(value))
    
    inline def setRenderTabUndefined: Self = StObject.set(x, "renderTab", js.undefined)
    
    inline def setRenderUnderline(value: /* style */ Any => ReactNode): Self = StObject.set(x, "renderUnderline", js.Any.fromFunction1(value))
    
    inline def setRenderUnderlineUndefined: Self = StObject.set(x, "renderUnderline", js.undefined)
    
    inline def setTabBarActiveTextColor(value: String): Self = StObject.set(x, "tabBarActiveTextColor", value.asInstanceOf[js.Any])
    
    inline def setTabBarActiveTextColorUndefined: Self = StObject.set(x, "tabBarActiveTextColor", js.undefined)
    
    inline def setTabBarBackgroundColor(value: String): Self = StObject.set(x, "tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setTabBarBackgroundColorUndefined: Self = StObject.set(x, "tabBarBackgroundColor", js.undefined)
    
    inline def setTabBarInactiveTextColor(value: String): Self = StObject.set(x, "tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    
    inline def setTabBarInactiveTextColorUndefined: Self = StObject.set(x, "tabBarInactiveTextColor", js.undefined)
    
    inline def setTabBarPosition(value: top | bottom): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
    
    inline def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
    
    inline def setTabBarTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabBarTextStyle", value.asInstanceOf[js.Any])
    
    inline def setTabBarTextStyleNull: Self = StObject.set(x, "tabBarTextStyle", null)
    
    inline def setTabBarTextStyleUndefined: Self = StObject.set(x, "tabBarTextStyle", js.undefined)
    
    inline def setTabBarUnderlineStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    inline def setTabBarUnderlineStyleNull: Self = StObject.set(x, "tabBarUnderlineStyle", null)
    
    inline def setTabBarUnderlineStyleUndefined: Self = StObject.set(x, "tabBarUnderlineStyle", js.undefined)
    
    inline def setTabs(value: js.Array[TabData]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsVarargs(value: TabData*): Self = StObject.set(x, "tabs", js.Array(value*))
  }
}
