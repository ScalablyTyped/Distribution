package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayAttachment extends js.Object {
  /**
    * The association.
    */
  var Association: js.UndefOr[TransitGatewayAttachmentAssociation] = js.native
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the resource.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.native
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType] = js.native
  /**
    * The attachment state.
    */
  var State: js.UndefOr[TransitGatewayAttachmentState] = js.native
  /**
    * The tags for the attachment.
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
    * The ID of the AWS account that owns the transit gateway.
    */
  var TransitGatewayOwnerId: js.UndefOr[String] = js.native
}

object TransitGatewayAttachment {
  @scala.inline
  def apply(
    Association: TransitGatewayAttachmentAssociation = null,
    CreationTime: DateTime = null,
    ResourceId: String = null,
    ResourceOwnerId: String = null,
    ResourceType: TransitGatewayAttachmentResourceType = null,
    State: TransitGatewayAttachmentState = null,
    Tags: TagList = null,
    TransitGatewayAttachmentId: String = null,
    TransitGatewayId: String = null,
    TransitGatewayOwnerId: String = null
  ): TransitGatewayAttachment = {
    val __obj = js.Dynamic.literal()
    if (Association != null) __obj.updateDynamic("Association")(Association.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceOwnerId != null) __obj.updateDynamic("ResourceOwnerId")(ResourceOwnerId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TransitGatewayAttachmentId != null) __obj.updateDynamic("TransitGatewayAttachmentId")(TransitGatewayAttachmentId.asInstanceOf[js.Any])
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId.asInstanceOf[js.Any])
    if (TransitGatewayOwnerId != null) __obj.updateDynamic("TransitGatewayOwnerId")(TransitGatewayOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayAttachment]
  }
}

