package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQueryResponse extends StObject {
  
  /**
    * The URI for the S3 bucket where CloudTrail delivered query results, if applicable.
    */
  var DeliveryS3Uri: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.DeliveryS3Uri] = js.undefined
  
  /**
    * The delivery status.
    */
  var DeliveryStatus: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.DeliveryStatus] = js.undefined
  
  /**
    * The error message returned if a query failed.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.ErrorMessage] = js.undefined
  
  /**
    * The ID of the query.
    */
  var QueryId: js.UndefOr[UUID] = js.undefined
  
  /**
    * Metadata about a query, including the number of events that were matched, the total number of events scanned, the query run time in milliseconds, and the query's creation time.
    */
  var QueryStatistics: js.UndefOr[QueryStatisticsForDescribeQuery] = js.undefined
  
  /**
    * The status of a query. Values for QueryStatus include QUEUED, RUNNING, FINISHED, FAILED, TIMED_OUT, or CANCELLED 
    */
  var QueryStatus: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.QueryStatus] = js.undefined
  
  /**
    * The SQL code of a query.
    */
  var QueryString: js.UndefOr[QueryStatement] = js.undefined
}
object DescribeQueryResponse {
  
  inline def apply(): DescribeQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQueryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeQueryResponse] (val x: Self) extends AnyVal {
    
    inline def setDeliveryS3Uri(value: DeliveryS3Uri): Self = StObject.set(x, "DeliveryS3Uri", value.asInstanceOf[js.Any])
    
    inline def setDeliveryS3UriUndefined: Self = StObject.set(x, "DeliveryS3Uri", js.undefined)
    
    inline def setDeliveryStatus(value: DeliveryStatus): Self = StObject.set(x, "DeliveryStatus", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStatusUndefined: Self = StObject.set(x, "DeliveryStatus", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setQueryId(value: UUID): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "QueryId", js.undefined)
    
    inline def setQueryStatistics(value: QueryStatisticsForDescribeQuery): Self = StObject.set(x, "QueryStatistics", value.asInstanceOf[js.Any])
    
    inline def setQueryStatisticsUndefined: Self = StObject.set(x, "QueryStatistics", js.undefined)
    
    inline def setQueryStatus(value: QueryStatus): Self = StObject.set(x, "QueryStatus", value.asInstanceOf[js.Any])
    
    inline def setQueryStatusUndefined: Self = StObject.set(x, "QueryStatus", js.undefined)
    
    inline def setQueryString(value: QueryStatement): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "QueryString", js.undefined)
  }
}
