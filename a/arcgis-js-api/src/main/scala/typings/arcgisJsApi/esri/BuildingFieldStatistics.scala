package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildingFieldStatistics extends Object {
  /**
    * Name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var fieldName: String
  /**
    * Label of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var label: String
  /**
    * Maximum value of the field for numeric values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var max: Double
  /**
    * Minimum value of the field for numeric values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var min: Double
  /**
    * Model Name of the field. This can be used to identify certain special fields, like floor number, or phase id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var modelName: String
  /**
    * List of the most frequent values of the field. This is not guaranteed to be a complete list of all values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var mostFrequentValues: js.Array[Double | String]
  /**
    * List of sublayer ids where this field is available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var subLayerIds: js.Array[Double]
}

object BuildingFieldStatistics {
  @scala.inline
  def apply(
    constructor: js.Function,
    fieldName: String,
    hasOwnProperty: PropertyKey => Boolean,
    label: String,
    max: Double,
    min: Double,
    modelName: String,
    mostFrequentValues: js.Array[Double | String],
    propertyIsEnumerable: PropertyKey => Boolean,
    subLayerIds: js.Array[Double]
  ): BuildingFieldStatistics = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], mostFrequentValues = mostFrequentValues.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), subLayerIds = subLayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingFieldStatistics]
  }
}

