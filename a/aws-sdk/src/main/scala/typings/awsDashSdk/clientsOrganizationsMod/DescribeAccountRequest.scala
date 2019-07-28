package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccountRequest extends js.Object {
  /**
    * The unique identifier (ID) of the AWS account that you want information about. You can get the ID from the ListAccounts or ListAccountsForParent operations. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var AccountId: typings.awsDashSdk.clientsOrganizationsMod.AccountId
}

object DescribeAccountRequest {
  @scala.inline
  def apply(AccountId: AccountId): DescribeAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId)
  
    __obj.asInstanceOf[DescribeAccountRequest]
  }
}

