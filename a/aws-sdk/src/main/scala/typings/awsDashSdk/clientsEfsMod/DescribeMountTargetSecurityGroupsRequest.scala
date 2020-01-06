package typings.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMountTargetSecurityGroupsRequest extends js.Object {
  /**
    * The ID of the mount target whose security groups you want to retrieve.
    */
  var MountTargetId: typings.awsDashSdk.clientsEfsMod.MountTargetId = js.native
}

object DescribeMountTargetSecurityGroupsRequest {
  @scala.inline
  def apply(MountTargetId: MountTargetId): DescribeMountTargetSecurityGroupsRequest = {
    val __obj = js.Dynamic.literal(MountTargetId = MountTargetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeMountTargetSecurityGroupsRequest]
  }
}

