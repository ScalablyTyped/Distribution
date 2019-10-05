package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleDependentStops extends Object {
  /**
    * **Deprecated since version 4.2. Use `valueExpression` instead**. The only supported expression is `view.scale`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
    */
  var expression: js.UndefOr[String] = js.undefined
  /**
    * An array of objects that define the size of the icon (or alternatively the width of the polygon outline) at the given scale `value`. You must specify 2 - 6 stops. The stops must be listed in ascending order based on the value of the `value` property in each stop. When the [MapView.scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) equals the `value` in a stop, then icons (or outlines) will be rendered with the corresponding size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
    */
  var stops: js.Array[SizeStop]
  /**
    * This value must be `outline` when scaling polygon outline widths based on the view scale. If scale-dependent icons are desired, then this property should be ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * Value must be `size`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
    */
  var `type`: String
  /**
    * This value must be `$view.scale`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
    */
  var valueExpression: String
}

object ScaleDependentStops {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    stops: js.Array[SizeStop],
    `type`: String,
    valueExpression: String,
    expression: String = null,
    target: String = null
  ): ScaleDependentStops = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stops = stops, valueExpression = valueExpression)
    __obj.updateDynamic("type")(`type`)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ScaleDependentStops]
  }
}

