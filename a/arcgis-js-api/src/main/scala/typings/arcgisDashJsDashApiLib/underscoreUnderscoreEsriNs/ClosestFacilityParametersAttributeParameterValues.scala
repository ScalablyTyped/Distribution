package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClosestFacilityParametersAttributeParameterValues
  extends stdLib.Object {
  /**
    * The name of the attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#attributeParameterValues)
    */
  var attributeName: java.lang.String
  /**
    * The parameter name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#attributeParameterValues)
    */
  var parameterName: java.lang.String
  /**
    * The parameter value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#attributeParameterValues)
    */
  var value: java.lang.String
}

object ClosestFacilityParametersAttributeParameterValues {
  @scala.inline
  def apply(
    attributeName: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    parameterName: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    value: java.lang.String
  ): ClosestFacilityParametersAttributeParameterValues = {
    val __obj = js.Dynamic.literal(attributeName = attributeName, constructor = constructor, hasOwnProperty = hasOwnProperty, parameterName = parameterName, propertyIsEnumerable = propertyIsEnumerable, value = value)
  
    __obj.asInstanceOf[ClosestFacilityParametersAttributeParameterValues]
  }
}

