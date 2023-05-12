package typings.awsSdk.clientsPiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceMetricsRequest extends StObject {
  
  /**
    * The date and time specifying the end of the requested time series query range. The value specified is exclusive. Thus, the command returns data points less than (but not equal to) EndTime. The value for EndTime must be later than the value for StartTime.
    */
  var EndTime: js.Date
  
  /**
    * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights gathers metrics from this data source. In the console, the identifier is shown as ResourceID. When you call DescribeDBInstances, the identifier is returned as DbiResourceId. To use a DB instance as a data source, specify its DbiResourceId value. For example, specify db-ABCDEFGHIJKLMNOPQRSTU1VW2X.
    */
  var Identifier: RequestString
  
  /**
    * The maximum number of items to return in the response. If more items exist than the specified MaxRecords value, a pagination token is included in the response so that the remaining results can be retrieved. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsPiMod.MaxResults] = js.undefined
  
  /**
    * An array of one or more queries to perform. Each query must specify a Performance Insights metric, and can optionally specify aggregation and filtering criteria.
    */
  var MetricQueries: MetricQueryList
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPiMod.NextToken] = js.undefined
  
  /**
    * The returned timestamp which is the start or end time of the time periods. The default value is END_TIME.
    */
  var PeriodAlignment: js.UndefOr[typings.awsSdk.clientsPiMod.PeriodAlignment] = js.undefined
  
  /**
    * The granularity, in seconds, of the data points returned from Performance Insights. A period can be as short as one second, or as long as one day (86400 seconds). Valid values are:    1 (one second)    60 (one minute)    300 (five minutes)    3600 (one hour)    86400 (twenty-four hours)   If you don't specify PeriodInSeconds, then Performance Insights will choose a value for you, with a goal of returning roughly 100-200 data points in the response.
    */
  var PeriodInSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon Web Services service for which Performance Insights returns metrics. Valid values are as follows:    RDS     DOCDB   
    */
  var ServiceType: typings.awsSdk.clientsPiMod.ServiceType
  
  /**
    * The date and time specifying the beginning of the requested time series query range. You can't specify a StartTime that is earlier than 7 days ago. By default, Performance Insights has 7 days of retention, but you can extend this range up to 2 years. The value specified is inclusive. Thus, the command returns data points equal to or greater than StartTime. The value for StartTime must be earlier than the value for EndTime.
    */
  var StartTime: js.Date
}
object GetResourceMetricsRequest {
  
  inline def apply(
    EndTime: js.Date,
    Identifier: RequestString,
    MetricQueries: MetricQueryList,
    ServiceType: ServiceType,
    StartTime: js.Date
  ): GetResourceMetricsRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], MetricQueries = MetricQueries.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceMetricsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourceMetricsRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: RequestString): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMetricQueries(value: MetricQueryList): Self = StObject.set(x, "MetricQueries", value.asInstanceOf[js.Any])
    
    inline def setMetricQueriesVarargs(value: MetricQuery*): Self = StObject.set(x, "MetricQueries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPeriodAlignment(value: PeriodAlignment): Self = StObject.set(x, "PeriodAlignment", value.asInstanceOf[js.Any])
    
    inline def setPeriodAlignmentUndefined: Self = StObject.set(x, "PeriodAlignment", js.undefined)
    
    inline def setPeriodInSeconds(value: Integer): Self = StObject.set(x, "PeriodInSeconds", value.asInstanceOf[js.Any])
    
    inline def setPeriodInSecondsUndefined: Self = StObject.set(x, "PeriodInSeconds", js.undefined)
    
    inline def setServiceType(value: ServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
