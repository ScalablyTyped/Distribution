package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVirtualInterfacesRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.undefined
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
}

object DescribeVirtualInterfacesRequest {
  @scala.inline
  def apply(connectionId: ConnectionId = null, virtualInterfaceId: VirtualInterfaceId = null): DescribeVirtualInterfacesRequest = {
    val __obj = js.Dynamic.literal()
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId)
    if (virtualInterfaceId != null) __obj.updateDynamic("virtualInterfaceId")(virtualInterfaceId)
    __obj.asInstanceOf[DescribeVirtualInterfacesRequest]
  }
}

