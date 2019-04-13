package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSnapshotScheduleOutput extends js.Object {
  /**
    * The volume which snapshot schedule was deleted.
    */
  var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
}

object DeleteSnapshotScheduleOutput {
  @scala.inline
  def apply(VolumeARN: VolumeARN = null): DeleteSnapshotScheduleOutput = {
    val __obj = js.Dynamic.literal()
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN)
    __obj.asInstanceOf[DeleteSnapshotScheduleOutput]
  }
}

