package typings
package awsDashSdkLib.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDetails extends js.Object {
  /**
    * Summary information about the event.
    */
  var event: js.UndefOr[Event] = js.undefined
  /**
    * The most recent description of the event.
    */
  var eventDescription: js.UndefOr[EventDescription] = js.undefined
  /**
    * Additional metadata about the event.
    */
  var eventMetadata: js.UndefOr[eventMetadata] = js.undefined
}

object EventDetails {
  @scala.inline
  def apply(
    event: Event = null,
    eventDescription: EventDescription = null,
    eventMetadata: eventMetadata = null
  ): EventDetails = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event)
    if (eventDescription != null) __obj.updateDynamic("eventDescription")(eventDescription)
    if (eventMetadata != null) __obj.updateDynamic("eventMetadata")(eventMetadata)
    __obj.asInstanceOf[EventDetails]
  }
}

