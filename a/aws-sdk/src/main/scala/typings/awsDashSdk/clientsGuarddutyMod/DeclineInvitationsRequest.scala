package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclineInvitationsRequest extends js.Object {
  /**
    * A list of account IDs of the AWS accounts that sent invitations to the current member account that you want to decline invitations from.
    */
  var AccountIds: typings.awsDashSdk.clientsGuarddutyMod.AccountIds
}

object DeclineInvitationsRequest {
  @scala.inline
  def apply(AccountIds: AccountIds): DeclineInvitationsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds)
  
    __obj.asInstanceOf[DeclineInvitationsRequest]
  }
}

