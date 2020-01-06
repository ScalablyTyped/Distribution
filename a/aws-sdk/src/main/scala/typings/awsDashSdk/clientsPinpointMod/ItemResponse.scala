package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemResponse extends js.Object {
  /**
    * The response that was received after the endpoint data was accepted.
    */
  var EndpointItemResponse: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.EndpointItemResponse] = js.native
  /**
    * A multipart response object that contains a key and a value for each event in the request. In each object, the event ID is the key and an EventItemResponse object is the value.
    */
  var EventsItemResponse: js.UndefOr[MapOfEventItemResponse] = js.native
}

object ItemResponse {
  @scala.inline
  def apply(
    EndpointItemResponse: EndpointItemResponse = null,
    EventsItemResponse: MapOfEventItemResponse = null
  ): ItemResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointItemResponse != null) __obj.updateDynamic("EndpointItemResponse")(EndpointItemResponse.asInstanceOf[js.Any])
    if (EventsItemResponse != null) __obj.updateDynamic("EventsItemResponse")(EventsItemResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemResponse]
  }
}

