package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignVolumeRequest extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The volume ID.
    */
  var VolumeId: String
}

object AssignVolumeRequest {
  @scala.inline
  def apply(VolumeId: String, InstanceId: String = null): AssignVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    __obj.asInstanceOf[AssignVolumeRequest]
  }
}

