package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayResponses extends StObject {
  
  /**
    * Returns the entire collection, because of no pagination support.
    */
  var items: js.UndefOr[ListOfGatewayResponse] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object GatewayResponses {
  
  inline def apply(): GatewayResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GatewayResponses] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ListOfGatewayResponse): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GatewayResponse*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
