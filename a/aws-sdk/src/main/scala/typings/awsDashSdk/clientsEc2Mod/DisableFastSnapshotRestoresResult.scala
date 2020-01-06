package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableFastSnapshotRestoresResult extends js.Object {
  /**
    * Information about the snapshots for which fast snapshot restores were successfully disabled.
    */
  var Successful: js.UndefOr[DisableFastSnapshotRestoreSuccessSet] = js.native
  /**
    * Information about the snapshots for which fast snapshot restores could not be disabled.
    */
  var Unsuccessful: js.UndefOr[DisableFastSnapshotRestoreErrorSet] = js.native
}

object DisableFastSnapshotRestoresResult {
  @scala.inline
  def apply(
    Successful: DisableFastSnapshotRestoreSuccessSet = null,
    Unsuccessful: DisableFastSnapshotRestoreErrorSet = null
  ): DisableFastSnapshotRestoresResult = {
    val __obj = js.Dynamic.literal()
    if (Successful != null) __obj.updateDynamic("Successful")(Successful.asInstanceOf[js.Any])
    if (Unsuccessful != null) __obj.updateDynamic("Unsuccessful")(Unsuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableFastSnapshotRestoresResult]
  }
}

