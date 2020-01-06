package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeStatusEvent extends js.Object {
  /**
    * A description of the event.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of this event.
    */
  var EventId: js.UndefOr[String] = js.native
  /**
    * The type of this event.
    */
  var EventType: js.UndefOr[String] = js.native
  /**
    * The latest end time of the event.
    */
  var NotAfter: js.UndefOr[MillisecondDateTime] = js.native
  /**
    * The earliest start time of the event.
    */
  var NotBefore: js.UndefOr[MillisecondDateTime] = js.native
}

object VolumeStatusEvent {
  @scala.inline
  def apply(
    Description: String = null,
    EventId: String = null,
    EventType: String = null,
    NotAfter: MillisecondDateTime = null,
    NotBefore: MillisecondDateTime = null
  ): VolumeStatusEvent = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EventId != null) __obj.updateDynamic("EventId")(EventId.asInstanceOf[js.Any])
    if (EventType != null) __obj.updateDynamic("EventType")(EventType.asInstanceOf[js.Any])
    if (NotAfter != null) __obj.updateDynamic("NotAfter")(NotAfter.asInstanceOf[js.Any])
    if (NotBefore != null) __obj.updateDynamic("NotBefore")(NotBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeStatusEvent]
  }
}

