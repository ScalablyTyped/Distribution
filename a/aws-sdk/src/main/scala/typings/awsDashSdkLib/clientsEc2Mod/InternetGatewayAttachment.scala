package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternetGatewayAttachment extends js.Object {
  /**
    * The current state of the attachment. For an internet gateway, the state is available when attached to a VPC; otherwise, this value is not returned.
    */
  var State: js.UndefOr[AttachmentStatus] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object InternetGatewayAttachment {
  @scala.inline
  def apply(State: AttachmentStatus = null, VpcId: String = null): InternetGatewayAttachment = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[InternetGatewayAttachment]
  }
}

