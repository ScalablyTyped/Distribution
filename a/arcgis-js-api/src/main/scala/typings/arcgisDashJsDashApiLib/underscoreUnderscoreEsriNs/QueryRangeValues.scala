package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRangeValues
  extends stdLib.Object {
  /**
    * The range id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#rangeValues)
    */
  var name: java.lang.String
  /**
    * Single value or value range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#rangeValues)
    */
  var values: scala.Double | js.Array[scala.Double]
}

object QueryRangeValues {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    values: scala.Double | js.Array[scala.Double]
  ): QueryRangeValues = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, name = name, propertyIsEnumerable = propertyIsEnumerable, values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryRangeValues]
  }
}

