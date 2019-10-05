package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorVariableProperties extends VisualVariableProperties {
  /**
    * Name of the numeric attribute field by which to normalize the data. If this field is used, then the values in [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#stops) should be normalized as percentages or ratios.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#normalizationField)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
  /**
    * An array of sequential objects, or stops, that defines a continuous color ramp. You must specify 2 - 8 stops. In most cases, no more than five are needed. Features with values that fall between the given stops will be assigned colors linearly interpolated along the ramp in relation to the nearest stop values. The stops must be listed in ascending order based on the value of the `value` property in each stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#stops)
    */
  var stops: js.UndefOr[js.Array[ColorStopProperties]] = js.undefined
}

object ColorVariableProperties {
  @scala.inline
  def apply(
    field: String = null,
    legendOptions: VisualVariableLegendOptions = null,
    normalizationField: String = null,
    stops: js.Array[ColorStopProperties] = null,
    valueExpression: String = null,
    valueExpressionTitle: String = null
  ): ColorVariableProperties = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField)
    if (stops != null) __obj.updateDynamic("stops")(stops)
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression)
    if (valueExpressionTitle != null) __obj.updateDynamic("valueExpressionTitle")(valueExpressionTitle)
    __obj.asInstanceOf[ColorVariableProperties]
  }
}

