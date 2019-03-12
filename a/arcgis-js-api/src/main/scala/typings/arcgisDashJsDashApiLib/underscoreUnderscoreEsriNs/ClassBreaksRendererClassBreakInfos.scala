package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBreaksRendererClassBreakInfos
  extends stdLib.Object {
  /**
    * The label used to describe features in the break in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos)
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum value of the break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos)
    */
  var maxValue: scala.Double
  /**
    * The minimum value of the break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos)
    */
  var minValue: scala.Double
  /**
    * The symbol used to style features whose values are between the `minValue` and `maxValue` of the break. This value may be autocast by specifying the symbol `type`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos)
    */
  var symbol: Symbol
}

object ClassBreaksRendererClassBreakInfos {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    maxValue: scala.Double,
    minValue: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    symbol: Symbol,
    label: java.lang.String = null
  ): ClassBreaksRendererClassBreakInfos = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxValue = maxValue, minValue = minValue, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), symbol = symbol)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[ClassBreaksRendererClassBreakInfos]
  }
}

