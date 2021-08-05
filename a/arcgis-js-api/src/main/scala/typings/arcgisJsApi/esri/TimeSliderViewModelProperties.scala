package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`cumulative-from-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`cumulative-from-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`time-window`
import typings.arcgisJsApi.arcgisJsApiStrings.instant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSliderViewModelProperties extends StObject {
  
  /**
    * The temporal extent of the entire slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#fullTimeExtent)
    */
  var fullTimeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  
  /**
    * If animating, the time indicator(s) will restart if they reach the edge.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#loop)
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time slider mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#mode)
    */
  var mode: js.UndefOr[instant | `time-window` | `cumulative-from-start` | `cumulative-from-end`] = js.undefined
  
  /**
    * The time (in milliseconds) between playback steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#playRate)
    */
  var playRate: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines specific locations on the time slider where thumbs will snap to when manipulated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#stops)
    */
  var stops: js.UndefOr[StopsByDates | StopsByCount | StopsByInterval] = js.undefined
  
  /**
    * The user defined time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#values)
    */
  var values: js.UndefOr[js.Array[DateProperties]] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}
object TimeSliderViewModelProperties {
  
  inline def apply(): TimeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSliderViewModelProperties]
  }
  
  extension [Self <: TimeSliderViewModelProperties](x: Self) {
    
    inline def setFullTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "fullTimeExtent", value.asInstanceOf[js.Any])
    
    inline def setFullTimeExtentUndefined: Self = StObject.set(x, "fullTimeExtent", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMode(value: instant | `time-window` | `cumulative-from-start` | `cumulative-from-end`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPlayRate(value: Double): Self = StObject.set(x, "playRate", value.asInstanceOf[js.Any])
    
    inline def setPlayRateUndefined: Self = StObject.set(x, "playRate", js.undefined)
    
    inline def setStops(value: StopsByDates | StopsByCount | StopsByInterval): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setValues(value: js.Array[DateProperties]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: DateProperties*): Self = StObject.set(x, "values", js.Array(value :_*))
    
    inline def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
