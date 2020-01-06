package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContactFlowsResponse extends js.Object {
  /**
    * Information about the contact flows.
    */
  var ContactFlowSummaryList: js.UndefOr[typings.awsDashSdk.clientsConnectMod.ContactFlowSummaryList] = js.native
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConnectMod.NextToken] = js.native
}

object ListContactFlowsResponse {
  @scala.inline
  def apply(ContactFlowSummaryList: ContactFlowSummaryList = null, NextToken: NextToken = null): ListContactFlowsResponse = {
    val __obj = js.Dynamic.literal()
    if (ContactFlowSummaryList != null) __obj.updateDynamic("ContactFlowSummaryList")(ContactFlowSummaryList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactFlowsResponse]
  }
}

