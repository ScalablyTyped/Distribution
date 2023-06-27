package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.donut
import typings.arcgisJsApi.arcgisJsApiStrings.pie
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pieChartCreateRendererForClusteringParams extends StObject {
  
  /**
  		 * Includes the `defaultSymbol` defined in the input layer's renderer in the output pie chart renderer.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRendererForClustering)
  		 */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The layer for which the visualization is generated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRendererForClustering)
  		 */
  var layer: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer
  
  /**
  		 * Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRendererForClustering)
  		 */
  var legendOptions: js.UndefOr[pieChartCreateRendererForClusteringParamsLegendOptions] = js.undefined
  
  /**
  		 * Determines whether to create a pie chart or a donut chart.
  		 *
  		 * @default "pie"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRendererForClustering)
  		 */
  var shape: js.UndefOr[pie | donut] = js.undefined
  
  /**
  		 * Allows for cancelable requests.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRendererForClustering)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object pieChartCreateRendererForClusteringParams {
  
  inline def apply(layer: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer): pieChartCreateRendererForClusteringParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[pieChartCreateRendererForClusteringParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: pieChartCreateRendererForClusteringParams] (val x: Self) extends AnyVal {
    
    inline def setDefaultSymbolEnabled(value: Boolean): Self = StObject.set(x, "defaultSymbolEnabled", value.asInstanceOf[js.Any])
    
    inline def setDefaultSymbolEnabledUndefined: Self = StObject.set(x, "defaultSymbolEnabled", js.undefined)
    
    inline def setLayer(value: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLegendOptions(value: pieChartCreateRendererForClusteringParamsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setShape(value: pie | donut): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
