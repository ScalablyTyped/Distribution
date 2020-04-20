package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagMeetingRequest extends js.Object {
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString = js.native
  /**
    * The tag keys.
    */
  var TagKeys: MeetingTagKeyList = js.native
}

object UntagMeetingRequest {
  @scala.inline
  def apply(MeetingId: GuidString, TagKeys: MeetingTagKeyList): UntagMeetingRequest = {
    val __obj = js.Dynamic.literal(MeetingId = MeetingId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagMeetingRequest]
  }
}

