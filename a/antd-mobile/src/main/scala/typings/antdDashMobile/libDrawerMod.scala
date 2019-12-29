package typings.antdDashMobile

import typings.antdDashMobile.libDrawerPropsTypeMod.DrawerWebProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/drawer", JSImport.Namespace)
@js.native
object libDrawerMod extends js.Object {
  @js.native
  trait Drawer
    extends Component[DrawerWebProps, js.Any, js.Any]
  
  @js.native
  class default () extends Drawer
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_EnableDragHandle = js.native
  }
  
}

