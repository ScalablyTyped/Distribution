package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionRequest extends StObject {
  
  /**
    *  The ID of the connection. 
    */
  var ConnectionId: typings.awsSdk.clientsOutpostsMod.ConnectionId
}
object GetConnectionRequest {
  
  inline def apply(ConnectionId: ConnectionId): GetConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionRequest]
  }
  
  extension [Self <: GetConnectionRequest](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
  }
}
