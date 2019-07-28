package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSecurityProfilesResponse extends js.Object {
  /**
    * A string returned in the response. Use the value returned in the response as the value of the NextToken in a subsequent request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConnectMod.NextToken] = js.undefined
  /**
    * An array of SecurityProfileSummary objects.
    */
  var SecurityProfileSummaryList: js.UndefOr[typings.awsDashSdk.clientsConnectMod.SecurityProfileSummaryList] = js.undefined
}

object ListSecurityProfilesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, SecurityProfileSummaryList: SecurityProfileSummaryList = null): ListSecurityProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SecurityProfileSummaryList != null) __obj.updateDynamic("SecurityProfileSummaryList")(SecurityProfileSummaryList)
    __obj.asInstanceOf[ListSecurityProfilesResponse]
  }
}

