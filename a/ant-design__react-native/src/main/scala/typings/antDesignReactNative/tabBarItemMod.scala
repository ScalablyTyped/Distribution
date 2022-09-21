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
  open class default () extends TabBarItem
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/tab-bar/TabBarItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/tab-bar/TabBarItem", "default.defaultProps")
    @js.native
    def defaultProps: `0` = js.native
    inline def defaultProps_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TabBarItem extends Component[TabBarItemProps, Any, Any]
  
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
    
    inline def apply(title: String): TabBarItemProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabBarItemProps]
    }
    
    extension [Self <: TabBarItemProps](x: Self) {
      
      inline def setBadge(value: String | Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setIcon(value: TabBarIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleNull: Self = StObject.set(x, "iconStyle", null)
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setRenderAsOriginal(value: Boolean): Self = StObject.set(x, "renderAsOriginal", value.asInstanceOf[js.Any])
      
      inline def setRenderAsOriginalUndefined: Self = StObject.set(x, "renderAsOriginal", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedIcon(value: TabBarIcon): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
      
      inline def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
      
      inline def setSelectedIconVarargs(value: ImageURISource*): Self = StObject.set(x, "selectedIcon", js.Array(value*))
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setStyles(value: ReturnType[js.Function1[/* theme */ Theme, TabBarStyle]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUnselectedTintColor(value: String): Self = StObject.set(x, "unselectedTintColor", value.asInstanceOf[js.Any])
      
      inline def setUnselectedTintColorUndefined: Self = StObject.set(x, "unselectedTintColor", js.undefined)
    }
  }
}
