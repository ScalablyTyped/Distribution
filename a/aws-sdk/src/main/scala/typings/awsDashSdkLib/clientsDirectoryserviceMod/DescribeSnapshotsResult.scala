package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSnapshotsResult extends js.Object {
  /**
    * If not null, more results are available. Pass this value in the NextToken member of a subsequent call to DescribeSnapshots.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The list of Snapshot objects that were retrieved. It is possible that this list contains less than the number of items specified in the Limit member of the request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations of the operation have been exceeded.
    */
  var Snapshots: js.UndefOr[Snapshots] = js.undefined
}

object DescribeSnapshotsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Snapshots: Snapshots = null): DescribeSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Snapshots != null) __obj.updateDynamic("Snapshots")(Snapshots)
    __obj.asInstanceOf[DescribeSnapshotsResult]
  }
}

