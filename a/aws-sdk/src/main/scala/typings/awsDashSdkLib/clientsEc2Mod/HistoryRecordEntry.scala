package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryRecordEntry extends js.Object {
  /**
    * Information about the event.
    */
  var EventInformation: js.UndefOr[EventInformation] = js.undefined
  /**
    * The event type.
    */
  var EventType: js.UndefOr[FleetEventType] = js.undefined
  /**
    * The date and time of the event, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var Timestamp: js.UndefOr[DateTime] = js.undefined
}

object HistoryRecordEntry {
  @scala.inline
  def apply(
    EventInformation: EventInformation = null,
    EventType: FleetEventType = null,
    Timestamp: DateTime = null
  ): HistoryRecordEntry = {
    val __obj = js.Dynamic.literal()
    if (EventInformation != null) __obj.updateDynamic("EventInformation")(EventInformation)
    if (EventType != null) __obj.updateDynamic("EventType")(EventType.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[HistoryRecordEntry]
  }
}

