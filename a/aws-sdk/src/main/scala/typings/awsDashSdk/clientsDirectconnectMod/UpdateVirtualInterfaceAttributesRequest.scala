package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVirtualInterfaceAttributesRequest extends js.Object {
  /**
    * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
    */
  var mtu: js.UndefOr[MTU] = js.undefined
  /**
    * The ID of the virtual private interface.
    */
  var virtualInterfaceId: VirtualInterfaceId
}

object UpdateVirtualInterfaceAttributesRequest {
  @scala.inline
  def apply(virtualInterfaceId: VirtualInterfaceId, mtu: js.UndefOr[MTU] = js.undefined): UpdateVirtualInterfaceAttributesRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId)
    if (!js.isUndefined(mtu)) __obj.updateDynamic("mtu")(mtu)
    __obj.asInstanceOf[UpdateVirtualInterfaceAttributesRequest]
  }
}

