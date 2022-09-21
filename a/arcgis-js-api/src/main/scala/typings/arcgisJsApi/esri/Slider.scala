package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`horizontal-reversed`
import typings.arcgisJsApi.arcgisJsApiStrings.`max-change`
import typings.arcgisJsApi.arcgisJsApiStrings.`max-click`
import typings.arcgisJsApi.arcgisJsApiStrings.`min-change`
import typings.arcgisJsApi.arcgisJsApiStrings.`min-click`
import typings.arcgisJsApi.arcgisJsApiStrings.`segment-click`
import typings.arcgisJsApi.arcgisJsApiStrings.`segment-drag`
import typings.arcgisJsApi.arcgisJsApiStrings.`thumb-change`
import typings.arcgisJsApi.arcgisJsApiStrings.`thumb-click`
import typings.arcgisJsApi.arcgisJsApiStrings.`thumb-drag`
import typings.arcgisJsApi.arcgisJsApiStrings.`tick-click`
import typings.arcgisJsApi.arcgisJsApiStrings.`track-click`
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
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#disabled)
    */
  var disabled: Boolean = js.native
  
  /**
    * Indicates if the user can drag the segment between thumbs to update thumb positions.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#draggableSegmentsEnabled)
    */
  var draggableSegmentsEnabled: Boolean = js.native
  
  /**
    * When set, the user is restricted from moving slider thumbs to positions higher than this value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#effectiveMax)
    */
  var effectiveMax: Double = js.native
  
  /**
    * When set, the user is restricted from moving slider thumbs to positions less than this value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#effectiveMin)
    */
  var effectiveMin: Double = js.native
  
  /**
    * The HTML Element nodes representing the slider segment between the [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) and [effectiveMin](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#effectiveMin), and the segment between the [effectiveMax](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#effectiveMax) and [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#effectiveSegmentElements)
    */
  val effectiveSegmentElements: Collection[HTMLElement] = js.native
  
  /**
    * A function that provides the developer with access to the input elements when [rangeLabelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled) and/or [labelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelInputsEnabled) are set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputCreatedFunction)
    */
  def inputCreatedFunction(inputElement: Any, `type`: max | min | thumb): scala.Unit = js.native
  def inputCreatedFunction(inputElement: Any, `type`: max | min | thumb, thumbIndex: Double): scala.Unit = js.native
  /**
    * A function that provides the developer with access to the input elements when [rangeLabelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled) and/or [labelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelInputsEnabled) are set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputCreatedFunction)
    */
  @JSName("inputCreatedFunction")
  var inputCreatedFunction_Original: InputCreatedFunction = js.native
  
  /**
    * A function used to format user inputs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputFormatFunction)
    */
  def inputFormatFunction(value: Double): String = js.native
  def inputFormatFunction(value: Double, `type`: average | min | max | tick | value): String = js.native
  def inputFormatFunction(value: Double, `type`: average | min | max | tick | value, index: Double): String = js.native
  def inputFormatFunction(value: Double, `type`: scala.Unit, index: Double): String = js.native
  /**
    * A function used to format user inputs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputFormatFunction)
    */
  @JSName("inputFormatFunction")
  var inputFormatFunction_Original: SliderLabelFormatter = js.native
  
  /**
    * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputFormatFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputParseFunction)
    */
  def inputParseFunction(value: String): Double = js.native
  def inputParseFunction(value: String, `type`: average | min | max | tick | value): Double = js.native
  def inputParseFunction(value: String, `type`: average | min | max | tick | value, index: Double): Double = js.native
  def inputParseFunction(value: String, `type`: scala.Unit, index: Double): Double = js.native
  /**
    * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputFormatFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputParseFunction)
    */
  @JSName("inputParseFunction")
  var inputParseFunction_Original: InputParser = js.native
  
  /**
    * The HTML Element nodes representing [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labels) attached to slider thumbs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelElements)
    */
  val labelElements: Collection[HTMLElement] = js.native
  
  /**
    * A function used to format labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction)
    */
  def labelFormatFunction(value: Double): String = js.native
  def labelFormatFunction(value: Double, `type`: average | min | max | tick | value): String = js.native
  def labelFormatFunction(value: Double, `type`: average | min | max | tick | value, index: Double): String = js.native
  def labelFormatFunction(value: Double, `type`: scala.Unit, index: Double): String = js.native
  /**
    * A function used to format labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original: SliderLabelFormatter = js.native
  
  /**
    * Indicates whether to enable editing input values via keyboard input when the user clicks a label.
    *
    * @default false
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
    * Determines the layout/orientation of the Slider widget.
    *
    * @default horizontal
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
    * The HTML Element node representing the [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) value label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#maxLabelElement)
    */
  val maxLabelElement: HTMLElement = js.native
  
  /**
    * The minimum possible data/thumb value of the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min)
    */
  var min: Double = js.native
  
  /**
    * The HTML Element node representing the [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) value label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#minLabelElement)
    */
  val minLabelElement: HTMLElement = js.native
  
  @JSName("on")
  def on_maxchange(name: `max-change`, eventHandler: SliderMaxChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_maxclick(name: `max-click`, eventHandler: SliderMaxClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_minchange(name: `min-change`, eventHandler: SliderMinChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_minclick(name: `min-click`, eventHandler: SliderMinClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_segmentclick(name: `segment-click`, eventHandler: SliderSegmentClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_segmentdrag(name: `segment-drag`, eventHandler: SliderSegmentDragEventHandler): IHandle = js.native
  @JSName("on")
  def on_thumbchange(name: `thumb-change`, eventHandler: SliderThumbChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_thumbclick(name: `thumb-click`, eventHandler: SliderThumbClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_thumbdrag(name: `thumb-drag`, eventHandler: SliderThumbDragEventHandler): IHandle = js.native
  @JSName("on")
  def on_tickclick(name: `tick-click`, eventHandler: SliderTickClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_trackclick(name: `track-click`, eventHandler: SliderTrackClickEventHandler): IHandle = js.native
  
  /**
    * Defines how slider thumb values should be rounded.
    *
    * @default 4
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#precision)
    */
  var precision: Double = js.native
  
  /**
    * Indicates whether to enable editing range values via keyboard input when the user clicks a [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) or [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) label.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled)
    */
  var rangeLabelInputsEnabled: Boolean = js.native
  
  /**
    * The HTML Element nodes representing interactive slider segments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#segmentElements)
    */
  val segmentElements: Collection[HTMLElement] = js.native
  
  /**
    * Indicates if the closest thumb will snap to the clicked location on the track.
    *
    * @default true
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
    * When `true`, all segments will sync together in updating thumb values when the user drags any segment.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#syncedSegmentsEnabled)
    */
  var syncedSegmentsEnabled: Boolean = js.native
  
  /**
    * Function that executes each time a thumb is created on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#thumbCreatedFunction)
    */
  def thumbCreatedFunction(index: Double, value: Double, thumbElement: HTMLElement): scala.Unit = js.native
  def thumbCreatedFunction(index: Double, value: Double, thumbElement: HTMLElement, labelElement: HTMLElement): scala.Unit = js.native
  /**
    * Function that executes each time a thumb is created on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#thumbCreatedFunction)
    */
  @JSName("thumbCreatedFunction")
  var thumbCreatedFunction_Original: ThumbCreatedFunction = js.native
  
  /**
    * The HTML Element nodes representing slider thumbs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#thumbElements)
    */
  val thumbElements: Collection[HTMLElement] = js.native
  
  /**
    * When `false`, the user can freely move any slider thumb to any position along the track.
    *
    * @default true
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
    * The HTML Element nodes representing slider ticks and their associated labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#tickElements)
    */
  val tickElements: Collection[Collection[TickElementGroup]] = js.native
  
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
