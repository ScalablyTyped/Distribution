package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramViewModelProperties extends StObject {
  
  /**
    * The statistical average of the data in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#average)
    */
  var average: js.UndefOr[Double] = js.native
  
  /**
    * An array of objects representing each bin in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#bins)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.native
  
  /**
    * A function used to format labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#labelFormatFunction)
    */
  var labelFormatFunction: js.UndefOr[LabelFormatter] = js.native
  
  /**
    * The maximum value or bound of the entire histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#max)
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * The minimum value or bound of the entire histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html#min)
    */
  var min: js.UndefOr[Double] = js.native
}
object HistogramViewModelProperties {
  
  @scala.inline
  def apply(): HistogramViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramViewModelProperties]
  }
  
  @scala.inline
  implicit class HistogramViewModelPropertiesMutableBuilder[Self <: HistogramViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    @scala.inline
    def setBins(value: js.Array[Bin]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
    
    @scala.inline
    def setBinsVarargs(value: Bin*): Self = StObject.set(x, "bins", js.Array(value :_*))
    
    @scala.inline
    def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "labelFormatFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLabelFormatFunctionUndefined: Self = StObject.set(x, "labelFormatFunction", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
