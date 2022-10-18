package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorMetric extends StObject {
  
  /**
    *  The Forecast type used to compute WAPE, MAPE, MASE, and RMSE. 
    */
  var ForecastType: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ForecastType] = js.undefined
  
  /**
    * The Mean Absolute Percentage Error (MAPE)
    */
  var MAPE: js.UndefOr[Double] = js.undefined
  
  /**
    * The Mean Absolute Scaled Error (MASE)
    */
  var MASE: js.UndefOr[Double] = js.undefined
  
  /**
    *  The root-mean-square error (RMSE). 
    */
  var RMSE: js.UndefOr[Double] = js.undefined
  
  /**
    *  The weighted absolute percentage error (WAPE). 
    */
  var WAPE: js.UndefOr[Double] = js.undefined
}
object ErrorMetric {
  
  inline def apply(): ErrorMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorMetric]
  }
  
  extension [Self <: ErrorMetric](x: Self) {
    
    inline def setForecastType(value: ForecastType): Self = StObject.set(x, "ForecastType", value.asInstanceOf[js.Any])
    
    inline def setForecastTypeUndefined: Self = StObject.set(x, "ForecastType", js.undefined)
    
    inline def setMAPE(value: Double): Self = StObject.set(x, "MAPE", value.asInstanceOf[js.Any])
    
    inline def setMAPEUndefined: Self = StObject.set(x, "MAPE", js.undefined)
    
    inline def setMASE(value: Double): Self = StObject.set(x, "MASE", value.asInstanceOf[js.Any])
    
    inline def setMASEUndefined: Self = StObject.set(x, "MASE", js.undefined)
    
    inline def setRMSE(value: Double): Self = StObject.set(x, "RMSE", value.asInstanceOf[js.Any])
    
    inline def setRMSEUndefined: Self = StObject.set(x, "RMSE", js.undefined)
    
    inline def setWAPE(value: Double): Self = StObject.set(x, "WAPE", value.asInstanceOf[js.Any])
    
    inline def setWAPEUndefined: Self = StObject.set(x, "WAPE", js.undefined)
  }
}
