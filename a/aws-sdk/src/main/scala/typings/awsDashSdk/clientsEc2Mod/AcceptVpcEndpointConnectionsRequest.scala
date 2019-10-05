package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptVpcEndpointConnectionsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: String
  /**
    * The IDs of one or more interface VPC endpoints.
    */
  var VpcEndpointIds: ValueStringList
}

object AcceptVpcEndpointConnectionsRequest {
  @scala.inline
  def apply(
    ServiceId: String,
    VpcEndpointIds: ValueStringList,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): AcceptVpcEndpointConnectionsRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId, VpcEndpointIds = VpcEndpointIds)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[AcceptVpcEndpointConnectionsRequest]
  }
}

