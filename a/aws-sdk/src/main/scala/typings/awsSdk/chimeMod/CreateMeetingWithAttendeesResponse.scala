package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMeetingWithAttendeesResponse extends js.Object {
  /**
    * The attendee information, including attendees IDs and join tokens.
    */
  var Attendees: js.UndefOr[AttendeeList] = js.native
  /**
    * If the action fails for one or more of the attendees in the request, a list of the attendees is returned, along with error codes and error messages.
    */
  var Errors: js.UndefOr[BatchCreateAttendeeErrorList] = js.native
  var Meeting: js.UndefOr[typings.awsSdk.chimeMod.Meeting] = js.native
}

object CreateMeetingWithAttendeesResponse {
  @scala.inline
  def apply(
    Attendees: AttendeeList = null,
    Errors: BatchCreateAttendeeErrorList = null,
    Meeting: Meeting = null
  ): CreateMeetingWithAttendeesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attendees != null) __obj.updateDynamic("Attendees")(Attendees.asInstanceOf[js.Any])
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    if (Meeting != null) __obj.updateDynamic("Meeting")(Meeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeetingWithAttendeesResponse]
  }
}

