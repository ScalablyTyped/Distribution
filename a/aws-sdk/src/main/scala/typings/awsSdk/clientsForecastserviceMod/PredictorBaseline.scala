package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictorBaseline extends StObject {
  
  /**
    * The initial accuracy metrics for the predictor. Use these metrics as a baseline for comparison purposes as you use your predictor and the metrics change.
    */
  var BaselineMetrics: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.BaselineMetrics] = js.undefined
}
object PredictorBaseline {
  
  inline def apply(): PredictorBaseline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictorBaseline]
  }
  
  extension [Self <: PredictorBaseline](x: Self) {
    
    inline def setBaselineMetrics(value: BaselineMetrics): Self = StObject.set(x, "BaselineMetrics", value.asInstanceOf[js.Any])
    
    inline def setBaselineMetricsUndefined: Self = StObject.set(x, "BaselineMetrics", js.undefined)
    
    inline def setBaselineMetricsVarargs(value: BaselineMetric*): Self = StObject.set(x, "BaselineMetrics", js.Array(value*))
  }
}
