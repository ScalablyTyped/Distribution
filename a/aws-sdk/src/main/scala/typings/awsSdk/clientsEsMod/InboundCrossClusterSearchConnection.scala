package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundCrossClusterSearchConnection extends StObject {
  
  /**
    * Specifies the InboundCrossClusterSearchConnectionStatus for the outbound connection.
    */
  var ConnectionStatus: js.UndefOr[InboundCrossClusterSearchConnectionStatus] = js.undefined
  
  /**
    * Specifies the connection id for the inbound cross-cluster search connection.
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
object InboundCrossClusterSearchConnection {
  
  inline def apply(): InboundCrossClusterSearchConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InboundCrossClusterSearchConnection]
  }
  
  extension [Self <: InboundCrossClusterSearchConnection](x: Self) {
    
    inline def setConnectionStatus(value: InboundCrossClusterSearchConnectionStatus): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    inline def setCrossClusterSearchConnectionId(value: CrossClusterSearchConnectionId): Self = StObject.set(x, "CrossClusterSearchConnectionId", value.asInstanceOf[js.Any])
    
    inline def setCrossClusterSearchConnectionIdUndefined: Self = StObject.set(x, "CrossClusterSearchConnectionId", js.undefined)
    
    inline def setDestinationDomainInfo(value: DomainInformation): Self = StObject.set(x, "DestinationDomainInfo", value.asInstanceOf[js.Any])
    
    inline def setDestinationDomainInfoUndefined: Self = StObject.set(x, "DestinationDomainInfo", js.undefined)
    
    inline def setSourceDomainInfo(value: DomainInformation): Self = StObject.set(x, "SourceDomainInfo", value.asInstanceOf[js.Any])
    
    inline def setSourceDomainInfoUndefined: Self = StObject.set(x, "SourceDomainInfo", js.undefined)
  }
}
