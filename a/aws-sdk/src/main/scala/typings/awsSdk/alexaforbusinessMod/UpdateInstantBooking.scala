package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInstantBooking extends js.Object {
  /**
    * Duration between 15 and 240 minutes at increments of 15 that determines how long to book an available room when a meeting is started with Alexa.
    */
  var DurationInMinutes: js.UndefOr[Minutes] = js.native
  /**
    * Whether instant booking is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object UpdateInstantBooking {
  @scala.inline
  def apply(DurationInMinutes: Int | Double = null, Enabled: js.UndefOr[scala.Boolean] = js.undefined): UpdateInstantBooking = {
    val __obj = js.Dynamic.literal()
    if (DurationInMinutes != null) __obj.updateDynamic("DurationInMinutes")(DurationInMinutes.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstantBooking]
  }
}

