package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSnapshotsRequest extends js.Object {
  /**
    * The identifier of the directory for which to retrieve snapshot information.
    */
  var DirectoryId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
  /**
    * The maximum number of objects to return.
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Limit] = js.undefined
  /**
    * The DescribeSnapshotsResult.NextToken value from a previous call to DescribeSnapshots. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
  /**
    * A list of identifiers of the snapshots to obtain the information for. If this member is null or empty, all snapshots are returned using the Limit and NextToken members.
    */
  var SnapshotIds: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SnapshotIds] = js.undefined
}

object DescribeSnapshotsRequest {
  @scala.inline
  def apply(
    DirectoryId: DirectoryId = null,
    Limit: js.UndefOr[Limit] = js.undefined,
    NextToken: NextToken = null,
    SnapshotIds: SnapshotIds = null
  ): DescribeSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SnapshotIds != null) __obj.updateDynamic("SnapshotIds")(SnapshotIds)
    __obj.asInstanceOf[DescribeSnapshotsRequest]
  }
}

