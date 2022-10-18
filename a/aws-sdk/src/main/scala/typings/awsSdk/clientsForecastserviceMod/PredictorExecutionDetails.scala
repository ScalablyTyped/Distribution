package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictorExecutionDetails extends StObject {
  
  /**
    * An array of the backtests performed to evaluate the accuracy of the predictor against a particular algorithm. The NumberOfBacktestWindows from the object determines the number of windows in the array.
    */
  var PredictorExecutions: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.PredictorExecutions] = js.undefined
}
object PredictorExecutionDetails {
  
  inline def apply(): PredictorExecutionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictorExecutionDetails]
  }
  
  extension [Self <: PredictorExecutionDetails](x: Self) {
    
    inline def setPredictorExecutions(value: PredictorExecutions): Self = StObject.set(x, "PredictorExecutions", value.asInstanceOf[js.Any])
    
    inline def setPredictorExecutionsUndefined: Self = StObject.set(x, "PredictorExecutions", js.undefined)
    
    inline def setPredictorExecutionsVarargs(value: PredictorExecution*): Self = StObject.set(x, "PredictorExecutions", js.Array(value*))
  }
}
