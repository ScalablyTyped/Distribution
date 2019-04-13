package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVolumeAttributeRequest extends js.Object {
  /**
    * Indicates whether the volume should be auto-enabled for I/O operations.
    */
  var AutoEnableIO: js.UndefOr[AttributeBooleanValue] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the volume.
    */
  var VolumeId: String
}

object ModifyVolumeAttributeRequest {
  @scala.inline
  def apply(
    VolumeId: String,
    AutoEnableIO: AttributeBooleanValue = null,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ModifyVolumeAttributeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId)
    if (AutoEnableIO != null) __obj.updateDynamic("AutoEnableIO")(AutoEnableIO)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ModifyVolumeAttributeRequest]
  }
}

