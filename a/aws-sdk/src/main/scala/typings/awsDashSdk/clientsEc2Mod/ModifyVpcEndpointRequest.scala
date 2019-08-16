package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVpcEndpointRequest extends js.Object {
  /**
    * (Gateway endpoint) One or more route tables IDs to associate with the endpoint.
    */
  var AddRouteTableIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * (Interface endpoint) One or more security group IDs to associate with the network interface.
    */
  var AddSecurityGroupIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * (Interface endpoint) One or more subnet IDs in which to serve the endpoint.
    */
  var AddSubnetIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * A policy to attach to the endpoint that controls access to the service. The policy must be in valid JSON format.
    */
  var PolicyDocument: js.UndefOr[String] = js.undefined
  /**
    * (Interface endpoint) Indicate whether a private hosted zone is associated with the VPC.
    */
  var PrivateDnsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Gateway endpoint) One or more route table IDs to disassociate from the endpoint.
    */
  var RemoveRouteTableIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * (Interface endpoint) One or more security group IDs to disassociate from the network interface.
    */
  var RemoveSecurityGroupIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * (Interface endpoint) One or more subnets IDs in which to remove the endpoint.
    */
  var RemoveSubnetIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * (Gateway endpoint) Specify true to reset the policy document to the default policy. The default policy allows full access to the service.
    */
  var ResetPolicy: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the endpoint.
    */
  var VpcEndpointId: String
}

object ModifyVpcEndpointRequest {
  @scala.inline
  def apply(
    VpcEndpointId: String,
    AddRouteTableIds: ValueStringList = null,
    AddSecurityGroupIds: ValueStringList = null,
    AddSubnetIds: ValueStringList = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    PolicyDocument: String = null,
    PrivateDnsEnabled: js.UndefOr[Boolean] = js.undefined,
    RemoveRouteTableIds: ValueStringList = null,
    RemoveSecurityGroupIds: ValueStringList = null,
    RemoveSubnetIds: ValueStringList = null,
    ResetPolicy: js.UndefOr[Boolean] = js.undefined
  ): ModifyVpcEndpointRequest = {
    val __obj = js.Dynamic.literal(VpcEndpointId = VpcEndpointId)
    if (AddRouteTableIds != null) __obj.updateDynamic("AddRouteTableIds")(AddRouteTableIds)
    if (AddSecurityGroupIds != null) __obj.updateDynamic("AddSecurityGroupIds")(AddSecurityGroupIds)
    if (AddSubnetIds != null) __obj.updateDynamic("AddSubnetIds")(AddSubnetIds)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (PolicyDocument != null) __obj.updateDynamic("PolicyDocument")(PolicyDocument)
    if (!js.isUndefined(PrivateDnsEnabled)) __obj.updateDynamic("PrivateDnsEnabled")(PrivateDnsEnabled)
    if (RemoveRouteTableIds != null) __obj.updateDynamic("RemoveRouteTableIds")(RemoveRouteTableIds)
    if (RemoveSecurityGroupIds != null) __obj.updateDynamic("RemoveSecurityGroupIds")(RemoveSecurityGroupIds)
    if (RemoveSubnetIds != null) __obj.updateDynamic("RemoveSubnetIds")(RemoveSubnetIds)
    if (!js.isUndefined(ResetPolicy)) __obj.updateDynamic("ResetPolicy")(ResetPolicy)
    __obj.asInstanceOf[ModifyVpcEndpointRequest]
  }
}

