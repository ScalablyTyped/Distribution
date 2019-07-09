package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBreakInfoProperties extends js.Object {
  /**
    * Describes the data represented by the class break. This label will appear in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget next to the symbol representing the break. If no label is provided, then a default label is derived using the [minValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#minValue) and [maxValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#maxValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#label)
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the maximum value for the class break. Features with this value or smaller as small as the provided [minValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#minValue) will be rendered with the given [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#symbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#maxValue)
    */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the minimum value for the class break. Features with this value or greater up to the provided [maxValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#maxValue) will be rendered with the given [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#symbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#minValue)
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines the symbol used to render features with data values that are within the bounds defined for the class break. This value may be autocast by specifying the symbol `type`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#symbol)
    */
  var symbol: js.UndefOr[SymbolProperties] = js.undefined
}

object ClassBreakInfoProperties {
  @scala.inline
  def apply(
    label: java.lang.String = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    symbol: SymbolProperties = null
  ): ClassBreakInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    __obj.asInstanceOf[ClassBreakInfoProperties]
  }
}

