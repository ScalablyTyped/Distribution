package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthoringInfoField2
  extends stdLib.Object {
  /**
    * Describes the class breaks generated for this field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2)
    */
  var classBreakInfos: js.UndefOr[js.Array[AuthoringInfoField2ClassBreakInfos]] = js.undefined
  /**
    * The name of a numeric field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2)
    */
  var field: java.lang.String
  /**
    * The name of a numeric field used to normalize the given `field`. In choropleth visualizations it is best practice to normalize your data values if they haven't already been normalized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2)
    */
  var normalizationField: js.UndefOr[java.lang.String] = js.undefined
}

object AuthoringInfoField2 {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    classBreakInfos: js.Array[AuthoringInfoField2ClassBreakInfos] = null,
    normalizationField: java.lang.String = null
  ): AuthoringInfoField2 = {
    val __obj = js.Dynamic.literal(constructor = constructor, field = field, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (classBreakInfos != null) __obj.updateDynamic("classBreakInfos")(classBreakInfos)
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField)
    __obj.asInstanceOf[AuthoringInfoField2]
  }
}

