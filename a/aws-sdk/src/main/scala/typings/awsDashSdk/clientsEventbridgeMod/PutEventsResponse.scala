package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEventsResponse extends js.Object {
  /**
    * The successfully and unsuccessfully ingested events results. If the ingestion was successful, the entry has the event ID in it. Otherwise, you can use the error code and error message to identify the problem with the entry.
    */
  var Entries: js.UndefOr[PutEventsResultEntryList] = js.undefined
  /**
    * The number of failed entries.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.undefined
}

object PutEventsResponse {
  @scala.inline
  def apply(Entries: PutEventsResultEntryList = null, FailedEntryCount: Int | Double = null): PutEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (Entries != null) __obj.updateDynamic("Entries")(Entries)
    if (FailedEntryCount != null) __obj.updateDynamic("FailedEntryCount")(FailedEntryCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsResponse]
  }
}

