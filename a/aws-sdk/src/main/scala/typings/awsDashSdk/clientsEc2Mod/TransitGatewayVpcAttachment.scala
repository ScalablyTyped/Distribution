package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitGatewayVpcAttachment extends js.Object {
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The VPC attachment options.
    */
  var Options: js.UndefOr[TransitGatewayVpcAttachmentOptions] = js.undefined
  /**
    * The state of the VPC attachment.
    */
  var State: js.UndefOr[TransitGatewayAttachmentState] = js.undefined
  /**
    * The IDs of the subnets.
    */
  var SubnetIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The tags for the VPC attachment.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the AWS account that owns the VPC.
    */
  var VpcOwnerId: js.UndefOr[String] = js.undefined
}

object TransitGatewayVpcAttachment {
  @scala.inline
  def apply(
    CreationTime: DateTime = null,
    Options: TransitGatewayVpcAttachmentOptions = null,
    State: TransitGatewayAttachmentState = null,
    SubnetIds: ValueStringList = null,
    Tags: TagList = null,
    TransitGatewayAttachmentId: String = null,
    TransitGatewayId: String = null,
    VpcId: String = null,
    VpcOwnerId: String = null
  ): TransitGatewayVpcAttachment = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TransitGatewayAttachmentId != null) __obj.updateDynamic("TransitGatewayAttachmentId")(TransitGatewayAttachmentId)
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    if (VpcOwnerId != null) __obj.updateDynamic("VpcOwnerId")(VpcOwnerId)
    __obj.asInstanceOf[TransitGatewayVpcAttachment]
  }
}

