package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait colorCreateContinuousRendererParams extends Object {
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    *
    * @default replace
    */
  var colorMixMode: js.UndefOr[String] = js.undefined
  /**
    * In authoring apps, the user may select a pre-defined color scheme. Pass the scheme object to this property to avoid getting one based on a `theme` and the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    */
  var colorScheme: js.UndefOr[ColorScheme] = js.undefined
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value and features that do not fall within the configured data range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    *
    * @default true
    */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. This property is ignored if a `valueExpression` is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer
  /**
    * Provides options for setting a title to a field when an expression is provided instead of a field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    */
  var legendOptions: js.UndefOr[colorCreateContinuousRendererParamsLegendOptions] = js.undefined
  /**
    * A custom maximum value set by the user. Use this in conjunction with `minValue` to generate statistics between lower and upper bounds. This will be the uppermost stop in the returned color visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /**
    * A custom minimum value set by the user. Use this in conjunction with `maxValue` to generate statistics between lower and upper bounds. This will be the lowest stop in the returned color visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /**
    * The name of the field to normalize the values of the given `field`. Providing a normalization field helps minimize some visualization errors and standardizes the data so all features are visualized with minimal bias due to area differences or count variation. This option is commonly used when visualizing densities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
  /**
    * For polygon layers only. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    *
    * @default false
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * For point and polyline layers only. Indicates whether symbol sizes should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    *
    * @default false
    */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A SQL expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    */
  var sqlExpression: js.UndefOr[String] = js.undefined
  /**
    * A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    */
  var sqlWhere: js.UndefOr[String] = js.undefined
  /**
    * A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    */
  var statistics: js.UndefOr[SummaryStatisticsResult] = js.undefined
  /**
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. This parameter does not need to be specified for layers with a `mesh` geometry type. Possible values are described below.
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    * | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    * | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). A SceneView instance must be provided to the `view` parameter if this option is used. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    *
    * @default 2d
    */
  var symbolType: js.UndefOr[String] = js.undefined
  /**
    * Determines which values will be emphasized in the continuous ramp and the map. Possible values are listed below.
    *
    * | Value | Description | Example |
    * | ----- | ----------- | ------- |
    * | high-to-low | High values are emphasized with strong colors. | ![high-to-low](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-high-to-low.png) |
    * | above-and-below | Values centered around a given point (e.g. the average) are visualized with weak colors while other values are emphasized with strong colors. | ![above-and-below](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-above-and-below.png) |
    * | centered-on | Values centered around a given point (e.g. the average) are emphasized with strong colors while other values are visualized with weak colors. | ![centered-on](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-centered-on.png) |
    * | extremes | High and low values are emphasized with strong colors. All others are visualized with weak colors. | ![extremes](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-extremes.png) |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    */
  var theme: js.UndefOr[String] = js.undefined
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
  /**
    * Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
  /**
    * The view where the input layer is rendered. This method inspects the view's background (i.e. basemap, web map background, or view container) to determine optimal colors for the output renderer. This parameter should always be set in practice, but if not provided this method will assume the generated renderer will display on a light background. This parameter is required when creating renderers using a `valueExpression` or for renderers intended for display in a SceneView.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.undefined
}

object colorCreateContinuousRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    basemap: String | Basemap = null,
    colorMixMode: String = null,
    colorScheme: ColorScheme = null,
    defaultSymbolEnabled: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    legendOptions: colorCreateContinuousRendererParamsLegendOptions = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    normalizationField: String = null,
    outlineOptimizationEnabled: js.UndefOr[Boolean] = js.undefined,
    sizeOptimizationEnabled: js.UndefOr[Boolean] = js.undefined,
    sqlExpression: String = null,
    sqlWhere: String = null,
    statistics: SummaryStatisticsResult = null,
    symbolType: String = null,
    theme: String = null,
    valueExpression: String = null,
    valueExpressionTitle: String = null,
    view: View = null
  ): colorCreateContinuousRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (colorMixMode != null) __obj.updateDynamic("colorMixMode")(colorMixMode.asInstanceOf[js.Any])
    if (colorScheme != null) __obj.updateDynamic("colorScheme")(colorScheme.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultSymbolEnabled)) __obj.updateDynamic("defaultSymbolEnabled")(defaultSymbolEnabled.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField.asInstanceOf[js.Any])
    if (!js.isUndefined(outlineOptimizationEnabled)) __obj.updateDynamic("outlineOptimizationEnabled")(outlineOptimizationEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeOptimizationEnabled)) __obj.updateDynamic("sizeOptimizationEnabled")(sizeOptimizationEnabled.asInstanceOf[js.Any])
    if (sqlExpression != null) __obj.updateDynamic("sqlExpression")(sqlExpression.asInstanceOf[js.Any])
    if (sqlWhere != null) __obj.updateDynamic("sqlWhere")(sqlWhere.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression.asInstanceOf[js.Any])
    if (valueExpressionTitle != null) __obj.updateDynamic("valueExpressionTitle")(valueExpressionTitle.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[colorCreateContinuousRendererParams]
  }
}

