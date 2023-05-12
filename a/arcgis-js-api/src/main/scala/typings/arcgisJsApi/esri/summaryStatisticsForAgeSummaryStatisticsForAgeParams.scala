package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.days
import typings.arcgisJsApi.arcgisJsApiStrings.hours
import typings.arcgisJsApi.arcgisJsApiStrings.minutes
import typings.arcgisJsApi.arcgisJsApiStrings.months
import typings.arcgisJsApi.arcgisJsApiStrings.seconds
import typings.arcgisJsApi.arcgisJsApiStrings.years
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait summaryStatisticsForAgeSummaryStatisticsForAgeParams extends StObject {
  
  /**
    * The end time for the age calculation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatisticsForAge.html#summaryStatisticsForAge)
    */
  var endTime: js.Date | String | Double
  
  /**
    * The layer from which to generate age statistics for the given `startTime` and `endTime`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatisticsForAge.html#summaryStatisticsForAge)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatisticsForAge.html#summaryStatisticsForAge)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * The start time for the age calculation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatisticsForAge.html#summaryStatisticsForAge)
    */
  var startTime: js.Date | String | Double
  
  /**
    * The desired units of the age result.
    *
    * [Read more...](global.html#unit)
    */
  var unit: years | months | days | hours | minutes | seconds
  
  /**
    * The view in which features will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[MapView | SceneView] = js.undefined
}
object summaryStatisticsForAgeSummaryStatisticsForAgeParams {
  
  inline def apply(
    endTime: js.Date | String | Double,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer,
    startTime: js.Date | String | Double,
    unit: years | months | days | hours | minutes | seconds
  ): summaryStatisticsForAgeSummaryStatisticsForAgeParams = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[summaryStatisticsForAgeSummaryStatisticsForAgeParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: summaryStatisticsForAgeSummaryStatisticsForAgeParams] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date | String | Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setStartTime(value: js.Date | String | Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: years | months | days | hours | minutes | seconds): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setView(value: MapView | SceneView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
