package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVolumeResult extends js.Object {
  /**
    * Information about the volume modification.
    */
  var VolumeModification: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VolumeModification] = js.undefined
}

object ModifyVolumeResult {
  @scala.inline
  def apply(VolumeModification: VolumeModification = null): ModifyVolumeResult = {
    val __obj = js.Dynamic.literal()
    if (VolumeModification != null) __obj.updateDynamic("VolumeModification")(VolumeModification)
    __obj.asInstanceOf[ModifyVolumeResult]
  }
}

