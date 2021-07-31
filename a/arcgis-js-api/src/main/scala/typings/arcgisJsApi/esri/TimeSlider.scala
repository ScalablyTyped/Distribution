package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`cumulative-from-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`cumulative-from-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`time-window`
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.compact
import typings.arcgisJsApi.arcgisJsApiStrings.extent
import typings.arcgisJsApi.arcgisJsApiStrings.instant
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.wide
import typings.std.Date
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSlider
  extends StObject
     with Widget_ {
  
  /**
    * When `true`, sets the widget to a disabled state so the user cannot interact with it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#disabled)
    */
  var disabled: Boolean = js.native
  
  /**
    * Lists the specific locations on the timeline where handle(s) will snap to when manipulated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#effectiveStops)
    */
  val effectiveStops: js.Array[Date] = js.native
  
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
  
  def labelFormatFunction(value: js.Array[Date]): Unit = js.native
  def labelFormatFunction(value: js.Array[Date], `type`: Unit, element: HTMLElement): Unit = js.native
  def labelFormatFunction(value: js.Array[Date], `type`: extent, element: Unit, layout: compact): Unit = js.native
  def labelFormatFunction(value: js.Array[Date], `type`: extent, element: Unit, layout: wide): Unit = js.native
  def labelFormatFunction(value: js.Array[Date], `type`: extent, element: HTMLElement, layout: compact): Unit = js.native
  def labelFormatFunction(value: js.Array[Date], `type`: extent, element: HTMLElement, layout: wide): Unit = js.native
  def labelFormatFunction(value: js.Array[Date], `type`: max, element: Unit, layout: compact): Unit = js.native
  def labelFormatFunction(value: js.Array[Date], `type`: max, element: Unit, layout: wide): Unit = js.native
  def labelFormatFunction(value: js.Array[Date], `type`: max, element: HTMLElement, layout: compact): Unit = js.native
  def labelFormatFunction(value: js.Array[Date], `type`: max, element: HTMLElement, layout: wide): Unit = js.native
  def labelFormatFunction(value: js.Array[Date], `type`: min, element: Unit, layout: compact): Unit = js.native
  def labelFormatFunction(value: js.Array[Date], `type`: min, element: Unit, layout: wide): Unit = js.native
  def labelFormatFunction(value: js.Array[Date], `type`: min, element: HTMLElement, layout: compact): Unit = js.native
  def labelFormatFunction(value: js.Array[Date], `type`: min, element: HTMLElement, layout: wide): Unit = js.native
  /**
    * A function used to specify custom formatting and styling of the min, max, and extent labels of the TimeSlider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#labelFormatFunction)
    */
  def labelFormatFunction(value: Date): Unit = js.native
  def labelFormatFunction(value: Date, `type`: Unit, element: HTMLElement): Unit = js.native
  def labelFormatFunction(value: Date, `type`: extent, element: Unit, layout: compact): Unit = js.native
  def labelFormatFunction(value: Date, `type`: extent, element: Unit, layout: wide): Unit = js.native
  def labelFormatFunction(value: Date, `type`: extent, element: HTMLElement, layout: compact): Unit = js.native
  def labelFormatFunction(value: Date, `type`: extent, element: HTMLElement, layout: wide): Unit = js.native
  def labelFormatFunction(value: Date, `type`: max, element: Unit, layout: compact): Unit = js.native
  def labelFormatFunction(value: Date, `type`: max, element: Unit, layout: wide): Unit = js.native
  def labelFormatFunction(value: Date, `type`: max, element: HTMLElement, layout: compact): Unit = js.native
  def labelFormatFunction(value: Date, `type`: max, element: HTMLElement, layout: wide): Unit = js.native
  def labelFormatFunction(value: Date, `type`: min, element: Unit, layout: compact): Unit = js.native
  def labelFormatFunction(value: Date, `type`: min, element: Unit, layout: wide): Unit = js.native
  def labelFormatFunction(value: Date, `type`: min, element: HTMLElement, layout: compact): Unit = js.native
  def labelFormatFunction(value: Date, `type`: min, element: HTMLElement, layout: wide): Unit = js.native
  /**
    * A function used to specify custom formatting and styling of the min, max, and extent labels of the TimeSlider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original: DateLabelFormatter = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_compact(value: js.Array[Date], `type`: Unit, element: Unit, layout: compact): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_compact(value: js.Array[Date], `type`: Unit, element: HTMLElement, layout: compact): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_compact(value: Date, `type`: Unit, element: Unit, layout: compact): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_compact(value: Date, `type`: Unit, element: HTMLElement, layout: compact): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_extent(value: js.Array[Date], `type`: extent): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_extent(value: js.Array[Date], `type`: extent, element: HTMLElement): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_extent(value: Date, `type`: extent): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_extent(value: Date, `type`: extent, element: HTMLElement): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_max(value: js.Array[Date], `type`: max): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_max(value: js.Array[Date], `type`: max, element: HTMLElement): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_max(value: Date, `type`: max): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_max(value: Date, `type`: max, element: HTMLElement): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_min(value: js.Array[Date], `type`: min): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_min(value: js.Array[Date], `type`: min, element: HTMLElement): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_min(value: Date, `type`: min): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_min(value: Date, `type`: min, element: HTMLElement): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_wide(value: js.Array[Date], `type`: Unit, element: Unit, layout: wide): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_wide(value: js.Array[Date], `type`: Unit, element: HTMLElement, layout: wide): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_wide(value: Date, `type`: Unit, element: Unit, layout: wide): Unit = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_wide(value: Date, `type`: Unit, element: HTMLElement, layout: wide): Unit = js.native
  
  /**
    * Determines the layout used by the TimeSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#layout)
    */
  var layout: auto | compact | wide = js.native
  
  /**
    * When `true`, the time slider will play its animation in a loop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#loop)
    */
  var loop: Boolean = js.native
  
  /**
    * The time slider mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#mode)
    */
  var mode: instant | `time-window` | `cumulative-from-start` | `cumulative-from-end` = js.native
  
  /**
    * Incrementally moves the time extent forward one stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#next)
    */
  def next(): Unit = js.native
  
  /**
    * Initiates the time slider's temporal playback.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#play)
    */
  def play(): Unit = js.native
  
  /**
    * The time (in milliseconds) between animation steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#playRate)
    */
  var playRate: Double = js.native
  
  /**
    * Incrementally moves the time extent back one stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#previous)
    */
  def previous(): Unit = js.native
  
  /**
    * Stops the time slider's temporal playback.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#stop)
    */
  def stop(): Unit = js.native
  
  /**
    * Defines specific locations on the time slider where thumbs will snap to when manipulated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#stops)
    */
  var stops: StopsByDates | StopsByCount | StopsByInterval = js.native
  
  /**
    * When set, overrides the default TimeSlider ticks labelling system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#tickConfigs)
    */
  var tickConfigs: js.Array[TickConfig] = js.native
  
  /**
    * The current time extent of the time slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#timeExtent)
    */
  val timeExtent: TimeExtent = js.native
  
  /**
    * Shows/hides time in the display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#timeVisible)
    */
  var timeVisible: Boolean = js.native
  
  /**
    * The user defined time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#values)
    */
  var values: js.Array[Date] = js.native
  
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
