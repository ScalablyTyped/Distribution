package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectionRequest extends StObject {
  
  /**
    * The ID of the dedicated connection. You can use DescribeConnections to retrieve the connection ID.
    */
  var connectionId: ConnectionId
  
  /**
    * The name of the connection.
    */
  var connectionName: js.UndefOr[ConnectionName] = js.undefined
  
  /**
    * The connection MAC Security (MACsec) encryption mode. The valid values are no_encrypt, should_encrypt, and must_encrypt.
    */
  var encryptionMode: js.UndefOr[EncryptionMode] = js.undefined
}
object UpdateConnectionRequest {
  
  inline def apply(connectionId: ConnectionId): UpdateConnectionRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectionRequest]
  }
  
  extension [Self <: UpdateConnectionRequest](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionName(value: ConnectionName): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
    
    inline def setEncryptionMode(value: EncryptionMode): Self = StObject.set(x, "encryptionMode", value.asInstanceOf[js.Any])
    
    inline def setEncryptionModeUndefined: Self = StObject.set(x, "encryptionMode", js.undefined)
  }
}
