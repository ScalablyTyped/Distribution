package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOutboundCrossClusterSearchConnectionResponse extends StObject {
  
  /**
    * Specifies the connection alias provided during the create connection request.
    */
  var ConnectionAlias: js.UndefOr[typings.awsSdk.clientsEsMod.ConnectionAlias] = js.undefined
  
  /**
    * Specifies the OutboundCrossClusterSearchConnectionStatus for the newly created connection.
    */
  var ConnectionStatus: js.UndefOr[OutboundCrossClusterSearchConnectionStatus] = js.undefined
  
  /**
    * Unique id for the created outbound connection, which is used for subsequent operations on connection.
    */
  var CrossClusterSearchConnectionId: js.UndefOr[typings.awsSdk.clientsEsMod.CrossClusterSearchConnectionId] = js.undefined
  
  /**
    * Specifies the DomainInformation for the destination Elasticsearch domain.
    */
  var DestinationDomainInfo: js.UndefOr[DomainInformation] = js.undefined
  
  /**
    * Specifies the DomainInformation for the source Elasticsearch domain.
    */
  var SourceDomainInfo: js.UndefOr[DomainInformation] = js.undefined
}
object CreateOutboundCrossClusterSearchConnectionResponse {
  
  inline def apply(): CreateOutboundCrossClusterSearchConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOutboundCrossClusterSearchConnectionResponse]
  }
  
  extension [Self <: CreateOutboundCrossClusterSearchConnectionResponse](x: Self) {
    
    inline def setConnectionAlias(value: ConnectionAlias): Self = StObject.set(x, "ConnectionAlias", value.asInstanceOf[js.Any])
    
    inline def setConnectionAliasUndefined: Self = StObject.set(x, "ConnectionAlias", js.undefined)
    
    inline def setConnectionStatus(value: OutboundCrossClusterSearchConnectionStatus): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    inline def setCrossClusterSearchConnectionId(value: CrossClusterSearchConnectionId): Self = StObject.set(x, "CrossClusterSearchConnectionId", value.asInstanceOf[js.Any])
    
    inline def setCrossClusterSearchConnectionIdUndefined: Self = StObject.set(x, "CrossClusterSearchConnectionId", js.undefined)
    
    inline def setDestinationDomainInfo(value: DomainInformation): Self = StObject.set(x, "DestinationDomainInfo", value.asInstanceOf[js.Any])
    
    inline def setDestinationDomainInfoUndefined: Self = StObject.set(x, "DestinationDomainInfo", js.undefined)
    
    inline def setSourceDomainInfo(value: DomainInformation): Self = StObject.set(x, "SourceDomainInfo", value.asInstanceOf[js.Any])
    
    inline def setSourceDomainInfoUndefined: Self = StObject.set(x, "SourceDomainInfo", js.undefined)
  }
}
