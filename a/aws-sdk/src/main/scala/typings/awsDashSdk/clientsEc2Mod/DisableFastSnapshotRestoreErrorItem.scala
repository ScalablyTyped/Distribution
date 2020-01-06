package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableFastSnapshotRestoreErrorItem extends js.Object {
  /**
    * The errors.
    */
  var FastSnapshotRestoreStateErrors: js.UndefOr[DisableFastSnapshotRestoreStateErrorSet] = js.native
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
}

object DisableFastSnapshotRestoreErrorItem {
  @scala.inline
  def apply(
    FastSnapshotRestoreStateErrors: DisableFastSnapshotRestoreStateErrorSet = null,
    SnapshotId: String = null
  ): DisableFastSnapshotRestoreErrorItem = {
    val __obj = js.Dynamic.literal()
    if (FastSnapshotRestoreStateErrors != null) __obj.updateDynamic("FastSnapshotRestoreStateErrors")(FastSnapshotRestoreStateErrors.asInstanceOf[js.Any])
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableFastSnapshotRestoreErrorItem]
  }
}

