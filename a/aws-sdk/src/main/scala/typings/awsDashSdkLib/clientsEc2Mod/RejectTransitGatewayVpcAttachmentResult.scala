package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectTransitGatewayVpcAttachmentResult extends js.Object {
  /**
    * Information about the attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[TransitGatewayVpcAttachment] = js.undefined
}

object RejectTransitGatewayVpcAttachmentResult {
  @scala.inline
  def apply(TransitGatewayVpcAttachment: TransitGatewayVpcAttachment = null): RejectTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayVpcAttachment != null) __obj.updateDynamic("TransitGatewayVpcAttachment")(TransitGatewayVpcAttachment)
    __obj.asInstanceOf[RejectTransitGatewayVpcAttachmentResult]
  }
}

