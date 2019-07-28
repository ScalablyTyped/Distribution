package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthoringInfoField1 extends Object {
  /**
    * Describes the class breaks generated for this field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1)
    */
  var classBreakInfos: js.UndefOr[js.Array[AuthoringInfoField1ClassBreakInfos]] = js.undefined
  /**
    * The name of a numeric field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1)
    */
  var field: String
  /**
    * The name of a numeric field used to normalize the given `field`. In choropleth visualizations it is best practice to normalize your data values if they haven't already been normalized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
}

object AuthoringInfoField1 {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    classBreakInfos: js.Array[AuthoringInfoField1ClassBreakInfos] = null,
    normalizationField: String = null
  ): AuthoringInfoField1 = {
    val __obj = js.Dynamic.literal(constructor = constructor, field = field, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (classBreakInfos != null) __obj.updateDynamic("classBreakInfos")(classBreakInfos)
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField)
    __obj.asInstanceOf[AuthoringInfoField1]
  }
}

