package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRoutingProfilesResponse extends js.Object {
  /**
    * A string returned in the response. Use the value returned in the response as the value of the NextToken in a subsequent request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConnectMod.NextToken] = js.undefined
  /**
    * An array of RoutingProfileSummary objects that include the ARN, Id, and Name of the routing profile.
    */
  var RoutingProfileSummaryList: js.UndefOr[typings.awsDashSdk.clientsConnectMod.RoutingProfileSummaryList] = js.undefined
}

object ListRoutingProfilesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, RoutingProfileSummaryList: RoutingProfileSummaryList = null): ListRoutingProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (RoutingProfileSummaryList != null) __obj.updateDynamic("RoutingProfileSummaryList")(RoutingProfileSummaryList)
    __obj.asInstanceOf[ListRoutingProfilesResponse]
  }
}

