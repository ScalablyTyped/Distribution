package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryRecord extends js.Object {
  /**
    * Information about the event.
    */
  var EventInformation: js.UndefOr[EventInformation] = js.undefined
  /**
    * The event type.    error - An error with the Spot Fleet request.    fleetRequestChange - A change in the status or configuration of the Spot Fleet request.    instanceChange - An instance was launched or terminated.    Information - An informational event.  
    */
  var EventType: js.UndefOr[EventType] = js.undefined
  /**
    * The date and time of the event, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var Timestamp: js.UndefOr[DateTime] = js.undefined
}

object HistoryRecord {
  @scala.inline
  def apply(EventInformation: EventInformation = null, EventType: EventType = null, Timestamp: DateTime = null): HistoryRecord = {
    val __obj = js.Dynamic.literal()
    if (EventInformation != null) __obj.updateDynamic("EventInformation")(EventInformation)
    if (EventType != null) __obj.updateDynamic("EventType")(EventType.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[HistoryRecord]
  }
}

