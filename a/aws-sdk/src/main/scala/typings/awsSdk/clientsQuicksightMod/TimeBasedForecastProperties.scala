package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeBasedForecastProperties extends StObject {
  
  /**
    * The lower boundary setup of a forecast computation.
    */
  var LowerBoundary: js.UndefOr[Double] = js.undefined
  
  /**
    * The periods backward setup of a forecast computation.
    */
  var PeriodsBackward: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PeriodsBackward] = js.undefined
  
  /**
    * The periods forward setup of a forecast computation.
    */
  var PeriodsForward: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PeriodsForward] = js.undefined
  
  /**
    * The prediction interval setup of a forecast computation.
    */
  var PredictionInterval: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PredictionInterval] = js.undefined
  
  /**
    * The seasonality setup of a forecast computation. Choose one of the following options:    NULL: The input is set to NULL.    NON_NULL: The input is set to a custom value.  
    */
  var Seasonality: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Seasonality] = js.undefined
  
  /**
    * The upper boundary setup of a forecast computation.
    */
  var UpperBoundary: js.UndefOr[Double] = js.undefined
}
object TimeBasedForecastProperties {
  
  inline def apply(): TimeBasedForecastProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeBasedForecastProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeBasedForecastProperties] (val x: Self) extends AnyVal {
    
    inline def setLowerBoundary(value: Double): Self = StObject.set(x, "LowerBoundary", value.asInstanceOf[js.Any])
    
    inline def setLowerBoundaryUndefined: Self = StObject.set(x, "LowerBoundary", js.undefined)
    
    inline def setPeriodsBackward(value: PeriodsBackward): Self = StObject.set(x, "PeriodsBackward", value.asInstanceOf[js.Any])
    
    inline def setPeriodsBackwardUndefined: Self = StObject.set(x, "PeriodsBackward", js.undefined)
    
    inline def setPeriodsForward(value: PeriodsForward): Self = StObject.set(x, "PeriodsForward", value.asInstanceOf[js.Any])
    
    inline def setPeriodsForwardUndefined: Self = StObject.set(x, "PeriodsForward", js.undefined)
    
    inline def setPredictionInterval(value: PredictionInterval): Self = StObject.set(x, "PredictionInterval", value.asInstanceOf[js.Any])
    
    inline def setPredictionIntervalUndefined: Self = StObject.set(x, "PredictionInterval", js.undefined)
    
    inline def setSeasonality(value: Seasonality): Self = StObject.set(x, "Seasonality", value.asInstanceOf[js.Any])
    
    inline def setSeasonalityUndefined: Self = StObject.set(x, "Seasonality", js.undefined)
    
    inline def setUpperBoundary(value: Double): Self = StObject.set(x, "UpperBoundary", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundaryUndefined: Self = StObject.set(x, "UpperBoundary", js.undefined)
  }
}
