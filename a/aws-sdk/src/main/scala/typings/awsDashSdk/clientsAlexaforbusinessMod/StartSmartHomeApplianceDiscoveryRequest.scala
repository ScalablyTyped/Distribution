package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSmartHomeApplianceDiscoveryRequest extends js.Object {
  /**
    * The room where smart home appliance discovery was initiated.
    */
  var RoomArn: Arn
}

object StartSmartHomeApplianceDiscoveryRequest {
  @scala.inline
  def apply(RoomArn: Arn): StartSmartHomeApplianceDiscoveryRequest = {
    val __obj = js.Dynamic.literal(RoomArn = RoomArn)
  
    __obj.asInstanceOf[StartSmartHomeApplianceDiscoveryRequest]
  }
}

