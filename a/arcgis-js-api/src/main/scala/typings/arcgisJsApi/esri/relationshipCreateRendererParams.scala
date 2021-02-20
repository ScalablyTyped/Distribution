package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`2d`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-flat`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric-uniform`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric`
import typings.arcgisJsApi.arcgisJsApiStrings.`equal-interval`
import typings.arcgisJsApi.arcgisJsApiStrings.`natural-breaks`
import typings.arcgisJsApi.arcgisJsApiStrings.quantile
import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait relationshipCreateRendererParams extends Object {
  
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  
  /**
    * The method for classifying each field's data values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var classificationMethod: js.UndefOr[quantile | `equal-interval` | `natural-breaks`] = js.native
  
  /**
    * **This option only applies to generating renderers for mesh SceneLayers**.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var colorMixMode: js.UndefOr[String] = js.native
  
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value or that fall outside of the prescribed class breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to add edges to the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var edgesType: js.UndefOr[String] = js.native
  
  /**
    * A numeric field that will be used to explore its relationship with `field2`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var field1: relationshipCreateRendererParamsField1 = js.native
  
  /**
    * A numeric field that will be used to explore its relationship with `field1`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var field2: relationshipCreateRendererParamsField2 = js.native
  
  /**
    * Determines the orientation of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var focus: js.UndefOr[String] = js.native
  
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer = js.native
  
  /**
    * Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var legendOptions: js.UndefOr[relationshipCreateRendererParamsLegendOptions] = js.native
  
  /**
    * Indicates the number of classes by which to break up the values of each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var numClasses: js.UndefOr[Double] = js.native
  
  /**
    * For polygon layers only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * In authoring apps, the user may select a pre-defined relationship scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var relationshipScheme: js.UndefOr[RelationshipScheme] = js.native
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * For point and polyline layers only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of symbol to generate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#createRenderer)
    */
  var symbolType: js.UndefOr[`2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`] = js.native
  
  /**
    * The view instance in which the visualization will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: View = js.native
}
object relationshipCreateRendererParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    field1: relationshipCreateRendererParamsField1,
    field2: relationshipCreateRendererParamsField2,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    view: View
  ): relationshipCreateRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field1 = field1.asInstanceOf[js.Any], field2 = field2.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[relationshipCreateRendererParams]
  }
  
  @scala.inline
  implicit class relationshipCreateRendererParamsMutableBuilder[Self <: relationshipCreateRendererParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasemap(value: String | Basemap): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    @scala.inline
    def setClassificationMethod(value: quantile | `equal-interval` | `natural-breaks`): Self = StObject.set(x, "classificationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationMethodUndefined: Self = StObject.set(x, "classificationMethod", js.undefined)
    
    @scala.inline
    def setColorMixMode(value: String): Self = StObject.set(x, "colorMixMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMixModeUndefined: Self = StObject.set(x, "colorMixMode", js.undefined)
    
    @scala.inline
    def setDefaultSymbolEnabled(value: Boolean): Self = StObject.set(x, "defaultSymbolEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSymbolEnabledUndefined: Self = StObject.set(x, "defaultSymbolEnabled", js.undefined)
    
    @scala.inline
    def setEdgesType(value: String): Self = StObject.set(x, "edgesType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesTypeUndefined: Self = StObject.set(x, "edgesType", js.undefined)
    
    @scala.inline
    def setField1(value: relationshipCreateRendererParamsField1): Self = StObject.set(x, "field1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField2(value: relationshipCreateRendererParamsField2): Self = StObject.set(x, "field2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendOptions(value: relationshipCreateRendererParamsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    @scala.inline
    def setNumClasses(value: Double): Self = StObject.set(x, "numClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumClassesUndefined: Self = StObject.set(x, "numClasses", js.undefined)
    
    @scala.inline
    def setOutlineOptimizationEnabled(value: Boolean): Self = StObject.set(x, "outlineOptimizationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineOptimizationEnabledUndefined: Self = StObject.set(x, "outlineOptimizationEnabled", js.undefined)
    
    @scala.inline
    def setRelationshipScheme(value: RelationshipScheme): Self = StObject.set(x, "relationshipScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipSchemeUndefined: Self = StObject.set(x, "relationshipScheme", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setSizeOptimizationEnabled(value: Boolean): Self = StObject.set(x, "sizeOptimizationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeOptimizationEnabledUndefined: Self = StObject.set(x, "sizeOptimizationEnabled", js.undefined)
    
    @scala.inline
    def setSymbolType(value: `2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
