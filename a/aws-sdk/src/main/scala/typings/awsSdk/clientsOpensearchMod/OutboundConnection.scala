package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutboundConnection extends StObject {
  
  /**
    * Name of the connection.
    */
  var ConnectionAlias: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ConnectionAlias] = js.undefined
  
  /**
    * Unique identifier of the connection.
    */
  var ConnectionId: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ConnectionId] = js.undefined
  
  /**
    * Status of the connection.
    */
  var ConnectionStatus: js.UndefOr[OutboundConnectionStatus] = js.undefined
  
  /**
    * Information about the source (local) domain.
    */
  var LocalDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined
  
  /**
    * Information about the destination (remote) domain.
    */
  var RemoteDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined
}
object OutboundConnection {
  
  inline def apply(): OutboundConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutboundConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutboundConnection] (val x: Self) extends AnyVal {
    
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
