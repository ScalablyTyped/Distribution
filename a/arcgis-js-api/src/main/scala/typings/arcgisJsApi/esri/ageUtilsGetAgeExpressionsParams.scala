package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.days
import typings.arcgisJsApi.arcgisJsApiStrings.hours
import typings.arcgisJsApi.arcgisJsApiStrings.minutes
import typings.arcgisJsApi.arcgisJsApiStrings.months
import typings.arcgisJsApi.arcgisJsApiStrings.seconds
import typings.arcgisJsApi.arcgisJsApiStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ageUtilsGetAgeExpressionsParams extends StObject {
  
  /**
  		 * The end time for the age calculation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-ageUtils.html#getAgeExpressions)
  		 */
  var endTime: js.Date | String | Double
  
  /**
  		 * The layer from which to generate age statistics for the given `startTime` and `endTime`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-ageUtils.html#getAgeExpressions)
  		 */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer
  
  /**
  		 * The start time for the age calculation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-ageUtils.html#getAgeExpressions)
  		 */
  var startTime: js.Date | String | Double
  
  /**
  		 * The desired units of the age result.
  		 *
  		 * [Read more...](global.html#unit)
  		 */
  var unit: js.UndefOr[years | months | days | hours | minutes | seconds] = js.undefined
}
object ageUtilsGetAgeExpressionsParams {
  
  inline def apply(
    endTime: js.Date | String | Double,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer,
    startTime: js.Date | String | Double
  ): ageUtilsGetAgeExpressionsParams = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ageUtilsGetAgeExpressionsParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ageUtilsGetAgeExpressionsParams] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date | String | Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setLayer(
      value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer
    ): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date | String | Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: years | months | days | hours | minutes | seconds): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
