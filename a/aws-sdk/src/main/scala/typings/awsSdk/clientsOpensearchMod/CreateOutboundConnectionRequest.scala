package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOutboundConnectionRequest extends StObject {
  
  /**
    * Name of the connection.
    */
  var ConnectionAlias: typings.awsSdk.clientsOpensearchMod.ConnectionAlias
  
  /**
    * The connection mode.
    */
  var ConnectionMode: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ConnectionMode] = js.undefined
  
  /**
    * Name and Region of the source (local) domain.
    */
  var LocalDomainInfo: DomainInformationContainer
  
  /**
    * Name and Region of the destination (remote) domain.
    */
  var RemoteDomainInfo: DomainInformationContainer
}
object CreateOutboundConnectionRequest {
  
  inline def apply(
    ConnectionAlias: ConnectionAlias,
    LocalDomainInfo: DomainInformationContainer,
    RemoteDomainInfo: DomainInformationContainer
  ): CreateOutboundConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionAlias = ConnectionAlias.asInstanceOf[js.Any], LocalDomainInfo = LocalDomainInfo.asInstanceOf[js.Any], RemoteDomainInfo = RemoteDomainInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOutboundConnectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateOutboundConnectionRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectionAlias(value: ConnectionAlias): Self = StObject.set(x, "ConnectionAlias", value.asInstanceOf[js.Any])
    
    inline def setConnectionMode(value: ConnectionMode): Self = StObject.set(x, "ConnectionMode", value.asInstanceOf[js.Any])
    
    inline def setConnectionModeUndefined: Self = StObject.set(x, "ConnectionMode", js.undefined)
    
    inline def setLocalDomainInfo(value: DomainInformationContainer): Self = StObject.set(x, "LocalDomainInfo", value.asInstanceOf[js.Any])
    
    inline def setRemoteDomainInfo(value: DomainInformationContainer): Self = StObject.set(x, "RemoteDomainInfo", value.asInstanceOf[js.Any])
  }
}
