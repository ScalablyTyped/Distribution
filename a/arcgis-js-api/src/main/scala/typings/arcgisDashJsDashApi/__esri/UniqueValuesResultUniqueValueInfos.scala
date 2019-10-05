package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniqueValuesResultUniqueValueInfos extends Object {
  /**
    * The number of features assigned the given `value` (or belonging to the given category).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#UniqueValuesResult)
    */
  var count: Double
  /**
    * A unique value representing a type or category of features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#UniqueValuesResult)
    */
  var value: String | Double
}

object UniqueValuesResultUniqueValueInfos {
  @scala.inline
  def apply(
    constructor: js.Function,
    count: Double,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: String | Double
  ): UniqueValuesResultUniqueValueInfos = {
    val __obj = js.Dynamic.literal(constructor = constructor, count = count, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UniqueValuesResultUniqueValueInfos]
  }
}

