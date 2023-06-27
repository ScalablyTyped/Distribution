package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramProperties
  extends StObject
     with WidgetProperties {
  
  /**
  		 * The statistical average of the data in the histogram.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#average)
  		 */
  var average: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Function for styling bars representing histogram bins.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#barCreatedFunction)
  		 */
  var barCreatedFunction: js.UndefOr[BarCreatedFunction] = js.undefined
  
  /**
  		 * An array of objects representing each bin in the histogram.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#bins)
  		 */
  var bins: js.UndefOr[js.Array[Bin]] = js.undefined
  
  /**
  		 * Function that fires each time a data line is created.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#dataLineCreatedFunction)
  		 */
  var dataLineCreatedFunction: js.UndefOr[DataLineCreatedFunction] = js.undefined
  
  /**
  		 * When set, renders lines on the histogram that indicate important or meaningful values to the end user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#dataLines)
  		 */
  var dataLines: js.UndefOr[js.Array[HistogramDataLines]] = js.undefined
  
  /**
  		 * A function used to format labels on the histogram.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#labelFormatFunction)
  		 */
  var labelFormatFunction: js.UndefOr[LabelFormatter] = js.undefined
  
  /**
  		 * Determines the orientation of the Histogram widget.
  		 *
  		 * @default horizontal
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#layout)
  		 */
  var layout: js.UndefOr[vertical | horizontal] = js.undefined
  
  /**
  		 * The maximum value or bound of the entire histogram.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#max)
  		 */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The minimum value or bound of the entire histogram.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#min)
  		 */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The view model for the Histogram widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#viewModel)
  		 */
  var viewModel: js.UndefOr[HistogramViewModelProperties] = js.undefined
}
object HistogramProperties {
  
  inline def apply(): HistogramProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistogramProperties] (val x: Self) extends AnyVal {
    
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
    
    inline def setDataLines(value: js.Array[HistogramDataLines]): Self = StObject.set(x, "dataLines", value.asInstanceOf[js.Any])
    
    inline def setDataLinesUndefined: Self = StObject.set(x, "dataLines", js.undefined)
    
    inline def setDataLinesVarargs(value: HistogramDataLines*): Self = StObject.set(x, "dataLines", js.Array(value*))
    
    inline def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "labelFormatFunction", js.Any.fromFunction3(value))
    
    inline def setLabelFormatFunctionUndefined: Self = StObject.set(x, "labelFormatFunction", js.undefined)
    
    inline def setLayout(value: vertical | horizontal): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setViewModel(value: HistogramViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
