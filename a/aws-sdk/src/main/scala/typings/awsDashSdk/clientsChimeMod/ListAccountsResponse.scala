package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccountsResponse extends js.Object {
  /**
    * List of Amazon Chime accounts and account details.
    */
  var Accounts: js.UndefOr[AccountList] = js.native
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListAccountsResponse {
  @scala.inline
  def apply(Accounts: AccountList = null, NextToken: String = null): ListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccountsResponse]
  }
}

