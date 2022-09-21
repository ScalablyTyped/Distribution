package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`cumulative-from-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`cumulative-from-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`time-window`
import typings.arcgisJsApi.arcgisJsApiStrings.`trigger-action`
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.compact
import typings.arcgisJsApi.arcgisJsApiStrings.extent
import typings.arcgisJsApi.arcgisJsApiStrings.instant
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.wide
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSlider
  extends StObject
     with Widget_ {
  
  /**
    * Defines actions that will appear in a menu when the user clicks the ellipsis button ![timeSlider-actions-menu](https://developers.arcgis.com/javascript/latest/assets/img/apiref/widgets/timeslider/ellipsis.png) in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#actions)
    */
  var actions: Collection[Action] = js.native
  
  /**
    * When `true`, sets the widget to a disabled state so the user cannot interact with it.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#disabled)
    */
  var disabled: Boolean = js.native
  
  /**
    * Lists the specific locations on the timeline where handle(s) will snap to when manipulated.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#effectiveStops)
    */
  val effectiveStops: js.Array[js.Date] = js.native
  
  /**
    * The temporal extent of the entire slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#fullTimeExtent)
    */
  var fullTimeExtent: TimeExtent = js.native
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#iconClass)
    */
  val iconClass: String = js.native
  
  def labelFormatFunction(value: js.Array[js.Date]): scala.Unit = js.native
  def labelFormatFunction(value: js.Array[js.Date], `type`: min | max | extent): scala.Unit = js.native
  def labelFormatFunction(value: js.Array[js.Date], `type`: min | max | extent, element: scala.Unit, layout: compact | wide): scala.Unit = js.native
  def labelFormatFunction(value: js.Array[js.Date], `type`: min | max | extent, element: HTMLElement): scala.Unit = js.native
  def labelFormatFunction(value: js.Array[js.Date], `type`: min | max | extent, element: HTMLElement, layout: compact | wide): scala.Unit = js.native
  def labelFormatFunction(value: js.Array[js.Date], `type`: scala.Unit, element: scala.Unit, layout: compact | wide): scala.Unit = js.native
  def labelFormatFunction(value: js.Array[js.Date], `type`: scala.Unit, element: HTMLElement): scala.Unit = js.native
  def labelFormatFunction(value: js.Array[js.Date], `type`: scala.Unit, element: HTMLElement, layout: compact | wide): scala.Unit = js.native
  /**
    * A function used to specify custom formatting and styling of the min, max, and extent labels of the TimeSlider.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#labelFormatFunction)
    */
  def labelFormatFunction(value: js.Date): scala.Unit = js.native
  def labelFormatFunction(value: js.Date, `type`: min | max | extent): scala.Unit = js.native
  def labelFormatFunction(value: js.Date, `type`: min | max | extent, element: scala.Unit, layout: compact | wide): scala.Unit = js.native
  def labelFormatFunction(value: js.Date, `type`: min | max | extent, element: HTMLElement): scala.Unit = js.native
  def labelFormatFunction(value: js.Date, `type`: min | max | extent, element: HTMLElement, layout: compact | wide): scala.Unit = js.native
  def labelFormatFunction(value: js.Date, `type`: scala.Unit, element: scala.Unit, layout: compact | wide): scala.Unit = js.native
  def labelFormatFunction(value: js.Date, `type`: scala.Unit, element: HTMLElement): scala.Unit = js.native
  def labelFormatFunction(value: js.Date, `type`: scala.Unit, element: HTMLElement, layout: compact | wide): scala.Unit = js.native
  /**
    * A function used to specify custom formatting and styling of the min, max, and extent labels of the TimeSlider.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original: DateLabelFormatter = js.native
  
  /**
    * Determines the layout used by the TimeSlider widget.
    *
    * @default auto
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#layout)
    */
  var layout: auto | compact | wide = js.native
  
  /**
    * When `true`, the time slider will play its animation in a loop.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#loop)
    */
  var loop: Boolean = js.native
  
  /**
    * The time slider mode.
    *
    * @default "time-window"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#mode)
    */
  var mode: instant | `time-window` | `cumulative-from-start` | `cumulative-from-end` = js.native
  
  /**
    * Incrementally moves the time extent forward one stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#next)
    */
  def next(): scala.Unit = js.native
  
  @JSName("on")
  def on_triggeraction(name: `trigger-action`, eventHandler: TimeSliderTriggerActionEventHandler): IHandle = js.native
  
  /**
    * Initiates the time slider's temporal playback.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#play)
    */
  def play(): scala.Unit = js.native
  
  /**
    * The time (in milliseconds) between animation steps.
    *
    * @default 1000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#playRate)
    */
  var playRate: Double = js.native
  
  /**
    * Incrementally moves the time extent back one stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#previous)
    */
  def previous(): scala.Unit = js.native
  
  /**
    * Stops the time slider's temporal playback.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#stop)
    */
  def stop(): scala.Unit = js.native
  
  /**
    * Defines specific locations on the time slider where thumbs will snap to when manipulated.
    *
    * @default { count : 10 }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#stops)
    */
  var stops: StopsByDates | StopsByCount | StopsByInterval = js.native
  
  /**
    * When set, overrides the default TimeSlider ticks labelling system.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#tickConfigs)
    */
  var tickConfigs: js.Array[TickConfig] = js.native
  
  /**
    * The current time extent of the time slider.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#timeExtent)
    */
  var timeExtent: TimeExtent = js.native
  
  /**
    * Shows/hides time in the display.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#timeVisible)
    */
  var timeVisible: Boolean = js.native
  
  /**
    * Updates the [time slider](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider) widget definition in the provided [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#updateWebDocument)
    */
  def updateWebDocument(webmap: WebMap): scala.Unit = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#viewModel)
    */
  var viewModel: TimeSliderViewModel = js.native
}
