package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.season
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DaylightProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * Controls whether the widget displays a date or a season picker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#dateOrSeason)
    */
  var dateOrSeason: js.UndefOr[season | date] = js.undefined
  
  /**
    * Controls the speed of the daytime and date animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#playSpeedMultiplier)
    */
  var playSpeedMultiplier: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets steps, or intervals, on the time slider to restrict the times of the day that can be selected when dragging the thumb.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#timeSliderSteps)
    */
  var timeSliderSteps: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
  
  /**
    * The view model for the Daylight widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#viewModel)
    */
  var viewModel: js.UndefOr[DaylightViewModelProperties] = js.undefined
  
  /**
    * This property provides the ability to display or hide the individual elements of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#visibleElements)
    */
  var visibleElements: js.UndefOr[DaylightVisibleElements] = js.undefined
}
object DaylightProperties {
  
  inline def apply(): DaylightProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaylightProperties]
  }
  
  extension [Self <: DaylightProperties](x: Self) {
    
    inline def setDateOrSeason(value: season | date): Self = StObject.set(x, "dateOrSeason", value.asInstanceOf[js.Any])
    
    inline def setDateOrSeasonUndefined: Self = StObject.set(x, "dateOrSeason", js.undefined)
    
    inline def setPlaySpeedMultiplier(value: Double): Self = StObject.set(x, "playSpeedMultiplier", value.asInstanceOf[js.Any])
    
    inline def setPlaySpeedMultiplierUndefined: Self = StObject.set(x, "playSpeedMultiplier", js.undefined)
    
    inline def setTimeSliderSteps(value: Double | js.Array[Double]): Self = StObject.set(x, "timeSliderSteps", value.asInstanceOf[js.Any])
    
    inline def setTimeSliderStepsUndefined: Self = StObject.set(x, "timeSliderSteps", js.undefined)
    
    inline def setTimeSliderStepsVarargs(value: Double*): Self = StObject.set(x, "timeSliderSteps", js.Array(value :_*))
    
    inline def setView(value: SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: DaylightViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisibleElements(value: DaylightVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
