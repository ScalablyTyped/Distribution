package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeParamValue
  extends stdLib.Object {
  /**
    * The name of the attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#AttributeParamValue)
    */
  var attributeName: java.lang.String
  /**
    * The name of the parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#AttributeParamValue)
    */
  var parameterName: java.lang.String
  /**
    * The parameter's value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#AttributeParamValue)
    */
  var value: java.lang.String
}

object AttributeParamValue {
  @scala.inline
  def apply(
    attributeName: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    parameterName: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    value: java.lang.String
  ): AttributeParamValue = {
    val __obj = js.Dynamic.literal(attributeName = attributeName, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), parameterName = parameterName, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value)
  
    __obj.asInstanceOf[AttributeParamValue]
  }
}

