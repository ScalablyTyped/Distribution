package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFeedbackResponse extends StObject {
  
  /**
    * Feedback for an anomalous metric.
    */
  var AnomalyGroupTimeSeriesFeedback: js.UndefOr[TimeSeriesFeedbackList] = js.undefined
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.NextToken] = js.undefined
}
object GetFeedbackResponse {
  
  inline def apply(): GetFeedbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFeedbackResponse]
  }
  
  extension [Self <: GetFeedbackResponse](x: Self) {
    
    inline def setAnomalyGroupTimeSeriesFeedback(value: TimeSeriesFeedbackList): Self = StObject.set(x, "AnomalyGroupTimeSeriesFeedback", value.asInstanceOf[js.Any])
    
    inline def setAnomalyGroupTimeSeriesFeedbackUndefined: Self = StObject.set(x, "AnomalyGroupTimeSeriesFeedback", js.undefined)
    
    inline def setAnomalyGroupTimeSeriesFeedbackVarargs(value: TimeSeriesFeedback*): Self = StObject.set(x, "AnomalyGroupTimeSeriesFeedback", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
