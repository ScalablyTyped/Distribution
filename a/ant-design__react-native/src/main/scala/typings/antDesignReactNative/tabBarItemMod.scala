package typings.antDesignReactNative

import typings.antDesignReactNative.anon.`0`
import typings.antDesignReactNative.libStyleMod.Theme
import typings.antDesignReactNative.tabBarPropsTypeMod.TabBarIcon
import typings.antDesignReactNative.tabBarStyleMod.TabBarStyle
import typings.react.mod.Component
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarItemMod {
  
  @JSImport("@ant-design/react-native/lib/tab-bar/TabBarItem", JSImport.Default)
  @js.native
  class default () extends TabBarItem
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/tab-bar/TabBarItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/tab-bar/TabBarItem", "default.defaultProps")
    @js.native
    def defaultProps: `0` = js.native
    @scala.inline
    def defaultProps_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TabBarItem
    extends Component[TabBarItemProps, js.Any, js.Any]
  
  trait TabBarItemProps extends StObject {
    
    var badge: js.UndefOr[String | Double] = js.undefined
    
    var icon: js.UndefOr[TabBarIcon] = js.undefined
    
    var iconStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var renderAsOriginal: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var selectedIcon: js.UndefOr[TabBarIcon] = js.undefined
    
    var styles: js.UndefOr[ReturnType[js.Function1[/* theme */ Theme, TabBarStyle]]] = js.undefined
    
    var tintColor: js.UndefOr[String] = js.undefined
    
    var title: String
    
    var unselectedTintColor: js.UndefOr[String] = js.undefined
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
      def setIcon(value: TabBarIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyleNull: Self = StObject.set(x, "iconStyle", null)
      
      @scala.inline
      def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value :_*))
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setRenderAsOriginal(value: Boolean): Self = StObject.set(x, "renderAsOriginal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderAsOriginalUndefined: Self = StObject.set(x, "renderAsOriginal", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIcon(value: TabBarIcon): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
      
      @scala.inline
      def setSelectedIconVarargs(value: ImageURISource*): Self = StObject.set(x, "selectedIcon", js.Array(value :_*))
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setStyles(value: ReturnType[js.Function1[/* theme */ Theme, TabBarStyle]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectedTintColor(value: String): Self = StObject.set(x, "unselectedTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectedTintColorUndefined: Self = StObject.set(x, "unselectedTintColor", js.undefined)
    }
  }
}
