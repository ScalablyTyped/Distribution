package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptReservedNodeExchangeOutputMessage extends StObject {
  
  /**
    * 
    */
  var ExchangedReservedNode: js.UndefOr[ReservedNode] = js.undefined
}
object AcceptReservedNodeExchangeOutputMessage {
  
  inline def apply(): AcceptReservedNodeExchangeOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptReservedNodeExchangeOutputMessage]
  }
  
  extension [Self <: AcceptReservedNodeExchangeOutputMessage](x: Self) {
    
    inline def setExchangedReservedNode(value: ReservedNode): Self = StObject.set(x, "ExchangedReservedNode", value.asInstanceOf[js.Any])
    
    inline def setExchangedReservedNodeUndefined: Self = StObject.set(x, "ExchangedReservedNode", js.undefined)
  }
}
