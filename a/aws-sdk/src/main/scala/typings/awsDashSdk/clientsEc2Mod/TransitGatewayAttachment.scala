package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitGatewayAttachment extends js.Object {
  /**
    * The association.
    */
  var Association: js.UndefOr[TransitGatewayAttachmentAssociation] = js.undefined
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the AWS account that owns the resource.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.undefined
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType] = js.undefined
  /**
    * The attachment state.
    */
  var State: js.UndefOr[TransitGatewayAttachmentState] = js.undefined
  /**
    * The tags for the attachment.
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
    * The ID of the AWS account that owns the transit gateway.
    */
  var TransitGatewayOwnerId: js.UndefOr[String] = js.undefined
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
    if (Association != null) __obj.updateDynamic("Association")(Association)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourceOwnerId != null) __obj.updateDynamic("ResourceOwnerId")(ResourceOwnerId)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TransitGatewayAttachmentId != null) __obj.updateDynamic("TransitGatewayAttachmentId")(TransitGatewayAttachmentId)
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId)
    if (TransitGatewayOwnerId != null) __obj.updateDynamic("TransitGatewayOwnerId")(TransitGatewayOwnerId)
    __obj.asInstanceOf[TransitGatewayAttachment]
  }
}

