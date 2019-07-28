package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDiskResult extends js.Object {
  /**
    * An object containing information about the disk.
    */
  var disk: js.UndefOr[Disk] = js.undefined
}

object GetDiskResult {
  @scala.inline
  def apply(disk: Disk = null): GetDiskResult = {
    val __obj = js.Dynamic.literal()
    if (disk != null) __obj.updateDynamic("disk")(disk)
    __obj.asInstanceOf[GetDiskResult]
  }
}

