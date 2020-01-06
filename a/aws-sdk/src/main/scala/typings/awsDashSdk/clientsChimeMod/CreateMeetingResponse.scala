package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMeetingResponse extends js.Object {
  /**
    * The meeting information, including the meeting ID and MediaPlacement.
    */
  var Meeting: js.UndefOr[typings.awsDashSdk.clientsChimeMod.Meeting] = js.native
}

object CreateMeetingResponse {
  @scala.inline
  def apply(Meeting: Meeting = null): CreateMeetingResponse = {
    val __obj = js.Dynamic.literal()
    if (Meeting != null) __obj.updateDynamic("Meeting")(Meeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeetingResponse]
  }
}

