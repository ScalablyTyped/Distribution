package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.cim
import typings.arcgisJsApi.esri.CIM.CIMSymbolReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMSymbol extends Symbol {
  
  /**
    * The JSON payload of the [CIMSymbolReference](https://github.com/Esri/cim-spec/blob/master/docs/v2/CIMRenderers.md#CIMSymbolReference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#data)
    */
  var data: CIMSymbolReference = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#type)
    */
  @JSName("type")
  val type_CIMSymbol: cim = js.native
}
