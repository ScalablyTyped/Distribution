package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSnapshotsResult extends js.Object {
  /**
    * The NextToken value to include in a future DescribeSnapshots request. When the results of a DescribeSnapshots request exceed MaxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the snapshots.
    */
  var Snapshots: js.UndefOr[SnapshotList] = js.undefined
}

object DescribeSnapshotsResult {
  @scala.inline
  def apply(NextToken: String = null, Snapshots: SnapshotList = null): DescribeSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Snapshots != null) __obj.updateDynamic("Snapshots")(Snapshots)
    __obj.asInstanceOf[DescribeSnapshotsResult]
  }
}

