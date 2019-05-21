package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUsageReportSubscriptionsResult extends js.Object {
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the usage report subscription.
    */
  var UsageReportSubscriptions: js.UndefOr[UsageReportSubscriptionList] = js.undefined
}

object DescribeUsageReportSubscriptionsResult {
  @scala.inline
  def apply(NextToken: String = null, UsageReportSubscriptions: UsageReportSubscriptionList = null): DescribeUsageReportSubscriptionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (UsageReportSubscriptions != null) __obj.updateDynamic("UsageReportSubscriptions")(UsageReportSubscriptions)
    __obj.asInstanceOf[DescribeUsageReportSubscriptionsResult]
  }
}

