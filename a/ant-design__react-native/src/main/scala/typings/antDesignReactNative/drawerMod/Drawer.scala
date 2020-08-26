package typings.antDesignReactNative.drawerMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drawer
  extends Component[DrawerNativeProps, js.Any, js.Any] {
  var drawer: typings.bang88ReactNativeDrawerLayout.mod.default | Null = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MDrawer(nextProps: DrawerNativeProps): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDrawer(): Unit = js.native
  def onOpenChange(isOpen: Boolean): Unit = js.native
}

