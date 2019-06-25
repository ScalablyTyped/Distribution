package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMembersRequest extends js.Object {
  /**
    * A list of account IDs of the member accounts to delete.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.undefined
}

object DeleteMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList = null): DeleteMembersRequest = {
    val __obj = js.Dynamic.literal()
    if (AccountIds != null) __obj.updateDynamic("AccountIds")(AccountIds)
    __obj.asInstanceOf[DeleteMembersRequest]
  }
}

