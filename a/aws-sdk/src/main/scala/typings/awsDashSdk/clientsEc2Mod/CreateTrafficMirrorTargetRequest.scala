package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTrafficMirrorTargetRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The description of the Traffic Mirror target.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The network interface ID that is associated with the target.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
    */
  var NetworkLoadBalancerArn: js.UndefOr[String] = js.undefined
  /**
    * The tags to assign to the Traffic Mirror target.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}

object CreateTrafficMirrorTargetRequest {
  @scala.inline
  def apply(
    ClientToken: String = null,
    Description: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    NetworkInterfaceId: String = null,
    NetworkLoadBalancerArn: String = null,
    TagSpecifications: TagSpecificationList = null
  ): CreateTrafficMirrorTargetRequest = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId)
    if (NetworkLoadBalancerArn != null) __obj.updateDynamic("NetworkLoadBalancerArn")(NetworkLoadBalancerArn)
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications)
    __obj.asInstanceOf[CreateTrafficMirrorTargetRequest]
  }
}

