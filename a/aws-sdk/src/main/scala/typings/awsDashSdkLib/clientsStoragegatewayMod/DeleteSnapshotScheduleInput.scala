package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSnapshotScheduleInput extends js.Object {
  /**
    * The volume which snapshot schedule to delete.
    */
  var VolumeARN: awsDashSdkLib.clientsStoragegatewayMod.VolumeARN
}

object DeleteSnapshotScheduleInput {
  @scala.inline
  def apply(VolumeARN: VolumeARN): DeleteSnapshotScheduleInput = {
    val __obj = js.Dynamic.literal(VolumeARN = VolumeARN)
  
    __obj.asInstanceOf[DeleteSnapshotScheduleInput]
  }
}

