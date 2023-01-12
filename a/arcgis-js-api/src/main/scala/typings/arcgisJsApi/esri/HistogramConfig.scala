package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramConfig extends StObject {
  
  /**
    * Indicates the average value of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var average: js.UndefOr[Double] = js.undefined
  
  /**
    * Function for styling bars representing histogram bins.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var barCreatedFunction: js.UndefOr[BarCreatedFunction] = js.undefined
  
  /**
    * The bins of the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.undefined
  
  /**
    * Function that fires each time a data line is created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var dataLineCreatedFunction: js.UndefOr[DataLineCreatedFunction] = js.undefined
  
  /**
    * When set, renders lines on the histogram that indicate important or meaningful values to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var dataLines: js.UndefOr[js.Array[HistogramConfigDataLines]] = js.undefined
  
  /**
    * Indicates the standard deviation of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var standardDeviation: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the standard deviation of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var standardDeviationCount: js.UndefOr[Double] = js.undefined
}
object HistogramConfig {
  
  inline def apply(): HistogramConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistogramConfig] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    inline def setBarCreatedFunction(value: (/* index */ Double, /* element */ Any) => scala.Unit): Self = StObject.set(x, "barCreatedFunction", js.Any.fromFunction2(value))
    
    inline def setBarCreatedFunctionUndefined: Self = StObject.set(x, "barCreatedFunction", js.undefined)
    
    inline def setBins(value: js.Array[Bin]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    inline def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
    
    inline def setBinsVarargs(value: Bin*): Self = StObject.set(x, "bins", js.Array(value*))
    
    inline def setDataLineCreatedFunction(
      value: (/* lineElement */ Any, /* labelElement */ js.UndefOr[Any], /* index */ js.UndefOr[Double]) => scala.Unit
    ): Self = StObject.set(x, "dataLineCreatedFunction", js.Any.fromFunction3(value))
    
    inline def setDataLineCreatedFunctionUndefined: Self = StObject.set(x, "dataLineCreatedFunction", js.undefined)
    
    inline def setDataLines(value: js.Array[HistogramConfigDataLines]): Self = StObject.set(x, "dataLines", value.asInstanceOf[js.Any])
    
    inline def setDataLinesUndefined: Self = StObject.set(x, "dataLines", js.undefined)
    
    inline def setDataLinesVarargs(value: HistogramConfigDataLines*): Self = StObject.set(x, "dataLines", js.Array(value*))
    
    inline def setStandardDeviation(value: Double): Self = StObject.set(x, "standardDeviation", value.asInstanceOf[js.Any])
    
    inline def setStandardDeviationCount(value: Double): Self = StObject.set(x, "standardDeviationCount", value.asInstanceOf[js.Any])
    
    inline def setStandardDeviationCountUndefined: Self = StObject.set(x, "standardDeviationCount", js.undefined)
    
    inline def setStandardDeviationUndefined: Self = StObject.set(x, "standardDeviation", js.undefined)
  }
}
