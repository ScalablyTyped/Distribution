package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCurrentMetricDataRequest extends js.Object {
  /**
    * A list of CurrentMetric objects for the metrics to retrieve. Each CurrentMetric includes a name of a metric to retrieve and the unit to use for it. You must list each metric to retrieve data for in the request. The following metrics are available:  AGENTS_AVAILABLE  Unit: COUNT  AGENTS_ONLINE  Unit: COUNT  AGENTS_ON_CALL  Unit: COUNT  AGENTS_STAFFED  Unit: COUNT  AGENTS_AFTER_CONTACT_WORK  Unit: COUNT  AGENTS_NON_PRODUCTIVE  Unit: COUNT  AGENTS_ERROR  Unit: COUNT  CONTACTS_IN_QUEUE  Unit: COUNT  OLDEST_CONTACT_AGE  Unit: SECONDS  CONTACTS_SCHEDULED  Unit: COUNT  
    */
  var CurrentMetrics: typings.awsDashSdk.clientsConnectMod.CurrentMetrics
  /**
    * A Filters object that contains a list of queue IDs or queue ARNs, up to 100, or list of Channels to use to filter the metrics returned in the response. Metric data is retrieved only for the resources associated with the queue IDs, ARNs, or Channels included in the filter. You can include both IDs and ARNs in the same request. To retrieve metrics for all queues, add the queue ID or ARN for each queue in your instance. Only VOICE is supported for Channels. To find the ARN for a queue, open the queue you want to use in the Amazon Connect Queue editor. The ARN for the queue is displayed in the address bar as part of the URL. For example, the queue ARN is the set of characters at the end of the URL, after 'id=' such as arn:aws:connect:us-east-1:270923740243:instance/78fb859d-1b7d-44b1-8aa3-12f0835c5855/queue/1d1a4575-9618-40ab-bbeb-81e45795fe61. The queue ID is also included in the URL, and is the string after 'queue/'.
    */
  var Filters: typings.awsDashSdk.clientsConnectMod.Filters
  /**
    * The grouping applied to the metrics returned. For example, when grouped by QUEUE, the metrics returned apply to each queue rather than aggregated for all queues. If you group by CHANNEL, you should include a Channels filter. The only supported channel is VOICE. If no Grouping is included in the request, a summary of CurrentMetrics is returned.
    */
  var Groupings: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Groupings] = js.undefined
  /**
    * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
    */
  var InstanceId: typings.awsDashSdk.clientsConnectMod.InstanceId
  /**
    *  MaxResults indicates the maximum number of results to return per page in the response, between 1 and 100.
    */
  var MaxResults: js.UndefOr[MaxResult100] = js.undefined
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the NextToken must use the same request parameters as the request that generated the token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConnectMod.NextToken] = js.undefined
}

object GetCurrentMetricDataRequest {
  @scala.inline
  def apply(
    CurrentMetrics: CurrentMetrics,
    Filters: Filters,
    InstanceId: InstanceId,
    Groupings: Groupings = null,
    MaxResults: js.UndefOr[MaxResult100] = js.undefined,
    NextToken: NextToken = null
  ): GetCurrentMetricDataRequest = {
    val __obj = js.Dynamic.literal(CurrentMetrics = CurrentMetrics, Filters = Filters, InstanceId = InstanceId)
    if (Groupings != null) __obj.updateDynamic("Groupings")(Groupings)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetCurrentMetricDataRequest]
  }
}

