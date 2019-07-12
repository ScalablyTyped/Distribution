package typings
package awsDashSdkLib.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPartnerEventsResultEntry extends js.Object {
  /**
    * The error code that indicates why the event submission failed.
    */
  var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
  /**
    * The error message that explains why the event submission failed.
    */
  var ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
  /**
    * The ID of the event.
    */
  var EventId: js.UndefOr[EventId] = js.undefined
}

object PutPartnerEventsResultEntry {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, ErrorMessage: ErrorMessage = null, EventId: EventId = null): PutPartnerEventsResultEntry = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (EventId != null) __obj.updateDynamic("EventId")(EventId)
    __obj.asInstanceOf[PutPartnerEventsResultEntry]
  }
}

