package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.ImageSymbolTableElementInfo
  - typings.arcgisJsApi.esri.SymbolTableElementInfo
*/
trait SymbolTableElementType extends js.Object

object SymbolTableElementType {
  @scala.inline
  def ImageSymbolTableElementInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    src: String,
    height: js.UndefOr[Double] = js.undefined,
    label: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): SymbolTableElementType = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolTableElementType]
  }
  @scala.inline
  def SymbolTableElementInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    label: String | RampTitle,
    propertyIsEnumerable: PropertyKey => Boolean,
    symbol: Symbol,
    preview: HTMLElement = null,
    size: js.UndefOr[Double] = js.undefined,
    value: js.Any = null
  ): SymbolTableElementType = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), symbol = symbol.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolTableElementType]
  }
}

