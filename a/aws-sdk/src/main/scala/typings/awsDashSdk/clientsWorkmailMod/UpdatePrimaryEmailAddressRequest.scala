package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePrimaryEmailAddressRequest extends js.Object {
  /**
    * The value of the email to be updated as primary.
    */
  var Email: EmailAddress
  /**
    * The user, group, or resource to update.
    */
  var EntityId: WorkMailIdentifier
  /**
    * The organization that contains the user, group, or resource to update.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
}

object UpdatePrimaryEmailAddressRequest {
  @scala.inline
  def apply(Email: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): UpdatePrimaryEmailAddressRequest = {
    val __obj = js.Dynamic.literal(Email = Email, EntityId = EntityId, OrganizationId = OrganizationId)
  
    __obj.asInstanceOf[UpdatePrimaryEmailAddressRequest]
  }
}

