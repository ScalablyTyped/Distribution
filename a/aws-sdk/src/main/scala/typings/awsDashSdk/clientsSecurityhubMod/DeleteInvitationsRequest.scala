package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInvitationsRequest extends js.Object {
  /**
    * A list of the account IDs that sent the invitations to delete.
    */
  var AccountIds: AccountIdList
}

object DeleteInvitationsRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList): DeleteInvitationsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds)
  
    __obj.asInstanceOf[DeleteInvitationsRequest]
  }
}

