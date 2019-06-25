package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInvitationsRequest extends js.Object {
  /**
    * A list of the account IDs that sent the invitations to delete.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.undefined
}

object DeleteInvitationsRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList = null): DeleteInvitationsRequest = {
    val __obj = js.Dynamic.literal()
    if (AccountIds != null) __obj.updateDynamic("AccountIds")(AccountIds)
    __obj.asInstanceOf[DeleteInvitationsRequest]
  }
}

