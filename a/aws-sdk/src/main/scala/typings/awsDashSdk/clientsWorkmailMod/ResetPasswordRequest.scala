package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetPasswordRequest extends js.Object {
  /**
    * The identifier of the organization that contains the user for which the password is reset.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
  /**
    * The new password for the user.
    */
  var Password: typings.awsDashSdk.clientsWorkmailMod.Password
  /**
    * The identifier of the user for whom the password is reset.
    */
  var UserId: WorkMailIdentifier
}

object ResetPasswordRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, Password: Password, UserId: WorkMailIdentifier): ResetPasswordRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId, Password = Password, UserId = UserId)
  
    __obj.asInstanceOf[ResetPasswordRequest]
  }
}

