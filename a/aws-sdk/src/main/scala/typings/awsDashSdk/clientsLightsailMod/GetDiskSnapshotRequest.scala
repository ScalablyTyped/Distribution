package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiskSnapshotRequest extends js.Object {
  /**
    * The name of the disk snapshot (e.g., my-disk-snapshot).
    */
  var diskSnapshotName: ResourceName = js.native
}

object GetDiskSnapshotRequest {
  @scala.inline
  def apply(diskSnapshotName: ResourceName): GetDiskSnapshotRequest = {
    val __obj = js.Dynamic.literal(diskSnapshotName = diskSnapshotName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDiskSnapshotRequest]
  }
}

