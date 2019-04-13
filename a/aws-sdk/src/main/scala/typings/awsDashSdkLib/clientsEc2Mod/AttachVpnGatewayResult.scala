package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachVpnGatewayResult extends js.Object {
  /**
    * Information about the attachment.
    */
  var VpcAttachment: js.UndefOr[VpcAttachment] = js.undefined
}

object AttachVpnGatewayResult {
  @scala.inline
  def apply(VpcAttachment: VpcAttachment = null): AttachVpnGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (VpcAttachment != null) __obj.updateDynamic("VpcAttachment")(VpcAttachment)
    __obj.asInstanceOf[AttachVpnGatewayResult]
  }
}

