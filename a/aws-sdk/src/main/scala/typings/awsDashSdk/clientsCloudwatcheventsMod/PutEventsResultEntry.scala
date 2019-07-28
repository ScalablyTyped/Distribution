package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEventsResultEntry extends js.Object {
  /**
    * The error code that indicates why the event submission failed.
    */
  var ErrorCode: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.ErrorCode] = js.undefined
  /**
    * The error message that explains why the event submission failed.
    */
  var ErrorMessage: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.ErrorMessage] = js.undefined
  /**
    * The ID of the event.
    */
  var EventId: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.EventId] = js.undefined
}

object PutEventsResultEntry {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, ErrorMessage: ErrorMessage = null, EventId: EventId = null): PutEventsResultEntry = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (EventId != null) __obj.updateDynamic("EventId")(EventId)
    __obj.asInstanceOf[PutEventsResultEntry]
  }
}

