package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserRequest extends js.Object {
  /**
    * The identifier for the organization under which the user exists.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
  /**
    * The identifier for the user to be described.
    */
  var UserId: WorkMailIdentifier
}

object DescribeUserRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, UserId: WorkMailIdentifier): DescribeUserRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId, UserId = UserId)
  
    __obj.asInstanceOf[DescribeUserRequest]
  }
}

