package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.fall
import typings.arcgisJsApi.arcgisJsApiStrings.spring
import typings.arcgisJsApi.arcgisJsApiStrings.summer
import typings.arcgisJsApi.arcgisJsApiStrings.winter
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DaylightViewModel extends Accessor {
  /**
    * A season can be set instead of a date. Each season uses a fixed date corresponding to the seasonsal equinoxes and solstices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#currentSeason)
    */
  var currentSeason: spring | summer | fall | winter = js.native
  /**
    * Starts or pauses the daytime animation cycling through the minutes of the day. Set to `true` to start the animation and to `false` to pause it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#dayPlaying)
    *
    * @default false
    */
  var dayPlaying: Boolean = js.native
  /**
    * The calendar date in the timezone given by [utcOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#localDate)
    */
  var localDate: Date = js.native
  /**
    * Controls the daytime and date animation speed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#playSpeedMultiplier)
    *
    * @default 1.0
    */
  var playSpeedMultiplier: Double = js.native
  /**
    * Slider position for the time of day in the timezone given by [utcOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset). The position represents the time of the day in minutes. Possible values range between 0 and 1440.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#timeSliderPosition)
    */
  var timeSliderPosition: Double = js.native
  /**
    * The difference in hours between UTC time and the time displayed in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset)
    */
  var utcOffset: Double = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#view)
    */
  var view: SceneView = js.native
  /**
    * Starts or pauses the date animation cycling through the months of the year. Set to `true` to start the animation and to `false` to pause it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#yearPlaying)
    *
    * @default false
    */
  var yearPlaying: Boolean = js.native
}

