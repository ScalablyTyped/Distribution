package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateMemberFromGroupRequest extends js.Object {
  /**
    * The identifier for the group from which members are removed.
    */
  var GroupId: WorkMailIdentifier
  /**
    * The identifier for the member to be removed to the group.
    */
  var MemberId: WorkMailIdentifier
  /**
    * The identifier for the organization under which the group exists.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
}

object DisassociateMemberFromGroupRequest {
  @scala.inline
  def apply(GroupId: WorkMailIdentifier, MemberId: WorkMailIdentifier, OrganizationId: OrganizationId): DisassociateMemberFromGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId, MemberId = MemberId, OrganizationId = OrganizationId)
  
    __obj.asInstanceOf[DisassociateMemberFromGroupRequest]
  }
}

