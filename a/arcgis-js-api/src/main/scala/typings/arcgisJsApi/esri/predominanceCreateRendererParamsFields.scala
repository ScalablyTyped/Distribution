package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait predominanceCreateRendererParamsFields extends Object {
  /**
    * The label describing the field name (or category) in the legend. This is should be used if the given field doesn't have an intuitive field name. For example, for a field named `dem` representing the total vote count for the Democratic party, you can set the label to `Democrat` to clarify the name of the category in the final visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The name of a numeric field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    */
  var name: String = js.native
}

object predominanceCreateRendererParamsFields {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): predominanceCreateRendererParamsFields = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[predominanceCreateRendererParamsFields]
  }
  @scala.inline
  implicit class predominanceCreateRendererParamsFieldsOps[Self <: predominanceCreateRendererParamsFields] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

