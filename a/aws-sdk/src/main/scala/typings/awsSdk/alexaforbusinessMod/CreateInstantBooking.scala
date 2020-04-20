package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstantBooking extends js.Object {
  /**
    * Duration between 15 and 240 minutes at increments of 15 that determines how long to book an available room when a meeting is started with Alexa.
    */
  var DurationInMinutes: Minutes = js.native
  /**
    * Whether instant booking is enabled or not.
    */
  var Enabled: Boolean = js.native
}

object CreateInstantBooking {
  @scala.inline
  def apply(DurationInMinutes: Minutes, Enabled: Boolean): CreateInstantBooking = {
    val __obj = js.Dynamic.literal(DurationInMinutes = DurationInMinutes.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstantBooking]
  }
}

