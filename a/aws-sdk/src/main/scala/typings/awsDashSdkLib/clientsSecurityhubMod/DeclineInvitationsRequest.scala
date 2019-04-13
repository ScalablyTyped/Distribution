package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclineInvitationsRequest extends js.Object {
  /**
    * A list of account IDs specifying accounts whose invitations to Security Hub you want to decline. 
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

