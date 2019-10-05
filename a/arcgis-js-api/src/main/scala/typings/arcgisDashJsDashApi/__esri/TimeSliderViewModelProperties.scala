package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`cumulative-from-end`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`cumulative-from-start`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`time-window`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.instant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSliderViewModelProperties extends js.Object {
  /**
    * The temporal extent of the entire slider. It defines the entire time period within which you can visualize your time aware data using the time slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#fullTimeExtent)
    */
  var fullTimeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  /**
    * If animating, the time indicator(s) will restart if they reach the edge.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#loop)
    *
    * @default true
    */
  var loop: js.UndefOr[Boolean] = js.undefined
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
  var mode: js.UndefOr[instant | `time-window` | `cumulative-from-start` | `cumulative-from-end`] = js.undefined
  /**
    * The time (in milliseconds) between playback steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#playRate)
    *
    * @default 1000
    */
  var playRate: js.UndefOr[Double] = js.undefined
  /**
    * Defines specific locations on the time slider where thumbs will snap to when manipulated. If unspecified, ten evenly spaced stops will be added.  For continuous sliding set `stops` to null.
    * ```js
    * timeSlider.viewModel.stops = null;
    * ```
    *
    * To define regularly spaced stops, parse an object with interval and timeExtent properties
    * with types TimeInterval and TimeExtent respectively. The timeExtent property is optional
    * and used to confine stops to a certain date range. This property is useful to
    * commence stops on a spcific day or the week or month.
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
  var stops: js.UndefOr[StopsByDates | StopsByCount | StopsByInterval] = js.undefined
  /**
    * The user defined time extent. Values define the current location of time slider thumbs. The "time-window" [mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#mode) has two values, the other modes only have one.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#values)
    *
    * @default null
    */
  var values: js.UndefOr[js.Array[DateProperties]] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). If this property is set, the TimeSlider widget will update the view's timeExtent property whenever the time slider is manipulated or updated programmatically. This property will affect any time-aware layer in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}

object TimeSliderViewModelProperties {
  @scala.inline
  def apply(
    fullTimeExtent: TimeExtentProperties = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    mode: instant | `time-window` | `cumulative-from-start` | `cumulative-from-end` = null,
    playRate: Int | Double = null,
    stops: StopsByDates | StopsByCount | StopsByInterval = null,
    values: js.Array[DateProperties] = null,
    view: MapViewProperties | SceneViewProperties = null
  ): TimeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (fullTimeExtent != null) __obj.updateDynamic("fullTimeExtent")(fullTimeExtent)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (playRate != null) __obj.updateDynamic("playRate")(playRate.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSliderViewModelProperties]
  }
}

