package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRouterSpec extends js.Object {
  /**
    * The listeners that the virtual router is expected to receive inbound traffic from.
    Currently only one listener is supported per virtual router.
    */
  var listeners: js.UndefOr[VirtualRouterListeners] = js.undefined
}

object VirtualRouterSpec {
  @scala.inline
  def apply(listeners: VirtualRouterListeners = null): VirtualRouterSpec = {
    val __obj = js.Dynamic.literal()
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    __obj.asInstanceOf[VirtualRouterSpec]
  }
}

