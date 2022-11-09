package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundConnection extends StObject {
  
  /**
    * The unique identifier of the connection.
    */
  var ConnectionId: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ConnectionId] = js.undefined
  
  /**
    * The current status of the connection.
    */
  var ConnectionStatus: js.UndefOr[InboundConnectionStatus] = js.undefined
  
  /**
    * Information about the source (local) domain.
    */
  var LocalDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined
  
  /**
    * Information about the destination (remote) domain.
    */
  var RemoteDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined
}
object InboundConnection {
  
  inline def apply(): InboundConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InboundConnection]
  }
  
  extension [Self <: InboundConnection](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "ConnectionId", js.undefined)
    
    inline def setConnectionStatus(value: InboundConnectionStatus): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    inline def setLocalDomainInfo(value: DomainInformationContainer): Self = StObject.set(x, "LocalDomainInfo", value.asInstanceOf[js.Any])
    
    inline def setLocalDomainInfoUndefined: Self = StObject.set(x, "LocalDomainInfo", js.undefined)
    
    inline def setRemoteDomainInfo(value: DomainInformationContainer): Self = StObject.set(x, "RemoteDomainInfo", value.asInstanceOf[js.Any])
    
    inline def setRemoteDomainInfoUndefined: Self = StObject.set(x, "RemoteDomainInfo", js.undefined)
  }
}
