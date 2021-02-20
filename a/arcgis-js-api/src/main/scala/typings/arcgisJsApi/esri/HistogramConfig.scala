package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramConfig extends Object {
  
  /**
    * Indicates the average value of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var average: js.UndefOr[Double] = js.native
  
  /**
    * Function for styling bars representing histogram bins.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var barCreatedFunction: js.UndefOr[BarCreatedFunction] = js.native
  
  /**
    * The bins of the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.native
  
  /**
    * Function that fires each time a data line is created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var dataLineCreatedFunction: js.UndefOr[DataLineCreatedFunction] = js.native
  
  /**
    * When set, renders lines on the histogram that indicate important or meaningful values to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var dataLines: js.UndefOr[js.Array[HistogramConfigDataLines]] = js.native
  
  /**
    * Indicates the standard deviation of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var standardDeviation: js.UndefOr[Double] = js.native
  
  /**
    * Indicates the standard deviation of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var standardDeviationCount: js.UndefOr[Double] = js.native
}
object HistogramConfig {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): HistogramConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[HistogramConfig]
  }
  
  @scala.inline
  implicit class HistogramConfigMutableBuilder[Self <: HistogramConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    @scala.inline
    def setBarCreatedFunction(value: (/* index */ Double, /* element */ js.Any) => Unit): Self = StObject.set(x, "barCreatedFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBarCreatedFunctionUndefined: Self = StObject.set(x, "barCreatedFunction", js.undefined)
    
    @scala.inline
    def setBins(value: js.Array[Bin]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
    
    @scala.inline
    def setBinsVarargs(value: Bin*): Self = StObject.set(x, "bins", js.Array(value :_*))
    
    @scala.inline
    def setDataLineCreatedFunction(
      value: (/* lineElement */ js.Any, /* labelElement */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "dataLineCreatedFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDataLineCreatedFunctionUndefined: Self = StObject.set(x, "dataLineCreatedFunction", js.undefined)
    
    @scala.inline
    def setDataLines(value: js.Array[HistogramConfigDataLines]): Self = StObject.set(x, "dataLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLinesUndefined: Self = StObject.set(x, "dataLines", js.undefined)
    
    @scala.inline
    def setDataLinesVarargs(value: HistogramConfigDataLines*): Self = StObject.set(x, "dataLines", js.Array(value :_*))
    
    @scala.inline
    def setStandardDeviation(value: Double): Self = StObject.set(x, "standardDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardDeviationCount(value: Double): Self = StObject.set(x, "standardDeviationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardDeviationCountUndefined: Self = StObject.set(x, "standardDeviationCount", js.undefined)
    
    @scala.inline
    def setStandardDeviationUndefined: Self = StObject.set(x, "standardDeviation", js.undefined)
  }
}
