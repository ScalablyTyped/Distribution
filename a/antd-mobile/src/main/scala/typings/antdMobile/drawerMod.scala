package typings.antdMobile

import typings.antdMobile.anon.EnableDragHandle
import typings.antdMobile.drawerPropsTypeMod.DrawerWebProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile/lib/drawer", JSImport.Namespace)
@js.native
object drawerMod extends js.Object {
  
  @js.native
  trait Drawer
    extends Component[DrawerWebProps, js.Any, js.Any]
  
  @js.native
  class default () extends Drawer
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: EnableDragHandle = js.native
  }
}
