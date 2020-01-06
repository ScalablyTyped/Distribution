package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUsageReportSubscriptionsResult extends js.Object {
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the usage report subscription.
    */
  var UsageReportSubscriptions: js.UndefOr[UsageReportSubscriptionList] = js.native
}

object DescribeUsageReportSubscriptionsResult {
  @scala.inline
  def apply(NextToken: String = null, UsageReportSubscriptions: UsageReportSubscriptionList = null): DescribeUsageReportSubscriptionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (UsageReportSubscriptions != null) __obj.updateDynamic("UsageReportSubscriptions")(UsageReportSubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUsageReportSubscriptionsResult]
  }
}

