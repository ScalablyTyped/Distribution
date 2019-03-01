package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait classBreaksClassBreaksParams
  extends stdLib.Object {
  /**
    * The method for classifying the data. See the table below for a list of possible values.
    *
    * | Possible Value | Description |
    * |---------------|------------ |
    * | natural-breaks | Data values that cluster are placed into a single class. Class breaks occur where gaps exist between clusters. You should use this method if your data is unevenly distributed; that is, many features have the same or similar values and there are gaps between groups of values. |
    * | equal-interval | Each class has an equal range of values; in other words, the difference between the high and low value is equal for each class. You should use this method if your data is evenly distributed and you want to emphasize the difference in values between the features. |
    * | quantile | Each class has roughly the same number of features. If your data is evenly distributed and you want to emphasize the difference in relative position between features, you should use the quantile classification method. If, for example, the point values are divided into five classes, points in the highest class would fall into the top fifth of all points.  |
    * | standard-deviation | Class breaks are placed above and below the mean value at intervals of `1`, `0.5`, or `0.25` standard deviations until all the data values are included in a class.  |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var classificationMethod: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A subset of features for which to generate the class breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var features: js.UndefOr[js.Array[Graphic]] = js.undefined
  /**
    * The class breaks will be generated based on values of this field. If a field is provided, the values from the given field from all features will be queried in the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The layer from which to generate class breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer
  /**
    * The maximum bounding value for the class breaks definition. Use this in conjunction with `minValue` to generate class breaks between lower and upper bounds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum bounding value for the class breaks definition. Use this in conjunction with `maxValue` to generate class breaks between lower and upper bounds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * The field by which to normalize the values returned from the given `field`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var normalizationField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates the number of classes to generate for the class breaks definition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var numClasses: js.UndefOr[scala.Double] = js.undefined
  /**
    * A SQL expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var sqlExpression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var sqlWhere: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When `classificationMethod = "standard-deviation"`, this sets the interval at which each class break should be set (e.g. `0.25`, `0.33`, `0.5`, `1`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var standardDeviationInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var valueExpression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance is required when a `valueExpression` is specified.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.undefined
}

object classBreaksClassBreaksParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    classificationMethod: java.lang.String = null,
    features: js.Array[Graphic] = null,
    field: java.lang.String = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    normalizationField: java.lang.String = null,
    numClasses: scala.Int | scala.Double = null,
    sqlExpression: java.lang.String = null,
    sqlWhere: java.lang.String = null,
    standardDeviationInterval: scala.Int | scala.Double = null,
    valueExpression: java.lang.String = null,
    view: View = null
  ): classBreaksClassBreaksParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (classificationMethod != null) __obj.updateDynamic("classificationMethod")(classificationMethod)
    if (features != null) __obj.updateDynamic("features")(features)
    if (field != null) __obj.updateDynamic("field")(field)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField)
    if (numClasses != null) __obj.updateDynamic("numClasses")(numClasses.asInstanceOf[js.Any])
    if (sqlExpression != null) __obj.updateDynamic("sqlExpression")(sqlExpression)
    if (sqlWhere != null) __obj.updateDynamic("sqlWhere")(sqlWhere)
    if (standardDeviationInterval != null) __obj.updateDynamic("standardDeviationInterval")(standardDeviationInterval.asInstanceOf[js.Any])
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[classBreaksClassBreaksParams]
  }
}

