package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTransitGatewayVpcAttachmentResult extends js.Object {
  /**
    * Information about the VPC attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[TransitGatewayVpcAttachment] = js.undefined
}

object CreateTransitGatewayVpcAttachmentResult {
  @scala.inline
  def apply(TransitGatewayVpcAttachment: TransitGatewayVpcAttachment = null): CreateTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayVpcAttachment != null) __obj.updateDynamic("TransitGatewayVpcAttachment")(TransitGatewayVpcAttachment)
    __obj.asInstanceOf[CreateTransitGatewayVpcAttachmentResult]
  }
}

