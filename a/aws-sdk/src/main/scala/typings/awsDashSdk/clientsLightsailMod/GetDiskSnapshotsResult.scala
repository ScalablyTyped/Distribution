package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDiskSnapshotsResult extends js.Object {
  /**
    * An array of objects containing information about all block storage disk snapshots.
    */
  var diskSnapshots: js.UndefOr[DiskSnapshotList] = js.undefined
  /**
    * A token used for advancing to the next page of results from your GetDiskSnapshots request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object GetDiskSnapshotsResult {
  @scala.inline
  def apply(diskSnapshots: DiskSnapshotList = null, nextPageToken: String = null): GetDiskSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    if (diskSnapshots != null) __obj.updateDynamic("diskSnapshots")(diskSnapshots)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[GetDiskSnapshotsResult]
  }
}

