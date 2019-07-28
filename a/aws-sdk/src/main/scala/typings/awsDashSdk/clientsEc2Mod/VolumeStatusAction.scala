package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeStatusAction extends js.Object {
  /**
    * The code identifying the operation, for example, enable-volume-io.
    */
  var Code: js.UndefOr[String] = js.undefined
  /**
    * A description of the operation.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The ID of the event associated with this operation.
    */
  var EventId: js.UndefOr[String] = js.undefined
  /**
    * The event type associated with this operation.
    */
  var EventType: js.UndefOr[String] = js.undefined
}

object VolumeStatusAction {
  @scala.inline
  def apply(Code: String = null, Description: String = null, EventId: String = null, EventType: String = null): VolumeStatusAction = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EventId != null) __obj.updateDynamic("EventId")(EventId)
    if (EventType != null) __obj.updateDynamic("EventType")(EventType)
    __obj.asInstanceOf[VolumeStatusAction]
  }
}

