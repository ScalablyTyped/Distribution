package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateDelegateFromResourceRequest extends js.Object {
  /**
    * The identifier for the member (user, group) to be removed from the resource's delegates.
    */
  var EntityId: WorkMailIdentifier
  /**
    * The identifier for the organization under which the resource exists.
    */
  var OrganizationId: awsDashSdkLib.clientsWorkmailMod.OrganizationId
  /**
    * The identifier of the resource from which delegates' set members are removed. 
    */
  var ResourceId: awsDashSdkLib.clientsWorkmailMod.ResourceId
}

object DisassociateDelegateFromResourceRequest {
  @scala.inline
  def apply(EntityId: WorkMailIdentifier, OrganizationId: OrganizationId, ResourceId: ResourceId): DisassociateDelegateFromResourceRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId, OrganizationId = OrganizationId, ResourceId = ResourceId)
  
    __obj.asInstanceOf[DisassociateDelegateFromResourceRequest]
  }
}

