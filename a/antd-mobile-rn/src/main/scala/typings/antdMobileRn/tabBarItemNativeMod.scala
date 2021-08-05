package typings.antdMobileRn

import typings.antdMobileRn.anon.OnPress
import typings.react.mod.Component
import typings.reactNative.mod.ImageRequireSource
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarItemNativeMod {
  
  @JSImport("antd-mobile-rn/lib/tab-bar/TabBarItem.native", JSImport.Default)
  @js.native
  class default () extends TabBarItem
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/tab-bar/TabBarItem.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/tab-bar/TabBarItem.native", "default.defaultProps")
    @js.native
    def defaultProps: OnPress = js.native
    inline def defaultProps_=(x: OnPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TabBarItem
    extends Component[TabBarItemProps, js.Any, js.Any]
  
  trait TabBarItemProps extends StObject {
    
    var badge: js.UndefOr[String | Double] = js.undefined
    
    var icon: js.UndefOr[ImageURISource | js.Array[ImageURISource] | ImageRequireSource] = js.undefined
    
    var iconStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var renderAsOriginal: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var selectedIcon: js.UndefOr[ImageURISource | js.Array[ImageURISource] | ImageRequireSource] = js.undefined
    
    var styles: js.UndefOr[js.Any] = js.undefined
    
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
      
      inline def setIcon(value: ImageURISource | js.Array[ImageURISource] | ImageRequireSource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleNull: Self = StObject.set(x, "iconStyle", null)
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value :_*))
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setRenderAsOriginal(value: Boolean): Self = StObject.set(x, "renderAsOriginal", value.asInstanceOf[js.Any])
      
      inline def setRenderAsOriginalUndefined: Self = StObject.set(x, "renderAsOriginal", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedIcon(value: ImageURISource | js.Array[ImageURISource] | ImageRequireSource): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
      
      inline def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
      
      inline def setSelectedIconVarargs(value: ImageURISource*): Self = StObject.set(x, "selectedIcon", js.Array(value :_*))
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUnselectedTintColor(value: String): Self = StObject.set(x, "unselectedTintColor", value.asInstanceOf[js.Any])
      
      inline def setUnselectedTintColorUndefined: Self = StObject.set(x, "unselectedTintColor", js.undefined)
    }
  }
}
