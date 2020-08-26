package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleDependentStops extends Object {
  /**
    * The only supported expression is `view.scale`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
    */
  var expression: js.UndefOr[String] = js.native
  /**
    * An array of objects that define the size of the icon (or alternatively the width of the polygon outline) at the given scale `value`. You must specify 2 - 6 stops. The stops must be listed in ascending order based on the value of the `value` property in each stop. When the [MapView.scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) equals the `value` in a stop, then icons (or outlines) will be rendered with the corresponding size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
    */
  var stops: js.Array[SizeStop] = js.native
  /**
    * This value must be `outline` when scaling polygon outline widths based on the view scale. If scale-dependent icons are desired, then this property should be ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
    */
  var target: js.UndefOr[String] = js.native
  /**
    * Value must be `size`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
    */
  var `type`: String = js.native
  /**
    * This value must be `$view.scale`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
    */
  var valueExpression: String = js.native
}

object ScaleDependentStops {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    stops: js.Array[SizeStop],
    `type`: String,
    valueExpression: String
  ): ScaleDependentStops = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stops = stops.asInstanceOf[js.Any], valueExpression = valueExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleDependentStops]
  }
  @scala.inline
  implicit class ScaleDependentStopsOps[Self <: ScaleDependentStops] (val x: Self) extends AnyVal {
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
    def setStopsVarargs(value: SizeStop*): Self = this.set("stops", js.Array(value :_*))
    @scala.inline
    def setStops(value: js.Array[SizeStop]): Self = this.set("stops", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueExpression(value: String): Self = this.set("valueExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

