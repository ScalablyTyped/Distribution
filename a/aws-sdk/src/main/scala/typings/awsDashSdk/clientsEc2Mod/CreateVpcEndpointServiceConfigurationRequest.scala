package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpcEndpointServiceConfigurationRequest extends js.Object {
  /**
    * Indicate whether requests from service consumers to create an endpoint to your service must be accepted. To accept a request, use AcceptVpcEndpointConnections.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Resource Names (ARNs) of one or more Network Load Balancers for your service.
    */
  var NetworkLoadBalancerArns: ValueStringList
}

object CreateVpcEndpointServiceConfigurationRequest {
  @scala.inline
  def apply(
    NetworkLoadBalancerArns: ValueStringList,
    AcceptanceRequired: js.UndefOr[scala.Boolean] = js.undefined,
    ClientToken: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateVpcEndpointServiceConfigurationRequest = {
    val __obj = js.Dynamic.literal(NetworkLoadBalancerArns = NetworkLoadBalancerArns)
    if (!js.isUndefined(AcceptanceRequired)) __obj.updateDynamic("AcceptanceRequired")(AcceptanceRequired)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[CreateVpcEndpointServiceConfigurationRequest]
  }
}

