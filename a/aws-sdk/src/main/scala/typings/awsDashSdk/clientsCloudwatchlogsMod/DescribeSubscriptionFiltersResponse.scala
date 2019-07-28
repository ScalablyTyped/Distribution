package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSubscriptionFiltersResponse extends js.Object {
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The subscription filters.
    */
  var subscriptionFilters: js.UndefOr[SubscriptionFilters] = js.undefined
}

object DescribeSubscriptionFiltersResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, subscriptionFilters: SubscriptionFilters = null): DescribeSubscriptionFiltersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (subscriptionFilters != null) __obj.updateDynamic("subscriptionFilters")(subscriptionFilters)
    __obj.asInstanceOf[DescribeSubscriptionFiltersResponse]
  }
}

