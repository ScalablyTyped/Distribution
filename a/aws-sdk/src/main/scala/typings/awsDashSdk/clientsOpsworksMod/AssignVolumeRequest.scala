package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignVolumeRequest extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The volume ID.
    */
  var VolumeId: String = js.native
}

object AssignVolumeRequest {
  @scala.inline
  def apply(VolumeId: String, InstanceId: String = null): AssignVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignVolumeRequest]
  }
}

