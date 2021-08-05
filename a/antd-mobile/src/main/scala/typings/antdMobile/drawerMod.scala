package typings.antdMobile

import typings.antdMobile.anon.EnableDragHandle
import typings.antdMobile.drawerPropsTypeMod.DrawerWebProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerMod {
  
  @JSImport("antd-mobile/lib/drawer", JSImport.Default)
  @js.native
  class default () extends Drawer
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/drawer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/drawer", "default.defaultProps")
    @js.native
    def defaultProps: EnableDragHandle = js.native
    inline def defaultProps_=(x: EnableDragHandle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Drawer
    extends Component[DrawerWebProps, js.Any, js.Any]
}
