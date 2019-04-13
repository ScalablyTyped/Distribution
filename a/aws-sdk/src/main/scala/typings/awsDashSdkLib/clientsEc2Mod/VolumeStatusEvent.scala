package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeStatusEvent extends js.Object {
  /**
    * A description of the event.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The ID of this event.
    */
  var EventId: js.UndefOr[String] = js.undefined
  /**
    * The type of this event.
    */
  var EventType: js.UndefOr[String] = js.undefined
  /**
    * The latest end time of the event.
    */
  var NotAfter: js.UndefOr[DateTime] = js.undefined
  /**
    * The earliest start time of the event.
    */
  var NotBefore: js.UndefOr[DateTime] = js.undefined
}

object VolumeStatusEvent {
  @scala.inline
  def apply(
    Description: String = null,
    EventId: String = null,
    EventType: String = null,
    NotAfter: DateTime = null,
    NotBefore: DateTime = null
  ): VolumeStatusEvent = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EventId != null) __obj.updateDynamic("EventId")(EventId)
    if (EventType != null) __obj.updateDynamic("EventType")(EventType)
    if (NotAfter != null) __obj.updateDynamic("NotAfter")(NotAfter)
    if (NotBefore != null) __obj.updateDynamic("NotBefore")(NotBefore)
    __obj.asInstanceOf[VolumeStatusEvent]
  }
}

