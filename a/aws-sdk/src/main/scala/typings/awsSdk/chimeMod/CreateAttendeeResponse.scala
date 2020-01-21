package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAttendeeResponse extends js.Object {
  /**
    * The attendee information, including attendee ID and join token.
    */
  var Attendee: js.UndefOr[typings.awsSdk.chimeMod.Attendee] = js.native
}

object CreateAttendeeResponse {
  @scala.inline
  def apply(Attendee: Attendee = null): CreateAttendeeResponse = {
    val __obj = js.Dynamic.literal()
    if (Attendee != null) __obj.updateDynamic("Attendee")(Attendee.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAttendeeResponse]
  }
}

