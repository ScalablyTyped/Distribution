package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDiskSnapshotResult extends js.Object {
  /**
    * An object containing information about the disk snapshot.
    */
  var diskSnapshot: js.UndefOr[DiskSnapshot] = js.undefined
}

object GetDiskSnapshotResult {
  @scala.inline
  def apply(diskSnapshot: DiskSnapshot = null): GetDiskSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (diskSnapshot != null) __obj.updateDynamic("diskSnapshot")(diskSnapshot)
    __obj.asInstanceOf[GetDiskSnapshotResult]
  }
}

