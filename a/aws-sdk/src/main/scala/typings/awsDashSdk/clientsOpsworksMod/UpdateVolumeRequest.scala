package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVolumeRequest extends js.Object {
  /**
    * The new mount point.
    */
  var MountPoint: js.UndefOr[String] = js.undefined
  /**
    * The new name.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The volume ID.
    */
  var VolumeId: String
}

object UpdateVolumeRequest {
  @scala.inline
  def apply(VolumeId: String, MountPoint: String = null, Name: String = null): UpdateVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId)
    if (MountPoint != null) __obj.updateDynamic("MountPoint")(MountPoint)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateVolumeRequest]
  }
}

