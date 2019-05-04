package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMailboxQuotaRequest extends js.Object {
  /**
    * The updated mailbox quota, in MB, for the specified user.
    */
  var MailboxQuota: awsDashSdkLib.clientsWorkmailMod.MailboxQuota
  /**
    * The identifier for the organization that contains the user for whom to update the mailbox quota.
    */
  var OrganizationId: awsDashSdkLib.clientsWorkmailMod.OrganizationId
  /**
    * The identifer for the user for whom to update the mailbox quota.
    */
  var UserId: WorkMailIdentifier
}

object UpdateMailboxQuotaRequest {
  @scala.inline
  def apply(MailboxQuota: MailboxQuota, OrganizationId: OrganizationId, UserId: WorkMailIdentifier): UpdateMailboxQuotaRequest = {
    val __obj = js.Dynamic.literal(MailboxQuota = MailboxQuota, OrganizationId = OrganizationId, UserId = UserId)
  
    __obj.asInstanceOf[UpdateMailboxQuotaRequest]
  }
}

