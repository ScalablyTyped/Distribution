package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramResult extends StObject {
  
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
  
  /**
    * The number used to normalize all values when `percent-of-total` is specified as the `normalizationType`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#HistogramResult)
    */
  var normalizationTotal: js.UndefOr[Double] = js.undefined
}
object HistogramResult {
  
  inline def apply(bins: js.Array[Bin], maxValue: Double, minValue: Double): HistogramResult = {
    val __obj = js.Dynamic.literal(bins = bins.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramResult]
  }
  
  extension [Self <: HistogramResult](x: Self) {
    
    inline def setBins(value: js.Array[Bin]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    inline def setBinsVarargs(value: Bin*): Self = StObject.set(x, "bins", js.Array(value*))
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setNormalizationTotal(value: Double): Self = StObject.set(x, "normalizationTotal", value.asInstanceOf[js.Any])
    
    inline def setNormalizationTotalUndefined: Self = StObject.set(x, "normalizationTotal", js.undefined)
  }
}
