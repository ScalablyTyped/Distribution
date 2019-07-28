package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEventSourceMappingsResponse extends js.Object {
  /**
    * A list of event source mappings.
    */
  var EventSourceMappings: js.UndefOr[EventSourceMappingsList] = js.undefined
  /**
    * A pagination token that's returned when the response doesn't contain all event source mappings.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}

object ListEventSourceMappingsResponse {
  @scala.inline
  def apply(EventSourceMappings: EventSourceMappingsList = null, NextMarker: String = null): ListEventSourceMappingsResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSourceMappings != null) __obj.updateDynamic("EventSourceMappings")(EventSourceMappings)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListEventSourceMappingsResponse]
  }
}

