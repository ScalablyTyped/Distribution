package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateSymbolResponse extends StObject {
  
  /**
    * The CIMSymbol created from the [generateSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-symbolService.html#generateSymbol) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-symbolService.html#GenerateSymbolResponse)
    */
  var symbol: CIMSymbol
}
object GenerateSymbolResponse {
  
  inline def apply(symbol: CIMSymbol): GenerateSymbolResponse = {
    val __obj = js.Dynamic.literal(symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateSymbolResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateSymbolResponse] (val x: Self) extends AnyVal {
    
    inline def setSymbol(value: CIMSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
