package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAttendeeRequest extends js.Object {
  /**
    * The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
    */
  var ExternalUserId: ExternalUserIdType = js.native
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString = js.native
  /**
    * The tag key-value pairs.
    */
  var Tags: js.UndefOr[AttendeeTagList] = js.native
}

object CreateAttendeeRequest {
  @scala.inline
  def apply(ExternalUserId: ExternalUserIdType, MeetingId: GuidString): CreateAttendeeRequest = {
    val __obj = js.Dynamic.literal(ExternalUserId = ExternalUserId.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAttendeeRequest]
  }
  @scala.inline
  implicit class CreateAttendeeRequestOps[Self <: CreateAttendeeRequest] (val x: Self) extends AnyVal {
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
    def setExternalUserId(value: ExternalUserIdType): Self = this.set("ExternalUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeetingId(value: GuidString): Self = this.set("MeetingId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: AttendeeTagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

