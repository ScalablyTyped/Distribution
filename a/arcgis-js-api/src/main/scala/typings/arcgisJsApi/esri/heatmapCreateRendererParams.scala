package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait heatmapCreateRendererParams extends StObject {
  
  /**
  		 * Indicates how much to fade the lower color stops with transparency to create a fuzzy boundary on the edge of the heatmap.
  		 *
  		 * @default 0.2
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
  		 */
  var fadeRatio: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates whether the heatmap should fade its colors to transparent.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
  		 */
  var fadeToTransparent: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
  		 */
  var field: js.UndefOr[String] = js.undefined
  
  /**
  		 * In authoring apps, the user may select a pre-defined heatmap scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
  		 */
  var heatmapScheme: js.UndefOr[HeatmapScheme] = js.undefined
  
  /**
  		 * The point layer for which the visualization is generated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
  		 */
  var layer: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer
  
  /**
  		 * The maximum [ratio](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio) used in the [HeatmapRenderer.colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops) of the output renderer.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
  		 */
  var maxRatio: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The minimum [ratio](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio) used in the [HeatmapRenderer.colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops) of the output renderer.
  		 *
  		 * @default 0.01
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
  		 */
  var minRatio: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The [radius](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#radius) in points that determines the area of influence of each point.
  		 *
  		 * @default 18
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
  		 */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Allows for cancelable requests.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
  		 * A statistics object generated from the [heatmapStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html) function.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
  		 */
  var statistics: js.UndefOr[HeatmapStatisticsResult] = js.undefined
  
  /**
  		 * The view instance in which the visualization will be rendered.
  		 *
  		 * [Read more...](global.html)
  		 */
  var view: MapView | SceneView
}
object heatmapCreateRendererParams {
  
  inline def apply(
    layer: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer,
    view: MapView | SceneView
  ): heatmapCreateRendererParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[heatmapCreateRendererParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: heatmapCreateRendererParams] (val x: Self) extends AnyVal {
    
    inline def setFadeRatio(value: Double): Self = StObject.set(x, "fadeRatio", value.asInstanceOf[js.Any])
    
    inline def setFadeRatioUndefined: Self = StObject.set(x, "fadeRatio", js.undefined)
    
    inline def setFadeToTransparent(value: Boolean): Self = StObject.set(x, "fadeToTransparent", value.asInstanceOf[js.Any])
    
    inline def setFadeToTransparentUndefined: Self = StObject.set(x, "fadeToTransparent", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setHeatmapScheme(value: HeatmapScheme): Self = StObject.set(x, "heatmapScheme", value.asInstanceOf[js.Any])
    
    inline def setHeatmapSchemeUndefined: Self = StObject.set(x, "heatmapScheme", js.undefined)
    
    inline def setLayer(value: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setMaxRatio(value: Double): Self = StObject.set(x, "maxRatio", value.asInstanceOf[js.Any])
    
    inline def setMaxRatioUndefined: Self = StObject.set(x, "maxRatio", js.undefined)
    
    inline def setMinRatio(value: Double): Self = StObject.set(x, "minRatio", value.asInstanceOf[js.Any])
    
    inline def setMinRatioUndefined: Self = StObject.set(x, "minRatio", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setStatistics(value: HeatmapStatisticsResult): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    inline def setView(value: MapView | SceneView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
