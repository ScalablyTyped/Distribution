package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateMembersRequest extends js.Object {
  /**
    * The account IDs of the member accounts to disassociate from the master account.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.undefined
}

object DisassociateMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList = null): DisassociateMembersRequest = {
    val __obj = js.Dynamic.literal()
    if (AccountIds != null) __obj.updateDynamic("AccountIds")(AccountIds)
    __obj.asInstanceOf[DisassociateMembersRequest]
  }
}

