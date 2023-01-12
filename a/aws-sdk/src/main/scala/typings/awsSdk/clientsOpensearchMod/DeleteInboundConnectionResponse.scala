package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInboundConnectionResponse extends StObject {
  
  /**
    * The deleted inbound connection.
    */
  var Connection: js.UndefOr[InboundConnection] = js.undefined
}
object DeleteInboundConnectionResponse {
  
  inline def apply(): DeleteInboundConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteInboundConnectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteInboundConnectionResponse] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: InboundConnection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
  }
}
