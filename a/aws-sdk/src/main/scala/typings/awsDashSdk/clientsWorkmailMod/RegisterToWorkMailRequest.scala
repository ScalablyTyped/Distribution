package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterToWorkMailRequest extends js.Object {
  /**
    * The email for the user, group, or resource to be updated.
    */
  var Email: EmailAddress = js.native
  /**
    * The identifier for the user, group, or resource to be updated.
    */
  var EntityId: WorkMailIdentifier = js.native
  /**
    * The identifier for the organization under which the user, group, or resource exists.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId = js.native
}

object RegisterToWorkMailRequest {
  @scala.inline
  def apply(Email: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): RegisterToWorkMailRequest = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegisterToWorkMailRequest]
  }
}

