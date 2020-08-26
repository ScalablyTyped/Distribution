package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAttendeesResponse extends js.Object {
  /**
    * The Amazon Chime SDK attendee information.
    */
  var Attendees: js.UndefOr[AttendeeList] = js.native
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListAttendeesResponse {
  @scala.inline
  def apply(): ListAttendeesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttendeesResponse]
  }
  @scala.inline
  implicit class ListAttendeesResponseOps[Self <: ListAttendeesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

