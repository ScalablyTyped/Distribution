package typings.antdMobileRn

import typings.antdMobileRn.tabBarPropsTypeMod.TabBarProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabbarIosMod {
  
  @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.ios", JSImport.Default)
  @js.native
  class default () extends TabBar
  object default {
    
    @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.ios", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.ios", "default.Item")
    @js.native
    def Item: js.Any = js.native
    @scala.inline
    def Item_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.ios", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.ios", "default.defaultProps.barTintColor")
      @js.native
      def barTintColor: String = js.native
      @scala.inline
      def barTintColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("barTintColor")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.ios", "default.defaultProps.tintColor")
      @js.native
      def tintColor: String = js.native
      @scala.inline
      def tintColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.ios", "default.defaultProps.unselectedTintColor")
      @js.native
      def unselectedTintColor: String = js.native
      @scala.inline
      def unselectedTintColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unselectedTintColor")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TabBar
    extends Component[TabBarProps, js.Any, js.Any]
}
