package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sizeCreateVisualVariablesParams
  extends stdLib.Object {
  /**
    * When set to `all`, a single size variable that scales uniformly in all dimensions is generated. When set to `height`, the result contains two size visual variables: the first one sizes the height according to the field statistics, while the second defines a constant size for width and depth.  **Possible Values:** all | height
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    *
    * @default all
    */
  var axis: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    *
    * @default gray
    */
  var basemap: js.UndefOr[java.lang.String | Basemap] = js.undefined
  /**
    * The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. This property is ignored if a `valueExpression` is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var field: java.lang.String
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
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * A custom minimum value set by the user. Use this in conjunction with `maxValue` to generate statistics between lower and upper bounds. This will be the lowest stop in the returned size visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the field to normalize the values of the given `field`. Providing a normalization field helps minimize some visualization errors and standardizes the data so all features are visualized with minimal bias due to area differences or count variation. This option is commonly used when visualizing densities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var normalizationField: js.UndefOr[java.lang.String] = js.undefined
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
  var sqlExpression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var sqlWhere: js.UndefOr[java.lang.String] = js.undefined
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
  var valueExpression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var valueExpressionTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When generating 3D symbols, a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) instance is required. The relevant SceneView or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) is required when a `valueExpression` is specified.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.undefined
  /**
    * Indicates if the size units of the symbols will be in meters. This should be `true` when generating visualizations with 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createVisualVariables)
    */
  var worldScale: js.UndefOr[scala.Boolean] = js.undefined
}

object sizeCreateVisualVariablesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    axis: java.lang.String = null,
    basemap: java.lang.String | Basemap = null,
    legendOptions: sizeCreateVisualVariablesParamsLegendOptions = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    normalizationField: java.lang.String = null,
    sizeScheme: SizeScheme = null,
    sqlExpression: java.lang.String = null,
    sqlWhere: java.lang.String = null,
    statistics: SummaryStatisticsResult = null,
    valueExpression: java.lang.String = null,
    valueExpressionTitle: java.lang.String = null,
    view: View = null,
    worldScale: js.UndefOr[scala.Boolean] = js.undefined
  ): sizeCreateVisualVariablesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, field = field, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField)
    if (sizeScheme != null) __obj.updateDynamic("sizeScheme")(sizeScheme)
    if (sqlExpression != null) __obj.updateDynamic("sqlExpression")(sqlExpression)
    if (sqlWhere != null) __obj.updateDynamic("sqlWhere")(sqlWhere)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression)
    if (valueExpressionTitle != null) __obj.updateDynamic("valueExpressionTitle")(valueExpressionTitle)
    if (view != null) __obj.updateDynamic("view")(view)
    if (!js.isUndefined(worldScale)) __obj.updateDynamic("worldScale")(worldScale)
    __obj.asInstanceOf[sizeCreateVisualVariablesParams]
  }
}

