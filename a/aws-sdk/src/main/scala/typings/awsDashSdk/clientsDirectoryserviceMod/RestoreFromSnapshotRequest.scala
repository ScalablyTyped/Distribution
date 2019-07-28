package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreFromSnapshotRequest extends js.Object {
  /**
    * The identifier of the snapshot to restore from.
    */
  var SnapshotId: typings.awsDashSdk.clientsDirectoryserviceMod.SnapshotId
}

object RestoreFromSnapshotRequest {
  @scala.inline
  def apply(SnapshotId: SnapshotId): RestoreFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId)
  
    __obj.asInstanceOf[RestoreFromSnapshotRequest]
  }
}

