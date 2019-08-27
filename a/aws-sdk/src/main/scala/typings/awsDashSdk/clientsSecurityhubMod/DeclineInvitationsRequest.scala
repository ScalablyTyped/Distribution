package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclineInvitationsRequest extends js.Object {
  /**
    * A list of account IDs that specify the accounts that invitations to Security Hub are declined from.
    */
  var AccountIds: AccountIdList
}

object DeclineInvitationsRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList): DeclineInvitationsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds)
  
    __obj.asInstanceOf[DeclineInvitationsRequest]
  }
}

