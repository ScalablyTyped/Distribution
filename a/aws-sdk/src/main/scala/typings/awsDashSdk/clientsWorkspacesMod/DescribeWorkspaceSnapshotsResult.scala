package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspaceSnapshotsResult extends js.Object {
  /**
    * Information about the snapshots that can be used to rebuild a WorkSpace. These snapshots include the user volume.
    */
  var RebuildSnapshots: js.UndefOr[SnapshotList] = js.native
  /**
    * Information about the snapshots that can be used to restore a WorkSpace. These snapshots include both the root volume and the user volume.
    */
  var RestoreSnapshots: js.UndefOr[SnapshotList] = js.native
}

object DescribeWorkspaceSnapshotsResult {
  @scala.inline
  def apply(RebuildSnapshots: SnapshotList = null, RestoreSnapshots: SnapshotList = null): DescribeWorkspaceSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    if (RebuildSnapshots != null) __obj.updateDynamic("RebuildSnapshots")(RebuildSnapshots.asInstanceOf[js.Any])
    if (RestoreSnapshots != null) __obj.updateDynamic("RestoreSnapshots")(RestoreSnapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspaceSnapshotsResult]
  }
}

