package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayVpcAttachment extends js.Object {
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  /**
    * The VPC attachment options.
    */
  var Options: js.UndefOr[TransitGatewayVpcAttachmentOptions] = js.native
  /**
    * The state of the VPC attachment.
    */
  var State: js.UndefOr[TransitGatewayAttachmentState] = js.native
  /**
    * The IDs of the subnets.
    */
  var SubnetIds: js.UndefOr[ValueStringList] = js.native
  /**
    * The tags for the VPC attachment.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.native
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the VPC.
    */
  var VpcOwnerId: js.UndefOr[String] = js.native
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
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TransitGatewayAttachmentId != null) __obj.updateDynamic("TransitGatewayAttachmentId")(TransitGatewayAttachmentId.asInstanceOf[js.Any])
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    if (VpcOwnerId != null) __obj.updateDynamic("VpcOwnerId")(VpcOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayVpcAttachment]
  }
}

