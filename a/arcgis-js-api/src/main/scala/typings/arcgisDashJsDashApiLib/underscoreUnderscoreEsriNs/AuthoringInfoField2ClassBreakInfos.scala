package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthoringInfoField2ClassBreakInfos
  extends stdLib.Object {
  /**
    * The maximum bound of values to visualize in the given field. If a feature's value is greater than this value, then it will be assigned the default symbol of the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2)
    */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum bound of values to visualize in the given field. If a feature's value is less than this value, then it will be assigned the default symbol of the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2)
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
}

object AuthoringInfoField2ClassBreakInfos {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null
  ): AuthoringInfoField2ClassBreakInfos = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthoringInfoField2ClassBreakInfos]
  }
}

