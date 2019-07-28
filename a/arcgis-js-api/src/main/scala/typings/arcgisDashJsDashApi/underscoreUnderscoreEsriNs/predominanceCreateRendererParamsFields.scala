package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait predominanceCreateRendererParamsFields extends Object {
  /**
    * The label describing the field name (or category) in the legend. This is should be used if the given field doesn't have an intuitive field name. For example, for a field named `dem` representing the total vote count for the Democratic party, you can set the label to `Democrat` to clarify the name of the category in the final visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#createRenderer)
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The name of a numeric field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#createRenderer)
    */
  var name: String
}

object predominanceCreateRendererParamsFields {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    label: String = null
  ): predominanceCreateRendererParamsFields = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[predominanceCreateRendererParamsFields]
  }
}

