package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.discrete
import typings.arcgisJsApi.arcgisJsApiStrings.duration
import typings.arcgisJsApi.arcgisJsApiStrings.threshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowCastViewModelProperties extends StObject {
  
  /**
    * The calendar date used to calculate the shadow cast.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#date)
    */
  var date: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * The configuration used when the widget's [visualizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#visualizationType) is set to "discrete".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#discreteOptions)
    */
  var discreteOptions: js.UndefOr[ShadowCastViewModelDiscreteOptionsProperties] = js.undefined
  
  /**
    * The configuration used when the widget's [visualizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#visualizationType) is set to "duration".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#durationOptions)
    */
  var durationOptions: js.UndefOr[ShadowCastViewModelDurationOptionsProperties] = js.undefined
  
  /**
    * Time (in milliseconds from midnight of the [date](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#date)) when the shadow cast computation should stop.
    *
    * @default 16 * 3600 * 1000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#endTimeOfDay)
    */
  var endTimeOfDay: js.UndefOr[Double] = js.undefined
  
  /**
    * Time (in milliseconds from midnight of the [date](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#date)) when the shadow cast computation should start.
    *
    * @default 10 * 3600 * 1000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#startTimeOfDay)
    */
  var startTimeOfDay: js.UndefOr[Double] = js.undefined
  
  /**
    * The configuration used when the widget's [visualizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#visualizationType) is set to "threshold".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#thresholdOptions)
    */
  var thresholdOptions: js.UndefOr[ShadowCastViewModelThresholdOptionsProperties] = js.undefined
  
  /**
    * The difference in hours between UTC time and the times displayed in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#utcOffset)
    */
  var utcOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * A reference to the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
  
  /**
    * Type of visualization to use when showing the shadows.
    *
    * @default "threshold"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#visualizationType)
    */
  var visualizationType: js.UndefOr[threshold | duration | discrete] = js.undefined
}
object ShadowCastViewModelProperties {
  
  inline def apply(): ShadowCastViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowCastViewModelProperties]
  }
  
  extension [Self <: ShadowCastViewModelProperties](x: Self) {
    
    inline def setDate(value: DateProperties): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDiscreteOptions(value: ShadowCastViewModelDiscreteOptionsProperties): Self = StObject.set(x, "discreteOptions", value.asInstanceOf[js.Any])
    
    inline def setDiscreteOptionsUndefined: Self = StObject.set(x, "discreteOptions", js.undefined)
    
    inline def setDurationOptions(value: ShadowCastViewModelDurationOptionsProperties): Self = StObject.set(x, "durationOptions", value.asInstanceOf[js.Any])
    
    inline def setDurationOptionsUndefined: Self = StObject.set(x, "durationOptions", js.undefined)
    
    inline def setEndTimeOfDay(value: Double): Self = StObject.set(x, "endTimeOfDay", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOfDayUndefined: Self = StObject.set(x, "endTimeOfDay", js.undefined)
    
    inline def setStartTimeOfDay(value: Double): Self = StObject.set(x, "startTimeOfDay", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOfDayUndefined: Self = StObject.set(x, "startTimeOfDay", js.undefined)
    
    inline def setThresholdOptions(value: ShadowCastViewModelThresholdOptionsProperties): Self = StObject.set(x, "thresholdOptions", value.asInstanceOf[js.Any])
    
    inline def setThresholdOptionsUndefined: Self = StObject.set(x, "thresholdOptions", js.undefined)
    
    inline def setUtcOffset(value: Double): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
    
    inline def setUtcOffsetUndefined: Self = StObject.set(x, "utcOffset", js.undefined)
    
    inline def setView(value: SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisualizationType(value: threshold | duration | discrete): Self = StObject.set(x, "visualizationType", value.asInstanceOf[js.Any])
    
    inline def setVisualizationTypeUndefined: Self = StObject.set(x, "visualizationType", js.undefined)
  }
}
