package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dotDensityCreateRendererParams
  extends StObject
     with Object {
  
  /**
    * A set of complementary numeric fields/expressions used as the basis of the dot density visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var attributes: js.Array[dotDensityCreateRendererParamsAttributes]
  
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  
  /**
    * Indicates whether to enable color blending of different colored dots rendered at the same pixel.
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var dotValueOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The **polygon** layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var layer: FeatureLayer | GeoJSONLayer
  
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
  
  @scala.inline
  def apply(
    attributes: js.Array[dotDensityCreateRendererParamsAttributes],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    view: MapView
  ): dotDensityCreateRendererParams = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[dotDensityCreateRendererParams]
  }
  
  @scala.inline
  implicit class dotDensityCreateRendererParamsMutableBuilder[Self <: dotDensityCreateRendererParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[dotDensityCreateRendererParamsAttributes]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: dotDensityCreateRendererParamsAttributes*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setBasemap(value: String | Basemap): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    @scala.inline
    def setDotBlendingEnabled(value: Boolean): Self = StObject.set(x, "dotBlendingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotBlendingEnabledUndefined: Self = StObject.set(x, "dotBlendingEnabled", js.undefined)
    
    @scala.inline
    def setDotDensityScheme(value: DotDensityScheme): Self = StObject.set(x, "dotDensityScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotDensitySchemeUndefined: Self = StObject.set(x, "dotDensityScheme", js.undefined)
    
    @scala.inline
    def setDotValueOptimizationEnabled(value: Boolean): Self = StObject.set(x, "dotValueOptimizationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotValueOptimizationEnabledUndefined: Self = StObject.set(x, "dotValueOptimizationEnabled", js.undefined)
    
    @scala.inline
    def setLayer(value: FeatureLayer | GeoJSONLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendOptions(value: dotDensityCreateRendererParamsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    @scala.inline
    def setOutlineOptimizationEnabled(value: Boolean): Self = StObject.set(x, "outlineOptimizationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineOptimizationEnabledUndefined: Self = StObject.set(x, "outlineOptimizationEnabled", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setView(value: MapView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
