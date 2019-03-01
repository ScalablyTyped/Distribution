package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait predominanceCreateRendererParams
  extends stdLib.Object {
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#createRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[java.lang.String | Basemap] = js.undefined
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#createRenderer)
    *
    * @default replace
    */
  var colorMixMode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#createRenderer)
    *
    * @default true
    */
  var defaultSymbolEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A set of competing numeric fields used as the basis of the predominance visualization. For example, if creating an election map, you would indicate the names of each field representing the candidate or political party where total votes are stored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#createRenderer)
    */
  var fields: js.Array[predominanceCreateRendererParamsFields]
  /**
    * Indicates whether to include data-driven opacity in the final renderer. If `true`, features where the predominant value beats all others by a large margin are given a high opacity. Features where the predominant value beats others by a small margin will be assigned a low opacity, indicating that while the feature has a winning value, it doesn't win by much.  ![predominance-opacity](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/predominance-opacity.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#createRenderer)
    */
  var includeOpacityVariable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether to include data-driven size in the final renderer. If `true`, features will be assigned a sized based on the sum of all competing values in the `fields` param. Features with small total counts will be sized with small icons or lines depending on the geometry type of the layer, and features with large total counts will be sized with large icons or lines. Enabling this option is good for visualizing how influential a particular feature is compared to the dataset as a whole. It removes bias introduced by features with large geographic areas, but relatively small data values.  ![predominance-size](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/predominance-size.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#createRenderer)
    */
  var includeSizeVariable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#createRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer
  /**
    * Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#createRenderer)
    */
  var legendOptions: js.UndefOr[predominanceCreateRendererParamsLegendOptions] = js.undefined
  /**
    * In authoring apps, the user may select a pre-defined predominance scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#createRenderer)
    */
  var predominanceScheme: js.UndefOr[PredominanceScheme] = js.undefined
  /**
    * Indicates how values should be sorted in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html). See the table below for information about values that may be passed to this parameter.
    *
    *   Possible Value | Description
    *   ---------------|------------
    *   count | Unique values/types will be sorted from highest to lowest based on the count of features that fall in each category.
    *   value | Unique values/types will be sorted in the order they were specified in the `fields` parameter.
    *
    *   **Possible Values:** count | value
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#createRenderer)
    *
    * @default count
    */
  var sortBy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function. The `createAgeRenderer()` method generates an Arcade expression and executes a statistics query against the layer for the result of the expression. If statistics for the expression have already been generated, then pass the object here to avoid making a second statistics query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#createRenderer)
    */
  var statistics: js.UndefOr[SummaryStatisticsResult] = js.undefined
  /**
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. This parameter does not need to be specified for layers with a `mesh` geometry type. Possible values are described below.
    *
    *   | Value | Description |
    *   | ----- | ----------- |
    *   | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    *   | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    *   | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). A SceneView instance must be provided to the `view` parameter if this option is used. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#createRenderer)
    *
    * @default 2d
    */
  var symbolType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The view instance in which the visualization will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: View
}

object predominanceCreateRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    fields: js.Array[predominanceCreateRendererParamsFields],
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    layer: FeatureLayer | SceneLayer | CSVLayer,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    view: View,
    basemap: java.lang.String | Basemap = null,
    colorMixMode: java.lang.String = null,
    defaultSymbolEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    includeOpacityVariable: js.UndefOr[scala.Boolean] = js.undefined,
    includeSizeVariable: js.UndefOr[scala.Boolean] = js.undefined,
    legendOptions: predominanceCreateRendererParamsLegendOptions = null,
    predominanceScheme: PredominanceScheme = null,
    sortBy: java.lang.String = null,
    statistics: SummaryStatisticsResult = null,
    symbolType: java.lang.String = null
  ): predominanceCreateRendererParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("view")(view)
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (colorMixMode != null) __obj.updateDynamic("colorMixMode")(colorMixMode)
    if (!js.isUndefined(defaultSymbolEnabled)) __obj.updateDynamic("defaultSymbolEnabled")(defaultSymbolEnabled)
    if (!js.isUndefined(includeOpacityVariable)) __obj.updateDynamic("includeOpacityVariable")(includeOpacityVariable)
    if (!js.isUndefined(includeSizeVariable)) __obj.updateDynamic("includeSizeVariable")(includeSizeVariable)
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (predominanceScheme != null) __obj.updateDynamic("predominanceScheme")(predominanceScheme)
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType)
    __obj.asInstanceOf[predominanceCreateRendererParams]
  }
}

