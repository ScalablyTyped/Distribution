package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagAttendeeRequest extends js.Object {
  /**
    * The Amazon Chime SDK attendee ID.
    */
  var AttendeeId: GuidString = js.native
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString = js.native
  /**
    * The tag keys.
    */
  var TagKeys: AttendeeTagKeyList = js.native
}

object UntagAttendeeRequest {
  @scala.inline
  def apply(AttendeeId: GuidString, MeetingId: GuidString, TagKeys: AttendeeTagKeyList): UntagAttendeeRequest = {
    val __obj = js.Dynamic.literal(AttendeeId = AttendeeId.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagAttendeeRequest]
  }
  @scala.inline
  implicit class UntagAttendeeRequestOps[Self <: UntagAttendeeRequest] (val x: Self) extends AnyVal {
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
    def setAttendeeId(value: GuidString): Self = this.set("AttendeeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeetingId(value: GuidString): Self = this.set("MeetingId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = this.set("TagKeys", js.Array(value :_*))
    @scala.inline
    def setTagKeys(value: AttendeeTagKeyList): Self = this.set("TagKeys", value.asInstanceOf[js.Any])
  }
  
}

