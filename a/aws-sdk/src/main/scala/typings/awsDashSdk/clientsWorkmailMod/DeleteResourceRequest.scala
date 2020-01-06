package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourceRequest extends js.Object {
  /**
    * The identifier associated with the organization from which the resource is deleted.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId = js.native
  /**
    * The identifier of the resource to be deleted.
    */
  var ResourceId: typings.awsDashSdk.clientsWorkmailMod.ResourceId = js.native
}

object DeleteResourceRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, ResourceId: ResourceId): DeleteResourceRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteResourceRequest]
  }
}

