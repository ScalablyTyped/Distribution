package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThematicStops
  extends stdLib.Object {
  /**
    * See [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ThematicStops)
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * See [normalizationField](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#normalizationField).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ThematicStops)
    */
  var normalizationField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of objects defining the thematic size ramp in a sequence of data or expression stops. At least two stops are required. The stops must be listed in ascending order based on the value of the `value` property in each stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ThematicStops)
    */
  var stops: js.Array[SizeStop]
  /**
    * Value must be `size`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ThematicStops)
    */
  var `type`: java.lang.String
  /**
    * See [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ThematicStops)
    */
  var valueExpression: js.UndefOr[java.lang.String] = js.undefined
}

object ThematicStops {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    stops: js.Array[SizeStop],
    `type`: java.lang.String,
    field: java.lang.String = null,
    normalizationField: java.lang.String = null,
    valueExpression: java.lang.String = null
  ): ThematicStops = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("stops")(stops)
    if (field != null) __obj.updateDynamic("field")(field)
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField)
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression)
    __obj.asInstanceOf[ThematicStops]
  }
}

