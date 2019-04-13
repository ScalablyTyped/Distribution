package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEventsRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  var EventsRequest: awsDashSdkLib.clientsPinpointMod.EventsRequest
}

object PutEventsRequest {
  @scala.inline
  def apply(ApplicationId: __string, EventsRequest: EventsRequest): PutEventsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, EventsRequest = EventsRequest)
  
    __obj.asInstanceOf[PutEventsRequest]
  }
}

