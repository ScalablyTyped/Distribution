package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOutboundConnectionRequest extends StObject {
  
  /**
    * The connection alias used used by the customer for this cross-cluster connection.
    */
  var ConnectionAlias: typings.awsSdk.clientsOpensearchMod.ConnectionAlias
  
  /**
    * The  AWSDomainInformation  for the local OpenSearch domain. 
    */
  var LocalDomainInfo: DomainInformationContainer
  
  /**
    * The  AWSDomainInformation  for the remote OpenSearch domain. 
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
  
  extension [Self <: CreateOutboundConnectionRequest](x: Self) {
    
    inline def setConnectionAlias(value: ConnectionAlias): Self = StObject.set(x, "ConnectionAlias", value.asInstanceOf[js.Any])
    
    inline def setLocalDomainInfo(value: DomainInformationContainer): Self = StObject.set(x, "LocalDomainInfo", value.asInstanceOf[js.Any])
    
    inline def setRemoteDomainInfo(value: DomainInformationContainer): Self = StObject.set(x, "RemoteDomainInfo", value.asInstanceOf[js.Any])
  }
}
