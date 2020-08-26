package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`2d`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-flat`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric-uniform`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric`
import typings.arcgisJsApi.arcgisJsApiStrings.count
import typings.arcgisJsApi.arcgisJsApiStrings.value
import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait predominanceCreateRendererParams extends Object {
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  /**
    * **This option only applies to generating renderers for mesh SceneLayers**. Specifies how the symbol's color is applied to the geometry color/texture. See the documentation in [FillSymbol3DLayer.material](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material) for more context. See the table below for possible values.
    *
    *   Value | Description
    *   ------|------------
    *   tint | Applies the symbol `color` to the desaturated geometry/texture color.
    *   replace | Removes the geometry/texture color and applies the symbol `color`.
    *   multiply | Multiplies geometry/texture color value with the symbol `color` value. The result is a darker color. Multiplying with white keeps the geometry color the same.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    *
    * @default replace
    */
  var colorMixMode: js.UndefOr[String] = js.native
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    *
    * @default true
    */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to add edges to the output renderer. This setting only applies to mesh SceneLayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    *
    * @default none
    */
  var edgesType: js.UndefOr[String] = js.native
  /**
    * A set of competing numeric fields used as the basis of the predominance visualization. For example, if creating an election map, you would indicate the names of each field representing the candidate or political party where total votes are stored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    */
  var fields: js.Array[predominanceCreateRendererParamsFields] = js.native
  /**
    * Indicates whether to include data-driven opacity in the final renderer. If `true`, features where the predominant value beats all others by a large margin are given a high opacity. Features where the predominant value beats others by a small margin will be assigned a low opacity, indicating that while the feature has a winning value, it doesn't win by much.  ![predominance-opacity](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/predominance-opacity.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    */
  var includeOpacityVariable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to include data-driven size in the final renderer. If `true`, features will be assigned a sized based on the sum of all competing values in the `fields` param. Features with small total counts will be sized with small icons or lines depending on the geometry type of the layer, and features with large total counts will be sized with large icons or lines. Enabling this option is good for visualizing how influential a particular feature is compared to the dataset as a whole. It removes bias introduced by features with large geographic areas, but relatively small data values.  ![predominance-size](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/predominance-size.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    */
  var includeSizeVariable: js.UndefOr[Boolean] = js.native
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer = js.native
  /**
    * Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    */
  var legendOptions: js.UndefOr[predominanceCreateRendererParamsLegendOptions] = js.native
  /**
    * Only for polygon layers. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    *
    * @default false
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * In authoring apps, the user may select a pre-defined predominance scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    */
  var predominanceScheme: js.UndefOr[PredominanceScheme] = js.native
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
    * Indicates whether symbol sizes should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    *
    * @default false
    */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates how values should be sorted in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html). See the table below for information about values that may be passed to this parameter.
    *
    *   Possible Value | Description
    *   ---------------|------------
    *   count | Unique values/types will be sorted from highest to lowest based on the count of features that fall in each category.
    *   value | Unique values/types will be sorted in the order they were specified in the `fields` parameter.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    *
    * @default count
    */
  var sortBy: js.UndefOr[count | value] = js.native
  /**
    * A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function. The `createAgeRenderer()` method generates an Arcade expression and executes a statistics query against the layer for the result of the expression. If statistics for the expression have already been generated, then pass the object here to avoid making a second statistics query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    */
  var statistics: js.UndefOr[SummaryStatisticsResult] = js.native
  /**
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. This parameter does not need to be specified for layers with a `mesh` geometry type. Possible values are described below.
    *
    *   | Value | Description |
    *   | ----- | ----------- |
    *   | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    *   | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    *   | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). A SceneView instance must be provided to the `view` parameter if this option is used. |
    *   | 3d-volumetric-uniform | Generates a visualization using uniformly sized 3D symbols with volumetric symbol layers. Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and the symbol should be sizes uniformly, for example with spheres. A SceneView instance must be provided to the `view` parameter if this option is used. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    *
    * @default 2d
    */
  var symbolType: js.UndefOr[`2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`] = js.native
  /**
    * The view instance in which the visualization will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: View = js.native
}

object predominanceCreateRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    fields: js.Array[predominanceCreateRendererParamsFields],
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    view: View
  ): predominanceCreateRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[predominanceCreateRendererParams]
  }
  @scala.inline
  implicit class predominanceCreateRendererParamsOps[Self <: predominanceCreateRendererParams] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: predominanceCreateRendererParamsFields*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[predominanceCreateRendererParamsFields]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
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
    def setEdgesType(value: String): Self = this.set("edgesType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgesType: Self = this.set("edgesType", js.undefined)
    @scala.inline
    def setIncludeOpacityVariable(value: Boolean): Self = this.set("includeOpacityVariable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeOpacityVariable: Self = this.set("includeOpacityVariable", js.undefined)
    @scala.inline
    def setIncludeSizeVariable(value: Boolean): Self = this.set("includeSizeVariable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSizeVariable: Self = this.set("includeSizeVariable", js.undefined)
    @scala.inline
    def setLegendOptions(value: predominanceCreateRendererParamsLegendOptions): Self = this.set("legendOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendOptions: Self = this.set("legendOptions", js.undefined)
    @scala.inline
    def setOutlineOptimizationEnabled(value: Boolean): Self = this.set("outlineOptimizationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineOptimizationEnabled: Self = this.set("outlineOptimizationEnabled", js.undefined)
    @scala.inline
    def setPredominanceScheme(value: PredominanceScheme): Self = this.set("predominanceScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredominanceScheme: Self = this.set("predominanceScheme", js.undefined)
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
    def setStatistics(value: SummaryStatisticsResult): Self = this.set("statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
    @scala.inline
    def setSymbolType(value: `2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolType: Self = this.set("symbolType", js.undefined)
  }
  
}

