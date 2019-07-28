package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDatasetContentResponse extends js.Object {
  /**
    * A list of "DatasetEntry" objects.
    */
  var entries: js.UndefOr[DatasetEntries] = js.undefined
  /**
    * The status of the data set content.
    */
  var status: js.UndefOr[DatasetContentStatus] = js.undefined
  /**
    * The time when the request was made.
    */
  var timestamp: js.UndefOr[Timestamp] = js.undefined
}

object GetDatasetContentResponse {
  @scala.inline
  def apply(entries: DatasetEntries = null, status: DatasetContentStatus = null, timestamp: Timestamp = null): GetDatasetContentResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (status != null) __obj.updateDynamic("status")(status)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[GetDatasetContentResponse]
  }
}

