package typings.arcgisJsApi.esri

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
    src: String
  ): SymbolTableElementType = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolTableElementType]
  }
  @scala.inline
  def SymbolTableElementInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    label: String | RampTitle,
    propertyIsEnumerable: PropertyKey => Boolean,
    symbol: Symbol
  ): SymbolTableElementType = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolTableElementType]
  }
}

