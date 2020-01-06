package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStorageInfo extends js.Object {
  /**
    * Array describing the disks that are available for the instance type.
    */
  var Disks: js.UndefOr[DiskInfoList] = js.native
  /**
    * The total size of the disks, in GB.
    */
  var TotalSizeInGB: js.UndefOr[DiskSize] = js.native
}

object InstanceStorageInfo {
  @scala.inline
  def apply(Disks: DiskInfoList = null, TotalSizeInGB: Int | scala.Double = null): InstanceStorageInfo = {
    val __obj = js.Dynamic.literal()
    if (Disks != null) __obj.updateDynamic("Disks")(Disks.asInstanceOf[js.Any])
    if (TotalSizeInGB != null) __obj.updateDynamic("TotalSizeInGB")(TotalSizeInGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceStorageInfo]
  }
}

