package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateDelegateToResourceRequest extends js.Object {
  /**
    * The member (user or group) to associate to the resource.
    */
  var EntityId: WorkMailIdentifier
  /**
    * The organization under which the resource exists.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
  /**
    * The resource for which members (users or groups) are associated.
    */
  var ResourceId: typings.awsDashSdk.clientsWorkmailMod.ResourceId
}

object AssociateDelegateToResourceRequest {
  @scala.inline
  def apply(EntityId: WorkMailIdentifier, OrganizationId: OrganizationId, ResourceId: ResourceId): AssociateDelegateToResourceRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId, OrganizationId = OrganizationId, ResourceId = ResourceId)
  
    __obj.asInstanceOf[AssociateDelegateToResourceRequest]
  }
}

