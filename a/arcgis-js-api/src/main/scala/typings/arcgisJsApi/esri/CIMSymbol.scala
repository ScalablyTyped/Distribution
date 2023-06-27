package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.cim
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMSymbol
  extends StObject
     with Symbol
     with typings.arcgisJsApi.esri.symbols.Symbol2D
     with Symbol2D {
  
  /**
  		 * The JSON payload of the [CIMSymbolReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSymbolReference).
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
