package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableFastSnapshotRestoresResult extends js.Object {
  /**
    * Information about the snapshots for which fast snapshot restores were successfully enabled.
    */
  var Successful: js.UndefOr[EnableFastSnapshotRestoreSuccessSet] = js.native
  /**
    * Information about the snapshots for which fast snapshot restores could not be enabled.
    */
  var Unsuccessful: js.UndefOr[EnableFastSnapshotRestoreErrorSet] = js.native
}

object EnableFastSnapshotRestoresResult {
  @scala.inline
  def apply(
    Successful: EnableFastSnapshotRestoreSuccessSet = null,
    Unsuccessful: EnableFastSnapshotRestoreErrorSet = null
  ): EnableFastSnapshotRestoresResult = {
    val __obj = js.Dynamic.literal()
    if (Successful != null) __obj.updateDynamic("Successful")(Successful.asInstanceOf[js.Any])
    if (Unsuccessful != null) __obj.updateDynamic("Unsuccessful")(Unsuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableFastSnapshotRestoresResult]
  }
}

