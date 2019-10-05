package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleDependentIcons extends Object {
  /**
    * **Deprecated since version 4.2. Use `valueExpression` instead**. The only supported expression is `view.scale`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
    */
  var expression: js.UndefOr[String] = js.undefined
  /**
    * See [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * See [maxDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxDataValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
    */
  var maxDataValue: Double
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
  var minDataValue: Double
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
  var normalizationField: js.UndefOr[String] = js.undefined
  /**
    * Value must be `size`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
    */
  var `type`: String
  /**
    * See [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
}

object ScaleDependentIcons {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxDataValue: Double,
    maxSize: ScaleDependentStops,
    minDataValue: Double,
    minSize: ScaleDependentStops,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String,
    expression: String = null,
    field: String = null,
    normalizationField: String = null,
    valueExpression: String = null
  ): ScaleDependentIcons = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxDataValue = maxDataValue, maxSize = maxSize, minDataValue = minDataValue, minSize = minSize, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (field != null) __obj.updateDynamic("field")(field)
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField)
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression)
    __obj.asInstanceOf[ScaleDependentIcons]
  }
}

