package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualVariableProperties extends js.Object {
  /**
    * The name of the numeric attribute field that contains the data values used to determine the color/opacity/size/rotation of each feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#field)
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An object providing options for displaying the visual variable in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#legendOptions)
    */
  var legendOptions: js.UndefOr[VisualVariableLegendOptions] = js.undefined
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to a number. This expression can reference field values using the `$feature` global variable and perform mathematical calculations and logical evaluations at runtime. The values returned from this expression are the data used to drive the visualization. This takes precedence over [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#field). Therefore, this property is typically used as an alternative to [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#field) in visual variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#valueExpression)
    */
  var valueExpression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#valueExpression) property. This is displayed as the title of the corresponding visual variable in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) in the absence of a provided `title` in the [legendOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#legendOptions) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#valueExpressionTitle)
    */
  var valueExpressionTitle: js.UndefOr[java.lang.String] = js.undefined
}

object VisualVariableProperties {
  @scala.inline
  def apply(
    field: java.lang.String = null,
    legendOptions: VisualVariableLegendOptions = null,
    valueExpression: java.lang.String = null,
    valueExpressionTitle: java.lang.String = null
  ): VisualVariableProperties = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression)
    if (valueExpressionTitle != null) __obj.updateDynamic("valueExpressionTitle")(valueExpressionTitle)
    __obj.asInstanceOf[VisualVariableProperties]
  }
}

