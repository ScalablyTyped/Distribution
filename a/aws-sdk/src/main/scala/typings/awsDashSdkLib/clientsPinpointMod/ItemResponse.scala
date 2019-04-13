package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemResponse extends js.Object {
  /**
    * The response received after the endpoint was accepted.
    */
  var EndpointItemResponse: js.UndefOr[EndpointItemResponse] = js.undefined
  /**
    * A multipart response object that contains a key and value for each event ID in the request. In each object, the event ID is the key, and an EventItemResponse object is the value.
    */
  var EventsItemResponse: js.UndefOr[MapOfEventItemResponse] = js.undefined
}

object ItemResponse {
  @scala.inline
  def apply(
    EndpointItemResponse: EndpointItemResponse = null,
    EventsItemResponse: MapOfEventItemResponse = null
  ): ItemResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointItemResponse != null) __obj.updateDynamic("EndpointItemResponse")(EndpointItemResponse)
    if (EventsItemResponse != null) __obj.updateDynamic("EventsItemResponse")(EventsItemResponse)
    __obj.asInstanceOf[ItemResponse]
  }
}

