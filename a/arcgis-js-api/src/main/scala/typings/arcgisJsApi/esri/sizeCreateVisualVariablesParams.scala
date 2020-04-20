package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sizeCreateVisualVariablesParams extends Object {
  /**
    * When set to `all`, a single size variable that scales uniformly in all dimensions is generated. When set to `height`, the result contains two size visual variables: the first one sizes the height according to the field statistics, while the second defines a constant size for width and depth.  **Possible Values:** all | height
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    *
    * @default all
    */
  var axis: js.UndefOr[String] = js.undefined
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    *
    * @default gray
    */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  /**
    * The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. This property is ignored if a `valueExpression` is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var field: String
  /**
    * The layer for which the visual variables are generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer
  /**
    * Provides options for setting a title to a field when an expression is provided instead of a field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var legendOptions: js.UndefOr[sizeCreateVisualVariablesParamsLegendOptions] = js.undefined
  /**
    * A custom maximum value set by the user. Use this in conjunction with `minValue` to generate statistics between lower and upper bounds. This will be the uppermost stop in the returned size visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /**
    * A custom minimum value set by the user. Use this in conjunction with `maxValue` to generate statistics between lower and upper bounds. This will be the lowest stop in the returned size visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /**
    * The name of the field to normalize the values of the given `field`. Providing a normalization field helps minimize some visualization errors and standardizes the data so all features are visualized with minimal bias due to area differences or count variation. This option is commonly used when visualizing densities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Indicates whether symbol sizes should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    *
    * @default false
    */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * In authoring apps, the user may select a pre-defined size scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var sizeScheme: js.UndefOr[SizeScheme] = js.undefined
  /**
    * A SQL expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var sqlExpression: js.UndefOr[String] = js.undefined
  /**
    * A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var sqlWhere: js.UndefOr[String] = js.undefined
  /**
    * A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var statistics: js.UndefOr[SummaryStatisticsResult] = js.undefined
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
  /**
    * Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
  /**
    * The view where the input layer is rendered. This method inspects the view's background (i.e. basemap, web map background, or view container) to determine optimal colors for the output renderer. This parameter should always be set in practice, but if not provided this method will assume the generated renderer will display on a light background. This parameter is required when creating renderers using a `valueExpression` or for renderers intended for display in a SceneView.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.undefined
  /**
    * Indicates if the size units of the symbols will be in meters. This should be `true` when generating visualizations with 3D volumetric symbology.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var worldScale: js.UndefOr[Boolean] = js.undefined
}

object sizeCreateVisualVariablesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    axis: String = null,
    basemap: String | Basemap = null,
    legendOptions: sizeCreateVisualVariablesParamsLegendOptions = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    normalizationField: String = null,
    signal: AbortSignal = null,
    sizeOptimizationEnabled: js.UndefOr[Boolean] = js.undefined,
    sizeScheme: SizeScheme = null,
    sqlExpression: String = null,
    sqlWhere: String = null,
    statistics: SummaryStatisticsResult = null,
    valueExpression: String = null,
    valueExpressionTitle: String = null,
    view: View = null,
    worldScale: js.UndefOr[Boolean] = js.undefined
  ): sizeCreateVisualVariablesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeOptimizationEnabled)) __obj.updateDynamic("sizeOptimizationEnabled")(sizeOptimizationEnabled.asInstanceOf[js.Any])
    if (sizeScheme != null) __obj.updateDynamic("sizeScheme")(sizeScheme.asInstanceOf[js.Any])
    if (sqlExpression != null) __obj.updateDynamic("sqlExpression")(sqlExpression.asInstanceOf[js.Any])
    if (sqlWhere != null) __obj.updateDynamic("sqlWhere")(sqlWhere.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression.asInstanceOf[js.Any])
    if (valueExpressionTitle != null) __obj.updateDynamic("valueExpressionTitle")(valueExpressionTitle.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(worldScale)) __obj.updateDynamic("worldScale")(worldScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[sizeCreateVisualVariablesParams]
  }
}

