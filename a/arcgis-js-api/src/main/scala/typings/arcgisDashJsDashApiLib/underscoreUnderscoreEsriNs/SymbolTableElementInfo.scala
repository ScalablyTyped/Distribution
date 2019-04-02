package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolTableElementInfo
  extends stdLib.Object
     with SymbolTableElementType {
  /**
    * The title of the renderer as displayed in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElementInfo)
    */
  var label: java.lang.String | RampTitle
  /**
    * A preview of the symbol element as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElementInfo)
    */
  var preview: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /**
    * The size of the symbol in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElementInfo)
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * The symbol for the corresponding `value` in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElementInfo)
    */
  var symbol: Symbol
  /**
    * The value corresponding with the given `symbol` in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElementInfo)
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object SymbolTableElementInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    label: java.lang.String | RampTitle,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    symbol: Symbol,
    preview: stdLib.HTMLElement = null,
    size: scala.Int | scala.Double = null,
    value: js.Any = null
  ): SymbolTableElementInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), symbol = symbol)
    if (preview != null) __obj.updateDynamic("preview")(preview)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SymbolTableElementInfo]
  }
}

