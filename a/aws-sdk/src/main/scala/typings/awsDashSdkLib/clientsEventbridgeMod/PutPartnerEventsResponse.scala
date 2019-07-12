package typings
package awsDashSdkLib.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPartnerEventsResponse extends js.Object {
  /**
    * The list of events from this operation that were successfully written to the partner event bus.
    */
  var Entries: js.UndefOr[PutPartnerEventsResultEntryList] = js.undefined
  /**
    * The number of events from this operation that couldn't be written to the partner event bus.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.undefined
}

object PutPartnerEventsResponse {
  @scala.inline
  def apply(
    Entries: PutPartnerEventsResultEntryList = null,
    FailedEntryCount: js.UndefOr[Integer] = js.undefined
  ): PutPartnerEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (Entries != null) __obj.updateDynamic("Entries")(Entries)
    if (!js.isUndefined(FailedEntryCount)) __obj.updateDynamic("FailedEntryCount")(FailedEntryCount)
    __obj.asInstanceOf[PutPartnerEventsResponse]
  }
}

