package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dotDensityCreateRendererParams extends StObject {
  
  /**
    * A set of complementary numeric fields/expressions used as the basis of the dot density visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var attributes: js.Array[dotDensityCreateRendererParamsAttributes]
  
  /**
    * Indicates whether to enable color blending of different colored dots rendered at the same pixel.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var dotBlendingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * In authoring apps, the user may select a pre-defined dot density scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var dotDensityScheme: js.UndefOr[DotDensityScheme] = js.undefined
  
  /**
    * Indicates whether to vary the value of each dot by the view's scale.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var dotValueOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the generated renderer is for a binning visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var forBinning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The **polygon** layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var layer: FeatureLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer
  
  /**
    * Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var legendOptions: js.UndefOr[dotDensityCreateRendererParamsLegendOptions] = js.undefined
  
  /**
    * Indicates whether the polygon outline width should vary based on view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * The MapView instance in which the visualization will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: MapView
}
object dotDensityCreateRendererParams {
  
  inline def apply(
    attributes: js.Array[dotDensityCreateRendererParamsAttributes],
    layer: FeatureLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer,
    view: MapView
  ): dotDensityCreateRendererParams = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[dotDensityCreateRendererParams]
  }
  
  extension [Self <: dotDensityCreateRendererParams](x: Self) {
    
    inline def setAttributes(value: js.Array[dotDensityCreateRendererParamsAttributes]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: dotDensityCreateRendererParamsAttributes*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setDotBlendingEnabled(value: Boolean): Self = StObject.set(x, "dotBlendingEnabled", value.asInstanceOf[js.Any])
    
    inline def setDotBlendingEnabledUndefined: Self = StObject.set(x, "dotBlendingEnabled", js.undefined)
    
    inline def setDotDensityScheme(value: DotDensityScheme): Self = StObject.set(x, "dotDensityScheme", value.asInstanceOf[js.Any])
    
    inline def setDotDensitySchemeUndefined: Self = StObject.set(x, "dotDensityScheme", js.undefined)
    
    inline def setDotValueOptimizationEnabled(value: Boolean): Self = StObject.set(x, "dotValueOptimizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setDotValueOptimizationEnabledUndefined: Self = StObject.set(x, "dotValueOptimizationEnabled", js.undefined)
    
    inline def setForBinning(value: Boolean): Self = StObject.set(x, "forBinning", value.asInstanceOf[js.Any])
    
    inline def setForBinningUndefined: Self = StObject.set(x, "forBinning", js.undefined)
    
    inline def setLayer(value: FeatureLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLegendOptions(value: dotDensityCreateRendererParamsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setOutlineOptimizationEnabled(value: Boolean): Self = StObject.set(x, "outlineOptimizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setOutlineOptimizationEnabledUndefined: Self = StObject.set(x, "outlineOptimizationEnabled", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setView(value: MapView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
