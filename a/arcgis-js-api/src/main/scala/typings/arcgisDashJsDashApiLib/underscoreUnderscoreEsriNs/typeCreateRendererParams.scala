package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait typeCreateRendererParams
  extends stdLib.Object {
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[java.lang.String | Basemap] = js.undefined
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer)
    *
    * @default replace
    */
  var colorMixMode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer)
    */
  var defaultSymbolEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the field from which to extract unique values that will be used for the basis of the data-driven visualization. This property is ignored if a `valueExpression` is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer)
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The layer for which the renderer is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer
  /**
    * Provides options for setting a title to a field that will override the field alias defined in the service. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer)
    */
  var legendOptions: js.UndefOr[typeCreateRendererParamsLegendOptions] = js.undefined
  /**
    * The number of types (or categories) displayed by the renderer. Use `-1` to display all returned types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer)
    *
    * @default 10
    */
  var numTypes: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates how values should be sorted in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html). See the table below for information about values that may be passed to this parameter.
    *
    * Possible Value | Description
    * ---------------|------------
    * count | Unique values/types will be sorted from highest to lowest based on the count of features that fall in each category.
    * value | Unique values/types will be sorted in alphabetical order.
    *
    * **Possible Values:** count | value
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer)
    *
    * @default count
    */
  var sortBy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A statistics object generated from the [uniqueValues](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer)
    */
  var statistics: js.UndefOr[UniqueValuesResult] = js.undefined
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer)
    *
    * @default 2d
    */
  var symbolType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * In authoring apps, the user may select a pre-defined type scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer)
    */
  var typeScheme: js.UndefOr[TypeScheme] = js.undefined
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number or a string. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer)
    */
  var valueExpression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer)
    */
  var valueExpressionTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The view instance in which the visualization will be rendered. A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) is required if `symbolType = "3d-volumetric"` or `3d-volumetric-uniform`. The relevant SceneView or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) is required when a `valueExpression` is specified.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.undefined
}

object typeCreateRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    layer: FeatureLayer | SceneLayer | CSVLayer,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    basemap: java.lang.String | Basemap = null,
    colorMixMode: java.lang.String = null,
    defaultSymbolEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    field: java.lang.String = null,
    legendOptions: typeCreateRendererParamsLegendOptions = null,
    numTypes: scala.Int | scala.Double = null,
    sortBy: java.lang.String = null,
    statistics: UniqueValuesResult = null,
    symbolType: java.lang.String = null,
    typeScheme: TypeScheme = null,
    valueExpression: java.lang.String = null,
    valueExpressionTitle: java.lang.String = null,
    view: View = null
  ): typeCreateRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = propertyIsEnumerable)
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (colorMixMode != null) __obj.updateDynamic("colorMixMode")(colorMixMode)
    if (!js.isUndefined(defaultSymbolEnabled)) __obj.updateDynamic("defaultSymbolEnabled")(defaultSymbolEnabled)
    if (field != null) __obj.updateDynamic("field")(field)
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (numTypes != null) __obj.updateDynamic("numTypes")(numTypes.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType)
    if (typeScheme != null) __obj.updateDynamic("typeScheme")(typeScheme)
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression)
    if (valueExpressionTitle != null) __obj.updateDynamic("valueExpressionTitle")(valueExpressionTitle)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[typeCreateRendererParams]
  }
}

