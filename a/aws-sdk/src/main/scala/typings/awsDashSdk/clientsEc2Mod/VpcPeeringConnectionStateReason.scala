package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcPeeringConnectionStateReason extends js.Object {
  /**
    * The status of the VPC peering connection.
    */
  var Code: js.UndefOr[VpcPeeringConnectionStateReasonCode] = js.undefined
  /**
    * A message that provides more information about the status, if applicable.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object VpcPeeringConnectionStateReason {
  @scala.inline
  def apply(Code: VpcPeeringConnectionStateReasonCode = null, Message: String = null): VpcPeeringConnectionStateReason = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[VpcPeeringConnectionStateReason]
  }
}

