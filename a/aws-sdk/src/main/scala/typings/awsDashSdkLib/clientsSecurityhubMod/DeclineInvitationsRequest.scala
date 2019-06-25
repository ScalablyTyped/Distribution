package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclineInvitationsRequest extends js.Object {
  /**
    * A list of account IDs that specify the accounts that invitations to Security Hub are declined from.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.undefined
}

object DeclineInvitationsRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList = null): DeclineInvitationsRequest = {
    val __obj = js.Dynamic.literal()
    if (AccountIds != null) __obj.updateDynamic("AccountIds")(AccountIds)
    __obj.asInstanceOf[DeclineInvitationsRequest]
  }
}

