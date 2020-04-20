package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagMeetingRequest extends js.Object {
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString = js.native
  /**
    * The tag key-value pairs.
    */
  var Tags: MeetingTagList = js.native
}

object TagMeetingRequest {
  @scala.inline
  def apply(MeetingId: GuidString, Tags: MeetingTagList): TagMeetingRequest = {
    val __obj = js.Dynamic.literal(MeetingId = MeetingId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagMeetingRequest]
  }
}

