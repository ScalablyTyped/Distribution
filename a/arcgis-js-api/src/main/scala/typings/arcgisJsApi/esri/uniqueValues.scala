package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A function that queries for unique values from a field in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html)
  */
@js.native
trait uniqueValues extends js.Object {
  /**
    * Returns an object containing an array of unique values queried from a given field (or values returned from an expression) in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) along with the total count of features that belong to the given category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#uniqueValues)
    *
    * @param params See the table below for details of each parameter.
    * @param params.layer The layer from which to query for unique values.
    * @param params.field The name of the numeric or string field from which the unique values will be obtained. This property is ignored if a `valueExpression` is used.
    * @param params.valueExpression An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number or string. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    * @param params.sqlExpression A SQL expression evaluating to a number or string.
    * @param params.sqlWhere A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    * @param params.returnAllCodedValues Indicates that all domain codes should be returned if the given field has domain values.
    * @param params.view A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance is required when a `valueExpression` is specified.
    * @param params.features A subset of features for which to generate the unique values.
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def uniqueValues(params: uniqueValuesUniqueValuesParams): js.Promise[UniqueValuesResult] = js.native
}

object uniqueValues {
  @scala.inline
  def apply(uniqueValues: uniqueValuesUniqueValuesParams => js.Promise[UniqueValuesResult]): uniqueValues = {
    val __obj = js.Dynamic.literal(uniqueValues = js.Any.fromFunction1(uniqueValues))
    __obj.asInstanceOf[uniqueValues]
  }
  @scala.inline
  implicit class uniqueValuesOps[Self <: uniqueValues] (val x: Self) extends AnyVal {
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
    def setUniqueValues(value: uniqueValuesUniqueValuesParams => js.Promise[UniqueValuesResult]): Self = this.set("uniqueValues", js.Any.fromFunction1(value))
  }
  
}

