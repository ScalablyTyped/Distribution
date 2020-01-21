package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForgetSmartHomeAppliancesRequest extends js.Object {
  /**
    * The room that the appliances are associated with.
    */
  var RoomArn: Arn = js.native
}

object ForgetSmartHomeAppliancesRequest {
  @scala.inline
  def apply(RoomArn: Arn): ForgetSmartHomeAppliancesRequest = {
    val __obj = js.Dynamic.literal(RoomArn = RoomArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ForgetSmartHomeAppliancesRequest]
  }
}

