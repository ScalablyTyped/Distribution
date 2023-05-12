package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLagRequest extends StObject {
  
  /**
    * The tags to associate with the automtically created LAGs.
    */
  var childConnectionTags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of an existing dedicated connection to migrate to the LAG.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.undefined
  
  /**
    * The bandwidth of the individual physical dedicated connections bundled by the LAG. The possible values are 1Gbps and 10Gbps. 
    */
  var connectionsBandwidth: Bandwidth
  
  /**
    * The name of the LAG.
    */
  var lagName: LagName
  
  /**
    * The location for the LAG.
    */
  var location: LocationCode
  
  /**
    * The number of physical dedicated connections initially provisioned and bundled by the LAG. You can have a maximum of four connections when the port speed is 1G or 10G, or two when the port speed is 100G. 
    */
  var numberOfConnections: Count
  
  /**
    * The name of the service provider associated with the LAG.
    */
  var providerName: js.UndefOr[ProviderName] = js.undefined
  
  /**
    * Indicates whether the connection will support MAC Security (MACsec).  All connections in the LAG must be capable of supporting MAC Security (MACsec). For information about MAC Security (MACsec) prerequisties, see MACsec prerequisties in the Direct Connect User Guide. 
    */
  var requestMACSec: js.UndefOr[RequestMACSec] = js.undefined
  
  /**
    * The tags to associate with the LAG.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateLagRequest {
  
  inline def apply(
    connectionsBandwidth: Bandwidth,
    lagName: LagName,
    location: LocationCode,
    numberOfConnections: Count
  ): CreateLagRequest = {
    val __obj = js.Dynamic.literal(connectionsBandwidth = connectionsBandwidth.asInstanceOf[js.Any], lagName = lagName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], numberOfConnections = numberOfConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLagRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLagRequest] (val x: Self) extends AnyVal {
    
    inline def setChildConnectionTags(value: TagList): Self = StObject.set(x, "childConnectionTags", value.asInstanceOf[js.Any])
    
    inline def setChildConnectionTagsUndefined: Self = StObject.set(x, "childConnectionTags", js.undefined)
    
    inline def setChildConnectionTagsVarargs(value: Tag*): Self = StObject.set(x, "childConnectionTags", js.Array(value*))
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    inline def setConnectionsBandwidth(value: Bandwidth): Self = StObject.set(x, "connectionsBandwidth", value.asInstanceOf[js.Any])
    
    inline def setLagName(value: LagName): Self = StObject.set(x, "lagName", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationCode): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setNumberOfConnections(value: Count): Self = StObject.set(x, "numberOfConnections", value.asInstanceOf[js.Any])
    
    inline def setProviderName(value: ProviderName): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    
    inline def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
    
    inline def setRequestMACSec(value: RequestMACSec): Self = StObject.set(x, "requestMACSec", value.asInstanceOf[js.Any])
    
    inline def setRequestMACSecUndefined: Self = StObject.set(x, "requestMACSec", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
