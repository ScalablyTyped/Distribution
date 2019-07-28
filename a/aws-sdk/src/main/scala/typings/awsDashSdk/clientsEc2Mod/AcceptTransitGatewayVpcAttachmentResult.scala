package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptTransitGatewayVpcAttachmentResult extends js.Object {
  /**
    * The VPC attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TransitGatewayVpcAttachment] = js.undefined
}

object AcceptTransitGatewayVpcAttachmentResult {
  @scala.inline
  def apply(TransitGatewayVpcAttachment: TransitGatewayVpcAttachment = null): AcceptTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayVpcAttachment != null) __obj.updateDynamic("TransitGatewayVpcAttachment")(TransitGatewayVpcAttachment)
    __obj.asInstanceOf[AcceptTransitGatewayVpcAttachmentResult]
  }
}

