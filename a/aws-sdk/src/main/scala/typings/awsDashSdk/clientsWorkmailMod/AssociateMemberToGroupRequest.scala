package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateMemberToGroupRequest extends js.Object {
  /**
    * The group to which the member (user or group) is associated.
    */
  var GroupId: WorkMailIdentifier = js.native
  /**
    * The member (user or group) to associate to the group.
    */
  var MemberId: WorkMailIdentifier = js.native
  /**
    * The organization under which the group exists.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId = js.native
}

object AssociateMemberToGroupRequest {
  @scala.inline
  def apply(GroupId: WorkMailIdentifier, MemberId: WorkMailIdentifier, OrganizationId: OrganizationId): AssociateMemberToGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateMemberToGroupRequest]
  }
}

