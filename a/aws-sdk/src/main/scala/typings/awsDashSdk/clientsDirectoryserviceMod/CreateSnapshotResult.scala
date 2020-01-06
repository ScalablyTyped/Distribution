package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotResult extends js.Object {
  /**
    * The identifier of the snapshot that was created.
    */
  var SnapshotId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SnapshotId] = js.native
}

object CreateSnapshotResult {
  @scala.inline
  def apply(SnapshotId: SnapshotId = null): CreateSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotResult]
  }
}

