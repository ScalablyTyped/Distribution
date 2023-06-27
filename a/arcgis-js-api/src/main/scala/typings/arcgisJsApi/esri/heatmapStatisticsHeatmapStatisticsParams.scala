package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait heatmapStatisticsHeatmapStatisticsParams extends StObject {
  
  /**
  		 * The name of the numeric field for which the statistics will be generated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#heatmapStatistics)
  		 */
  var field: js.UndefOr[String] = js.undefined
  
  /**
  		 * The layer from which to generate statistics for the pixel intensity values and a given `field` if provided.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#heatmapStatistics)
  		 */
  var layer: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer
  
  /**
  		 * The area of influence for each point as a radius in points from the point.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#heatmapStatistics)
  		 */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Allows for cancelable requests.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#heatmapStatistics)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
  		 * A view instance used to calculate pixel intensity values based on the features in the current view.
  		 *
  		 * [Read more...](global.html)
  		 */
  var view: MapView | SceneView
}
object heatmapStatisticsHeatmapStatisticsParams {
  
  inline def apply(
    layer: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer,
    view: MapView | SceneView
  ): heatmapStatisticsHeatmapStatisticsParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[heatmapStatisticsHeatmapStatisticsParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: heatmapStatisticsHeatmapStatisticsParams] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setLayer(value: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setView(value: MapView | SceneView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
