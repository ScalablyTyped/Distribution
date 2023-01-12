package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Baseline extends StObject {
  
  /**
    * The initial accuracy metrics for the predictor you are monitoring. Use these metrics as a baseline for comparison purposes as you use your predictor and the metrics change.
    */
  var PredictorBaseline: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.PredictorBaseline] = js.undefined
}
object Baseline {
  
  inline def apply(): Baseline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Baseline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Baseline] (val x: Self) extends AnyVal {
    
    inline def setPredictorBaseline(value: PredictorBaseline): Self = StObject.set(x, "PredictorBaseline", value.asInstanceOf[js.Any])
    
    inline def setPredictorBaselineUndefined: Self = StObject.set(x, "PredictorBaseline", js.undefined)
  }
}
