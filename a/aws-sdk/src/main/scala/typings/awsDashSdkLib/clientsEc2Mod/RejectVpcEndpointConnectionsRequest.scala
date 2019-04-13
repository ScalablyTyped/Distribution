package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectVpcEndpointConnectionsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the service.
    */
  var ServiceId: String
  /**
    * The IDs of one or more VPC endpoints.
    */
  var VpcEndpointIds: ValueStringList
}

object RejectVpcEndpointConnectionsRequest {
  @scala.inline
  def apply(ServiceId: String, VpcEndpointIds: ValueStringList, DryRun: js.UndefOr[Boolean] = js.undefined): RejectVpcEndpointConnectionsRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId, VpcEndpointIds = VpcEndpointIds)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[RejectVpcEndpointConnectionsRequest]
  }
}

