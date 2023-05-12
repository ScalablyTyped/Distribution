package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturizationConfig extends StObject {
  
  /**
    * An array of featurization (transformation) information for the fields of a dataset.
    */
  var Featurizations: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Featurizations] = js.undefined
  
  /**
    * An array of dimension (field) names that specify how to group the generated forecast. For example, suppose that you are generating a forecast for item sales across all of your stores, and your dataset contains a store_id field. If you want the sales forecast for each item by store, you would specify store_id as the dimension. All forecast dimensions specified in the TARGET_TIME_SERIES dataset don't need to be specified in the CreatePredictor request. All forecast dimensions specified in the RELATED_TIME_SERIES dataset must be specified in the CreatePredictor request.
    */
  var ForecastDimensions: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ForecastDimensions] = js.undefined
  
  /**
    * The frequency of predictions in a forecast. Valid intervals are an integer followed by Y (Year), M (Month), W (Week), D (Day), H (Hour), and min (Minute). For example, "1D" indicates every day and "15min" indicates every 15 minutes. You cannot specify a value that would overlap with the next larger frequency. That means, for example, you cannot specify a frequency of 60 minutes, because that is equivalent to 1 hour. The valid values for each frequency are the following:   Minute - 1-59   Hour - 1-23   Day - 1-6   Week - 1-4   Month - 1-11   Year - 1   Thus, if you want every other week forecasts, specify "2W". Or, if you want quarterly forecasts, you specify "3M". The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency. When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the TARGET_TIME_SERIES dataset frequency.
    */
  var ForecastFrequency: Frequency
}
object FeaturizationConfig {
  
  inline def apply(ForecastFrequency: Frequency): FeaturizationConfig = {
    val __obj = js.Dynamic.literal(ForecastFrequency = ForecastFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturizationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturizationConfig] (val x: Self) extends AnyVal {
    
    inline def setFeaturizations(value: Featurizations): Self = StObject.set(x, "Featurizations", value.asInstanceOf[js.Any])
    
    inline def setFeaturizationsUndefined: Self = StObject.set(x, "Featurizations", js.undefined)
    
    inline def setFeaturizationsVarargs(value: Featurization*): Self = StObject.set(x, "Featurizations", js.Array(value*))
    
    inline def setForecastDimensions(value: ForecastDimensions): Self = StObject.set(x, "ForecastDimensions", value.asInstanceOf[js.Any])
    
    inline def setForecastDimensionsUndefined: Self = StObject.set(x, "ForecastDimensions", js.undefined)
    
    inline def setForecastDimensionsVarargs(value: Name*): Self = StObject.set(x, "ForecastDimensions", js.Array(value*))
    
    inline def setForecastFrequency(value: Frequency): Self = StObject.set(x, "ForecastFrequency", value.asInstanceOf[js.Any])
  }
}
