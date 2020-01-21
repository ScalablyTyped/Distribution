package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.`cumulative-from-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`cumulative-from-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`time-window`
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.instant
import typings.arcgisJsApi.arcgisJsApiStrings.playing
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeSliderViewModel extends Accessor {
  /**
    * Defined specific locations on the timeline that the handles will snap to when manipulated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#effectiveStops)
    *
    * @default null
    */
  val effectiveStops: js.Array[Date] = js.native
  /**
    * The temporal extent of the entire slider. It defines the entire time period within which you can visualize your time aware data using the time slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#fullTimeExtent)
    */
  var fullTimeExtent: TimeExtent = js.native
  /**
    * If animating, the time indicator(s) will restart if they reach the edge.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#loop)
    *
    * @default true
    */
  var loop: Boolean = js.native
  /**
    * The time slider mode. This property is used for defining if the temporal data will be displayed cumulatively up to a point in time, a single instant in time, or within a time range. See the following table for possible values.
    *
    * Possible Values       | Description   | Example |
    * ----------------------|-------------- | ------- |
    * instant               | The slider will show temporal data that falls on a single instance in time. Set the [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#values) property to an array with one date. | <img alt="mode-instance" src="../../assets/img/apiref/widgets/timeslider/mode-instance.png"> |
    * time-window           | The slider will show temporal data that falls within a given time range. This is the default. Set [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#values) property to an array with two dates. | <img alt="mode-instance" src="../../assets/img/apiref/widgets/timeslider/mode-time-window.png"> |
    * cumulative-from-start | Similar to `time-window` with the start time is always pinned to the start of the slider. Set the [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#values) property to have one date, which is the end date. | <img alt="mode-instance" src="../../assets/img/apiref/widgets/timeslider/mode-from-start.png"> |
    * cumulative-from-end   | Also, similar to the `time-window` with the end time pinned to the end of the slider. Set the [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#values) property to have one date, which is the start date. | <img alt="mode-instance" src="../../assets/img/apiref/widgets/timeslider/mode-from-end.png"> |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#mode)
    *
    * @default time-window
    */
  var mode: instant | `time-window` | `cumulative-from-start` | `cumulative-from-end` = js.native
  /**
    * The time (in milliseconds) between playback steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#playRate)
    *
    * @default 1000
    */
  var playRate: Double = js.native
  /**
    * The view model's state.
    *
    * Value | Description
    * ------------|-------------
    * disabled | not ready yet
    * ready    | ready for time navigation
    * playing  | time is playing in the navigator
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | ready | playing = js.native
  /**
    * Defines specific locations on the time slider where thumbs will snap to when manipulated. If unspecified, ten evenly spaced stops will be added.  For continuous sliding set `stops` to null.
    * ```js
    * timeSlider.viewModel.stops = null;
    * ```
    *
    * To define regularly spaced stops, parse an object with interval and timeExtent properties
    * with types TimeInterval and TimeExtent respectively. The timeExtent property is optional
    * and used to confine stops to a certain date range. This property is useful to
    * commence stops on a specific day or the week or month.
    * If a stop definition by interval results in excess of 10,000 stops then the view model
    * will default to ten evenly spaced stops.
    * ```js
    * { interval: TimeInterval, timeExtent: TimeExtent }
    * ```
    * ```js
    * // Add yearly intervals starting from the beginning of the TimeSlider.
    * timeSlider.viewModel.stops = {
    *   interval: {
    *     value: 1,
    *     unit: "years"
    *   }
    * }
    * ```
    * Rather than regular time intervals the TimeSlider can be divided into evenly spaced
    * stops. As with the previous method, divisions can be confined to a specific date range
    * using the optional timeExtent property.
    * ```js
    * // Add stops at 15 evenly spaced intervals.
    * timeSlider.viewModel.stops = {
    *   count: 15
    * }
    * ```
    * For irregular spaced stops simply assign an array of dates as demonstrated below.
    * ```js
    * // Add nine irregular stops.
    * timeSlider.viewModel.stops = {
    *   dates: [
    *     new Date(2000, 0, 1), new Date(2001, 3, 8), new Date(2002, 0, 10),
    *     new Date(2003, 12, 8), new Date(2004, 2, 19), new Date(2005, 7, 5),
    *     new Date(2006, 9, 11), new Date(2007, 11, 21), new Date(2008, 1, 10)
    *   ]
    * }
    * ```
    * Lastly, to constrain or offset division by count or interval use the optional timeExtent property.
    * ```js
    * // Add yearly stops from Christmas 2019 to Christmas 2029 only
    * timeSlider.viewModel.stops = {
    *   interval: {
    *     value: 1,
    *     unit: "years"
    *   },
    *   timeExtent: {
    *     start: new Date(2019, 11, 25),
    *     end: new Date(2029, 11, 25)
    *   }
    * }
    *
    * // Likewise, add stops that represent quarters of 2019 only.
    * timeSlider.viewModel.stops = {
    *   count: 4,
    *   timeExtent: {
    *     start: new Date(2019, 0, 1),
    *     end: new Date(2020, 0, 1)
    *   }
    * }
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#stops)
    *
    * @default { count : 10 }
    */
  var stops: StopsByDates | StopsByCount | StopsByInterval = js.native
  /**
    * The current time extent of the time slider. This property can be watched for updates and used to update the time extent property in queries and/or the layer filters and effects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#timeExtent)
    *
    * @default null
    */
  val timeExtent: TimeExtent = js.native
  /**
    * The user defined time extent. Values define the current location of time slider thumbs. The "time-window" [mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#mode) has two values, the other modes only have one.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#values)
    *
    * @default null
    */
  var values: js.Array[Date] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). If this property is set, the TimeSlider widget will update the view's timeExtent property whenever the time slider is manipulated or updated programmatically. This property will affect any time-aware layer in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * Incrementally moves the time extent forward one stop
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#next)
    *
    *
    */
  def next(): Unit = js.native
  /**
    * Initiates the time slider's temporal playback.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#play)
    *
    *
    */
  def play(): Unit = js.native
  /**
    * Incrementally moves the time extent back one stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#previous)
    *
    *
    */
  def previous(): Unit = js.native
  /**
    * Stops the time slider's temporal playback.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#stop)
    *
    *
    */
  def stop(): Unit = js.native
}

@JSGlobal("__esri.TimeSliderViewModel")
@js.native
object TimeSliderViewModel extends TopLevel[TimeSliderViewModelConstructor]

