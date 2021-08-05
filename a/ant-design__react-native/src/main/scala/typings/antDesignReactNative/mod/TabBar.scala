package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.`0`
import typings.antDesignReactNative.tabBarMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "TabBar")
@js.native
class TabBar () extends default
object TabBar {
  
  /* was `typeof TabBarItem` */
  @JSImport("@ant-design/react-native", "TabBar.Item")
  @js.native
  class Item ()
    extends typings.antDesignReactNative.tabBarMod.default.Item
  /* static members */
  object Item {
    
    @JSImport("@ant-design/react-native", "TabBar.Item")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native", "TabBar.Item.defaultProps")
    @js.native
    def defaultProps: `0` = js.native
    inline def defaultProps_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object defaultProps {
    
    @JSImport("@ant-design/react-native", "TabBar.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native", "TabBar.defaultProps.barTintColor")
    @js.native
    def barTintColor: String = js.native
    inline def barTintColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("barTintColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native", "TabBar.defaultProps.tintColor")
    @js.native
    def tintColor: String = js.native
    inline def tintColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native", "TabBar.defaultProps.unselectedTintColor")
    @js.native
    def unselectedTintColor: String = js.native
    inline def unselectedTintColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unselectedTintColor")(x.asInstanceOf[js.Any])
  }
}
