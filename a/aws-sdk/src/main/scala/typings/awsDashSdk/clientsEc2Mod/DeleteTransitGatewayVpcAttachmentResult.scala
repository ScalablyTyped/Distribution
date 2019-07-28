package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTransitGatewayVpcAttachmentResult extends js.Object {
  /**
    * Information about the deleted VPC attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TransitGatewayVpcAttachment] = js.undefined
}

object DeleteTransitGatewayVpcAttachmentResult {
  @scala.inline
  def apply(TransitGatewayVpcAttachment: TransitGatewayVpcAttachment = null): DeleteTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayVpcAttachment != null) __obj.updateDynamic("TransitGatewayVpcAttachment")(TransitGatewayVpcAttachment)
    __obj.asInstanceOf[DeleteTransitGatewayVpcAttachmentResult]
  }
}

