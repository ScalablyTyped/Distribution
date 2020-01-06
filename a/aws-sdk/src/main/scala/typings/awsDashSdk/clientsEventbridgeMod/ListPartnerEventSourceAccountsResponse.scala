package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartnerEventSourceAccountsResponse extends js.Object {
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.NextToken] = js.native
  /**
    * The list of partner event sources returned by the operation.
    */
  var PartnerEventSourceAccounts: js.UndefOr[PartnerEventSourceAccountList] = js.native
}

object ListPartnerEventSourceAccountsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, PartnerEventSourceAccounts: PartnerEventSourceAccountList = null): ListPartnerEventSourceAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PartnerEventSourceAccounts != null) __obj.updateDynamic("PartnerEventSourceAccounts")(PartnerEventSourceAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartnerEventSourceAccountsResponse]
  }
}

