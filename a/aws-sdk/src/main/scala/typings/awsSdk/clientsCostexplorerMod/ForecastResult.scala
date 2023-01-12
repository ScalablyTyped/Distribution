package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForecastResult extends StObject {
  
  /**
    * The mean value of the forecast.
    */
  var MeanValue: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The lower limit for the prediction interval. 
    */
  var PredictionIntervalLowerBound: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The upper limit for the prediction interval. 
    */
  var PredictionIntervalUpperBound: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The period of time that the forecast covers.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.undefined
}
object ForecastResult {
  
  inline def apply(): ForecastResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForecastResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForecastResult] (val x: Self) extends AnyVal {
    
    inline def setMeanValue(value: GenericString): Self = StObject.set(x, "MeanValue", value.asInstanceOf[js.Any])
    
    inline def setMeanValueUndefined: Self = StObject.set(x, "MeanValue", js.undefined)
    
    inline def setPredictionIntervalLowerBound(value: GenericString): Self = StObject.set(x, "PredictionIntervalLowerBound", value.asInstanceOf[js.Any])
    
    inline def setPredictionIntervalLowerBoundUndefined: Self = StObject.set(x, "PredictionIntervalLowerBound", js.undefined)
    
    inline def setPredictionIntervalUpperBound(value: GenericString): Self = StObject.set(x, "PredictionIntervalUpperBound", value.asInstanceOf[js.Any])
    
    inline def setPredictionIntervalUpperBoundUndefined: Self = StObject.set(x, "PredictionIntervalUpperBound", js.undefined)
    
    inline def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    inline def setTimePeriodUndefined: Self = StObject.set(x, "TimePeriod", js.undefined)
  }
}
