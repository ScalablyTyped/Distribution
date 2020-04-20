package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAttendeeRequestItem extends js.Object {
  /**
    * The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
    */
  var ExternalUserId: ExternalUserIdType = js.native
  /**
    * The tag key-value pairs.
    */
  var Tags: js.UndefOr[AttendeeTagList] = js.native
}

object CreateAttendeeRequestItem {
  @scala.inline
  def apply(ExternalUserId: ExternalUserIdType, Tags: AttendeeTagList = null): CreateAttendeeRequestItem = {
    val __obj = js.Dynamic.literal(ExternalUserId = ExternalUserId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAttendeeRequestItem]
  }
}

