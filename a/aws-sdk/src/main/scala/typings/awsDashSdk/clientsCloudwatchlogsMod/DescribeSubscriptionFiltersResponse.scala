package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSubscriptionFiltersResponse extends js.Object {
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The subscription filters.
    */
  var subscriptionFilters: js.UndefOr[SubscriptionFilters] = js.native
}

object DescribeSubscriptionFiltersResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, subscriptionFilters: SubscriptionFilters = null): DescribeSubscriptionFiltersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (subscriptionFilters != null) __obj.updateDynamic("subscriptionFilters")(subscriptionFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSubscriptionFiltersResponse]
  }
}

