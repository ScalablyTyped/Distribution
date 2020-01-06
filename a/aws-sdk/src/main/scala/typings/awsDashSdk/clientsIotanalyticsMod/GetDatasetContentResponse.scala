package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDatasetContentResponse extends js.Object {
  /**
    * A list of "DatasetEntry" objects.
    */
  var entries: js.UndefOr[DatasetEntries] = js.native
  /**
    * The status of the data set content.
    */
  var status: js.UndefOr[DatasetContentStatus] = js.native
  /**
    * The time when the request was made.
    */
  var timestamp: js.UndefOr[Timestamp] = js.native
}

object GetDatasetContentResponse {
  @scala.inline
  def apply(entries: DatasetEntries = null, status: DatasetContentStatus = null, timestamp: Timestamp = null): GetDatasetContentResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatasetContentResponse]
  }
}

