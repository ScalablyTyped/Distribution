package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetMetricDataResponse extends StObject {
  
  /**
    * A list of MetricDataError encountered while processing your metric data batch request.
    */
  var Errors: js.UndefOr[MetricDataErrorList] = js.undefined
  
  /**
    * A list of successfully retrieved MetricDataResult.
    */
  var Results: js.UndefOr[MetricDataResultList] = js.undefined
}
object BatchGetMetricDataResponse {
  
  inline def apply(): BatchGetMetricDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetMetricDataResponse]
  }
  
  extension [Self <: BatchGetMetricDataResponse](x: Self) {
    
    inline def setErrors(value: MetricDataErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: MetricDataError*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setResults(value: MetricDataResultList): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    inline def setResultsVarargs(value: MetricDataResult*): Self = StObject.set(x, "Results", js.Array(value*))
  }
}
