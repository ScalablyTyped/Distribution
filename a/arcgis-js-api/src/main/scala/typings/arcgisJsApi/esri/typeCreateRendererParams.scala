package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`2d`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-flat`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric-uniform`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric`
import typings.arcgisJsApi.arcgisJsApiStrings.count
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.solid
import typings.arcgisJsApi.arcgisJsApiStrings.value
import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait typeCreateRendererParams extends Object {
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  /**
    * **This option only applies to generating renderers for mesh SceneLayers**. Specifies how the symbol's color is applied to the geometry color/texture. See the documentation in [FillSymbol3DLayer.material](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material) for more context. See the table below for possible values.
    *
    * Value | Description
    * ------|------------
    * tint | Applies the symbol `color` to the desaturated geometry/texture color.
    * replace | Removes the geometry/texture color and applies the symbol `color`.
    * multiply | Multiplies geometry/texture color value with the symbol `color` value. The result is a darker color. Multiplying with white keeps the geometry color the same.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    *
    * @default replace
    */
  var colorMixMode: js.UndefOr[String] = js.native
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to add edges to the output renderer. This setting only applies to mesh SceneLayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    *
    * @default none
    */
  var edgesType: js.UndefOr[solid | none] = js.native
  /**
    * The name of the field from which to extract unique values that will be used for the basis of the data-driven visualization. This property is ignored if a `valueExpression` is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    */
  var field: js.UndefOr[String] = js.native
  /**
    * The layer for which the renderer is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer = js.native
  /**
    * Provides options for setting a title to a field that will override the field alias defined in the service. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    */
  var legendOptions: js.UndefOr[typeCreateRendererParamsLegendOptions] = js.native
  /**
    * The number of types (or categories) displayed by the renderer. Use `-1` to display all returned types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    *
    * @default 10
    */
  var numTypes: js.UndefOr[Double] = js.native
  /**
    * For polygon layers only. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    *
    * @default false
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that all domain codes should be returned if the given field has domain values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    */
  var returnAllCodedValues: js.UndefOr[Boolean] = js.native
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
    * For point and polyline layers only. Indicates whether symbol sizes should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    *
    * @default false
    */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates how values should be sorted in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html). See the table below for information about values that may be passed to this parameter.
    *
    * Possible Value | Description
    * ---------------|------------
    * count | Unique values/types will be sorted from highest to lowest based on the count of features that fall in each category.
    * value | Unique values/types will be sorted in alphabetical order.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    *
    * @default count
    */
  var sortBy: js.UndefOr[count | value] = js.native
  /**
    * A statistics object generated from the [uniqueValues](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    */
  var statistics: js.UndefOr[UniqueValuesResult] = js.native
  /**
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. This parameter can be ignored for layers with a `mesh` geometry type. Possible values are described below.
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    * | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    * | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and only the symbol's height should be variable, for example with cylinders. A SceneView instance must be provided to the `view` parameter if this option is used. |
    * | 3d-volumetric-uniform | Generates a visualization using uniformly-sized 3D symbols with volumetric symbol layers. Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and the symbol should be sized uniformly, for example with spheres. A SceneView instance must be provided to the `view` parameter if this option is used. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    *
    * @default 2d
    */
  var symbolType: js.UndefOr[`2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`] = js.native
  /**
    * In authoring apps, the user may select a pre-defined type scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    */
  var typeScheme: js.UndefOr[TypeScheme] = js.native
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number or a string. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    */
  var valueExpression: js.UndefOr[String] = js.native
  /**
    * Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.native
  /**
    * The view where the input layer is rendered. This method inspects the view's background (i.e. basemap, web map background, or view container) to determine optimal colors for the output renderer. This parameter should always be set in practice, but if not provided this method will assume the generated renderer will display on a light background. This parameter is required when creating renderers using a `valueExpression` or for renderers intended for display in a SceneView.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.native
}

object typeCreateRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typeCreateRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[typeCreateRendererParams]
  }
  @scala.inline
  implicit class typeCreateRendererParamsOps[Self <: typeCreateRendererParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasemap(value: String | Basemap): Self = this.set("basemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasemap: Self = this.set("basemap", js.undefined)
    @scala.inline
    def setColorMixMode(value: String): Self = this.set("colorMixMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorMixMode: Self = this.set("colorMixMode", js.undefined)
    @scala.inline
    def setDefaultSymbolEnabled(value: Boolean): Self = this.set("defaultSymbolEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSymbolEnabled: Self = this.set("defaultSymbolEnabled", js.undefined)
    @scala.inline
    def setEdgesType(value: solid | none): Self = this.set("edgesType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgesType: Self = this.set("edgesType", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setLegendOptions(value: typeCreateRendererParamsLegendOptions): Self = this.set("legendOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendOptions: Self = this.set("legendOptions", js.undefined)
    @scala.inline
    def setNumTypes(value: Double): Self = this.set("numTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumTypes: Self = this.set("numTypes", js.undefined)
    @scala.inline
    def setOutlineOptimizationEnabled(value: Boolean): Self = this.set("outlineOptimizationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineOptimizationEnabled: Self = this.set("outlineOptimizationEnabled", js.undefined)
    @scala.inline
    def setReturnAllCodedValues(value: Boolean): Self = this.set("returnAllCodedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnAllCodedValues: Self = this.set("returnAllCodedValues", js.undefined)
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setSizeOptimizationEnabled(value: Boolean): Self = this.set("sizeOptimizationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeOptimizationEnabled: Self = this.set("sizeOptimizationEnabled", js.undefined)
    @scala.inline
    def setSortBy(value: count | value): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    @scala.inline
    def setStatistics(value: UniqueValuesResult): Self = this.set("statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
    @scala.inline
    def setSymbolType(value: `2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolType: Self = this.set("symbolType", js.undefined)
    @scala.inline
    def setTypeScheme(value: TypeScheme): Self = this.set("typeScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeScheme: Self = this.set("typeScheme", js.undefined)
    @scala.inline
    def setValueExpression(value: String): Self = this.set("valueExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueExpression: Self = this.set("valueExpression", js.undefined)
    @scala.inline
    def setValueExpressionTitle(value: String): Self = this.set("valueExpressionTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueExpressionTitle: Self = this.set("valueExpressionTitle", js.undefined)
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

