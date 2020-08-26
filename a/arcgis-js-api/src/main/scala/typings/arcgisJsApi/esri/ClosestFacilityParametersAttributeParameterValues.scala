package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClosestFacilityParametersAttributeParameterValues extends Object {
  /**
    * The name of the attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#attributeParameterValues)
    */
  var attributeName: String = js.native
  /**
    * The parameter name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#attributeParameterValues)
    */
  var parameterName: String = js.native
  /**
    * The parameter value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#attributeParameterValues)
    */
  var value: String = js.native
}

object ClosestFacilityParametersAttributeParameterValues {
  @scala.inline
  def apply(
    attributeName: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    parameterName: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: String
  ): ClosestFacilityParametersAttributeParameterValues = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), parameterName = parameterName.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosestFacilityParametersAttributeParameterValues]
  }
  @scala.inline
  implicit class ClosestFacilityParametersAttributeParameterValuesOps[Self <: ClosestFacilityParametersAttributeParameterValues] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameterName(value: String): Self = this.set("parameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

