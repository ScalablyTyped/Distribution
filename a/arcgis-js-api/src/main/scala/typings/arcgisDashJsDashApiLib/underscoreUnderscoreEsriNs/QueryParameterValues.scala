package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameterValues
  extends stdLib.Object {
  /**
    * The parameter name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#parameterValues)
    */
  var name: java.lang.String
  /**
    * Single value or array of values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#parameterValues)
    */
  var value: java.lang.String | (js.Array[stdLib.Date | scala.Double | java.lang.String]) | scala.Double | stdLib.Date
}

object QueryParameterValues {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    name: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    value: java.lang.String | (js.Array[stdLib.Date | scala.Double | java.lang.String]) | scala.Double | stdLib.Date
  ): QueryParameterValues = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryParameterValues]
  }
}

