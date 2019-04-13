package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterToWorkMailRequest extends js.Object {
  /**
    * The email for the user, group, or resource to be updated.
    */
  var Email: EmailAddress
  /**
    * The identifier for the user, group, or resource to be updated.
    */
  var EntityId: WorkMailIdentifier
  /**
    * The identifier for the organization under which the user, group, or resource exists.
    */
  var OrganizationId: awsDashSdkLib.clientsWorkmailMod.OrganizationId
}

object RegisterToWorkMailRequest {
  @scala.inline
  def apply(Email: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): RegisterToWorkMailRequest = {
    val __obj = js.Dynamic.literal(Email = Email, EntityId = EntityId, OrganizationId = OrganizationId)
  
    __obj.asInstanceOf[RegisterToWorkMailRequest]
  }
}

