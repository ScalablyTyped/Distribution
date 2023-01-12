package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOutboundConnectionResponse extends StObject {
  
  /**
    * The deleted inbound connection.
    */
  var Connection: js.UndefOr[OutboundConnection] = js.undefined
}
object DeleteOutboundConnectionResponse {
  
  inline def apply(): DeleteOutboundConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteOutboundConnectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteOutboundConnectionResponse] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: OutboundConnection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
  }
}
