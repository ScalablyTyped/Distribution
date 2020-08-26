package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.tick
import typings.arcgisJsApi.arcgisJsApiStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartMappingSliderBaseProperties extends WidgetProperties {
  /**
    * The [Histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html) associated with the data represented on the slider. The bins are typically generated using the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html) statistics function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#histogramConfig)
    */
  var histogramConfig: js.UndefOr[HistogramConfig] = js.native
  /**
    * A function used to format user inputs. As opposed to [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#labelFormatFunction), which formats thumb labels, the `inputFormatFunction` formats thumb values in the input element when the user begins to edit them.  The image below demonstrates how slider input values resemble corresponding slider values by default and won't match the formatting set in `labelFormatFunction`.  ![Slider without input formatter](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-no-input-formatter.png%20%22Slider%20without%20input%20formatter%22)  If you want to format slider input values so they match thumb labels, you can pass the same function set in `labelFormatFunction` to `inputFormatFunction` for consistent formatting.  ![Slider with input formatter](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-input-formatter.png%20%22Slider%20with%20input%20formatter%22)  However, if an `inputFormatFunction` is specified, you must also write a corresponding [inputParseFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#inputParseFunction) to parse user inputs to understandable slider values. In most cases, if you specify an `inputFormatFunction`, you should set the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#labelFormatFunction) to the same value for consistency between labels and inputs.  This property overrides the default input formatter, which formats by calling `toString()` on the input value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#inputFormatFunction)
    */
  var inputFormatFunction: js.UndefOr[SmartMappingSliderBaseLabelFormatter] = js.native
  /**
    * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#inputFormatFunction). This property must be set if an `inputFormatFunction` is set. Otherwise the slider values will likely not update to their expected positions.  Overrides the default input parses, which is a parsed floating point number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#inputParseFunction)
    */
  var inputParseFunction: js.UndefOr[InputParser] = js.native
  /**
    * A modified version of [Slider.labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction), which is a custom function used to format labels on the thumbs, min, max, and average values. Overrides the default label formatter. This function also supports date formatting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#labelFormatFunction)
    */
  var labelFormatFunction: js.UndefOr[SmartMappingSliderBaseLabelFormatter] = js.native
  /**
    * The maximum value or upper bound of the slider. If the largest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#values) _in the constructor_ is greater than the `max` set in this property, then the `max` will update to match the largest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#values).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#max)
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum value or lower bound of the slider. If the smallest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#values) _in the constructor_ is greater than the `min` set in this property, then the `min` will update to match the smallest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#values).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#min)
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Defines how slider thumb values should be rounded. This number indicates the number of decimal places slider thumb _values_ should round to when they have been moved.  This value also indicates the precision of thumb [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#labels) when the data range is less than `10` (i.e. `(max - min) < 10`).  When the data range is larger than `10`, [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#labels) display with a precision of no more than two decimal places, though actual slider thumb values will maintain the precision specified in this property.  For example, given the default precision of `4`, and the following slider configuration, The labels of the thumbs will display two decimal places, but the precision of the actual thumb values will not be lost even when the user slides or moves the thumb.
    * ```js
    * const slider = new Slider({
    *   min: 20,
    *   max: 100,  // data range of 80
    *   values: [50.4331],
    *   // thumb label will display 50.43
    *   // thumb value will maintain precision, so
    *   // value will remain at 50.4331
    *   container: "sliderDiv"
    * });
    * ```
    *
    * If the user manually enters a value that has a higher precision than what's indicated by
    * this property, the precision of that thumb value will be maintained until the thumb
    * is moved by the user. At that point, the value will be rounded according to the indicated precision.
    *
    * If thumb labels aren't visible, they must be enabled with [labelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#labelInputsEnabled).
    *
    * Keep in mind this property rounds thumb [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#values) and shouldn't be used exclusively
    * for formatting purposes. To format thumb `labels`, use the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#labelFormatFunction)
    * property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#precision)
    *
    * @default 4
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * Zooms the slider track to the bounds provided in this property. When min and/or max zoom values are provided, the absolute [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#min) and [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#max) slider values are preserved and rendered at their typical positions on the slider. However, the slider track itself is zoomed so that thumbs cannot be moved above or below the provided min and max zoomed values.  When a slider is in a zoomed state, the zoomed ends of the track will appear jagged. In the image below, notice how the top thumb cannot be moved past the zoom max of `31` even though the slider max is `200`.  ![slider-zoom](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-zoomed.png)  To exit a zoomed state, the user can click the jagged line or the developer can set the `zoomOptions` to `null`. It is up to the developer to provide a UI option for end users to enable zooming on the slider.  Setting the `zoomOptions` is useful when the slider is tied to heavily skewed datasets where the histogram renders only one or two bars because of outliers.  ![slider-not-zoomed](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-skewed-not-zoomed.png)  You can remove the influence of outliers by zooming the slider and regenerating a histogram based on the zoomed min and max. This will provide a better view of the data and make the slider more useful to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#zoomOptions)
    */
  var zoomOptions: js.UndefOr[SmartMappingSliderBaseZoomOptions] = js.native
}

object SmartMappingSliderBaseProperties {
  @scala.inline
  def apply(): SmartMappingSliderBaseProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartMappingSliderBaseProperties]
  }
  @scala.inline
  implicit class SmartMappingSliderBasePropertiesOps[Self <: SmartMappingSliderBaseProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHistogramConfig(value: HistogramConfig): Self = this.set("histogramConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistogramConfig: Self = this.set("histogramConfig", js.undefined)
    @scala.inline
    def setInputFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | value], /* index */ js.UndefOr[Double]) => String
    ): Self = this.set("inputFormatFunction", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInputFormatFunction: Self = this.set("inputFormatFunction", js.undefined)
    @scala.inline
    def setInputParseFunction(
      value: (/* value */ String, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => Double
    ): Self = this.set("inputParseFunction", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInputParseFunction: Self = this.set("inputParseFunction", js.undefined)
    @scala.inline
    def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | value], /* index */ js.UndefOr[Double]) => String
    ): Self = this.set("labelFormatFunction", js.Any.fromFunction3(value))
    @scala.inline
    def deleteLabelFormatFunction: Self = this.set("labelFormatFunction", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setZoomOptions(value: SmartMappingSliderBaseZoomOptions): Self = this.set("zoomOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOptions: Self = this.set("zoomOptions", js.undefined)
  }
  
}

