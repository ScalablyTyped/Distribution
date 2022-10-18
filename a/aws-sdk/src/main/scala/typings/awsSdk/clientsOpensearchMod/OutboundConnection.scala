package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutboundConnection extends StObject {
  
  /**
    * The connection alias for the outbound cross-cluster connection.
    */
  var ConnectionAlias: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ConnectionAlias] = js.undefined
  
  /**
    * The connection ID for the outbound cross-cluster connection.
    */
  var ConnectionId: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ConnectionId] = js.undefined
  
  /**
    * The  OutboundConnectionStatus  for the outbound connection. 
    */
  var ConnectionStatus: js.UndefOr[OutboundConnectionStatus] = js.undefined
  
  /**
    * The  DomainInformation  for the local OpenSearch domain. 
    */
  var LocalDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined
  
  /**
    * The  DomainInformation  for the remote OpenSearch domain. 
    */
  var RemoteDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined
}
object OutboundConnection {
  
  inline def apply(): OutboundConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutboundConnection]
  }
  
  extension [Self <: OutboundConnection](x: Self) {
    
    inline def setConnectionAlias(value: ConnectionAlias): Self = StObject.set(x, "ConnectionAlias", value.asInstanceOf[js.Any])
    
    inline def setConnectionAliasUndefined: Self = StObject.set(x, "ConnectionAlias", js.undefined)
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "ConnectionId", js.undefined)
    
    inline def setConnectionStatus(value: OutboundConnectionStatus): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    inline def setLocalDomainInfo(value: DomainInformationContainer): Self = StObject.set(x, "LocalDomainInfo", value.asInstanceOf[js.Any])
    
    inline def setLocalDomainInfoUndefined: Self = StObject.set(x, "LocalDomainInfo", js.undefined)
    
    inline def setRemoteDomainInfo(value: DomainInformationContainer): Self = StObject.set(x, "RemoteDomainInfo", value.asInstanceOf[js.Any])
    
    inline def setRemoteDomainInfoUndefined: Self = StObject.set(x, "RemoteDomainInfo", js.undefined)
  }
}
