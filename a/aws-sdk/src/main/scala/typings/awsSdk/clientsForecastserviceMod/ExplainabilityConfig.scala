package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplainabilityConfig extends StObject {
  
  /**
    * To create an Explainability for all time points in your forecast horizon, use ALL. To create an Explainability for specific time points in your forecast horizon, use SPECIFIC. Specify time points with the StartDateTime and EndDateTime parameters within the CreateExplainability operation.
    */
  var TimePointGranularity: typings.awsSdk.clientsForecastserviceMod.TimePointGranularity
  
  /**
    * To create an Explainability for all time series in your datasets, use ALL. To create an Explainability for specific time series in your datasets, use SPECIFIC. Specify time series by uploading a CSV or Parquet file to an Amazon S3 bucket and set the location within the DataDestination data type.
    */
  var TimeSeriesGranularity: typings.awsSdk.clientsForecastserviceMod.TimeSeriesGranularity
}
object ExplainabilityConfig {
  
  inline def apply(TimePointGranularity: TimePointGranularity, TimeSeriesGranularity: TimeSeriesGranularity): ExplainabilityConfig = {
    val __obj = js.Dynamic.literal(TimePointGranularity = TimePointGranularity.asInstanceOf[js.Any], TimeSeriesGranularity = TimeSeriesGranularity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainabilityConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplainabilityConfig] (val x: Self) extends AnyVal {
    
    inline def setTimePointGranularity(value: TimePointGranularity): Self = StObject.set(x, "TimePointGranularity", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesGranularity(value: TimeSeriesGranularity): Self = StObject.set(x, "TimeSeriesGranularity", value.asInstanceOf[js.Any])
  }
}
