package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`cumulative-from-end`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`cumulative-from-start`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`time-window`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.instant
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSliderProperties extends WidgetProperties {
  /**
    * The temporal extent of the entire slider. It defines the entire time period within which you can visualize your time aware data using the time slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#fullTimeExtent)
    */
  var fullTimeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  /**
    * When `true`, the time slider will play its animation in a loop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#loop)
    *
    * @default true
    */
  var loop: js.UndefOr[Boolean] = js.undefined
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
  var mode: js.UndefOr[instant | `time-window` | `cumulative-from-start` | `cumulative-from-end`] = js.undefined
  /**
    * The time (in milliseconds) between animation steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#playRate)
    *
    * @default 1000
    */
  var playRate: js.UndefOr[Double] = js.undefined
  /**
    * Defines specific locations on the time slider where thumbs will snap to when manipulated. If unspecified, ten evenly spaced stops will be added.  To define regularly spaced stops based on specified [time interval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html) and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html), use [StopsByInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByInterval). Use [StopsByCount](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByCount) to define evenly spaced timeline stops. Lastly, for irregular dates use [StopsByDates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByDates). Please refer below for examples of each of these objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#stops)
    *
    * @default { count : 10 }
    */
  var stops: js.UndefOr[StopsByDates | StopsByCount | StopsByInterval] = js.undefined
  /**
    * Shows/hides time in the display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#timeVisible)
    *
    * @default false
    */
  var timeVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * The user defined time extent. Values define the current location of time slider thumbs. The "time-window" [mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#mode) has two values, the other modes only have one.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#values)
    *
    * @default null
    */
  var values: js.UndefOr[js.Array[DateProperties]] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). If this property is set, the TimeSlider widget will update the view's timeExtent property whenever the time slider is manipulated or updated programmatically. This property will affect any time-aware layer in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [TimeSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[TimeSliderViewModelProperties] = js.undefined
}

object TimeSliderProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    fullTimeExtent: TimeExtentProperties = null,
    id: String = null,
    label: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    mode: instant | `time-window` | `cumulative-from-start` | `cumulative-from-end` = null,
    playRate: Int | Double = null,
    stops: StopsByDates | StopsByCount | StopsByInterval = null,
    timeVisible: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[DateProperties] = null,
    view: MapViewProperties | SceneViewProperties = null,
    viewModel: TimeSliderViewModelProperties = null
  ): TimeSliderProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (fullTimeExtent != null) __obj.updateDynamic("fullTimeExtent")(fullTimeExtent)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (playRate != null) __obj.updateDynamic("playRate")(playRate.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    if (!js.isUndefined(timeVisible)) __obj.updateDynamic("timeVisible")(timeVisible)
    if (values != null) __obj.updateDynamic("values")(values)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[TimeSliderProperties]
  }
}

