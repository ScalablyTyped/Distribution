package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDetails extends js.Object {
  /**
    * Summary information about the event.
    */
  var event: js.UndefOr[Event] = js.native
  /**
    * The most recent description of the event.
    */
  var eventDescription: js.UndefOr[EventDescription] = js.native
  /**
    * Additional metadata about the event.
    */
  var eventMetadata: js.UndefOr[typings.awsDashSdk.clientsHealthMod.eventMetadata] = js.native
}

object EventDetails {
  @scala.inline
  def apply(
    event: Event = null,
    eventDescription: EventDescription = null,
    eventMetadata: eventMetadata = null
  ): EventDetails = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (eventDescription != null) __obj.updateDynamic("eventDescription")(eventDescription.asInstanceOf[js.Any])
    if (eventMetadata != null) __obj.updateDynamic("eventMetadata")(eventMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDetails]
  }
}

