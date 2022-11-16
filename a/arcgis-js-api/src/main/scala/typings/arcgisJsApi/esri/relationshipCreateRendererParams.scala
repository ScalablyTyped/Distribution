package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`2d`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-flat`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric-uniform`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric`
import typings.arcgisJsApi.arcgisJsApiStrings.`equal-interval`
import typings.arcgisJsApi.arcgisJsApiStrings.`natural-breaks`
import typings.arcgisJsApi.arcgisJsApiStrings.quantile
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait relationshipCreateRendererParams extends StObject {
  
  /**
    * The method for classifying each field's data values.
    *
    * @default quantile
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var classificationMethod: js.UndefOr[quantile | `equal-interval` | `natural-breaks`] = js.undefined
  
  /**
    * **This option only applies to generating renderers for mesh SceneLayers**.
    *
    * @default replace
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var colorMixMode: js.UndefOr[String] = js.undefined
  
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value or that fall outside of the prescribed class breaks.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A numeric field that will be used to explore its relationship with `field2`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var field1: relationshipCreateRendererParamsField1
  
  /**
    * A numeric field that will be used to explore its relationship with `field1`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var field2: relationshipCreateRendererParamsField2
  
  /**
    * Determines the orientation of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var focus: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the generated renderer is for a binning visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var forBinning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer
  
  /**
    * Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var legendOptions: js.UndefOr[relationshipCreateRendererParamsLegendOptions] = js.undefined
  
  /**
    * Indicates the number of classes by which to break up the values of each field.
    *
    * @default 3
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var numClasses: js.UndefOr[Double] = js.undefined
  
  /**
    * For polygon layers only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * In authoring apps, the user may select a pre-defined relationship scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var relationshipScheme: js.UndefOr[RelationshipScheme] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * For point and polyline layers only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of symbol to generate.
    *
    * @default 2d
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var symbolType: js.UndefOr[`2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`] = js.undefined
  
  /**
    * The view instance in which the visualization will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: View
}
object relationshipCreateRendererParams {
  
  inline def apply(
    field1: relationshipCreateRendererParamsField1,
    field2: relationshipCreateRendererParamsField2,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer,
    view: View
  ): relationshipCreateRendererParams = {
    val __obj = js.Dynamic.literal(field1 = field1.asInstanceOf[js.Any], field2 = field2.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[relationshipCreateRendererParams]
  }
  
  extension [Self <: relationshipCreateRendererParams](x: Self) {
    
    inline def setClassificationMethod(value: quantile | `equal-interval` | `natural-breaks`): Self = StObject.set(x, "classificationMethod", value.asInstanceOf[js.Any])
    
    inline def setClassificationMethodUndefined: Self = StObject.set(x, "classificationMethod", js.undefined)
    
    inline def setColorMixMode(value: String): Self = StObject.set(x, "colorMixMode", value.asInstanceOf[js.Any])
    
    inline def setColorMixModeUndefined: Self = StObject.set(x, "colorMixMode", js.undefined)
    
    inline def setDefaultSymbolEnabled(value: Boolean): Self = StObject.set(x, "defaultSymbolEnabled", value.asInstanceOf[js.Any])
    
    inline def setDefaultSymbolEnabledUndefined: Self = StObject.set(x, "defaultSymbolEnabled", js.undefined)
    
    inline def setField1(value: relationshipCreateRendererParamsField1): Self = StObject.set(x, "field1", value.asInstanceOf[js.Any])
    
    inline def setField2(value: relationshipCreateRendererParamsField2): Self = StObject.set(x, "field2", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setForBinning(value: Boolean): Self = StObject.set(x, "forBinning", value.asInstanceOf[js.Any])
    
    inline def setForBinningUndefined: Self = StObject.set(x, "forBinning", js.undefined)
    
    inline def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLegendOptions(value: relationshipCreateRendererParamsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setNumClasses(value: Double): Self = StObject.set(x, "numClasses", value.asInstanceOf[js.Any])
    
    inline def setNumClassesUndefined: Self = StObject.set(x, "numClasses", js.undefined)
    
    inline def setOutlineOptimizationEnabled(value: Boolean): Self = StObject.set(x, "outlineOptimizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setOutlineOptimizationEnabledUndefined: Self = StObject.set(x, "outlineOptimizationEnabled", js.undefined)
    
    inline def setRelationshipScheme(value: RelationshipScheme): Self = StObject.set(x, "relationshipScheme", value.asInstanceOf[js.Any])
    
    inline def setRelationshipSchemeUndefined: Self = StObject.set(x, "relationshipScheme", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSizeOptimizationEnabled(value: Boolean): Self = StObject.set(x, "sizeOptimizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setSizeOptimizationEnabledUndefined: Self = StObject.set(x, "sizeOptimizationEnabled", js.undefined)
    
    inline def setSymbolType(value: `2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    inline def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
