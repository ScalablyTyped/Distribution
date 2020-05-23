package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstantBooking extends js.Object {
  /**
    * Duration between 15 and 240 minutes at increments of 15 that determines how long to book an available room when a meeting is started with Alexa. 
    */
  var DurationInMinutes: js.UndefOr[Minutes] = js.native
  /**
    * Whether instant booking is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object InstantBooking {
  @scala.inline
  def apply(DurationInMinutes: js.UndefOr[Minutes] = js.undefined, Enabled: js.UndefOr[Boolean] = js.undefined): InstantBooking = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DurationInMinutes)) __obj.updateDynamic("DurationInMinutes")(DurationInMinutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantBooking]
  }
}

