package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEventsResponse extends js.Object {
  var EventsResponse: typings.awsDashSdk.clientsPinpointMod.EventsResponse = js.native
}

object PutEventsResponse {
  @scala.inline
  def apply(EventsResponse: EventsResponse): PutEventsResponse = {
    val __obj = js.Dynamic.literal(EventsResponse = EventsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutEventsResponse]
  }
}

