package typings.antDesignReactNative

import typings.antDesignReactNative.anon.`0`
import typings.antDesignReactNative.libStyleMod.Theme
import typings.antDesignReactNative.tabBarPropsTypeMod.TabBarProps
import typings.antDesignReactNative.tabBarStyleMod.TabBarStyle
import typings.react.mod.Component
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarMod {
  
  @JSImport("@ant-design/react-native/lib/tab-bar", JSImport.Default)
  @js.native
  class default () extends TabBar
  object default {
    
    /* was `typeof TabBarItem` */
    @JSImport("@ant-design/react-native/lib/tab-bar", "default.Item")
    @js.native
    class Item ()
      extends typings.antDesignReactNative.tabBarItemMod.default
    /* static members */
    object Item {
      
      @JSImport("@ant-design/react-native/lib/tab-bar", "default.Item")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/tab-bar", "default.Item.defaultProps")
      @js.native
      def defaultProps: `0` = js.native
      @scala.inline
      def defaultProps_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/tab-bar", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/tab-bar", "default.defaultProps.barTintColor")
      @js.native
      def barTintColor: String = js.native
      @scala.inline
      def barTintColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("barTintColor")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/tab-bar", "default.defaultProps.tintColor")
      @js.native
      def tintColor: String = js.native
      @scala.inline
      def tintColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/tab-bar", "default.defaultProps.unselectedTintColor")
      @js.native
      def unselectedTintColor: String = js.native
      @scala.inline
      def unselectedTintColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unselectedTintColor")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TabBar
    extends Component[TabBarNativeProps, js.Any, js.Any] {
    
    def getPanes(styles: ReturnType[js.Function1[/* theme */ Theme, TabBarStyle]], content: Boolean): js.Array[js.Any] = js.native
  }
  object TabBar {
    
    /* was `typeof TabBarItem` */
    type Item = typings.antDesignReactNative.tabBarItemMod.default
  }
  
  trait TabBarNativeProps
    extends StObject
       with TabBarProps {
    
    var styles: js.UndefOr[TabBarStyle] = js.undefined
  }
  object TabBarNativeProps {
    
    @scala.inline
    def apply(): TabBarNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarNativeProps]
    }
    
    @scala.inline
    implicit class TabBarNativePropsMutableBuilder[Self <: TabBarNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: TabBarStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
