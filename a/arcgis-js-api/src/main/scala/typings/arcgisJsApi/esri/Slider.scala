package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`horizontal-reversed`
import typings.arcgisJsApi.arcgisJsApiStrings.`max-change`
import typings.arcgisJsApi.arcgisJsApiStrings.`min-change`
import typings.arcgisJsApi.arcgisJsApiStrings.`segment-drag`
import typings.arcgisJsApi.arcgisJsApiStrings.`thumb-change`
import typings.arcgisJsApi.arcgisJsApiStrings.`thumb-drag`
import typings.arcgisJsApi.arcgisJsApiStrings.`vertical-reversed`
import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.dragging
import typings.arcgisJsApi.arcgisJsApiStrings.editing
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.thumb
import typings.arcgisJsApi.arcgisJsApiStrings.tick
import typings.arcgisJsApi.arcgisJsApiStrings.value
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slider
  extends StObject
     with Widget_ {
  
  /**
    * When `true`, sets the slider to a disabled state so the user cannot interact with it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#disabled)
    */
  var disabled: Boolean = js.native
  
  /**
    * Indicates if the user can drag the segment between thumbs to update thumb positions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#draggableSegmentsEnabled)
    */
  var draggableSegmentsEnabled: Boolean = js.native
  
  /**
    * A function that provides the developer with access to the input elements when [rangeLabelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled) and/or [labelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelInputsEnabled) are set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputCreatedFunction)
    */
  @JSName("inputCreatedFunction")
  var inputCreatedFunction_Original: InputCreatedFunction = js.native
  /**
    * A function that provides the developer with access to the input elements when [rangeLabelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled) and/or [labelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelInputsEnabled) are set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputCreatedFunction)
    */
  @JSName("inputCreatedFunction")
  def inputCreatedFunction_max(inputElement: js.Any, `type`: max): Unit = js.native
  @JSName("inputCreatedFunction")
  def inputCreatedFunction_max(inputElement: js.Any, `type`: max, thumbIndex: Double): Unit = js.native
  @JSName("inputCreatedFunction")
  def inputCreatedFunction_min(inputElement: js.Any, `type`: min): Unit = js.native
  @JSName("inputCreatedFunction")
  def inputCreatedFunction_min(inputElement: js.Any, `type`: min, thumbIndex: Double): Unit = js.native
  @JSName("inputCreatedFunction")
  def inputCreatedFunction_thumb(inputElement: js.Any, `type`: thumb): Unit = js.native
  @JSName("inputCreatedFunction")
  def inputCreatedFunction_thumb(inputElement: js.Any, `type`: thumb, thumbIndex: Double): Unit = js.native
  
  /**
    * A function used to format user inputs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputFormatFunction)
    */
  def inputFormatFunction(value: Double): String = js.native
  def inputFormatFunction(value: Double, `type`: Unit, index: Double): String = js.native
  /**
    * A function used to format user inputs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputFormatFunction)
    */
  @JSName("inputFormatFunction")
  var inputFormatFunction_Original: SliderLabelFormatter = js.native
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
    * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputFormatFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputParseFunction)
    */
  def inputParseFunction(value: String): Double = js.native
  def inputParseFunction(value: String, `type`: Unit, index: Double): Double = js.native
  /**
    * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputFormatFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputParseFunction)
    */
  @JSName("inputParseFunction")
  var inputParseFunction_Original: InputParser = js.native
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
    * A function used to format labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction)
    */
  def labelFormatFunction(value: Double): String = js.native
  def labelFormatFunction(value: Double, `type`: Unit, index: Double): String = js.native
  /**
    * A function used to format labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original: SliderLabelFormatter = js.native
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
  
  /**
    * Indicates whether to enable editing input values via keyboard input when the user clicks a label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelInputsEnabled)
    */
  var labelInputsEnabled: Boolean = js.native
  
  /**
    * An array of strings associated with 'values' generated using an internal label formatter or the values returned from [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labels)
    */
  val labels: js.Array[String] = js.native
  
  /**
    * Indicates whether to display labels alongside slider thumbs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelsVisible)
    */
  var labelsVisible: Boolean = js.native
  
  /**
    * Determines the layout/orientation of the Slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#layout)
    */
  var layout: horizontal | `horizontal-reversed` | vertical | `vertical-reversed` = js.native
  
  /**
    * The maximum possible data/thumb value of the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max)
    */
  var max: Double = js.native
  
  /**
    * The minimum possible data/thumb value of the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min)
    */
  var min: Double = js.native
  
  @JSName("on")
  def on_maxchange(name: `max-change`, eventHandler: SliderMaxChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_minchange(name: `min-change`, eventHandler: SliderMinChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_segmentdrag(name: `segment-drag`, eventHandler: SliderSegmentDragEventHandler): IHandle = js.native
  @JSName("on")
  def on_thumbchange(name: `thumb-change`, eventHandler: SliderThumbChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_thumbdrag(name: `thumb-drag`, eventHandler: SliderThumbDragEventHandler): IHandle = js.native
  
  /**
    * Defines how slider thumb values should be rounded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#precision)
    */
  var precision: Double = js.native
  
  /**
    * Indicates whether to enable editing range values via keyboard input when the user clicks a [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) or [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled)
    */
  var rangeLabelInputsEnabled: Boolean = js.native
  
  /**
    * Indicates whether to display [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) or [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) range values on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelsVisible)
    */
  var rangeLabelsVisible: Boolean = js.native
  
  /**
    * Indicates if the closest thumb will snap to the clicked location on the track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#snapOnClickEnabled)
    */
  var snapOnClickEnabled: Boolean = js.native
  
  /**
    * The current state of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#state)
    */
  val state: ready | disabled | editing | dragging = js.native
  
  /**
    * Sets steps, or intervals, on the slider that restrict user input to specific values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#steps)
    */
  var steps: Double | js.Array[Double] = js.native
  
  /**
    * Function that executes each time a thumb is created on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#thumbCreatedFunction)
    */
  def thumbCreatedFunction(index: Double, value: Double, thumbElement: HTMLElement): Unit = js.native
  def thumbCreatedFunction(index: Double, value: Double, thumbElement: HTMLElement, labelElement: HTMLElement): Unit = js.native
  /**
    * Function that executes each time a thumb is created on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#thumbCreatedFunction)
    */
  @JSName("thumbCreatedFunction")
  var thumbCreatedFunction_Original: ThumbCreatedFunction = js.native
  
  /**
    * When `false`, the user can freely move any slider thumb to any position along the track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#thumbsConstrained)
    */
  var thumbsConstrained: Boolean = js.native
  
  /**
    * When set, renders ticks along the slider track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#tickConfigs)
    */
  var tickConfigs: js.Array[TickConfig] = js.native
  
  /**
    * The HTML Element node representing the slider track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#trackElement)
    */
  var trackElement: HTMLElement = js.native
  
  /**
    * An array of numbers representing absolute thumb positions on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#values)
    */
  var values: js.Array[Double] = js.native
  
  /**
    * The view model for the Slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#viewModel)
    */
  var viewModel: SliderViewModel = js.native
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#visibleElements)
    */
  var visibleElements: SliderVisibleElements = js.native
}
