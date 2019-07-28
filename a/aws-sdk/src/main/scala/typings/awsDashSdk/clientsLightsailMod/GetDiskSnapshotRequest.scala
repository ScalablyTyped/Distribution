package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDiskSnapshotRequest extends js.Object {
  /**
    * The name of the disk snapshot (e.g., my-disk-snapshot).
    */
  var diskSnapshotName: ResourceName
}

object GetDiskSnapshotRequest {
  @scala.inline
  def apply(diskSnapshotName: ResourceName): GetDiskSnapshotRequest = {
    val __obj = js.Dynamic.literal(diskSnapshotName = diskSnapshotName)
  
    __obj.asInstanceOf[GetDiskSnapshotRequest]
  }
}

