package typings.arcgisJsApi.global.esri.symbols

import typings.arcgisJsApi.esri.CIMSymbolProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.symbols.CIMSymbol")
@js.native
/**
  * CIMSymbols are used to display multi-layer vector symbols for features and graphics. They allow the user to add more customizations to their symbols, using one or more [symbol layers](https://github.com/Esri/cim-spec/blob/master/docs/v2/Types.md#symbollayer) to create the desired effect on the symbol. CIMSymbols can be created from [CIMSymbolReference JSON](https://github.com/Esri/cim-spec/blob/master/docs/v2/CIMRenderers.md#CIMSymbolReference) that complies with the [CIM specification](https://github.com/Esri/cim-spec/blob/master/docs/v2/Types.md#symbol) by passing the JSON to the [data](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#data) property. CIMSymbols can also be created from [WebStyleSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html)s, using `[WebStyleSymbol.fetchCIMSymbol()](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#fetchCIMSymbol)`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html)
  */
class CIMSymbolCls ()
  extends typings.arcgisJsApi.esri.CIMSymbol {
  def this(properties: CIMSymbolProperties) = this()
}

