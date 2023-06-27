package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait colorCreatePCContinuousRendererParams extends StObject {
  
  /**
  		 * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
  		 *
  		 * @default gray
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCContinuousRenderer)
  		 */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  
  /**
  		 * In authoring apps, the user may select a pre-defined color scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCContinuousRenderer)
  		 */
  var colorScheme: js.UndefOr[ColorScheme] = js.undefined
  
  /**
  		 * The number of points per inch in the view.
  		 *
  		 * @default 25
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCContinuousRenderer)
  		 */
  var density: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCContinuousRenderer)
  		 */
  var field: String
  
  /**
  		 * The layer for which the visualization is generated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCContinuousRenderer)
  		 */
  var layer: PointCloudLayer
  
  /**
  		 * Allows for cancelable requests.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCContinuousRenderer)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
  		 * The size of each point expressed as a percentage.
  		 *
  		 * @default 100%
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCContinuousRenderer)
  		 */
  var size: js.UndefOr[String] = js.undefined
  
  /**
  		 * A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCContinuousRenderer)
  		 */
  var statistics: js.UndefOr[SummaryStatisticsResult] = js.undefined
}
object colorCreatePCContinuousRendererParams {
  
  inline def apply(field: String, layer: PointCloudLayer): colorCreatePCContinuousRendererParams = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[colorCreatePCContinuousRendererParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: colorCreatePCContinuousRendererParams] (val x: Self) extends AnyVal {
    
    inline def setBasemap(value: String | Basemap): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    inline def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    inline def setColorScheme(value: ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: PointCloudLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStatistics(value: SummaryStatisticsResult): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
  }
}
