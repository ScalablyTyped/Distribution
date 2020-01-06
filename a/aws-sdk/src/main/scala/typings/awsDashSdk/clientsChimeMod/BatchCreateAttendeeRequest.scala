package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateAttendeeRequest extends js.Object {
  /**
    * The request containing the attendees to create.
    */
  var Attendees: CreateAttendeeRequestItemList = js.native
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString = js.native
}

object BatchCreateAttendeeRequest {
  @scala.inline
  def apply(Attendees: CreateAttendeeRequestItemList, MeetingId: GuidString): BatchCreateAttendeeRequest = {
    val __obj = js.Dynamic.literal(Attendees = Attendees.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchCreateAttendeeRequest]
  }
}

