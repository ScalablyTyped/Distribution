package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitGatewayRouteTablePropagation extends js.Object {
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  /**
    * The type of resource.
    */
  var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType] = js.undefined
  /**
    * The state of the resource.
    */
  var State: js.UndefOr[TransitGatewayPropagationState] = js.undefined
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.undefined
}

object TransitGatewayRouteTablePropagation {
  @scala.inline
  def apply(
    ResourceId: String = null,
    ResourceType: TransitGatewayAttachmentResourceType = null,
    State: TransitGatewayPropagationState = null,
    TransitGatewayAttachmentId: String = null
  ): TransitGatewayRouteTablePropagation = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TransitGatewayAttachmentId != null) __obj.updateDynamic("TransitGatewayAttachmentId")(TransitGatewayAttachmentId)
    __obj.asInstanceOf[TransitGatewayRouteTablePropagation]
  }
}

