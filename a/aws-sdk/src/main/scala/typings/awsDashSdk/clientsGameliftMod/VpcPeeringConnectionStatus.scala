package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcPeeringConnectionStatus extends js.Object {
  /**
    * Code indicating the status of a VPC peering connection.
    */
  var Code: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Additional messaging associated with the connection status. 
    */
  var Message: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object VpcPeeringConnectionStatus {
  @scala.inline
  def apply(Code: NonZeroAndMaxString = null, Message: NonZeroAndMaxString = null): VpcPeeringConnectionStatus = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[VpcPeeringConnectionStatus]
  }
}

