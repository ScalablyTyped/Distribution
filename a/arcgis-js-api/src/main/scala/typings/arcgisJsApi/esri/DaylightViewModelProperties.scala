package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.fall
import typings.arcgisJsApi.arcgisJsApiStrings.spring
import typings.arcgisJsApi.arcgisJsApiStrings.summer
import typings.arcgisJsApi.arcgisJsApiStrings.winter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DaylightViewModelProperties extends js.Object {
  /**
    * A season can be set instead of a date. Each season uses a fixed date corresponding to the seasonsal equinoxes and solstices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#currentSeason)
    *
    * @default "spring"
    */
  var currentSeason: js.UndefOr[spring | summer | fall | winter] = js.undefined
  /**
    * Starts or pauses the daytime animation cycling through the minutes of the day. Set to `true` to start the animation and to `false` to pause it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#dayPlaying)
    *
    * @default false
    */
  var dayPlaying: js.UndefOr[Boolean] = js.undefined
  /**
    * The calendar date in the timezone given by [utcOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#localDate)
    */
  var localDate: js.UndefOr[DateProperties] = js.undefined
  /**
    * Controls the daytime and date animation speed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#playSpeedMultiplier)
    *
    * @default 1.0
    */
  var playSpeedMultiplier: js.UndefOr[Double] = js.undefined
  /**
    * Slider position for the time of day in the timezone given by [utcOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset). The position represents the time of the day in minutes. Possible values range between 0 and 1440.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#timeSliderPosition)
    */
  var timeSliderPosition: js.UndefOr[Double] = js.undefined
  /**
    * The difference in hours between UTC time and the time displayed in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset)
    */
  var utcOffset: js.UndefOr[Double] = js.undefined
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
  /**
    * Starts or pauses the date animation cycling through the months of the year. Set to `true` to start the animation and to `false` to pause it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#yearPlaying)
    *
    * @default false
    */
  var yearPlaying: js.UndefOr[Boolean] = js.undefined
}

object DaylightViewModelProperties {
  @scala.inline
  def apply(
    currentSeason: spring | summer | fall | winter = null,
    dayPlaying: js.UndefOr[Boolean] = js.undefined,
    localDate: DateProperties = null,
    playSpeedMultiplier: js.UndefOr[Double] = js.undefined,
    timeSliderPosition: js.UndefOr[Double] = js.undefined,
    utcOffset: js.UndefOr[Double] = js.undefined,
    view: SceneViewProperties = null,
    yearPlaying: js.UndefOr[Boolean] = js.undefined
  ): DaylightViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (currentSeason != null) __obj.updateDynamic("currentSeason")(currentSeason.asInstanceOf[js.Any])
    if (!js.isUndefined(dayPlaying)) __obj.updateDynamic("dayPlaying")(dayPlaying.get.asInstanceOf[js.Any])
    if (localDate != null) __obj.updateDynamic("localDate")(localDate.asInstanceOf[js.Any])
    if (!js.isUndefined(playSpeedMultiplier)) __obj.updateDynamic("playSpeedMultiplier")(playSpeedMultiplier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeSliderPosition)) __obj.updateDynamic("timeSliderPosition")(timeSliderPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(utcOffset)) __obj.updateDynamic("utcOffset")(utcOffset.get.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(yearPlaying)) __obj.updateDynamic("yearPlaying")(yearPlaying.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaylightViewModelProperties]
  }
}

