package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMeetingRequest extends js.Object {
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString = js.native
}

object GetMeetingRequest {
  @scala.inline
  def apply(MeetingId: GuidString): GetMeetingRequest = {
    val __obj = js.Dynamic.literal(MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMeetingRequest]
  }
  @scala.inline
  implicit class GetMeetingRequestOps[Self <: GetMeetingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMeetingId(value: GuidString): Self = this.set("MeetingId", value.asInstanceOf[js.Any])
  }
  
}

