package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  /**
    * The ID of the second device in the connection.
    */
  var ConnectedDeviceId: js.UndefOr[DeviceId] = js.undefined
  
  /**
    * The ID of the link for the second device in the connection.
    */
  var ConnectedLinkId: js.UndefOr[LinkId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the connection.
    */
  var ConnectionArn: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ConnectionArn] = js.undefined
  
  /**
    * The ID of the connection.
    */
  var ConnectionId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ConnectionId] = js.undefined
  
  /**
    * The date and time that the connection was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the connection.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the first device in the connection.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.DeviceId] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId] = js.undefined
  
  /**
    * The ID of the link for the first device in the connection.
    */
  var LinkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.LinkId] = js.undefined
  
  /**
    * The state of the connection.
    */
  var State: js.UndefOr[ConnectionState] = js.undefined
  
  /**
    * The tags for the connection.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object Connection {
  
  inline def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  extension [Self <: Connection](x: Self) {
    
    inline def setConnectedDeviceId(value: DeviceId): Self = StObject.set(x, "ConnectedDeviceId", value.asInstanceOf[js.Any])
    
    inline def setConnectedDeviceIdUndefined: Self = StObject.set(x, "ConnectedDeviceId", js.undefined)
    
    inline def setConnectedLinkId(value: LinkId): Self = StObject.set(x, "ConnectedLinkId", value.asInstanceOf[js.Any])
    
    inline def setConnectedLinkIdUndefined: Self = StObject.set(x, "ConnectedLinkId", js.undefined)
    
    inline def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setConnectionArnUndefined: Self = StObject.set(x, "ConnectionArn", js.undefined)
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "ConnectionId", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    inline def setLinkId(value: LinkId): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
    
    inline def setState(value: ConnectionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
