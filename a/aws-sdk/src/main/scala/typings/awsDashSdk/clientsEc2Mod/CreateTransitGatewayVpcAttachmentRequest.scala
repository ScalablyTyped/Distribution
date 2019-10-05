package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTransitGatewayVpcAttachmentRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The VPC attachment options.
    */
  var Options: js.UndefOr[CreateTransitGatewayVpcAttachmentRequestOptions] = js.undefined
  /**
    * The IDs of one or more subnets. You can specify only one subnet per Availability Zone. You must specify at least one subnet, but we recommend that you specify two subnets for better availability. The transit gateway uses one IP address from each specified subnet.
    */
  var SubnetIds: ValueStringList
  /**
    * The tags to apply to the VPC attachment.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: String
  /**
    * The ID of the VPC.
    */
  var VpcId: String
}

object CreateTransitGatewayVpcAttachmentRequest {
  @scala.inline
  def apply(
    SubnetIds: ValueStringList,
    TransitGatewayId: String,
    VpcId: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Options: CreateTransitGatewayVpcAttachmentRequestOptions = null,
    TagSpecifications: TagSpecificationList = null
  ): CreateTransitGatewayVpcAttachmentRequest = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds, TransitGatewayId = TransitGatewayId, VpcId = VpcId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications)
    __obj.asInstanceOf[CreateTransitGatewayVpcAttachmentRequest]
  }
}

