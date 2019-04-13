package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListApplicationSnapshotsResponse extends js.Object {
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A collection of objects containing information about the application snapshots.
    */
  var SnapshotSummaries: js.UndefOr[SnapshotSummaries] = js.undefined
}

object ListApplicationSnapshotsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, SnapshotSummaries: SnapshotSummaries = null): ListApplicationSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SnapshotSummaries != null) __obj.updateDynamic("SnapshotSummaries")(SnapshotSummaries)
    __obj.asInstanceOf[ListApplicationSnapshotsResponse]
  }
}

