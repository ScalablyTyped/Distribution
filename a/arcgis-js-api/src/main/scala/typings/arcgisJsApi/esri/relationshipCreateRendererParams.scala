package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait relationshipCreateRendererParams extends Object {
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  /**
    * The method for classifying each field's data values. See [classBreaks](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks) for more information about each classification type.  **Possible Values:** quantile | equal-interval | natural-breaks
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    *
    * @default quantile
    */
  var classificationMethod: js.UndefOr[String] = js.undefined
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    *
    * @default replace
    */
  var colorMixMode: js.UndefOr[String] = js.undefined
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value or that fall outside of the prescribed class breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    *
    * @default true
    */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to add edges to the output renderer. This setting only applies to mesh SceneLayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    *
    * @default none
    */
  var edgesType: js.UndefOr[String] = js.undefined
  /**
    * A numeric field that will be used to explore its relationship with `field2`. In the default visualization, the values of this field are rendered along the vertical axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    */
  var field1: relationshipCreateRendererParamsField1
  /**
    * A numeric field that will be used to explore its relationship with `field1`. In the default visualization, the values of this field are rendered along the horizontal axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    */
  var field2: relationshipCreateRendererParamsField2
  /**
    * Determines the orientation of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html). This value does not change the renderer or symbology of any features in the layer. This affects the legend only. See the table below for a description of the possible values. See the class description at the top of this page for a more thorough explanation of how to read the legend.
    *
    *   Value | Example | Description
    *   ------|-------------|--------
    *   null | ![relationship-legend-null](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-null.png) | The legend renders as a square. The top right corner of the legend indicates that values from both `field1` and `field2` are considered high. |
    *   HH | ![relationship-legend-hh](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-hh.png) | The legend renders as a diamond with the focus on the top corner where values from both `field1` and `field2` are considered high. |
    *   HL | ![relationship-legend-hl](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-hl.png) | The legend renders as a diamond with the focus on the top corner where values from `field1` are high and values from `field2` are low. |
    *   LH | ![relationship-legend-lh](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-lh.png) | The legend renders as a diamond with the focus on the top corner where values from `field1` are low and values from `field2` are high. |
    *   LL | ![relationship-legend-ll](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-ll.png) | The legend renders as a diamond with the focus on the top corner where values from both `field1` and `field2` are considered low. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    */
  var focus: js.UndefOr[String] = js.undefined
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer
  /**
    * Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    */
  var legendOptions: js.UndefOr[relationshipCreateRendererParamsLegendOptions] = js.undefined
  /**
    * Indicates the number of classes by which to break up the values of each field. More classes give you more detail, but more colors, making the visualization more difficult to understand. There are only three possible values.
    *
    * 2 classes | 3 classes | 4 classes
    * --|--|---
    * ![relationship-breaks-2](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-breaks-2.png) | ![relationship-breaks-3](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-breaks-3.png) | ![relationship-breaks-4](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-breaks-4.png)
    *
    * **Possible Values:** 2 | 3 | 4
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    *
    * @default 3
    */
  var numClasses: js.UndefOr[Double] = js.undefined
  /**
    * For polygon layers only. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    *
    * @default false
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * In authoring apps, the user may select a pre-defined relationship scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    */
  var relationshipScheme: js.UndefOr[RelationshipScheme] = js.undefined
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * For point and polyline layers only. Indicates whether symbol sizes should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    *
    * @default false
    */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    *
    * @default 2d
    */
  var symbolType: js.UndefOr[String] = js.undefined
  /**
    * The view instance in which the visualization will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: View
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
    view: View,
    basemap: String | Basemap = null,
    classificationMethod: String = null,
    colorMixMode: String = null,
    defaultSymbolEnabled: js.UndefOr[Boolean] = js.undefined,
    edgesType: String = null,
    focus: String = null,
    legendOptions: relationshipCreateRendererParamsLegendOptions = null,
    numClasses: Int | Double = null,
    outlineOptimizationEnabled: js.UndefOr[Boolean] = js.undefined,
    relationshipScheme: RelationshipScheme = null,
    signal: AbortSignal = null,
    sizeOptimizationEnabled: js.UndefOr[Boolean] = js.undefined,
    symbolType: String = null
  ): relationshipCreateRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field1 = field1.asInstanceOf[js.Any], field2 = field2.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view.asInstanceOf[js.Any])
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (classificationMethod != null) __obj.updateDynamic("classificationMethod")(classificationMethod.asInstanceOf[js.Any])
    if (colorMixMode != null) __obj.updateDynamic("colorMixMode")(colorMixMode.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultSymbolEnabled)) __obj.updateDynamic("defaultSymbolEnabled")(defaultSymbolEnabled.asInstanceOf[js.Any])
    if (edgesType != null) __obj.updateDynamic("edgesType")(edgesType.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions.asInstanceOf[js.Any])
    if (numClasses != null) __obj.updateDynamic("numClasses")(numClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(outlineOptimizationEnabled)) __obj.updateDynamic("outlineOptimizationEnabled")(outlineOptimizationEnabled.asInstanceOf[js.Any])
    if (relationshipScheme != null) __obj.updateDynamic("relationshipScheme")(relationshipScheme.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeOptimizationEnabled)) __obj.updateDynamic("sizeOptimizationEnabled")(sizeOptimizationEnabled.asInstanceOf[js.Any])
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType.asInstanceOf[js.Any])
    __obj.asInstanceOf[relationshipCreateRendererParams]
  }
}

