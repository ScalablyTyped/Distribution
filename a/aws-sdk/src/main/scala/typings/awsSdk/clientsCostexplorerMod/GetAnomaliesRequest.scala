package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnomaliesRequest extends StObject {
  
  /**
    * Assigns the start and end dates for retrieving cost anomalies. The returned anomaly object will have an AnomalyEndDate in the specified time range. 
    */
  var DateInterval: AnomalyDateInterval
  
  /**
    * Filters anomaly results by the feedback field on the anomaly object. 
    */
  var Feedback: js.UndefOr[AnomalyFeedbackType] = js.undefined
  
  /**
    * The number of entries a paginated response contains. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * Retrieves all of the cost anomalies detected for a specific cost anomaly monitor Amazon Resource Name (ARN). 
    */
  var MonitorArn: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  
  /**
    * Filters anomaly results by the total impact field on the anomaly object. For example, you can filter anomalies GREATER_THAN 200.00 to retrieve anomalies, with an estimated dollar impact greater than 200. 
    */
  var TotalImpact: js.UndefOr[TotalImpactFilter] = js.undefined
}
object GetAnomaliesRequest {
  
  inline def apply(DateInterval: AnomalyDateInterval): GetAnomaliesRequest = {
    val __obj = js.Dynamic.literal(DateInterval = DateInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnomaliesRequest]
  }
  
  extension [Self <: GetAnomaliesRequest](x: Self) {
    
    inline def setDateInterval(value: AnomalyDateInterval): Self = StObject.set(x, "DateInterval", value.asInstanceOf[js.Any])
    
    inline def setFeedback(value: AnomalyFeedbackType): Self = StObject.set(x, "Feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "Feedback", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMonitorArn(value: GenericString): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
    
    inline def setMonitorArnUndefined: Self = StObject.set(x, "MonitorArn", js.undefined)
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setTotalImpact(value: TotalImpactFilter): Self = StObject.set(x, "TotalImpact", value.asInstanceOf[js.Any])
    
    inline def setTotalImpactUndefined: Self = StObject.set(x, "TotalImpact", js.undefined)
  }
}
