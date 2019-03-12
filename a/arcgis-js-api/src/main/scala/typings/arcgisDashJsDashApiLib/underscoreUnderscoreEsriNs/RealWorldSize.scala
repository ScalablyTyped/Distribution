package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealWorldSize
  extends stdLib.Object {
  /**
    * See [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#RealWorldSize)
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * See [normalizationField](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#normalizationField).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#RealWorldSize)
    */
  var normalizationField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Value must be `size`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#RealWorldSize)
    */
  var `type`: java.lang.String
  /**
    * See [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#RealWorldSize)
    */
  var valueExpression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * See [valueRepresentation](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueRepresentation).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#RealWorldSize)
    */
  var valueRepresentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * See [valueUnit](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueUnit).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#RealWorldSize)
    */
  var valueUnit: java.lang.String
}

object RealWorldSize {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    `type`: java.lang.String,
    valueUnit: java.lang.String,
    field: java.lang.String = null,
    normalizationField: java.lang.String = null,
    valueExpression: java.lang.String = null,
    valueRepresentation: java.lang.String = null
  ): RealWorldSize = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), valueUnit = valueUnit)
    __obj.updateDynamic("type")(`type`)
    if (field != null) __obj.updateDynamic("field")(field)
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField)
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression)
    if (valueRepresentation != null) __obj.updateDynamic("valueRepresentation")(valueRepresentation)
    __obj.asInstanceOf[RealWorldSize]
  }
}

