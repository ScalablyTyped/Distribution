package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAccountFromOrganizationRequest extends js.Object {
  /**
    * The unique identifier (ID) of the member account that you want to remove from the organization. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var AccountId: typings.awsDashSdk.clientsOrganizationsMod.AccountId = js.native
}

object RemoveAccountFromOrganizationRequest {
  @scala.inline
  def apply(AccountId: AccountId): RemoveAccountFromOrganizationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveAccountFromOrganizationRequest]
  }
}

