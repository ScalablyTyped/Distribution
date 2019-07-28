package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniqueValuesResult extends Object {
  /**
    * An array of objects, each containing a unique value/type/category present in the field specified in the [uniqueValues()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues) query. See table below for the specification of each object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#UniqueValuesResult)
    */
  var uniqueValueInfos: js.Array[UniqueValuesResultUniqueValueInfos]
}

object UniqueValuesResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    uniqueValueInfos: js.Array[UniqueValuesResultUniqueValueInfos]
  ): UniqueValuesResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), uniqueValueInfos = uniqueValueInfos)
  
    __obj.asInstanceOf[UniqueValuesResult]
  }
}

