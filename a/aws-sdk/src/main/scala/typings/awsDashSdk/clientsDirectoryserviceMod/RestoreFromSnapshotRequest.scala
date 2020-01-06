package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreFromSnapshotRequest extends js.Object {
  /**
    * The identifier of the snapshot to restore from.
    */
  var SnapshotId: typings.awsDashSdk.clientsDirectoryserviceMod.SnapshotId = js.native
}

object RestoreFromSnapshotRequest {
  @scala.inline
  def apply(SnapshotId: SnapshotId): RestoreFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RestoreFromSnapshotRequest]
  }
}

