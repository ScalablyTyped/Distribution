package typings.antdMobile.mod

import typings.antdMobile.tabBarMod.AntTabbarProps
import typings.antdMobile.tabBarMod.default
import typings.antdMobile.tabBarPropsTypeMod.TabBarItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "TabBar")
@js.native
class TabBar () extends default
object TabBar {
  
  @JSImport("antd-mobile", "TabBar")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd-mobile", "TabBar.Item")
  @js.native
  class Item ()
    extends typings.antdMobile.tabBarMod.Item
  /* static member */
  /* was `typeof Item` */
  object Item {
    
    @JSImport("antd-mobile", "TabBar.Item")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile", "TabBar.Item.defaultProps")
    @js.native
    def defaultProps: TabBarItemProps = js.native
    inline def defaultProps_=(x: TabBarItemProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("antd-mobile", "TabBar.defaultProps")
  @js.native
  def defaultProps: AntTabbarProps = js.native
  inline def defaultProps_=(x: AntTabbarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
