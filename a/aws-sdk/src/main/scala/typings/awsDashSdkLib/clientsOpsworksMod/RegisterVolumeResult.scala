package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterVolumeResult extends js.Object {
  /**
    * The volume ID.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
}

object RegisterVolumeResult {
  @scala.inline
  def apply(VolumeId: String = null): RegisterVolumeResult = {
    val __obj = js.Dynamic.literal()
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId)
    __obj.asInstanceOf[RegisterVolumeResult]
  }
}

