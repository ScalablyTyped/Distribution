package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVpcEndpointServiceConfigurationsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The IDs of one or more services.
    */
  var ServiceIds: ValueStringList
}

object DeleteVpcEndpointServiceConfigurationsRequest {
  @scala.inline
  def apply(ServiceIds: ValueStringList, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DeleteVpcEndpointServiceConfigurationsRequest = {
    val __obj = js.Dynamic.literal(ServiceIds = ServiceIds)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteVpcEndpointServiceConfigurationsRequest]
  }
}

