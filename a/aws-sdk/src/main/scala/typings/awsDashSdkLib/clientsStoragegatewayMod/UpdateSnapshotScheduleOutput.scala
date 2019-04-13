package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSnapshotScheduleOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
}

object UpdateSnapshotScheduleOutput {
  @scala.inline
  def apply(VolumeARN: VolumeARN = null): UpdateSnapshotScheduleOutput = {
    val __obj = js.Dynamic.literal()
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN)
    __obj.asInstanceOf[UpdateSnapshotScheduleOutput]
  }
}

