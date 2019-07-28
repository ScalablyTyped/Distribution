package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGroupRequest extends js.Object {
  /**
    * The identifier of the group to be deleted.
    */
  var GroupId: WorkMailIdentifier
  /**
    * The organization that contains the group.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
}

object DeleteGroupRequest {
  @scala.inline
  def apply(GroupId: WorkMailIdentifier, OrganizationId: OrganizationId): DeleteGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId, OrganizationId = OrganizationId)
  
    __obj.asInstanceOf[DeleteGroupRequest]
  }
}

