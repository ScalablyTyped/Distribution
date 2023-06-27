package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.donut
import typings.arcgisJsApi.arcgisJsApiStrings.pie
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pieChartCreateRendererParams extends StObject {
  
  /**
  		 * A set of complementary numeric fields/expressions used to create the charts.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRenderer)
  		 */
  var attributes: js.Array[pieChartCreateRendererParamsAttributes]
  
  /**
  		 * Indicates whether the generated renderer is for a binning visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRenderer)
  		 */
  var forBinning: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to include data-driven size in the final renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRenderer)
  		 */
  var includeSizeVariable: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The layer for which the visualization is generated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRenderer)
  		 */
  var layer: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer
  
  /**
  		 * Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRenderer)
  		 */
  var legendOptions: js.UndefOr[pieChartCreateRendererParamsLegendOptions] = js.undefined
  
  /**
  		 * Only for polygon layers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRenderer)
  		 */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * In authoring apps, the user may select a pre-defined color scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRenderer)
  		 */
  var pieChartScheme: js.UndefOr[PieChartScheme] = js.undefined
  
  /**
  		 * Determines whether to create a pie chart or a donut chart.
  		 *
  		 * @default "pie"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRenderer)
  		 */
  var shape: js.UndefOr[pie | donut] = js.undefined
  
  /**
  		 * Allows for cancelable requests.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRenderer)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
  		 * Indicates whether chart sizes should vary based on view scale.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRenderer)
  		 */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The view instance in which the visualization will be rendered.
  		 *
  		 * [Read more...](global.html)
  		 */
  var view: MapView
}
object pieChartCreateRendererParams {
  
  inline def apply(
    attributes: js.Array[pieChartCreateRendererParamsAttributes],
    layer: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer,
    view: MapView
  ): pieChartCreateRendererParams = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[pieChartCreateRendererParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: pieChartCreateRendererParams] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[pieChartCreateRendererParamsAttributes]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: pieChartCreateRendererParamsAttributes*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setForBinning(value: Boolean): Self = StObject.set(x, "forBinning", value.asInstanceOf[js.Any])
    
    inline def setForBinningUndefined: Self = StObject.set(x, "forBinning", js.undefined)
    
    inline def setIncludeSizeVariable(value: Boolean): Self = StObject.set(x, "includeSizeVariable", value.asInstanceOf[js.Any])
    
    inline def setIncludeSizeVariableUndefined: Self = StObject.set(x, "includeSizeVariable", js.undefined)
    
    inline def setLayer(value: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLegendOptions(value: pieChartCreateRendererParamsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setOutlineOptimizationEnabled(value: Boolean): Self = StObject.set(x, "outlineOptimizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setOutlineOptimizationEnabledUndefined: Self = StObject.set(x, "outlineOptimizationEnabled", js.undefined)
    
    inline def setPieChartScheme(value: PieChartScheme): Self = StObject.set(x, "pieChartScheme", value.asInstanceOf[js.Any])
    
    inline def setPieChartSchemeUndefined: Self = StObject.set(x, "pieChartScheme", js.undefined)
    
    inline def setShape(value: pie | donut): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSizeOptimizationEnabled(value: Boolean): Self = StObject.set(x, "sizeOptimizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setSizeOptimizationEnabledUndefined: Self = StObject.set(x, "sizeOptimizationEnabled", js.undefined)
    
    inline def setView(value: MapView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
