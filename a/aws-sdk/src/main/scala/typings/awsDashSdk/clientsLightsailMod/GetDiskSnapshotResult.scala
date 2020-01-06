package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiskSnapshotResult extends js.Object {
  /**
    * An object containing information about the disk snapshot.
    */
  var diskSnapshot: js.UndefOr[DiskSnapshot] = js.native
}

object GetDiskSnapshotResult {
  @scala.inline
  def apply(diskSnapshot: DiskSnapshot = null): GetDiskSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (diskSnapshot != null) __obj.updateDynamic("diskSnapshot")(diskSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDiskSnapshotResult]
  }
}

