package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterVolumeRequest extends js.Object {
  /**
    * The AWS OpsWorks Stacks volume ID, which is the GUID that AWS OpsWorks Stacks assigned to the instance when you registered the volume with the stack, not the Amazon EC2 volume ID.
    */
  var VolumeId: String
}

object DeregisterVolumeRequest {
  @scala.inline
  def apply(VolumeId: String): DeregisterVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId)
  
    __obj.asInstanceOf[DeregisterVolumeRequest]
  }
}

