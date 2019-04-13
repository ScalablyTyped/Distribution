package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteResourceRequest extends js.Object {
  /**
    * The identifier associated with the organization from which the resource is deleted.
    */
  var OrganizationId: awsDashSdkLib.clientsWorkmailMod.OrganizationId
  /**
    * The identifier of the resource to be deleted.
    */
  var ResourceId: awsDashSdkLib.clientsWorkmailMod.ResourceId
}

object DeleteResourceRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, ResourceId: ResourceId): DeleteResourceRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId, ResourceId = ResourceId)
  
    __obj.asInstanceOf[DeleteResourceRequest]
  }
}

