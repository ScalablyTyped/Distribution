package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeParamValue extends Object {
  /**
    * The name of the attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#AttributeParamValue)
    */
  var attributeName: String
  /**
    * The name of the parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#AttributeParamValue)
    */
  var parameterName: String
  /**
    * The parameter's value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#AttributeParamValue)
    */
  var value: String
}

object AttributeParamValue {
  @scala.inline
  def apply(
    attributeName: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    parameterName: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: String
  ): AttributeParamValue = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), parameterName = parameterName.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeParamValue]
  }
}

