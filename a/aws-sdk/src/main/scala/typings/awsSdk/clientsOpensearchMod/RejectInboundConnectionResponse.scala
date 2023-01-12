package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectInboundConnectionResponse extends StObject {
  
  /**
    * Contains details about the rejected inbound connection.
    */
  var Connection: js.UndefOr[InboundConnection] = js.undefined
}
object RejectInboundConnectionResponse {
  
  inline def apply(): RejectInboundConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectInboundConnectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RejectInboundConnectionResponse] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: InboundConnection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
  }
}
