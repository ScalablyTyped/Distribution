package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMPolygonSymbol
  extends StObject
     with CIMMultiLayerSymbol
     with CIMSymbolType {
  
  @JSName("type")
  var type_CIMPolygonSymbol: typings.arcgisJsApi.arcgisJsApiStrings.CIMPolygonSymbol
}
object CIMPolygonSymbol {
  
  inline def apply(): CIMPolygonSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMPolygonSymbol")
    __obj.asInstanceOf[CIMPolygonSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMPolygonSymbol] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPolygonSymbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
