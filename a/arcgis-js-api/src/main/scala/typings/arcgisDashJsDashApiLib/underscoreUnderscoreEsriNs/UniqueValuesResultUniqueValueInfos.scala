package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniqueValuesResultUniqueValueInfos
  extends stdLib.Object {
  /**
    * The number of features assigned the given `value` (or belonging to the given category).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#UniqueValuesResult)
    */
  var count: scala.Double
  /**
    * A unique value representing a type or category of features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#UniqueValuesResult)
    */
  var value: java.lang.String | scala.Double
}

object UniqueValuesResultUniqueValueInfos {
  @scala.inline
  def apply(
    constructor: js.Function,
    count: scala.Double,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    value: java.lang.String | scala.Double
  ): UniqueValuesResultUniqueValueInfos = {
    val __obj = js.Dynamic.literal(constructor = constructor, count = count, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UniqueValuesResultUniqueValueInfos]
  }
}

