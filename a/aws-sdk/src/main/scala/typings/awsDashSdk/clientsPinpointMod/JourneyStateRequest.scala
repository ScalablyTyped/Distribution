package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JourneyStateRequest extends js.Object {
  /**
    * The status of the journey. Currently, the only supported value is CANCELLED. If you cancel a journey, Amazon Pinpoint continues to perform activities that are currently in progress, until those activities are complete. Amazon Pinpoint also continues to collect and aggregate analytics data for those activities, until they are complete, and any activities that were complete when you cancelled the journey. After you cancel a journey, you can't add, change, or remove any activities from the journey. In addition, Amazon Pinpoint stops evaluating the journey and doesn't perform any activities that haven't started.
    */
  var State: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.State] = js.native
}

object JourneyStateRequest {
  @scala.inline
  def apply(State: State = null): JourneyStateRequest = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyStateRequest]
  }
}

