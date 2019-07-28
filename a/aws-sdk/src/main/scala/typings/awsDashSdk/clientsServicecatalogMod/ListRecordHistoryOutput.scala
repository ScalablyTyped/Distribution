package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRecordHistoryOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * The records, in reverse chronological order.
    */
  var RecordDetails: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.RecordDetails] = js.undefined
}

object ListRecordHistoryOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, RecordDetails: RecordDetails = null): ListRecordHistoryOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (RecordDetails != null) __obj.updateDynamic("RecordDetails")(RecordDetails)
    __obj.asInstanceOf[ListRecordHistoryOutput]
  }
}

