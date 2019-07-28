package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskSnapshotInfo extends js.Object {
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: js.UndefOr[integer] = js.undefined
}

object DiskSnapshotInfo {
  @scala.inline
  def apply(sizeInGb: js.UndefOr[integer] = js.undefined): DiskSnapshotInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sizeInGb)) __obj.updateDynamic("sizeInGb")(sizeInGb)
    __obj.asInstanceOf[DiskSnapshotInfo]
  }
}

