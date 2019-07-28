package typings.awsDashSdk.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMemberAccountsResult extends js.Object {
  /**
    * A list of the Amazon Macie member accounts returned by the action. The current master account is also included in this list. 
    */
  var memberAccounts: js.UndefOr[MemberAccounts] = js.undefined
  /**
    * When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListMemberAccountsResult {
  @scala.inline
  def apply(memberAccounts: MemberAccounts = null, nextToken: NextToken = null): ListMemberAccountsResult = {
    val __obj = js.Dynamic.literal()
    if (memberAccounts != null) __obj.updateDynamic("memberAccounts")(memberAccounts)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListMemberAccountsResult]
  }
}

