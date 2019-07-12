package typings
package awsDashSdkLib.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPartnerEventSourceAccountsResponse extends js.Object {
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The list of partner event sources returned by the operation.
    */
  var PartnerEventSourceAccounts: js.UndefOr[PartnerEventSourceAccountList] = js.undefined
}

object ListPartnerEventSourceAccountsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, PartnerEventSourceAccounts: PartnerEventSourceAccountList = null): ListPartnerEventSourceAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PartnerEventSourceAccounts != null) __obj.updateDynamic("PartnerEventSourceAccounts")(PartnerEventSourceAccounts)
    __obj.asInstanceOf[ListPartnerEventSourceAccountsResponse]
  }
}

