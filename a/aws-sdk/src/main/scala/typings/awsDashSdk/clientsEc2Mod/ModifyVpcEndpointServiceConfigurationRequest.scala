package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcEndpointServiceConfigurationRequest extends js.Object {
  /**
    * Indicate whether requests to create an endpoint to your service must be accepted.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your service configuration.
    */
  var AddNetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from your service configuration.
    */
  var RemoveNetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  /**
    * The ID of the service.
    */
  var ServiceId: typings.awsDashSdk.clientsEc2Mod.ServiceId = js.native
}

object ModifyVpcEndpointServiceConfigurationRequest {
  @scala.inline
  def apply(
    ServiceId: ServiceId,
    AcceptanceRequired: js.UndefOr[scala.Boolean] = js.undefined,
    AddNetworkLoadBalancerArns: ValueStringList = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    RemoveNetworkLoadBalancerArns: ValueStringList = null
  ): ModifyVpcEndpointServiceConfigurationRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    if (!js.isUndefined(AcceptanceRequired)) __obj.updateDynamic("AcceptanceRequired")(AcceptanceRequired.asInstanceOf[js.Any])
    if (AddNetworkLoadBalancerArns != null) __obj.updateDynamic("AddNetworkLoadBalancerArns")(AddNetworkLoadBalancerArns.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (RemoveNetworkLoadBalancerArns != null) __obj.updateDynamic("RemoveNetworkLoadBalancerArns")(RemoveNetworkLoadBalancerArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointServiceConfigurationRequest]
  }
}

