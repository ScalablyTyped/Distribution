package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVirtualInterfacesRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.native
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.native
}

object DescribeVirtualInterfacesRequest {
  @scala.inline
  def apply(connectionId: ConnectionId = null, virtualInterfaceId: VirtualInterfaceId = null): DescribeVirtualInterfacesRequest = {
    val __obj = js.Dynamic.literal()
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (virtualInterfaceId != null) __obj.updateDynamic("virtualInterfaceId")(virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVirtualInterfacesRequest]
  }
}

