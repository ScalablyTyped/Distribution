package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.fall
import typings.arcgisJsApi.arcgisJsApiStrings.spring
import typings.arcgisJsApi.arcgisJsApiStrings.summer
import typings.arcgisJsApi.arcgisJsApiStrings.winter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DaylightViewModel
  extends StObject
     with Accessor {
  
  /**
    * A season can be set instead of a date.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#currentSeason)
    */
  var currentSeason: spring | summer | fall | winter = js.native
  
  /**
    * Starts or pauses the daytime animation cycling through the minutes of the day.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#dayPlaying)
    */
  var dayPlaying: Boolean = js.native
  
  /**
    * Indicates whether to show shadows cast by the sun.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#directShadowsEnabled)
    */
  var directShadowsEnabled: Boolean = js.native
  
  /**
    * The calendar date in the timezone given by [utcOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#localDate)
    */
  var localDate: js.Date = js.native
  
  /**
    * Controls the daytime and date animation speed.
    *
    * @default 1.0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#playSpeedMultiplier)
    */
  var playSpeedMultiplier: Double = js.native
  
  /**
    * Indicates whether date and time are used to determine position of the light source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#sunLightingEnabled)
    */
  var sunLightingEnabled: Boolean = js.native
  
  /**
    * Slider position for the time of day in the timezone given by [utcOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset).
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
    * Starts or pauses the date animation cycling through the months of the year.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#yearPlaying)
    */
  var yearPlaying: Boolean = js.native
}
