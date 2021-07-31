package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramResult
  extends StObject
     with Object {
  
  /**
    * An array of objects representing each bin in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#HistogramResult)
    */
  var bins: js.Array[Bin]
  
  /**
    * The maximum value returned by the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#HistogramResult)
    */
  var maxValue: Double
  
  /**
    * The minimum value returned by the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#HistogramResult)
    */
  var minValue: Double
}
object HistogramResult {
  
  @scala.inline
  def apply(
    bins: js.Array[Bin],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxValue: Double,
    minValue: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): HistogramResult = {
    val __obj = js.Dynamic.literal(bins = bins.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[HistogramResult]
  }
  
  @scala.inline
  implicit class HistogramResultMutableBuilder[Self <: HistogramResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBins(value: js.Array[Bin]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinsVarargs(value: Bin*): Self = StObject.set(x, "bins", js.Array(value :_*))
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
  }
}
