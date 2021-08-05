package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.fall
import typings.arcgisJsApi.arcgisJsApiStrings.spring
import typings.arcgisJsApi.arcgisJsApiStrings.summer
import typings.arcgisJsApi.arcgisJsApiStrings.winter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DaylightViewModelProperties extends StObject {
  
  /**
    * A season can be set instead of a date.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#currentSeason)
    */
  var currentSeason: js.UndefOr[spring | summer | fall | winter] = js.undefined
  
  /**
    * Starts or pauses the daytime animation cycling through the minutes of the day.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#dayPlaying)
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
    */
  var playSpeedMultiplier: js.UndefOr[Double] = js.undefined
  
  /**
    * Slider position for the time of day in the timezone given by [utcOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset).
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
    * Starts or pauses the date animation cycling through the months of the year.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#yearPlaying)
    */
  var yearPlaying: js.UndefOr[Boolean] = js.undefined
}
object DaylightViewModelProperties {
  
  inline def apply(): DaylightViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaylightViewModelProperties]
  }
  
  extension [Self <: DaylightViewModelProperties](x: Self) {
    
    inline def setCurrentSeason(value: spring | summer | fall | winter): Self = StObject.set(x, "currentSeason", value.asInstanceOf[js.Any])
    
    inline def setCurrentSeasonUndefined: Self = StObject.set(x, "currentSeason", js.undefined)
    
    inline def setDayPlaying(value: Boolean): Self = StObject.set(x, "dayPlaying", value.asInstanceOf[js.Any])
    
    inline def setDayPlayingUndefined: Self = StObject.set(x, "dayPlaying", js.undefined)
    
    inline def setLocalDate(value: DateProperties): Self = StObject.set(x, "localDate", value.asInstanceOf[js.Any])
    
    inline def setLocalDateUndefined: Self = StObject.set(x, "localDate", js.undefined)
    
    inline def setPlaySpeedMultiplier(value: Double): Self = StObject.set(x, "playSpeedMultiplier", value.asInstanceOf[js.Any])
    
    inline def setPlaySpeedMultiplierUndefined: Self = StObject.set(x, "playSpeedMultiplier", js.undefined)
    
    inline def setTimeSliderPosition(value: Double): Self = StObject.set(x, "timeSliderPosition", value.asInstanceOf[js.Any])
    
    inline def setTimeSliderPositionUndefined: Self = StObject.set(x, "timeSliderPosition", js.undefined)
    
    inline def setUtcOffset(value: Double): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
    
    inline def setUtcOffsetUndefined: Self = StObject.set(x, "utcOffset", js.undefined)
    
    inline def setView(value: SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setYearPlaying(value: Boolean): Self = StObject.set(x, "yearPlaying", value.asInstanceOf[js.Any])
    
    inline def setYearPlayingUndefined: Self = StObject.set(x, "yearPlaying", js.undefined)
  }
}
