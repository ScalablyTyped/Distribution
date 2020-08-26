package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.fall
import typings.arcgisJsApi.arcgisJsApiStrings.spring
import typings.arcgisJsApi.arcgisJsApiStrings.summer
import typings.arcgisJsApi.arcgisJsApiStrings.winter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DaylightViewModelProperties extends js.Object {
  /**
    * A season can be set instead of a date. Each season uses a fixed date corresponding to the seasonsal equinoxes and solstices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#currentSeason)
    */
  var currentSeason: js.UndefOr[spring | summer | fall | winter] = js.native
  /**
    * Starts or pauses the daytime animation cycling through the minutes of the day. Set to `true` to start the animation and to `false` to pause it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#dayPlaying)
    *
    * @default false
    */
  var dayPlaying: js.UndefOr[Boolean] = js.native
  /**
    * The calendar date in the timezone given by [utcOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#localDate)
    */
  var localDate: js.UndefOr[DateProperties] = js.native
  /**
    * Controls the daytime and date animation speed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#playSpeedMultiplier)
    *
    * @default 1.0
    */
  var playSpeedMultiplier: js.UndefOr[Double] = js.native
  /**
    * Slider position for the time of day in the timezone given by [utcOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset). The position represents the time of the day in minutes. Possible values range between 0 and 1440.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#timeSliderPosition)
    */
  var timeSliderPosition: js.UndefOr[Double] = js.native
  /**
    * The difference in hours between UTC time and the time displayed in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset)
    */
  var utcOffset: js.UndefOr[Double] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.native
  /**
    * Starts or pauses the date animation cycling through the months of the year. Set to `true` to start the animation and to `false` to pause it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#yearPlaying)
    *
    * @default false
    */
  var yearPlaying: js.UndefOr[Boolean] = js.native
}

object DaylightViewModelProperties {
  @scala.inline
  def apply(): DaylightViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaylightViewModelProperties]
  }
  @scala.inline
  implicit class DaylightViewModelPropertiesOps[Self <: DaylightViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentSeason(value: spring | summer | fall | winter): Self = this.set("currentSeason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentSeason: Self = this.set("currentSeason", js.undefined)
    @scala.inline
    def setDayPlaying(value: Boolean): Self = this.set("dayPlaying", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayPlaying: Self = this.set("dayPlaying", js.undefined)
    @scala.inline
    def setLocalDate(value: DateProperties): Self = this.set("localDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalDate: Self = this.set("localDate", js.undefined)
    @scala.inline
    def setPlaySpeedMultiplier(value: Double): Self = this.set("playSpeedMultiplier", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaySpeedMultiplier: Self = this.set("playSpeedMultiplier", js.undefined)
    @scala.inline
    def setTimeSliderPosition(value: Double): Self = this.set("timeSliderPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeSliderPosition: Self = this.set("timeSliderPosition", js.undefined)
    @scala.inline
    def setUtcOffset(value: Double): Self = this.set("utcOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtcOffset: Self = this.set("utcOffset", js.undefined)
    @scala.inline
    def setView(value: SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setYearPlaying(value: Boolean): Self = this.set("yearPlaying", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearPlaying: Self = this.set("yearPlaying", js.undefined)
  }
  
}

