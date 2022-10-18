package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSnapshotsRequest extends StObject {
  
  /**
    * The identifier of the index to get search metrics data.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * The time interval or time window to get search metrics data. The time interval uses the time zone of your index. You can view data in the following time windows:    THIS_WEEK: The current week, starting on the Sunday and ending on the day before the current date.    ONE_WEEK_AGO: The previous week, starting on the Sunday and ending on the following Saturday.    TWO_WEEKS_AGO: The week before the previous week, starting on the Sunday and ending on the following Saturday.    THIS_MONTH: The current month, starting on the first day of the month and ending on the day before the current date.    ONE_MONTH_AGO: The previous month, starting on the first day of the month and ending on the last day of the month.    TWO_MONTHS_AGO: The month before the previous month, starting on the first day of the month and ending on last day of the month.  
    */
  var Interval: typings.awsSdk.clientsKendraMod.Interval
  
  /**
    * The maximum number of returned data for the metric.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The metric you want to retrieve. You can specify only one metric per call. For more information about the metrics you can view, see Gaining insights with search analytics.
    */
  var MetricType: typings.awsSdk.clientsKendraMod.MetricType
  
  /**
    * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a pagination token in the response. You can use this pagination token to retrieve the next set of search metrics data.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKendraMod.NextToken] = js.undefined
}
object GetSnapshotsRequest {
  
  inline def apply(IndexId: IndexId, Interval: Interval, MetricType: MetricType): GetSnapshotsRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], Interval = Interval.asInstanceOf[js.Any], MetricType = MetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotsRequest]
  }
  
  extension [Self <: GetSnapshotsRequest](x: Self) {
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: Interval): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMetricType(value: MetricType): Self = StObject.set(x, "MetricType", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
