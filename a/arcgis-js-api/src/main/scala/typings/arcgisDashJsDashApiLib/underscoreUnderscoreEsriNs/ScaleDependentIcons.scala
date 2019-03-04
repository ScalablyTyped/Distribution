package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleDependentIcons
  extends stdLib.Object {
  /**
    * **Deprecated since version 4.2. Use `valueExpression` instead**. The only supported expression is `view.scale`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
    */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * See [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * See [maxDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxDataValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
    */
  var maxDataValue: scala.Double
  /**
    * An object defining the size of features whose data value (defined in `field` or `valueExpression`) is greater than or equal to the `maxDataValue` for the given view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
    */
  var maxSize: ScaleDependentStops
  /**
    * See [minDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
    */
  var minDataValue: scala.Double
  /**
    * An object defining the size of features whose data value (defined in `field` or `valueExpression`) is less than or equal to the `minDataValue` for the given view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
    */
  var minSize: ScaleDependentStops
  /**
    * See [normalizationField](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#normalizationField).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
    */
  var normalizationField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Value must be `size`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
    */
  var `type`: java.lang.String
  /**
    * This value must be `$view.scale`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
    */
  var valueExpression: js.UndefOr[java.lang.String] = js.undefined
}

object ScaleDependentIcons {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    maxDataValue: scala.Double,
    maxSize: ScaleDependentStops,
    minDataValue: scala.Double,
    minSize: ScaleDependentStops,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    `type`: java.lang.String,
    expression: java.lang.String = null,
    field: java.lang.String = null,
    normalizationField: java.lang.String = null,
    valueExpression: java.lang.String = null
  ): ScaleDependentIcons = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, maxDataValue = maxDataValue, maxSize = maxSize, minDataValue = minDataValue, minSize = minSize, propertyIsEnumerable = propertyIsEnumerable)
    __obj.updateDynamic("type")(`type`)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (field != null) __obj.updateDynamic("field")(field)
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField)
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression)
    __obj.asInstanceOf[ScaleDependentIcons]
  }
}

