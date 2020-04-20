package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSmartHomeApplianceDiscoveryRequest extends js.Object {
  /**
    * The room where smart home appliance discovery was initiated.
    */
  var RoomArn: Arn = js.native
}

object StartSmartHomeApplianceDiscoveryRequest {
  @scala.inline
  def apply(RoomArn: Arn): StartSmartHomeApplianceDiscoveryRequest = {
    val __obj = js.Dynamic.literal(RoomArn = RoomArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSmartHomeApplianceDiscoveryRequest]
  }
}

