package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMailboxDetailsRequest extends js.Object {
  /**
    * The identifier for the organization that contains the user whose mailbox details are being requested.
    */
  var OrganizationId: awsDashSdkLib.clientsWorkmailMod.OrganizationId
  /**
    * The identifier for the user whose mailbox details are being requested.
    */
  var UserId: WorkMailIdentifier
}

object GetMailboxDetailsRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, UserId: WorkMailIdentifier): GetMailboxDetailsRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId, UserId = UserId)
  
    __obj.asInstanceOf[GetMailboxDetailsRequest]
  }
}

