package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slider extends Widget {
  /**
    * Indicates if the user can drag the segment between thumbs to update thumb positions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#draggableSegmentsEnabled)
    *
    * @default true
    */
  var draggableSegmentsEnabled: scala.Boolean = js.native
  /**
    * A function used to format labels. Overrides the default label formatter.  By default labels are formatted in the following way:
    *   * When the data range is less than `10` (`(max - min) < 10`), labels are rounded based on the value set in the [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#precision) property.
    *   * When the data range is larger than `10`, [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labels) display with a precision of no more than two decimal places, though actual slider thumb values will maintain the precision specified in [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#precision).
    *
    *
    * Use this property to override the behavior defined above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original: SliderLabelFormatter = js.native
  /**
    * Indicates whether to enable editing input values via keyboard input when the user clicks a label. This allows the user to move the slider thumb to precise values without sliding the thumbs.  ![Slider editable labels](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-edit-label.png%20%22Slider%20with%20editable%20labels%22)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelInputsEnabled)
    *
    * @default false
    */
  var labelInputsEnabled: scala.Boolean = js.native
  /**
    * An array of strings associated with 'values' generated using an internal label formatter or the values returned from [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labels)
    */
  val labels: js.Array[java.lang.String] = js.native
  /**
    * Indicates whether to display labels alongside slider thumbs. By default, labels display input thumb values as floating point values with a precision of two digits. The format of labels can be customized via the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction).  Alternatively, developers may also use CSS (e.g. `display: none`) to show/hide labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelsVisible)
    *
    * @default false
    */
  var labelsVisible: scala.Boolean = js.native
  /**
    * Determines the layout/orientation of the Slider widget.  **Possible Values:** vertical | horizontal
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#layout)
    *
    * @default horizontal
    */
  var layout: java.lang.String = js.native
  /**
    * The maximum possible data/thumb value of the slider. In the constructor, if one of the values specified in [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#values) is greater than the `max` value specified in this property, then the `max` will update to the highest value in `values`.  To display the max value's label on the slider, then set [rangeLabelsVisible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelsVisible) to `true`. To allow the end user to modify the max value, set [rangeLabelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled) to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max)
    */
  var max: scala.Double = js.native
  /**
    * The minimum possible data/thumb value of the slider. In the constructor, if one of the values specified in [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#values) is less than the `min` value specified in this property, then the `min` will update to the lowest value in `values`.  To display the min value's label on the slider, then set [rangeLabelsVisible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelsVisible) to `true`. To allow the end user to modify the min value, set [rangeLabelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled) to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min)
    */
  var min: scala.Double = js.native
  /**
    * Defines how slider thumb values should be rounded. This number indicates the number of decimal places slider thumb _values_ should round to when they have been moved.  This value also indicates the precision of thumb [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labels) when the data range is less than `10` (i.e. `(max - min) < 10`).  When the data range is larger than `10`, [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labels) display with a precision of no more than two decimal places, though actual slider thumb values will maintain the precision specified in this property.  For example, given the default precision of `4`, and the following slider configuration, The labels of the thumbs will display two decimal places, but the precision of the actual thumb values will not be lost even when the user slides or moves the thumb.
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
    * If thumb labels aren't visible, they must be enabled with [labelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelInputsEnabled).
    *
    * Keep in mind this property rounds thumb [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#values) and shouldn't be used exclusively
    * for formatting purposes. To format thumb `labels`, use the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction)
    * property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#precision)
    *
    * @default 4
    */
  var precision: scala.Double = js.native
  /**
    * Indicates whether to enable editing range values via keyboard input when the user clicks a [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) or [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) label. This allows the user to increase or decrease the data range of the slider.  ![Slider editable range labels](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-edit-range-label.png%20%22Slider%20with%20editable%20range%20labels%22)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled)
    *
    * @default false
    */
  var rangeLabelInputsEnabled: scala.Boolean = js.native
  /**
    * Indicates whether to display [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) or [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) range values on the slider. The format of labels can be customized via the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction).  Alternatively, developers may also use CSS (e.g. `display: none`) to show/hide labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelsVisible)
    *
    * @default false
    */
  var rangeLabelsVisible: scala.Boolean = js.native
  /**
    * Indicates if the closest thumb will snap to the clicked location on the track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#snapOnClickEnabled)
    *
    * @default true
    */
  var snapOnClickEnabled: scala.Boolean = js.native
  /**
    * The current state of the widget.  **Possible Values:** ready | disabled | editing | dragging
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#state)
    */
  val state: java.lang.String = js.native
  /**
    * Sets steps, or intervals, on the slider that restrict user input to specific values. If an array of numbers is passed to this property, the slider thumbs may only be moved to the positions specified in the array.  If a single number is set, then steps are set along the entire slider range at an interval of the provided value. In this scenario, the user may only slide the thumbs to values at the provided interval. For example, if a value of `0.5` is set here, and the slider [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) is `0` and the slider [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) is `10`, then the user will only be able to update the thumbs to values of 0, 0.5, 1.0, 1.5, 2.0, etc.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#steps)
    */
  var steps: scala.Double | js.Array[scala.Double] = js.native
  /**
    * Function that executes each time a thumb is created on the slider. This can be used to add custom styling to each thumb or hook event listeners to specific thumbs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#thumbCreatedFunction)
    */
  @JSName("thumbCreatedFunction")
  var thumbCreatedFunction_Original: ThumbCreatedFunction = js.native
  /**
    * When set, renders ticks along the slider track. See the [TickConfig](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig) documentation for more information on how to configure tick placement, style, and behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#tickConfigs)
    */
  var tickConfigs: js.Array[TickConfig] = js.native
  /**
    * The HTML Element node representing the slider track. Use this property to attach event listeners to the track or to customize the track's CSS.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#trackElement)
    */
  var trackElement: stdLib.HTMLElement = js.native
  /**
    * An array of numbers representing absolute thumb positions on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#values)
    */
  var values: js.Array[scala.Double] = js.native
  /**
    * The view model for the Slider widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [SliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html) class to access all properties and methods on the Slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#viewModel)
    */
  var viewModel: SliderViewModel = js.native
  /**
    * A function used to format labels. Overrides the default label formatter.  By default labels are formatted in the following way:
    *   * When the data range is less than `10` (`(max - min) < 10`), labels are rounded based on the value set in the [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#precision) property.
    *   * When the data range is larger than `10`, [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labels) display with a precision of no more than two decimal places, though actual slider thumb values will maintain the precision specified in [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#precision).
    *
    *
    * Use this property to override the behavior defined above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction)
    */
  def labelFormatFunction(value: scala.Double): java.lang.String = js.native
  def labelFormatFunction(value: scala.Double, `type`: java.lang.String): java.lang.String = js.native
  def labelFormatFunction(value: scala.Double, `type`: java.lang.String, index: scala.Double): java.lang.String = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#render)
    *
    *
    */
  def render(): js.Any = js.native
  /**
    * Function that executes each time a thumb is created on the slider. This can be used to add custom styling to each thumb or hook event listeners to specific thumbs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#thumbCreatedFunction)
    */
  def thumbCreatedFunction(index: scala.Double, value: scala.Double, thumbElement: stdLib.HTMLElement): scala.Unit = js.native
  def thumbCreatedFunction(
    index: scala.Double,
    value: scala.Double,
    thumbElement: stdLib.HTMLElement,
    labelElement: stdLib.HTMLElement
  ): scala.Unit = js.native
}

@JSGlobal("__esri.Slider")
@js.native
/**
  * A slider widget that can be used for filtering data, or gathering numeric input from a user. The slider can have multiple thumbs, and provides you with the ability to format labels and control user input.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html)
  */
class SliderCls () extends Slider {
  def this(properties: SliderProperties) = this()
}

