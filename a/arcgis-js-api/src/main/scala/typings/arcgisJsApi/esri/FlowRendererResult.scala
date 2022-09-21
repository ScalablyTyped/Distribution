package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowRendererResult
  extends StObject
     with Object {
  
  /**
    * The ID of the basemap used to determine the optimal color of the flow lines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#FlowRendererResult)
    */
  var basemapId: String
  
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#FlowRendererResult)
    */
  var basemapTheme: String
  
  /**
    * The flow scheme used to set colors and sizes to the flow lines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#FlowRendererResult)
    */
  var flowScheme: FlowScheme
  
  /**
    * A suggested layer effect to apply to the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#FlowRendererResult)
    */
  var layerEffect: String
  
  /**
    * The FlowRenderer renderer to apply to the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#FlowRendererResult)
    */
  var renderer: FlowRenderer
  
  /**
    * Summary statistics of the raster layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#FlowRendererResult)
    */
  var statistics: SummaryStatisticsResult
  
  /**
    * Visual variables included in the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#FlowRendererResult)
    */
  var visualVariables: js.Array[VisualVariable]
}
object FlowRendererResult {
  
  inline def apply(
    basemapId: String,
    basemapTheme: String,
    constructor: js.Function,
    flowScheme: FlowScheme,
    hasOwnProperty: PropertyKey => Boolean,
    layerEffect: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: FlowRenderer,
    statistics: SummaryStatisticsResult,
    visualVariables: js.Array[VisualVariable]
  ): FlowRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], flowScheme = flowScheme.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layerEffect = layerEffect.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], visualVariables = visualVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowRendererResult]
  }
  
  extension [Self <: FlowRendererResult](x: Self) {
    
    inline def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setFlowScheme(value: FlowScheme): Self = StObject.set(x, "flowScheme", value.asInstanceOf[js.Any])
    
    inline def setLayerEffect(value: String): Self = StObject.set(x, "layerEffect", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: FlowRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: SummaryStatisticsResult): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setVisualVariables(value: js.Array[VisualVariable]): Self = StObject.set(x, "visualVariables", value.asInstanceOf[js.Any])
    
    inline def setVisualVariablesVarargs(value: VisualVariable*): Self = StObject.set(x, "visualVariables", js.Array(value*))
  }
}
