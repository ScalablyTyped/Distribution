package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForecastComputation extends StObject {
  
  /**
    * The ID for a computation.
    */
  var ComputationId: ShortRestrictiveResourceId
  
  /**
    * The custom seasonality value setup of a forecast computation.
    */
  var CustomSeasonalityValue: js.UndefOr[ForecastComputationCustomSeasonalityValue] = js.undefined
  
  /**
    * The lower boundary setup of a forecast computation.
    */
  var LowerBoundary: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of a computation.
    */
  var Name: js.UndefOr[String] = js.undefined
  
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
    * The seasonality setup of a forecast computation. Choose one of the following options:    AUTOMATIC     CUSTOM: Checks the custom seasonality value.  
    */
  var Seasonality: js.UndefOr[ForecastComputationSeasonality] = js.undefined
  
  /**
    * The time field that is used in a computation.
    */
  var Time: DimensionField
  
  /**
    * The upper boundary setup of a forecast computation.
    */
  var UpperBoundary: js.UndefOr[Double] = js.undefined
  
  /**
    * The value field that is used in a computation.
    */
  var Value: js.UndefOr[MeasureField] = js.undefined
}
object ForecastComputation {
  
  inline def apply(ComputationId: ShortRestrictiveResourceId, Time: DimensionField): ForecastComputation = {
    val __obj = js.Dynamic.literal(ComputationId = ComputationId.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForecastComputation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForecastComputation] (val x: Self) extends AnyVal {
    
    inline def setComputationId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ComputationId", value.asInstanceOf[js.Any])
    
    inline def setCustomSeasonalityValue(value: ForecastComputationCustomSeasonalityValue): Self = StObject.set(x, "CustomSeasonalityValue", value.asInstanceOf[js.Any])
    
    inline def setCustomSeasonalityValueUndefined: Self = StObject.set(x, "CustomSeasonalityValue", js.undefined)
    
    inline def setLowerBoundary(value: Double): Self = StObject.set(x, "LowerBoundary", value.asInstanceOf[js.Any])
    
    inline def setLowerBoundaryUndefined: Self = StObject.set(x, "LowerBoundary", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPeriodsBackward(value: PeriodsBackward): Self = StObject.set(x, "PeriodsBackward", value.asInstanceOf[js.Any])
    
    inline def setPeriodsBackwardUndefined: Self = StObject.set(x, "PeriodsBackward", js.undefined)
    
    inline def setPeriodsForward(value: PeriodsForward): Self = StObject.set(x, "PeriodsForward", value.asInstanceOf[js.Any])
    
    inline def setPeriodsForwardUndefined: Self = StObject.set(x, "PeriodsForward", js.undefined)
    
    inline def setPredictionInterval(value: PredictionInterval): Self = StObject.set(x, "PredictionInterval", value.asInstanceOf[js.Any])
    
    inline def setPredictionIntervalUndefined: Self = StObject.set(x, "PredictionInterval", js.undefined)
    
    inline def setSeasonality(value: ForecastComputationSeasonality): Self = StObject.set(x, "Seasonality", value.asInstanceOf[js.Any])
    
    inline def setSeasonalityUndefined: Self = StObject.set(x, "Seasonality", js.undefined)
    
    inline def setTime(value: DimensionField): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundary(value: Double): Self = StObject.set(x, "UpperBoundary", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundaryUndefined: Self = StObject.set(x, "UpperBoundary", js.undefined)
    
    inline def setValue(value: MeasureField): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
