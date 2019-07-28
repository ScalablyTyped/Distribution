package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMetricDataRequest extends js.Object {
  /**
    * The timestamp, in UNIX Epoch time format, at which to end the reporting interval for the retrieval of historical metrics data. The time must be specified using an interval of 5 minutes, such as 11:00, 11:05, 11:10, and must be later than the StartTime timestamp. The time range between StartTime and EndTime must be less than 24 hours.
    */
  var EndTime: timestamp
  /**
    * A Filters object that contains a list of queue IDs or queue ARNs, up to 100, or a list of Channels to use to filter the metrics returned in the response. Metric data is retrieved only for the resources associated with the IDs, ARNs, or Channels included in the filter. You can use both IDs and ARNs together in a request. Only VOICE is supported for Channel. To find the ARN for a queue, open the queue you want to use in the Amazon Connect Queue editor. The ARN for the queue is displayed in the address bar as part of the URL. For example, the queue ARN is the set of characters at the end of the URL, after 'id=' such as arn:aws:connect:us-east-1:270923740243:instance/78fb859d-1b7d-44b1-8aa3-12f0835c5855/queue/1d1a4575-9618-40ab-bbeb-81e45795fe61. The queue ID is also included in the URL, and is the string after 'queue/'.
    */
  var Filters: typings.awsDashSdk.clientsConnectMod.Filters
  /**
    * The grouping applied to the metrics returned. For example, when results are grouped by queueId, the metrics returned are grouped by queue. The values returned apply to the metrics for each queue rather than aggregated for all queues. The current version supports grouping by Queue If no Grouping is included in the request, a summary of HistoricalMetrics for all queues is returned.
    */
  var Groupings: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Groupings] = js.undefined
  /**
    * A list of HistoricalMetric objects that contain the metrics to retrieve with the request. A HistoricalMetric object contains: HistoricalMetricName, Statistic, Threshold, and Unit. You must list each metric to retrieve data for in the request. For each historical metric you include in the request, you must include a Unit and a Statistic.  The following historical metrics are available:  CONTACTS_QUEUED  Unit: COUNT Statistic: SUM  CONTACTS_HANDLED  Unit: COUNT Statistics: SUM  CONTACTS_ABANDONED  Unit: COUNT Statistics: SUM  CONTACTS_CONSULTED  Unit: COUNT Statistics: SUM  CONTACTS_AGENT_HUNG_UP_FIRST  Unit: COUNT Statistics: SUM  CONTACTS_HANDLED_INCOMING  Unit: COUNT Statistics: SUM  CONTACTS_HANDLED_OUTBOUND  Unit: COUNT Statistics: SUM  CONTACTS_HOLD_ABANDONS  Unit: COUNT Statistics: SUM  CONTACTS_TRANSFERRED_IN  Unit: COUNT Statistics: SUM  CONTACTS_TRANSFERRED_OUT  Unit: COUNT Statistics: SUM  CONTACTS_TRANSFERRED_IN_FROM_QUEUE  Unit: COUNT Statistics: SUM  CONTACTS_TRANSFERRED_OUT_FROM_QUEUE  Unit: COUNT Statistics: SUM  CALLBACK_CONTACTS_HANDLED  Unit: COUNT Statistics: SUM  CALLBACK_CONTACTS_HANDLED  Unit: COUNT Statistics: SUM  API_CONTACTS_HANDLED  Unit: COUNT Statistics: SUM  CONTACTS_MISSED  Unit: COUNT Statistics: SUM  OCCUPANCY  Unit: PERCENT Statistics: AVG  HANDLE_TIME  Unit: SECONDS Statistics: AVG  AFTER_CONTACT_WORK_TIME  Unit: SECONDS Statistics: AVG  QUEUED_TIME  Unit: SECONDS Statistics: MAX  ABANDON_TIME  Unit: COUNT Statistics: SUM  QUEUE_ANSWER_TIME  Unit: SECONDS Statistics: AVG  HOLD_TIME  Unit: SECONDS Statistics: AVG  INTERACTION_TIME  Unit: SECONDS Statistics: AVG  INTERACTION_AND_HOLD_TIME  Unit: SECONDS Statistics: AVG  SERVICE_LEVEL  Unit: PERCENT Statistics: AVG Threshold: Only "Less than" comparisons are supported, with the following service level thresholds: 15, 20, 25, 30, 45, 60, 90, 120, 180, 240, 300, 600  
    */
  var HistoricalMetrics: typings.awsDashSdk.clientsConnectMod.HistoricalMetrics
  /**
    * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
    */
  var InstanceId: typings.awsDashSdk.clientsConnectMod.InstanceId
  /**
    * Indicates the maximum number of results to return per page in the response, between 1-100.
    */
  var MaxResults: js.UndefOr[MaxResult100] = js.undefined
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConnectMod.NextToken] = js.undefined
  /**
    * The timestamp, in UNIX Epoch time format, at which to start the reporting interval for the retrieval of historical metrics data. The time must be specified using a multiple of 5 minutes, such as 10:05, 10:10, 10:15.  StartTime cannot be earlier than 24 hours before the time of the request. Historical metrics are available in Amazon Connect only for 24 hours.
    */
  var StartTime: timestamp
}

object GetMetricDataRequest {
  @scala.inline
  def apply(
    EndTime: timestamp,
    Filters: Filters,
    HistoricalMetrics: HistoricalMetrics,
    InstanceId: InstanceId,
    StartTime: timestamp,
    Groupings: Groupings = null,
    MaxResults: js.UndefOr[MaxResult100] = js.undefined,
    NextToken: NextToken = null
  ): GetMetricDataRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime, Filters = Filters, HistoricalMetrics = HistoricalMetrics, InstanceId = InstanceId, StartTime = StartTime)
    if (Groupings != null) __obj.updateDynamic("Groupings")(Groupings)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetMetricDataRequest]
  }
}

