package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJourneyStateRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
  /**
    * The unique identifier for the journey.
    */
  var JourneyId: __string = js.native
  var JourneyStateRequest: typings.awsDashSdk.clientsPinpointMod.JourneyStateRequest = js.native
}

object UpdateJourneyStateRequest {
  @scala.inline
  def apply(ApplicationId: __string, JourneyId: __string, JourneyStateRequest: JourneyStateRequest): UpdateJourneyStateRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JourneyId = JourneyId.asInstanceOf[js.Any], JourneyStateRequest = JourneyStateRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateJourneyStateRequest]
  }
}

