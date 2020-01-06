package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSnapshotRequest extends js.Object {
  /**
    * The identifier of the directory snapshot to be deleted.
    */
  var SnapshotId: typings.awsDashSdk.clientsDirectoryserviceMod.SnapshotId = js.native
}

object DeleteSnapshotRequest {
  @scala.inline
  def apply(SnapshotId: SnapshotId): DeleteSnapshotRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSnapshotRequest]
  }
}

