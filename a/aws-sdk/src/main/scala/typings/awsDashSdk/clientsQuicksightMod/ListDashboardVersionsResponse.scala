package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDashboardVersionsResponse extends js.Object {
  /**
    * A structure that contains information about each version of the dashboard.
    */
  var DashboardVersionSummaryList: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.DashboardVersionSummaryList] = js.native
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object ListDashboardVersionsResponse {
  @scala.inline
  def apply(
    DashboardVersionSummaryList: DashboardVersionSummaryList = null,
    NextToken: String = null,
    RequestId: String = null,
    Status: Int | scala.Double = null
  ): ListDashboardVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (DashboardVersionSummaryList != null) __obj.updateDynamic("DashboardVersionSummaryList")(DashboardVersionSummaryList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDashboardVersionsResponse]
  }
}

