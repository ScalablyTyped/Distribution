package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCurrentMetricDataRequest extends StObject {
  
  /**
    * The metrics to retrieve. Specify the name and unit for each metric. The following metrics are available. For a description of all the metrics, see Real-time Metrics Definitions in the Amazon Connect Administrator Guide.  AGENTS_AFTER_CONTACT_WORK  Unit: COUNT Name in real-time metrics report: ACW   AGENTS_AVAILABLE  Unit: COUNT Name in real-time metrics report: Available   AGENTS_ERROR  Unit: COUNT Name in real-time metrics report: Error   AGENTS_NON_PRODUCTIVE  Unit: COUNT Name in real-time metrics report: NPT (Non-Productive Time)   AGENTS_ON_CALL  Unit: COUNT Name in real-time metrics report: On contact   AGENTS_ON_CONTACT  Unit: COUNT Name in real-time metrics report: On contact   AGENTS_ONLINE  Unit: COUNT Name in real-time metrics report: Online   AGENTS_STAFFED  Unit: COUNT Name in real-time metrics report: Staffed   CONTACTS_IN_QUEUE  Unit: COUNT Name in real-time metrics report: In queue   CONTACTS_SCHEDULED  Unit: COUNT Name in real-time metrics report: Scheduled   OLDEST_CONTACT_AGE  Unit: SECONDS When you use groupings, Unit says SECONDS and the Value is returned in SECONDS.  When you do not use groupings, Unit says SECONDS but the Value is returned in MILLISECONDS. For example, if you get a response like this:  { "Metric": { "Name": "OLDEST_CONTACT_AGE", "Unit": "SECONDS" }, "Value": 24113.0 } The actual OLDEST_CONTACT_AGE is 24 seconds. Name in real-time metrics report: Oldest   SLOTS_ACTIVE  Unit: COUNT Name in real-time metrics report: Active   SLOTS_AVAILABLE  Unit: COUNT Name in real-time metrics report: Availability   
    */
  var CurrentMetrics: typings.awsSdk.clientsConnectMod.CurrentMetrics
  
  /**
    * The filters to apply to returned metrics. You can filter up to the following limits:   Queues: 100   Routing profiles: 100   Channels: 3 (VOICE, CHAT, and TASK channels are supported.)   Metric data is retrieved only for the resources associated with the queues or routing profiles, and by any channels included in the filter. (You cannot filter by both queue AND routing profile.) You can include both resource IDs and resource ARNs in the same request.  Currently tagging is only supported on the resources that are passed in the filter.
    */
  var Filters: typings.awsSdk.clientsConnectMod.Filters
  
  /**
    * The grouping applied to the metrics returned. For example, when grouped by QUEUE, the metrics returned apply to each queue rather than aggregated for all queues.    If you group by CHANNEL, you should include a Channels filter. VOICE, CHAT, and TASK channels are supported.   If you group by ROUTING_PROFILE, you must include either a queue or routing profile filter. In addition, a routing profile filter is required for metrics CONTACTS_SCHEDULED, CONTACTS_IN_QUEUE, and  OLDEST_CONTACT_AGE.   If no Grouping is included in the request, a summary of metrics is returned.  
    */
  var Groupings: js.UndefOr[typings.awsSdk.clientsConnectMod.Groupings] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult100] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must use the same request parameters as the request that generated the token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * The way to sort the resulting response based on metrics. You can enter one sort criteria. By default resources are sorted based on AGENTS_ONLINE, DESCENDING. The metric collection is sorted based on the input metrics. Note the following:   Sorting on SLOTS_ACTIVE and SLOTS_AVAILABLE is not supported.  
    */
  var SortCriteria: js.UndefOr[CurrentMetricSortCriteriaMaxOne] = js.undefined
}
object GetCurrentMetricDataRequest {
  
  inline def apply(CurrentMetrics: CurrentMetrics, Filters: Filters, InstanceId: InstanceId): GetCurrentMetricDataRequest = {
    val __obj = js.Dynamic.literal(CurrentMetrics = CurrentMetrics.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCurrentMetricDataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCurrentMetricDataRequest] (val x: Self) extends AnyVal {
    
    inline def setCurrentMetrics(value: CurrentMetrics): Self = StObject.set(x, "CurrentMetrics", value.asInstanceOf[js.Any])
    
    inline def setCurrentMetricsVarargs(value: CurrentMetric*): Self = StObject.set(x, "CurrentMetrics", js.Array(value*))
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setGroupings(value: Groupings): Self = StObject.set(x, "Groupings", value.asInstanceOf[js.Any])
    
    inline def setGroupingsUndefined: Self = StObject.set(x, "Groupings", js.undefined)
    
    inline def setGroupingsVarargs(value: Grouping*): Self = StObject.set(x, "Groupings", js.Array(value*))
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResult100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortCriteria(value: CurrentMetricSortCriteriaMaxOne): Self = StObject.set(x, "SortCriteria", value.asInstanceOf[js.Any])
    
    inline def setSortCriteriaUndefined: Self = StObject.set(x, "SortCriteria", js.undefined)
    
    inline def setSortCriteriaVarargs(value: CurrentMetricSortCriteria*): Self = StObject.set(x, "SortCriteria", js.Array(value*))
  }
}
