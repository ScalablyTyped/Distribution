package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyTransitGatewayVpcAttachmentResult extends js.Object {
  /**
    * Information about the modified attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TransitGatewayVpcAttachment] = js.undefined
}

object ModifyTransitGatewayVpcAttachmentResult {
  @scala.inline
  def apply(TransitGatewayVpcAttachment: TransitGatewayVpcAttachment = null): ModifyTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayVpcAttachment != null) __obj.updateDynamic("TransitGatewayVpcAttachment")(TransitGatewayVpcAttachment)
    __obj.asInstanceOf[ModifyTransitGatewayVpcAttachmentResult]
  }
}

