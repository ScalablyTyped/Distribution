package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAttendeeResponse extends js.Object {
  /**
    * The Amazon Chime SDK attendee information.
    */
  var Attendee: js.UndefOr[typings.awsSdk.chimeMod.Attendee] = js.native
}

object GetAttendeeResponse {
  @scala.inline
  def apply(Attendee: Attendee = null): GetAttendeeResponse = {
    val __obj = js.Dynamic.literal()
    if (Attendee != null) __obj.updateDynamic("Attendee")(Attendee.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttendeeResponse]
  }
}

