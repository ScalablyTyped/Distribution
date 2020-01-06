package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJourneyRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
  var WriteJourneyRequest: typings.awsDashSdk.clientsPinpointMod.WriteJourneyRequest = js.native
}

object CreateJourneyRequest {
  @scala.inline
  def apply(ApplicationId: __string, WriteJourneyRequest: WriteJourneyRequest): CreateJourneyRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteJourneyRequest = WriteJourneyRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateJourneyRequest]
  }
}

