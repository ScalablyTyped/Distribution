package typings.antdMobileRn

import typings.antdMobileRn.libTabBarPropsTypeMod.TabBarProps
import typings.antdMobileRn.libTabBarStyleIndexDotnativeMod.ITabBarStyle
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabBarTabbarDotandroidMod {
  
  @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.android", JSImport.Default)
  @js.native
  open class default () extends TabBar
  object default {
    
    @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.android", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.android", "default.Item")
    @js.native
    def Item: Any = js.native
    inline def Item_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.android", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.android", "default.defaultProps.barTintColor")
      @js.native
      def barTintColor: String = js.native
      inline def barTintColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("barTintColor")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.android", "default.defaultProps.tintColor")
      @js.native
      def tintColor: String = js.native
      inline def tintColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.android", "default.defaultProps.unselectedTintColor")
      @js.native
      def unselectedTintColor: String = js.native
      inline def unselectedTintColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unselectedTintColor")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TabBar extends Component[TabBarNativeProps, Any, Any] {
    
    def getPanes(content: Boolean): js.Array[Any] = js.native
  }
  
  trait TabBarNativeProps
    extends StObject
       with TabBarProps {
    
    @JSName("styles")
    var styles_TabBarNativeProps: js.UndefOr[ITabBarStyle] = js.undefined
  }
  object TabBarNativeProps {
    
    inline def apply(): TabBarNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarNativeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabBarNativeProps] (val x: Self) extends AnyVal {
      
      inline def setStyles(value: ITabBarStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
