package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcAttachment extends js.Object {
  /**
    * The current state of the attachment.
    */
  var State: js.UndefOr[AttachmentStatus] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object VpcAttachment {
  @scala.inline
  def apply(State: AttachmentStatus = null, VpcId: String = null): VpcAttachment = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[VpcAttachment]
  }
}

