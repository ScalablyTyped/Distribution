package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserRequest extends js.Object {
  /**
    * The organization that contains the user to be deleted.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
  /**
    * The identifier of the user to be deleted.
    */
  var UserId: WorkMailIdentifier
}

object DeleteUserRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, UserId: WorkMailIdentifier): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId, UserId = UserId)
  
    __obj.asInstanceOf[DeleteUserRequest]
  }
}

