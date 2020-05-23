package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`max-change`
import typings.arcgisJsApi.arcgisJsApiStrings.`min-change`
import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.tick
import typings.arcgisJsApi.arcgisJsApiStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderViewModel
  extends Accessor
     with Evented {
  /**
    * A function used to format user inputs. As opposed to [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction), which formats thumb labels, the `inputFormatFunction` formats thumb values in the input element when the user begins to edit them.  The image below demonstrates how slider input values resemble corresponding slider values by default and won't match the formatting set in `labelFormatFunction`.  ![Slider without input formatter](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-no-input-formatter.png%20%22Slider%20without%20input%20formatter%22)  If you want to format slider input values so they match thumb labels, you can pass the same function set in `labelFormatFunction` to `inputFormatFunction` for consistent formatting.  ![Slider with input formatter](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-input-formatter.png%20%22Slider%20with%20input%20formatter%22)  However, if an `inputFormatFunction` is specified, you must also write a corresponding [inputParseFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputParseFunction) to parse user inputs to understandable slider values. In most cases, if you specify an `inputFormatFunction`, you should set the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction) to the same value for consistency between labels and inputs.  This property overrides the default input formatter, which formats by calling `toString()` on the input value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction)
    */
  @JSName("inputFormatFunction")
  var inputFormatFunction_Original: SliderLabelFormatter = js.native
  /**
    * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction). This property must be set if an `inputFormatFunction` is set. Otherwise the slider values will likely not update to their expected positions.  Overrides the default input parses, which is a parsed floating point number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputParseFunction)
    */
  @JSName("inputParseFunction")
  var inputParseFunction_Original: InputParser = js.native
  /**
    * A function used to format labels. Overrides the default label formatter.  By default labels are formatted in the following way:
    *   * When the data range is less than `10` (`(max - min) < 10`), labels are rounded based on the value set in the [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#precision) property.
    *   * When the data range is larger than `10`, [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labels) display with a precision of no more than two decimal places, though actual slider thumb values will maintain the precision specified in [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#precision).
    *
    *
    * Use this property to override the behavior defined above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original: SliderLabelFormatter = js.native
  /**
    * An array of strings associated with [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values) generated using an internal label formatter or the values returned from [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labels)
    */
  val labels: js.Array[String] = js.native
  /**
    * The maximum possible data/thumb value of the slider. In the constructor, if one of the values specified in [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values) is greater than the `max` value specified in this property, then the `max` will update to the highest value in `values`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#max)
    */
  var max: Double = js.native
  /**
    * The minimum possible data/thumb value of the slider. In the constructor, if one of the values specified in [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values) is less than the `min` value specified in this property, then the `min` will update to the lowest value in `values`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#min)
    */
  var min: Double = js.native
  /**
    * Defines how slider values should be rounded. This number indicates the number of decimal places slider values should round to when they have been moved.  This value also indicates the precision of thumb [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labels) when the data range ([max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#max) - [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#min)) is less than `10`.  When the data range is larger than `10`, [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labels) display with a precision of no more than two decimal places, though actual slider thumb values will maintain the precision specified in this property.  For example, given the default precision of `4`, and the following slider configuration, The label of the thumb will display two decimal places, but the precision of the actual thumb value will not be lost even when the user slides or moves the thumb.
    * ```js
    * const slider = new SliderVM({
    *   min: 20,
    *   max: 100,  // data range of 80
    *   values: [50.4331],
    *   // thumb label will display 50.43
    *   // thumb value will maintain precision, so
    *   // value will remain at 50.4331
    * });
    * ```
    *
    * If the user manually enters a value that has a higher precision than what's indicated by
    * this property, the precision of that thumb value will be maintained until the thumb
    * is moved by the user. At that point, the value will be rounded according to the indicated precision.
    *
    * If thumb labels aren't visible, they must be enabled with [labelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelInputsEnabled).
    *
    * Keep in mind this property rounds thumb [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values) and shouldn't be used exclusively
    * for formatting purposes. To format thumb `labels`, use the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction)
    * property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#precision)
    *
    * @default 4
    */
  var precision: Double = js.native
  /**
    * The state of the view model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#state)
    */
  val state: ready | disabled = js.native
  /**
    * When `false`, the user can freely move any slider thumb to any position along the track. By default, a thumb's position is constrained to the positions of neighboring thumbs so you cannot move one thumb past another. Set this property to `false` to disable this constraining behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#thumbsConstrained)
    *
    * @default true
    */
  var thumbsConstrained: Boolean = js.native
  /**
    * An array of numbers representing absolute thumb positions on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values)
    */
  var values: js.Array[Double] = js.native
  /**
    * The default input format function available for use as a fallback in custom formatting implementations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#defaultInputFormatFunction)
    *
    * @param value The input value to format.
    *
    */
  def defaultInputFormatFunction(value: Double): String = js.native
  /**
    * The default input parsing function available for use as a fallback in custom parsing implementations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#defaultInputParseFunction)
    *
    * @param value The thumb value to parse.
    *
    */
  def defaultInputParseFunction(value: String): Double = js.native
  /**
    * The default label format function, available for use as a fallback in custom formatting implementations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#defaultLabelFormatFunction)
    *
    * @param value The thumb value to format.
    *
    */
  def defaultLabelFormatFunction(value: Double): String = js.native
  /**
    * Returns the min and max bounds for a 'value' at the provided index. Also used internally to provide accessibility information via HTMLElement properties
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#getBoundsForValueAtIndex)
    *
    * @param index The index of the associated value.
    *
    */
  def getBoundsForValueAtIndex(index: Double): js.Any = js.native
  /**
    * Returns the formatted label for a provided value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#getLabelForValue)
    *
    * @param value The value from which to retrieve a formatted label.
    * @param type The label type.  **Possible Values:** min | max | tick | values
    * @param index The index of the label.
    *
    */
  def getLabelForValue(value: Double): String = js.native
  def getLabelForValue(value: Double, `type`: String): String = js.native
  def getLabelForValue(value: Double, `type`: String, index: Double): String = js.native
  /**
    * A function used to format user inputs. As opposed to [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction), which formats thumb labels, the `inputFormatFunction` formats thumb values in the input element when the user begins to edit them.  The image below demonstrates how slider input values resemble corresponding slider values by default and won't match the formatting set in `labelFormatFunction`.  ![Slider without input formatter](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-no-input-formatter.png%20%22Slider%20without%20input%20formatter%22)  If you want to format slider input values so they match thumb labels, you can pass the same function set in `labelFormatFunction` to `inputFormatFunction` for consistent formatting.  ![Slider with input formatter](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-input-formatter.png%20%22Slider%20with%20input%20formatter%22)  However, if an `inputFormatFunction` is specified, you must also write a corresponding [inputParseFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputParseFunction) to parse user inputs to understandable slider values. In most cases, if you specify an `inputFormatFunction`, you should set the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction) to the same value for consistency between labels and inputs.  This property overrides the default input formatter, which formats by calling `toString()` on the input value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction)
    */
  def inputFormatFunction(value: Double): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_average(value: Double, `type`: average): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_average(value: Double, `type`: average, index: Double): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_max(value: Double, `type`: max): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_max(value: Double, `type`: max, index: Double): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_min(value: Double, `type`: min): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_min(value: Double, `type`: min, index: Double): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_tick(value: Double, `type`: tick): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_tick(value: Double, `type`: tick, index: Double): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_value(value: Double, `type`: value): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_value(value: Double, `type`: value, index: Double): String = js.native
  /**
    * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction). This property must be set if an `inputFormatFunction` is set. Otherwise the slider values will likely not update to their expected positions.  Overrides the default input parses, which is a parsed floating point number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputParseFunction)
    */
  def inputParseFunction(value: String): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_average(value: String, `type`: average): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_average(value: String, `type`: average, index: Double): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_max(value: String, `type`: max): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_max(value: String, `type`: max, index: Double): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_min(value: String, `type`: min): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_min(value: String, `type`: min, index: Double): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_tick(value: String, `type`: tick): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_tick(value: String, `type`: tick, index: Double): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_value(value: String, `type`: value): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_value(value: String, `type`: value, index: Double): Double = js.native
  /**
    * A function used to format labels. Overrides the default label formatter.  By default labels are formatted in the following way:
    *   * When the data range is less than `10` (`(max - min) < 10`), labels are rounded based on the value set in the [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#precision) property.
    *   * When the data range is larger than `10`, [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labels) display with a precision of no more than two decimal places, though actual slider thumb values will maintain the precision specified in [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#precision).
    *
    *
    * Use this property to override the behavior defined above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction)
    */
  def labelFormatFunction(value: Double): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_average(value: Double, `type`: average): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_average(value: Double, `type`: average, index: Double): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_max(value: Double, `type`: max): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_max(value: Double, `type`: max, index: Double): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_min(value: Double, `type`: min): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_min(value: Double, `type`: min, index: Double): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_tick(value: Double, `type`: tick): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_tick(value: Double, `type`: tick, index: Double): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_value(value: Double, `type`: value): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_value(value: Double, `type`: value, index: Double): String = js.native
  @JSName("on")
  def on_maxchange(name: `max-change`, eventHandler: SliderViewModelMaxChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_minchange(name: `min-change`, eventHandler: SliderViewModelMinChangeEventHandler): IHandle = js.native
  /**
    * Updates a thumb [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values) based on the provided index. The provided value must differ from the previous value. The provided value must also be between the [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#min) and [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#max).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#setValue)
    *
    * @param index The index of the thumb value in the associated [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values) array.
    * @param value The new value to replace with the old value.
    *
    */
  def setValue(index: Double, value: Double): Unit = js.native
  /**
    * Rounds the given value to the number of decimal places specified in the [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#precision) property set on the view model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#toPrecision)
    *
    * @param value The thumb value to format.
    *
    */
  def toPrecision(value: Double): String = js.native
}

