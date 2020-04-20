package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uniqueValuesUniqueValuesParams extends Object {
  /**
    * A subset of features for which to generate the unique values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var features: js.UndefOr[js.Array[Graphic]] = js.undefined
  /**
    * The name of the numeric or string field from which the unique values will be obtained. This property is ignored if a `valueExpression` is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * The layer from which to query for unique values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer
  /**
    * Indicates that all domain codes should be returned if the given field has domain values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var returnAllCodedValues: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * A SQL expression evaluating to a number or string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var sqlExpression: js.UndefOr[String] = js.undefined
  /**
    * A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var sqlWhere: js.UndefOr[String] = js.undefined
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number or string. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
  /**
    * A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance is required when a `valueExpression` is specified.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.undefined
}

object uniqueValuesUniqueValuesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    features: js.Array[Graphic] = null,
    field: String = null,
    returnAllCodedValues: js.UndefOr[Boolean] = js.undefined,
    signal: AbortSignal = null,
    sqlExpression: String = null,
    sqlWhere: String = null,
    valueExpression: String = null,
    view: View = null
  ): uniqueValuesUniqueValuesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(returnAllCodedValues)) __obj.updateDynamic("returnAllCodedValues")(returnAllCodedValues.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (sqlExpression != null) __obj.updateDynamic("sqlExpression")(sqlExpression.asInstanceOf[js.Any])
    if (sqlWhere != null) __obj.updateDynamic("sqlWhere")(sqlWhere.asInstanceOf[js.Any])
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[uniqueValuesUniqueValuesParams]
  }
}

