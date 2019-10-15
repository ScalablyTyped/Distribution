package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`cumulative-from-end`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`cumulative-from-start`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`time-window`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.instant
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeSlider extends Widget {
  /**
    * Lists the specific locations on the timeline where handle(s) will snap to when manipulated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#effectiveStops)
    *
    * @default null
    */
  val effectiveStops: js.Array[Date] = js.native
  /**
    * The temporal extent of the entire slider. It defines the entire time period within which you can visualize your time aware data using the time slider widget.
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
  /**
    * When `true`, the time slider will play its animation in a loop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#loop)
    *
    * @default true
    */
  var loop: Boolean = js.native
  /**
    * The time slider mode. This property is used for defining if the temporal data will be displayed cumulatively up to a point in time, a single instant in time, or within a time range. See the following table for possible values.
    *
    * Possible Values       | Description   | Example |
    * ----------------------|-------------- | ------- |
    * instant               | The slider will show temporal data that falls on a single instance in time. Set the [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#values) property to an array with one date. | <img alt="mode-instance" src="../../assets/img/apiref/widgets/timeslider/mode-instance.png"> |
    * time-window           | The slider will show temporal data that falls within a given time range. This is the default. Set [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#values) property to an array with two dates. | <img alt="mode-instance" src="../../assets/img/apiref/widgets/timeslider/mode-time-window.png"> |
    * cumulative-from-start | Similar to `time-window` with the start time is always pinned to the start of the slider. Set the [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#values) property to have one date, which is the end date. | <img alt="mode-instance" src="../../assets/img/apiref/widgets/timeslider/mode-from-start.png"> |
    * cumulative-from-end   | Also, similar to the `time-window` with the end time pinned to the end of the slider. Set the [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#values) property to have one date, which is the start date. | <img alt="mode-instance" src="../../assets/img/apiref/widgets/timeslider/mode-from-end.png"> |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#mode)
    *
    * @default "time-window"
    */
  var mode: instant | `time-window` | `cumulative-from-start` | `cumulative-from-end` = js.native
  /**
    * The time (in milliseconds) between animation steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#playRate)
    *
    * @default 1000
    */
  var playRate: Double = js.native
  /**
    * Defines specific locations on the time slider where thumbs will snap to when manipulated. If unspecified, ten evenly spaced stops will be added.  To define regularly spaced stops based on specified [time interval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html) and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html), use [StopsByInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByInterval). Use [StopsByCount](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByCount) to define evenly spaced timeline stops. Lastly, for irregular dates use [StopsByDates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByDates). Please refer below for examples of each of these objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#stops)
    *
    * @default { count : 10 }
    */
  var stops: StopsByDates | StopsByCount | StopsByInterval = js.native
  /**
    * The current time extent of the time slider. This property can be watched for updates and used to update the time extent property in queries and/or the layer filters and effects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#timeExtent)
    *
    * @default null
    */
  val timeExtent: TimeExtent = js.native
  /**
    * Shows/hides time in the display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#timeVisible)
    *
    * @default false
    */
  var timeVisible: Boolean = js.native
  /**
    * The user defined time extent. Values define the current location of time slider thumbs. The "time-window" [mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#mode) has two values, the other modes only have one.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#values)
    *
    * @default null
    */
  var values: js.Array[Date] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). If this property is set, the TimeSlider widget will update the view's timeExtent property whenever the time slider is manipulated or updated programmatically. This property will affect any time-aware layer in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [TimeSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#viewModel)
    */
  var viewModel: TimeSliderViewModel = js.native
  /**
    * Incrementally moves the time extent forward one stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#next)
    *
    *
    */
  def next(): Unit = js.native
  /**
    * Initiates the time slider's temporal playback.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#play)
    *
    *
    */
  def play(): Unit = js.native
  /**
    * Incrementally moves the time extent back one stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#previous)
    *
    *
    */
  def previous(): Unit = js.native
  /**
    * Stops the time slider's temporal playback.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#stop)
    *
    *
    */
  def stop(): Unit = js.native
}

@JSGlobal("__esri.TimeSlider")
@js.native
object TimeSlider extends TopLevel[TimeSliderConstructor]

