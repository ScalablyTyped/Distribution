package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVolumeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the storage volume that was deleted. It is the same ARN you provided in the request.
    */
  var VolumeARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VolumeARN] = js.undefined
}

object DeleteVolumeOutput {
  @scala.inline
  def apply(VolumeARN: VolumeARN = null): DeleteVolumeOutput = {
    val __obj = js.Dynamic.literal()
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN)
    __obj.asInstanceOf[DeleteVolumeOutput]
  }
}

