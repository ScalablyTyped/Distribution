package typings
package awsDashSdkLib.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMountTargetSecurityGroupsRequest extends js.Object {
  /**
    * The ID of the mount target whose security groups you want to retrieve.
    */
  var MountTargetId: awsDashSdkLib.clientsEfsMod.MountTargetId
}

object DescribeMountTargetSecurityGroupsRequest {
  @scala.inline
  def apply(MountTargetId: MountTargetId): DescribeMountTargetSecurityGroupsRequest = {
    val __obj = js.Dynamic.literal(MountTargetId = MountTargetId)
  
    __obj.asInstanceOf[DescribeMountTargetSecurityGroupsRequest]
  }
}

