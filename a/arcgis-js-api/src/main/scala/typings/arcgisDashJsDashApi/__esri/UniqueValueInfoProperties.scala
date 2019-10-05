package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniqueValueInfoProperties extends js.Object {
  /**
    * Describes the [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#value) represented by the [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#symbol). This label will appear in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget next to the symbol representing the value. If no label is provided, then the raw [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#value) is displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#label)
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Defines the symbol used to render features with the provided [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#value).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#symbol)
    */
  var symbol: js.UndefOr[SymbolProperties] = js.undefined
  /**
    * Features with this value will be rendered with the given [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#symbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#value)
    */
  var value: js.UndefOr[String | Double] = js.undefined
}

object UniqueValueInfoProperties {
  @scala.inline
  def apply(label: String = null, symbol: SymbolProperties = null, value: String | Double = null): UniqueValueInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniqueValueInfoProperties]
  }
}

