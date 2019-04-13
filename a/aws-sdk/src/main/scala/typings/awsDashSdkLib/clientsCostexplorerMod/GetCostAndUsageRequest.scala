package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCostAndUsageRequest extends js.Object {
  /**
    * Filters AWS costs by different dimensions. For example, you can specify SERVICE and LINKED_ACCOUNT and get the costs that are associated with that account's usage of that service. You can nest Expression objects to define any combination of dimension filters. For more information, see Expression. 
    */
  var Filter: js.UndefOr[Expression] = js.undefined
  /**
    * Sets the AWS cost granularity to MONTHLY or DAILY. If Granularity isn't set, the response object doesn't include the Granularity, either MONTHLY or DAILY.  The GetCostAndUsageRequest operation supports only DAILY and MONTHLY granularities.
    */
  var Granularity: js.UndefOr[Granularity] = js.undefined
  /**
    * You can group AWS costs using up to two different groups, either dimensions, tag keys, or both. When you group by tag key, you get all tag values, including empty strings. Valid values are AZ, INSTANCE_TYPE, LEGAL_ENTITY_NAME, LINKED_ACCOUNT, OPERATION, PLATFORM, PURCHASE_TYPE, SERVICE, TAGS, TENANCY, and USAGE_TYPE.
    */
  var GroupBy: js.UndefOr[GroupDefinitions] = js.undefined
  /**
    * Which metrics are returned in the query. For more information about blended and unblended rates, see Why does the "blended" annotation appear on some line items in my bill?.  Valid values are AmortizedCost, BlendedCost, NetAmortizedCost, NetUnblendedCost, NormalizedUsageAmount, UnblendedCost, and UsageQuantity.   If you return the UsageQuantity metric, the service aggregates all usage numbers without taking into account the units. For example, if you aggregate usageQuantity across all of Amazon EC2, the results aren't meaningful because Amazon EC2 compute hours and data transfer are measured in different units (for example, hours vs. GB). To get more meaningful UsageQuantity metrics, filter by UsageType or UsageTypeGroups.    Metrics is required for GetCostAndUsage requests.
    */
  var Metrics: js.UndefOr[MetricNames] = js.undefined
  /**
    * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
  /**
    * Sets the start and end dates for retrieving AWS costs. The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01.
    */
  var TimePeriod: DateInterval
}

object GetCostAndUsageRequest {
  @scala.inline
  def apply(
    TimePeriod: DateInterval,
    Filter: Expression = null,
    Granularity: Granularity = null,
    GroupBy: GroupDefinitions = null,
    Metrics: MetricNames = null,
    NextPageToken: NextPageToken = null
  ): GetCostAndUsageRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (Granularity != null) __obj.updateDynamic("Granularity")(Granularity.asInstanceOf[js.Any])
    if (GroupBy != null) __obj.updateDynamic("GroupBy")(GroupBy)
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    __obj.asInstanceOf[GetCostAndUsageRequest]
  }
}

