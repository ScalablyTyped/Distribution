package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMeetingsResponse extends js.Object {
  /**
    * The Amazon Chime SDK meeting information.
    */
  var Meetings: js.UndefOr[MeetingList] = js.native
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListMeetingsResponse {
  @scala.inline
  def apply(Meetings: MeetingList = null, NextToken: String = null): ListMeetingsResponse = {
    val __obj = js.Dynamic.literal()
    if (Meetings != null) __obj.updateDynamic("Meetings")(Meetings.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMeetingsResponse]
  }
}

