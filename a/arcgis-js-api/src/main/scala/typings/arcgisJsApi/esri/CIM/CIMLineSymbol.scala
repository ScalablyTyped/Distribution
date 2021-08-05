package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMLineSymbol
  extends StObject
     with CIMMultiLayerSymbol
     with CIMSymbolType {
  
  @JSName("type")
  var type_CIMLineSymbol: typings.arcgisJsApi.arcgisJsApiStrings.CIMLineSymbol
}
object CIMLineSymbol {
  
  inline def apply(): CIMLineSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMLineSymbol")
    __obj.asInstanceOf[CIMLineSymbol]
  }
  
  extension [Self <: CIMLineSymbol](x: Self) {
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMLineSymbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
