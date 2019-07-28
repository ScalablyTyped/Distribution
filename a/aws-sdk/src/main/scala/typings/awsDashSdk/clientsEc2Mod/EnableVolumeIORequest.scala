package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableVolumeIORequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the volume.
    */
  var VolumeId: String
}

object EnableVolumeIORequest {
  @scala.inline
  def apply(VolumeId: String, DryRun: js.UndefOr[Boolean] = js.undefined): EnableVolumeIORequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[EnableVolumeIORequest]
  }
}

