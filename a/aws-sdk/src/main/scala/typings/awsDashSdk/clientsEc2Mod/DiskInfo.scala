package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskInfo extends js.Object {
  /**
    * The number of disks with this configuration.
    */
  var Count: js.UndefOr[DiskCount] = js.native
  /**
    * The size of the disk in GB.
    */
  var SizeInGB: js.UndefOr[DiskSize] = js.native
  /**
    * The type of disk.
    */
  var Type: js.UndefOr[DiskType] = js.native
}

object DiskInfo {
  @scala.inline
  def apply(Count: Int | scala.Double = null, SizeInGB: Int | scala.Double = null, Type: DiskType = null): DiskInfo = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (SizeInGB != null) __obj.updateDynamic("SizeInGB")(SizeInGB.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskInfo]
  }
}

