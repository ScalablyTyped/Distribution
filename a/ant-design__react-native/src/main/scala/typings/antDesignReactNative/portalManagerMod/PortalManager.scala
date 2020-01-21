package typings.antDesignReactNative.portalManagerMod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalManager
  extends Component[js.Object, PortalManagerState, js.Any] {
  @JSName("state")
  var state_PortalManager: State = js.native
  def mount(key: Double, children: ReactNode): Unit = js.native
  def unmount(key: Double): Unit = js.native
  def update(key: Double, children: ReactNode): Unit = js.native
}

