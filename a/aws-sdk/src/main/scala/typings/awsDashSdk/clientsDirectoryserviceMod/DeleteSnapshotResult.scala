package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSnapshotResult extends js.Object {
  /**
    * The identifier of the directory snapshot that was deleted.
    */
  var SnapshotId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SnapshotId] = js.native
}

object DeleteSnapshotResult {
  @scala.inline
  def apply(SnapshotId: SnapshotId = null): DeleteSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotResult]
  }
}

