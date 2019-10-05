package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait colorCreateClassBreaksRendererParams extends Object {
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  /**
    * The classification method used for generating breaks. See the table below for a list of possible values.
    *
    * Possible Value | Description
    * ---------------|------------
    * equal-interval | Divides the range of attribute values into equal-sized subranges. For example, if you specify three classes for a field whose values range from 0 to 300, this method will create three classes with ranges of 0–100, 101–200, and 201–300. Equal interval is best applied to familiar data ranges, such as percentages and temperature. This method emphasizes the amount of an attribute value relative to other values. For example, it could show if a store is part of the group of stores that make up the top one-third of all sales.
    * natural-breaks | Groups similar values that maximize the differences between classes. Features are divided into classes whose boundaries are set where there are relatively big differences in the data values. Natural breaks are data-specific classifications and not useful for comparing multiple maps built from different underlying information.
    * quantile | Assigns the same number of data values to each class. This is well suited to linearly distributed data. Because features are grouped in equal numbers in each class, the resulting map can often be misleading. Similar features can potentially be placed in adjacent classes, or features with widely different values can be put in the same class. You can minimize this distortion by increasing the number of classes.
    * standard-deviation | Creates class breaks with equal value ranges that are a proportion of the standard deviation. This is usually done at intervals of one, one-half, one-third, or one-fourth standard deviations from the mean.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    *
    * @default equal-interval
    */
  var classificationMethod: js.UndefOr[String] = js.undefined
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    *
    * @default replace
    */
  var colorMixMode: js.UndefOr[String] = js.undefined
  /**
    * In authoring apps, the user may select a pre-defined color scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    */
  var colorScheme: js.UndefOr[ColorScheme] = js.undefined
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value and features that do not fall within the configured data range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    *
    * @default true
    */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the field whose data will be queried for statistics and classified. This property is ignored if a `valueExpression` is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer
  /**
    * Provides options for setting a title to describe a field instead of using the field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    */
  var legendOptions: js.UndefOr[colorCreateClassBreaksRendererParamsLegendOptions] = js.undefined
  /**
    * A maximum value set by the user. Use this in conjunction with `minValue` to generate class breaks between lower and upper bounds. This will be the upper bound of the highest class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /**
    * A minimum value set by the user. Use this in conjunction with `maxValue` to generate class breaks between lower and upper bounds. This will be the lower bound of the lowest class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /**
    * The name of the field to normalize the values of the given `field`. Providing a normalization field helps minimize some visualization errors and standardizes the data so all features are visualized with minimal bias due to area differences or count variation. This option is commonly used when visualizing densities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
  /**
    * When `normalizationType` is `percent-of-total`, this property contains the total of all data values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    */
  var normalizationTotal: js.UndefOr[Double] = js.undefined
  /**
    * Indicates how the data is normalized. The data value obtained from the `field` is normalized in one of the following ways before it is compared with the class breaks. See the table below for a list of possible values.
    *
    * Possible Value | Description
    * ---------------|------------
    * field | Divides the `field` value by the value of `normalizationField`. This value is set by default if the `normalizationField` is provided.
    * log | Computes the base 10 logarithm of the data value. This can be a useful approach for some data distributions because it reduces the influence of very large data values.
    * percent-of-total | Divides the data value by the sum of all data values then multiplies by 100. Use `normalizationTotal` to define the total value by which to normalize. This value is set by default if the `normalizationTotal` is provided.
    *
    * With the exception of `log` normalization, data normalization creates a ratio by dividing two values. When comparing attribute values between features, normalization minimizes the effect of varying map areas and the number of observations. For example, dividing the 18 to 30 year old population by the area of a polygon feature yields a density value that can be compared evenly with other features, regardless of their size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    */
  var normalizationType: js.UndefOr[String] = js.undefined
  /**
    * The number of class breaks to generate. This is ignored if a `standard-deviation` classification method is specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    *
    * @default 5
    */
  var numClasses: js.UndefOr[Double] = js.undefined
  /**
    * For polygon layers only. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    *
    * @default false
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A SQL expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    */
  var sqlExpression: js.UndefOr[String] = js.undefined
  /**
    * A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    */
  var sqlWhere: js.UndefOr[String] = js.undefined
  /**
    * If a `standard-deviation` classification method is used, then this indicates the interval by which to generate class breaks.  **Possible Values:** 1 | 0.5 | 0.33 | 0.25
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    *
    * @default 1
    */
  var standardDeviationInterval: js.UndefOr[Double] = js.undefined
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    *
    * @default 2d
    */
  var symbolType: js.UndefOr[String] = js.undefined
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
  /**
    * Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
  /**
    * The view instance in which the visualization will be rendered. A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) is required if `symbolType = "3d-volumetric"` or `3d-volumetric-uniform`. The relevant SceneView or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) is required when a `valueExpression` is specified.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.undefined
}

object colorCreateClassBreaksRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    basemap: String | Basemap = null,
    classificationMethod: String = null,
    colorMixMode: String = null,
    colorScheme: ColorScheme = null,
    defaultSymbolEnabled: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    legendOptions: colorCreateClassBreaksRendererParamsLegendOptions = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    normalizationField: String = null,
    normalizationTotal: Int | Double = null,
    normalizationType: String = null,
    numClasses: Int | Double = null,
    outlineOptimizationEnabled: js.UndefOr[Boolean] = js.undefined,
    sqlExpression: String = null,
    sqlWhere: String = null,
    standardDeviationInterval: Int | Double = null,
    symbolType: String = null,
    valueExpression: String = null,
    valueExpressionTitle: String = null,
    view: View = null
  ): colorCreateClassBreaksRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (classificationMethod != null) __obj.updateDynamic("classificationMethod")(classificationMethod)
    if (colorMixMode != null) __obj.updateDynamic("colorMixMode")(colorMixMode)
    if (colorScheme != null) __obj.updateDynamic("colorScheme")(colorScheme)
    if (!js.isUndefined(defaultSymbolEnabled)) __obj.updateDynamic("defaultSymbolEnabled")(defaultSymbolEnabled)
    if (field != null) __obj.updateDynamic("field")(field)
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField)
    if (normalizationTotal != null) __obj.updateDynamic("normalizationTotal")(normalizationTotal.asInstanceOf[js.Any])
    if (normalizationType != null) __obj.updateDynamic("normalizationType")(normalizationType)
    if (numClasses != null) __obj.updateDynamic("numClasses")(numClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(outlineOptimizationEnabled)) __obj.updateDynamic("outlineOptimizationEnabled")(outlineOptimizationEnabled)
    if (sqlExpression != null) __obj.updateDynamic("sqlExpression")(sqlExpression)
    if (sqlWhere != null) __obj.updateDynamic("sqlWhere")(sqlWhere)
    if (standardDeviationInterval != null) __obj.updateDynamic("standardDeviationInterval")(standardDeviationInterval.asInstanceOf[js.Any])
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType)
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression)
    if (valueExpressionTitle != null) __obj.updateDynamic("valueExpressionTitle")(valueExpressionTitle)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[colorCreateClassBreaksRendererParams]
  }
}

