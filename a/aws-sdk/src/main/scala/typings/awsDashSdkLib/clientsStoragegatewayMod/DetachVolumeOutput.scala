package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachVolumeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the volume that was detached.
    */
  var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
}

object DetachVolumeOutput {
  @scala.inline
  def apply(VolumeARN: VolumeARN = null): DetachVolumeOutput = {
    val __obj = js.Dynamic.literal()
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN)
    __obj.asInstanceOf[DetachVolumeOutput]
  }
}

