package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEventsRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  var EventsRequest: typings.awsDashSdk.clientsPinpointMod.EventsRequest
}

object PutEventsRequest {
  @scala.inline
  def apply(ApplicationId: __string, EventsRequest: EventsRequest): PutEventsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, EventsRequest = EventsRequest)
  
    __obj.asInstanceOf[PutEventsRequest]
  }
}

