package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWhatIfAnalysisRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the baseline forecast.
    */
  var ForecastArn: Arn
  
  /**
    * A list of tags to apply to the what if forecast.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Tags] = js.undefined
  
  /**
    * Defines the set of time series that are used in the what-if analysis with a TimeSeriesIdentifiers object. What-if analyses are performed only for the time series in this object. The TimeSeriesIdentifiers object needs the following information:    DataSource     Format     Schema   
    */
  var TimeSeriesSelector: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.TimeSeriesSelector] = js.undefined
  
  /**
    * The name of the what-if analysis. Each name must be unique.
    */
  var WhatIfAnalysisName: Name
}
object CreateWhatIfAnalysisRequest {
  
  inline def apply(ForecastArn: Arn, WhatIfAnalysisName: Name): CreateWhatIfAnalysisRequest = {
    val __obj = js.Dynamic.literal(ForecastArn = ForecastArn.asInstanceOf[js.Any], WhatIfAnalysisName = WhatIfAnalysisName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWhatIfAnalysisRequest]
  }
  
  extension [Self <: CreateWhatIfAnalysisRequest](x: Self) {
    
    inline def setForecastArn(value: Arn): Self = StObject.set(x, "ForecastArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTimeSeriesSelector(value: TimeSeriesSelector): Self = StObject.set(x, "TimeSeriesSelector", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesSelectorUndefined: Self = StObject.set(x, "TimeSeriesSelector", js.undefined)
    
    inline def setWhatIfAnalysisName(value: Name): Self = StObject.set(x, "WhatIfAnalysisName", value.asInstanceOf[js.Any])
  }
}
