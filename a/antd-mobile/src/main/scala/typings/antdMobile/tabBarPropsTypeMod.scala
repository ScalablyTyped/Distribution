package typings.antdMobile

import typings.antdMobile.anon.Uri
import typings.antdMobile.antdMobileStrings.bottom
import typings.antdMobile.antdMobileStrings.top
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarPropsTypeMod {
  
  trait TabBarItemProps extends StObject {
    
    var badge: js.UndefOr[String | Double] = js.undefined
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[TabIcon] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var selectedIcon: js.UndefOr[TabIcon] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: String
  }
  object TabBarItemProps {
    
    @scala.inline
    def apply(title: String): TabBarItemProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabBarItemProps]
    }
    
    @scala.inline
    implicit class TabBarItemPropsMutableBuilder[Self <: TabBarItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: String | Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setIcon(value: TabIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIcon(value: TabIcon): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabBarProps extends StObject {
    
    /** default: false */
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var barTintColor: js.UndefOr[String] = js.undefined
    
    /** default: false */
    var swipeable: js.UndefOr[Boolean] = js.undefined
    
    var tabBarPosition: js.UndefOr[top | bottom] = js.undefined
    
    var tintColor: js.UndefOr[String] = js.undefined
    
    var unselectedTintColor: js.UndefOr[String] = js.undefined
  }
  object TabBarProps {
    
    @scala.inline
    def apply(): TabBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarProps]
    }
    
    @scala.inline
    implicit class TabBarPropsMutableBuilder[Self <: TabBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setBarTintColor(value: String): Self = StObject.set(x, "barTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarTintColorUndefined: Self = StObject.set(x, "barTintColor", js.undefined)
      
      @scala.inline
      def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
      
      @scala.inline
      def setTabBarPosition(value: top | bottom): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
      
      @scala.inline
      def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      @scala.inline
      def setUnselectedTintColor(value: String): Self = StObject.set(x, "unselectedTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectedTintColorUndefined: Self = StObject.set(x, "unselectedTintColor", js.undefined)
    }
  }
  
  type TabIcon = ReactElement | Uri
}
