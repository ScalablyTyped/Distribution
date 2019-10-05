package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait relationshipUpdateRendererParamsField2 extends Object {
  /**
    * The class breaks for the second field used in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#updateRenderer)
    */
  var classBreakInfos: js.Array[ClassBreak]
  /**
    * The name of a numeric field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#updateRenderer)
    */
  var field: String
  /**
    * The name of a numeric field used to normalize the given `field`. In choropleth visualizations it is best practice to normalize your data values if they haven't already been normalized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#updateRenderer)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
}

object relationshipUpdateRendererParamsField2 {
  @scala.inline
  def apply(
    classBreakInfos: js.Array[ClassBreak],
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    normalizationField: String = null
  ): relationshipUpdateRendererParamsField2 = {
    val __obj = js.Dynamic.literal(classBreakInfos = classBreakInfos, constructor = constructor, field = field, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField)
    __obj.asInstanceOf[relationshipUpdateRendererParamsField2]
  }
}

