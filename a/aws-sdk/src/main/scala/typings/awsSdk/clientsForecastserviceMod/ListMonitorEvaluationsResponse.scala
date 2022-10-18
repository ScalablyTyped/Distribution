package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitorEvaluationsResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.NextToken] = js.undefined
  
  /**
    * The monitoring results and predictor events collected by the monitor resource during different windows of time. For information about monitoring see Viewing Monitoring Results. For more information about retrieving monitoring results see Viewing Monitoring Results.
    */
  var PredictorMonitorEvaluations: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.PredictorMonitorEvaluations] = js.undefined
}
object ListMonitorEvaluationsResponse {
  
  inline def apply(): ListMonitorEvaluationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMonitorEvaluationsResponse]
  }
  
  extension [Self <: ListMonitorEvaluationsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPredictorMonitorEvaluations(value: PredictorMonitorEvaluations): Self = StObject.set(x, "PredictorMonitorEvaluations", value.asInstanceOf[js.Any])
    
    inline def setPredictorMonitorEvaluationsUndefined: Self = StObject.set(x, "PredictorMonitorEvaluations", js.undefined)
    
    inline def setPredictorMonitorEvaluationsVarargs(value: PredictorMonitorEvaluation*): Self = StObject.set(x, "PredictorMonitorEvaluations", js.Array(value*))
  }
}
