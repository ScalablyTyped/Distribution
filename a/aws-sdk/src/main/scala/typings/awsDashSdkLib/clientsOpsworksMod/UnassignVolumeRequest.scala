package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnassignVolumeRequest extends js.Object {
  /**
    * The volume ID.
    */
  var VolumeId: String
}

object UnassignVolumeRequest {
  @scala.inline
  def apply(VolumeId: String): UnassignVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId)
  
    __obj.asInstanceOf[UnassignVolumeRequest]
  }
}

