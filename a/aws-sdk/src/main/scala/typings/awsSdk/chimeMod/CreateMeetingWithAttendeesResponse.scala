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
  def apply(): CreateMeetingWithAttendeesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMeetingWithAttendeesResponse]
  }
  @scala.inline
  implicit class CreateMeetingWithAttendeesResponseOps[Self <: CreateMeetingWithAttendeesResponse] (val x: Self) extends AnyVal {
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
    def setAttendeesVarargs(value: Attendee*): Self = this.set("Attendees", js.Array(value :_*))
    @scala.inline
    def setAttendees(value: AttendeeList): Self = this.set("Attendees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttendees: Self = this.set("Attendees", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: CreateAttendeeError*): Self = this.set("Errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: BatchCreateAttendeeErrorList): Self = this.set("Errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
    @scala.inline
    def setMeeting(value: Meeting): Self = this.set("Meeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeeting: Self = this.set("Meeting", js.undefined)
  }
  
}

