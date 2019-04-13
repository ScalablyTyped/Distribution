package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeResourceRequest extends js.Object {
  /**
    * The identifier associated with the organization for which the resource is described.
    */
  var OrganizationId: awsDashSdkLib.clientsWorkmailMod.OrganizationId
  /**
    * The identifier of the resource to be described.
    */
  var ResourceId: awsDashSdkLib.clientsWorkmailMod.ResourceId
}

object DescribeResourceRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, ResourceId: ResourceId): DescribeResourceRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId, ResourceId = ResourceId)
  
    __obj.asInstanceOf[DescribeResourceRequest]
  }
}

