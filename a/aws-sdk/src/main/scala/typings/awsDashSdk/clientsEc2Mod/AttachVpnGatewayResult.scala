package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachVpnGatewayResult extends js.Object {
  /**
    * Information about the attachment.
    */
  var VpcAttachment: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VpcAttachment] = js.native
}

object AttachVpnGatewayResult {
  @scala.inline
  def apply(VpcAttachment: VpcAttachment = null): AttachVpnGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (VpcAttachment != null) __obj.updateDynamic("VpcAttachment")(VpcAttachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachVpnGatewayResult]
  }
}

