package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMeetingResponse extends js.Object {
  /**
    * The Amazon Chime SDK meeting information.
    */
  var Meeting: js.UndefOr[typings.awsDashSdk.clientsChimeMod.Meeting] = js.native
}

object GetMeetingResponse {
  @scala.inline
  def apply(Meeting: Meeting = null): GetMeetingResponse = {
    val __obj = js.Dynamic.literal()
    if (Meeting != null) __obj.updateDynamic("Meeting")(Meeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMeetingResponse]
  }
}

