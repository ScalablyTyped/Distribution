package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMembersRequest extends js.Object {
  /**
    * A list of account ID and email address pairs of the accounts to associate with the Security Hub master account.
    */
  var AccountDetails: js.UndefOr[AccountDetailsList] = js.undefined
}

object CreateMembersRequest {
  @scala.inline
  def apply(AccountDetails: AccountDetailsList = null): CreateMembersRequest = {
    val __obj = js.Dynamic.literal()
    if (AccountDetails != null) __obj.updateDynamic("AccountDetails")(AccountDetails)
    __obj.asInstanceOf[CreateMembersRequest]
  }
}

