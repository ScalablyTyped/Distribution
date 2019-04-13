package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOrganizationRequest extends js.Object {
  /**
    * The identifier for the organization to be described.
    */
  var OrganizationId: awsDashSdkLib.clientsWorkmailMod.OrganizationId
}

object DescribeOrganizationRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId): DescribeOrganizationRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId)
  
    __obj.asInstanceOf[DescribeOrganizationRequest]
  }
}

