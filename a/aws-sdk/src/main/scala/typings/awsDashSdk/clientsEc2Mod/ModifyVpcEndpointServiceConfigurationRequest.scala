package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVpcEndpointServiceConfigurationRequest extends js.Object {
  /**
    * Indicate whether requests to create an endpoint to your service must be accepted.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your service configuration.
    */
  var AddNetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from your service configuration.
    */
  var RemoveNetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The ID of the service.
    */
  var ServiceId: String
}

object ModifyVpcEndpointServiceConfigurationRequest {
  @scala.inline
  def apply(
    ServiceId: String,
    AcceptanceRequired: js.UndefOr[scala.Boolean] = js.undefined,
    AddNetworkLoadBalancerArns: ValueStringList = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    RemoveNetworkLoadBalancerArns: ValueStringList = null
  ): ModifyVpcEndpointServiceConfigurationRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId)
    if (!js.isUndefined(AcceptanceRequired)) __obj.updateDynamic("AcceptanceRequired")(AcceptanceRequired)
    if (AddNetworkLoadBalancerArns != null) __obj.updateDynamic("AddNetworkLoadBalancerArns")(AddNetworkLoadBalancerArns)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (RemoveNetworkLoadBalancerArns != null) __obj.updateDynamic("RemoveNetworkLoadBalancerArns")(RemoveNetworkLoadBalancerArns)
    __obj.asInstanceOf[ModifyVpcEndpointServiceConfigurationRequest]
  }
}

