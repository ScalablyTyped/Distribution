package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransitGatewayPeeringAttachmentResult extends js.Object {
  /**
    * The transit gateway peering attachment.
    */
  var TransitGatewayPeeringAttachment: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TransitGatewayPeeringAttachment] = js.native
}

object CreateTransitGatewayPeeringAttachmentResult {
  @scala.inline
  def apply(TransitGatewayPeeringAttachment: TransitGatewayPeeringAttachment = null): CreateTransitGatewayPeeringAttachmentResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayPeeringAttachment != null) __obj.updateDynamic("TransitGatewayPeeringAttachment")(TransitGatewayPeeringAttachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayPeeringAttachmentResult]
  }
}

