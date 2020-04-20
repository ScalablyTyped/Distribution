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
}

