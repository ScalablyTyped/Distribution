package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIpGroupRequest extends js.Object {
  /**
    * The identifier of the IP access control group.
    */
  var GroupId: IpGroupId
}

object DeleteIpGroupRequest {
  @scala.inline
  def apply(GroupId: IpGroupId): DeleteIpGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId)
  
    __obj.asInstanceOf[DeleteIpGroupRequest]
  }
}

