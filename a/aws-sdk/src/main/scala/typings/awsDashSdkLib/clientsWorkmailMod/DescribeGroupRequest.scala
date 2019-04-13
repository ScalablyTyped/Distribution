package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGroupRequest extends js.Object {
  /**
    * The identifier for the group to be described.
    */
  var GroupId: WorkMailIdentifier
  /**
    * The identifier for the organization under which the group exists.
    */
  var OrganizationId: awsDashSdkLib.clientsWorkmailMod.OrganizationId
}

object DescribeGroupRequest {
  @scala.inline
  def apply(GroupId: WorkMailIdentifier, OrganizationId: OrganizationId): DescribeGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId, OrganizationId = OrganizationId)
  
    __obj.asInstanceOf[DescribeGroupRequest]
  }
}

