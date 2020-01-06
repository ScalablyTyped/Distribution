package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventSourceMappingsResponse extends js.Object {
  /**
    * A list of event source mappings.
    */
  var EventSourceMappings: js.UndefOr[EventSourceMappingsList] = js.native
  /**
    * A pagination token that's returned when the response doesn't contain all event source mappings.
    */
  var NextMarker: js.UndefOr[String] = js.native
}

object ListEventSourceMappingsResponse {
  @scala.inline
  def apply(EventSourceMappings: EventSourceMappingsList = null, NextMarker: String = null): ListEventSourceMappingsResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSourceMappings != null) __obj.updateDynamic("EventSourceMappings")(EventSourceMappings.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventSourceMappingsResponse]
  }
}

