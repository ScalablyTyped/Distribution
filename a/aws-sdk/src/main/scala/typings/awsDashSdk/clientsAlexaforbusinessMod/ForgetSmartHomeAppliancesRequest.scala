package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForgetSmartHomeAppliancesRequest extends js.Object {
  /**
    * The room that the appliances are associated with.
    */
  var RoomArn: Arn
}

object ForgetSmartHomeAppliancesRequest {
  @scala.inline
  def apply(RoomArn: Arn): ForgetSmartHomeAppliancesRequest = {
    val __obj = js.Dynamic.literal(RoomArn = RoomArn)
  
    __obj.asInstanceOf[ForgetSmartHomeAppliancesRequest]
  }
}

