package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait relationshipUpdateRendererParamsField1
  extends stdLib.Object {
  /**
    * The class breaks for the first field used in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#updateRenderer)
    */
  var classBreakInfos: js.Array[ClassBreak]
  /**
    * The name of a numeric field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#updateRenderer)
    */
  var field: java.lang.String
  /**
    * The name of a numeric field used to normalize the given `field`. In choropleth visualizations it is best practice to normalize your data values if they haven't already been normalized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#updateRenderer)
    */
  var normalizationField: js.UndefOr[java.lang.String] = js.undefined
}

object relationshipUpdateRendererParamsField1 {
  @scala.inline
  def apply(
    classBreakInfos: js.Array[ClassBreak],
    constructor: js.Function,
    field: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    normalizationField: java.lang.String = null
  ): relationshipUpdateRendererParamsField1 = {
    val __obj = js.Dynamic.literal(classBreakInfos = classBreakInfos, constructor = constructor, field = field, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField)
    __obj.asInstanceOf[relationshipUpdateRendererParamsField1]
  }
}

