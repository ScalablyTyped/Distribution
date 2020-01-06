package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRouterSpec extends js.Object {
  /**
    * The listeners that the virtual router is expected to receive inbound traffic from.
    You can specify one listener.
    */
  var listeners: js.UndefOr[VirtualRouterListeners] = js.native
}

object VirtualRouterSpec {
  @scala.inline
  def apply(listeners: VirtualRouterListeners = null): VirtualRouterSpec = {
    val __obj = js.Dynamic.literal()
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterSpec]
  }
}

