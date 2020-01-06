package typings.awsDashSdk.clientsChimeMod

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
  def apply(Attendees: AttendeeList = null, NextToken: String = null): ListAttendeesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attendees != null) __obj.updateDynamic("Attendees")(Attendees.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttendeesResponse]
  }
}

