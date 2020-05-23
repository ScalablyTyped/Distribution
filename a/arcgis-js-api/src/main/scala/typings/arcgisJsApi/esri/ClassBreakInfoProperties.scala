package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBreakInfoProperties extends js.Object {
  /**
    * Describes the data represented by the class break. This label will appear in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget next to the symbol representing the break. If no label is provided, then a default label is derived using the [minValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#minValue) and [maxValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#maxValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#label)
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Sets the maximum value for the class break. Features with this value or smaller as small as the provided [minValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#minValue) will be rendered with the given [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#symbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#maxValue)
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /**
    * Sets the minimum value for the class break. Features with this value or greater up to the provided [maxValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#maxValue) will be rendered with the given [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#symbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#minValue)
    */
  var minValue: js.UndefOr[Double] = js.undefined
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
    label: String = null,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    symbol: SymbolProperties = null
  ): ClassBreakInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassBreakInfoProperties]
  }
}

