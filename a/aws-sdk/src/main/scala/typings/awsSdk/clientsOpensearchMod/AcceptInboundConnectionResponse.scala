package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptInboundConnectionResponse extends StObject {
  
  /**
    * Information about the accepted inbound connection.
    */
  var Connection: js.UndefOr[InboundConnection] = js.undefined
}
object AcceptInboundConnectionResponse {
  
  inline def apply(): AcceptInboundConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptInboundConnectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcceptInboundConnectionResponse] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: InboundConnection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
  }
}
