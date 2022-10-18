package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFeedbackRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the anomaly detector.
    */
  var AnomalyDetectorArn: Arn
  
  /**
    * The anomalous metric and group ID.
    */
  var AnomalyGroupTimeSeriesFeedback: AnomalyGroupTimeSeries
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.MaxResults] = js.undefined
  
  /**
    * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.NextToken] = js.undefined
}
object GetFeedbackRequest {
  
  inline def apply(AnomalyDetectorArn: Arn, AnomalyGroupTimeSeriesFeedback: AnomalyGroupTimeSeries): GetFeedbackRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any], AnomalyGroupTimeSeriesFeedback = AnomalyGroupTimeSeriesFeedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFeedbackRequest]
  }
  
  extension [Self <: GetFeedbackRequest](x: Self) {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setAnomalyGroupTimeSeriesFeedback(value: AnomalyGroupTimeSeries): Self = StObject.set(x, "AnomalyGroupTimeSeriesFeedback", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
