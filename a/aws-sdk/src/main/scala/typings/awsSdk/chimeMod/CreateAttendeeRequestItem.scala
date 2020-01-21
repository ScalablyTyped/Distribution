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
}

object CreateAttendeeRequestItem {
  @scala.inline
  def apply(ExternalUserId: ExternalUserIdType): CreateAttendeeRequestItem = {
    val __obj = js.Dynamic.literal(ExternalUserId = ExternalUserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAttendeeRequestItem]
  }
}

