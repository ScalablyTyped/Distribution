package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`at-least`
import typings.arcgisJsApi.arcgisJsApiStrings.`at-most`
import typings.arcgisJsApi.arcgisJsApiStrings.`greater-than`
import typings.arcgisJsApi.arcgisJsApiStrings.`less-than`
import typings.arcgisJsApi.arcgisJsApiStrings.`not-between`
import typings.arcgisJsApi.arcgisJsApiStrings.`not-equal`
import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.between
import typings.arcgisJsApi.arcgisJsApiStrings.equal
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.tick
import typings.arcgisJsApi.arcgisJsApiStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramRangeSliderProperties extends WidgetProperties {
  
  /**
    * The statistical average of the data in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#average)
    */
  var average: js.UndefOr[Double] = js.native
  
  /**
    * Function for styling bars representing histogram bins.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#barCreatedFunction)
    */
  var barCreatedFunction: js.UndefOr[BarCreatedFunction] = js.native
  
  /**
    * An array of objects representing each bin in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#bins)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.native
  
  /**
    * Function that fires each time a data line is created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLineCreatedFunction)
    */
  var dataLineCreatedFunction: js.UndefOr[DataLineCreatedFunction] = js.native
  
  /**
    * When set, renders lines on the histogram that indicate important or meaningful values to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLines)
    */
  var dataLines: js.UndefOr[js.Array[HistogramRangeSliderDataLines]] = js.native
  
  /**
    * Sets the color of the histogram bars that are excluded based on the specified [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#excludedBarColor)
    */
  var excludedBarColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  
  /**
    * Sets the color of the histogram bars that are included in the specified [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#includedBarColor)
    */
  var includedBarColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  
  /**
    * A function used to format labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#labelFormatFunction)
    */
  var labelFormatFunction: js.UndefOr[SliderLabelFormatter] = js.native
  
  /**
    * The maximum value or upper bound of the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#max)
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * The minimum value or lower bound of the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#min)
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * Defines how slider thumb values should be rounded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#precision)
    */
  var precision: js.UndefOr[Double] = js.native
  
  /**
    * Indicates how the histogram bins should be rendered as the user slides the thumbs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType)
    */
  var rangeType: js.UndefOr[
    equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between | `not-between`
  ] = js.native
  
  /**
    * Indicates the standard deviation of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#standardDeviation)
    */
  var standardDeviation: js.UndefOr[Double] = js.native
  
  /**
    * Indicates the number of standard deviation lines to render on the histogram from the [average].
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#standardDeviationCount)
    */
  var standardDeviationCount: js.UndefOr[Double] = js.native
  
  /**
    * An array of either one or two numbers representing thumb positions on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values)
    */
  var values: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The view model for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[HistogramRangeSliderViewModelProperties] = js.native
}
object HistogramRangeSliderProperties {
  
  @scala.inline
  def apply(): HistogramRangeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramRangeSliderProperties]
  }
  
  @scala.inline
  implicit class HistogramRangeSliderPropertiesMutableBuilder[Self <: HistogramRangeSliderProperties] (val x: Self) extends AnyVal {
    
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
    def setDataLines(value: js.Array[HistogramRangeSliderDataLines]): Self = StObject.set(x, "dataLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLinesUndefined: Self = StObject.set(x, "dataLines", js.undefined)
    
    @scala.inline
    def setDataLinesVarargs(value: HistogramRangeSliderDataLines*): Self = StObject.set(x, "dataLines", js.Array(value :_*))
    
    @scala.inline
    def setExcludedBarColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "excludedBarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedBarColorUndefined: Self = StObject.set(x, "excludedBarColor", js.undefined)
    
    @scala.inline
    def setExcludedBarColorVarargs(value: Double*): Self = StObject.set(x, "excludedBarColor", js.Array(value :_*))
    
    @scala.inline
    def setIncludedBarColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "includedBarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedBarColorUndefined: Self = StObject.set(x, "includedBarColor", js.undefined)
    
    @scala.inline
    def setIncludedBarColorVarargs(value: Double*): Self = StObject.set(x, "includedBarColor", js.Array(value :_*))
    
    @scala.inline
    def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
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
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setRangeType(
      value: equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between | `not-between`
    ): Self = StObject.set(x, "rangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeTypeUndefined: Self = StObject.set(x, "rangeType", js.undefined)
    
    @scala.inline
    def setStandardDeviation(value: Double): Self = StObject.set(x, "standardDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardDeviationCount(value: Double): Self = StObject.set(x, "standardDeviationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardDeviationCountUndefined: Self = StObject.set(x, "standardDeviationCount", js.undefined)
    
    @scala.inline
    def setStandardDeviationUndefined: Self = StObject.set(x, "standardDeviation", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    
    @scala.inline
    def setViewModel(value: HistogramRangeSliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
