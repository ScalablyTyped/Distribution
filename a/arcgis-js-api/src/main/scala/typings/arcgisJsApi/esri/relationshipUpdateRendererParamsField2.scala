package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait relationshipUpdateRendererParamsField2 extends Object {
  /**
    * The class breaks for the second field used in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var classBreakInfos: js.Array[ClassBreak] = js.native
  /**
    * The name of a numeric field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var field: String = js.native
  /**
    * The label used to describe the field or variable in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The name of a numeric field used to normalize the given `field`. In choropleth visualizations it is best practice to normalize your data values if they haven't already been normalized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#updateRenderer)
    */
  var normalizationField: js.UndefOr[String] = js.native
}

object relationshipUpdateRendererParamsField2 {
  @scala.inline
  def apply(
    classBreakInfos: js.Array[ClassBreak],
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): relationshipUpdateRendererParamsField2 = {
    val __obj = js.Dynamic.literal(classBreakInfos = classBreakInfos.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[relationshipUpdateRendererParamsField2]
  }
  @scala.inline
  implicit class relationshipUpdateRendererParamsField2Ops[Self <: relationshipUpdateRendererParamsField2] (val x: Self) extends AnyVal {
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
    def setClassBreakInfosVarargs(value: ClassBreak*): Self = this.set("classBreakInfos", js.Array(value :_*))
    @scala.inline
    def setClassBreakInfos(value: js.Array[ClassBreak]): Self = this.set("classBreakInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setNormalizationField(value: String): Self = this.set("normalizationField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizationField: Self = this.set("normalizationField", js.undefined)
  }
  
}

