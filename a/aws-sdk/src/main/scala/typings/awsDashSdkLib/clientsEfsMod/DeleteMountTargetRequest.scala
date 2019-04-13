package typings
package awsDashSdkLib.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMountTargetRequest extends js.Object {
  /**
    * The ID of the mount target to delete (String).
    */
  var MountTargetId: awsDashSdkLib.clientsEfsMod.MountTargetId
}

object DeleteMountTargetRequest {
  @scala.inline
  def apply(MountTargetId: MountTargetId): DeleteMountTargetRequest = {
    val __obj = js.Dynamic.literal(MountTargetId = MountTargetId)
  
    __obj.asInstanceOf[DeleteMountTargetRequest]
  }
}

