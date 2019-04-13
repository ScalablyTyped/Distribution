package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateMemberToGroupRequest extends js.Object {
  /**
    * The group to which the member (user or group) is associated.
    */
  var GroupId: WorkMailIdentifier
  /**
    * The member (user or group) to associate to the group.
    */
  var MemberId: WorkMailIdentifier
  /**
    * The organization under which the group exists.
    */
  var OrganizationId: awsDashSdkLib.clientsWorkmailMod.OrganizationId
}

object AssociateMemberToGroupRequest {
  @scala.inline
  def apply(GroupId: WorkMailIdentifier, MemberId: WorkMailIdentifier, OrganizationId: OrganizationId): AssociateMemberToGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId, MemberId = MemberId, OrganizationId = OrganizationId)
  
    __obj.asInstanceOf[AssociateMemberToGroupRequest]
  }
}

