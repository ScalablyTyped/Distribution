package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSnapshotScheduleInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: typings.awsDashSdk.clientsStoragegatewayMod.VolumeARN
}

object DescribeSnapshotScheduleInput {
  @scala.inline
  def apply(VolumeARN: VolumeARN): DescribeSnapshotScheduleInput = {
    val __obj = js.Dynamic.literal(VolumeARN = VolumeARN)
  
    __obj.asInstanceOf[DescribeSnapshotScheduleInput]
  }
}

