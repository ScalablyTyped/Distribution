package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMetricDataV2Request extends StObject {
  
  /**
    * The timestamp, in UNIX Epoch time format, at which to end the reporting interval for the retrieval of historical metrics data. The time must be later than the start time timestamp. It cannot be later than the current timestamp. The time range between the start and end time must be less than 24 hours.
    */
  var EndTime: js.Date
  
  /**
    * The filters to apply to returned metrics. You can filter on the following resources:   Queues   Routing profiles   Agents   Channels   User hierarchy groups   At least one filter must be passed from queues, routing profiles, agents, or user hierarchy groups. To filter by phone number, see Create a historical metrics report in the Amazon Connect Administrator's Guide. Note the following limits:    Filter keys: A maximum of 5 filter keys are supported in a single request. Valid filter keys: QUEUE | ROUTING_PROFILE | AGENT | CHANNEL | AGENT_HIERARCHY_LEVEL_ONE | AGENT_HIERARCHY_LEVEL_TWO | AGENT_HIERARCHY_LEVEL_THREE | AGENT_HIERARCHY_LEVEL_FOUR | AGENT_HIERARCHY_LEVEL_FIVE     Filter values: A maximum of 100 filter values are supported in a single request. For example, a GetMetricDataV2 request can filter by 50 queues, 35 agents, and 15 routing profiles for a total of 100 filter values. VOICE, CHAT, and TASK are valid filterValue for the CHANNEL filter key.  
    */
  var Filters: FiltersV2List
  
  /**
    * The grouping applied to the metrics that are returned. For example, when results are grouped by queue, the metrics returned are grouped by queue. The values that are returned apply to the metrics for each queue. They are not aggregated for all queues. If no grouping is specified, a summary of all metrics is returned. Valid grouping keys: QUEUE | ROUTING_PROFILE | AGENT | CHANNEL | AGENT_HIERARCHY_LEVEL_ONE | AGENT_HIERARCHY_LEVEL_TWO | AGENT_HIERARCHY_LEVEL_THREE | AGENT_HIERARCHY_LEVEL_FOUR | AGENT_HIERARCHY_LEVEL_FIVE 
    */
  var Groupings: js.UndefOr[GroupingsV2] = js.undefined
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult100] = js.undefined
  
  /**
    * The metrics to retrieve. Specify the name, groupings, and filters for each metric. The following historical metrics are available. For a description of each metric, see Historical metrics definitions in the Amazon Connect Administrator's Guide.  AGENT_ADHERENT_TIME  This metric is available only in Amazon Web Services Regions where Forecasting, capacity planning, and scheduling is available. Unit: Seconds Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy   AGENT_NON_RESPONSE  Unit: Count Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy   AGENT_OCCUPANCY  Unit: Percentage Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy   AGENT_SCHEDULE_ADHERENCE  This metric is available only in Amazon Web Services Regions where Forecasting, capacity planning, and scheduling is available. Unit: Percent Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  AGENT_SCHEDULED_TIME  This metric is available only in Amazon Web Services Regions where Forecasting, capacity planning, and scheduling is available. Unit: Seconds Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  AVG_ABANDON_TIME  Unit: Seconds Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  AVG_AFTER_CONTACT_WORK_TIME  Unit: Seconds Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  AVG_AGENT_CONNECTING_TIME  Unit: Seconds Valid metric filter key: INITIATION_METHOD. For now, this metric only supports the following as INITIATION_METHOD: INBOUND | OUTBOUND | CALLBACK | API  Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  AVG_HANDLE_TIME  Unit: Seconds Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  AVG_HOLD_TIME  Unit: Seconds Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  AVG_INTERACTION_AND_HOLD_TIME  Unit: Seconds Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  AVG_INTERACTION_TIME  Unit: Seconds Valid groupings and filters: Queue, Channel, Routing Profile  AVG_QUEUE_ANSWER_TIME  Unit: Seconds Valid groupings and filters: Queue, Channel, Routing Profile  CONTACTS_ABANDONED  Unit: Count Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  CONTACTS_CREATED  Unit: Count Valid metric filter key: INITIATION_METHOD  Valid groupings and filters: Queue, Channel, Routing Profile  CONTACTS_HANDLED  Unit: Count Valid metric filter key: INITIATION_METHOD, DISCONNECT_REASON  Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  CONTACTS_HOLD_ABANDONS  Unit: Count Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  CONTACTS_QUEUED  Unit: Count Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  CONTACTS_TRANSFERRED_OUT  Unit: Count Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  CONTACTS_TRANSFERRED_OUT_BY_AGENT  Unit: Count Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  CONTACTS_TRANSFERRED_OUT_FROM_QUEUE  Unit: Count Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  MAX_QUEUED_TIME  Unit: Seconds Valid groupings and filters: Queue, Channel, Routing Profile, Agent, Agent Hierarchy  SERVICE_LEVEL  You can include up to 20 SERVICE_LEVEL metrics in a request. Unit: Percent Valid groupings and filters: Queue, Channel, Routing Profile Threshold: For ThresholdValue, enter any whole number from 1 to 604800 (inclusive), in seconds. For Comparison, you must enter LT (for "Less than").   SUM_CONTACTS_ANSWERED_IN_X  Unit: Count Valid groupings and filters: Queue, Channel, Routing Profile Threshold: For ThresholdValue, enter any whole number from 1 to 604800 (inclusive), in seconds. For Comparison, you must enter LT (for "Less than").   SUM_CONTACTS_ABANDONED_IN_X  Unit: Count Valid groupings and filters: Queue, Channel, Routing Profile Threshold: For ThresholdValue, enter any whole number from 1 to 604800 (inclusive), in seconds. For Comparison, you must enter LT (for "Less than").   SUM_CONTACTS_DISCONNECTED   Valid metric filter key: DISCONNECT_REASON  Unit: Count Valid groupings and filters: Queue, Channel, Routing Profile  SUM_RETRY_CALLBACK_ATTEMPTS  Unit: Count Valid groupings and filters: Queue, Channel, Routing Profile  
    */
  var Metrics: MetricsV2
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[NextToken2500] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource. This includes the instanceId an Amazon Connect instance.
    */
  var ResourceArn: ARN
  
  /**
    * The timestamp, in UNIX Epoch time format, at which to start the reporting interval for the retrieval of historical metrics data. The time must be before the end time timestamp. The time range between the start and end time must be less than 24 hours. The start time cannot be earlier than 35 days before the time of the request. Historical metrics are available for 35 days.
    */
  var StartTime: js.Date
}
object GetMetricDataV2Request {
  
  inline def apply(EndTime: js.Date, Filters: FiltersV2List, Metrics: MetricsV2, ResourceArn: ARN, StartTime: js.Date): GetMetricDataV2Request = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Metrics = Metrics.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricDataV2Request]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMetricDataV2Request] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: FiltersV2List): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: FilterV2*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setGroupings(value: GroupingsV2): Self = StObject.set(x, "Groupings", value.asInstanceOf[js.Any])
    
    inline def setGroupingsUndefined: Self = StObject.set(x, "Groupings", js.undefined)
    
    inline def setGroupingsVarargs(value: GroupingV2*): Self = StObject.set(x, "Groupings", js.Array(value*))
    
    inline def setMaxResults(value: MaxResult100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMetrics(value: MetricsV2): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsVarargs(value: MetricV2*): Self = StObject.set(x, "Metrics", js.Array(value*))
    
    inline def setNextToken(value: NextToken2500): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceArn(value: ARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
