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
  @scala.inline
  implicit class ForgetSmartHomeAppliancesRequestOps[Self <: ForgetSmartHomeAppliancesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoomArn(value: Arn): Self = this.set("RoomArn", value.asInstanceOf[js.Any])
  }
  
}

