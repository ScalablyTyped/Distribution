package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalGatewayVirtualInterface extends StObject {
  
  /**
    * The local address.
    */
  var LocalAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the local gateway.
    */
  var LocalBgpAsn: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the virtual interface.
    */
  var LocalGatewayVirtualInterfaceId: js.UndefOr[typings.awsSdk.clientsEc2Mod.LocalGatewayVirtualInterfaceId] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the local gateway virtual interface.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The peer address.
    */
  var PeerAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The peer BGP ASN.
    */
  var PeerBgpAsn: js.UndefOr[Integer] = js.undefined
  
  /**
    * The tags assigned to the virtual interface.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the VLAN.
    */
  var Vlan: js.UndefOr[Integer] = js.undefined
}
object LocalGatewayVirtualInterface {
  
  inline def apply(): LocalGatewayVirtualInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayVirtualInterface]
  }
  
  extension [Self <: LocalGatewayVirtualInterface](x: Self) {
    
    inline def setLocalAddress(value: String): Self = StObject.set(x, "LocalAddress", value.asInstanceOf[js.Any])
    
    inline def setLocalAddressUndefined: Self = StObject.set(x, "LocalAddress", js.undefined)
    
    inline def setLocalBgpAsn(value: Integer): Self = StObject.set(x, "LocalBgpAsn", value.asInstanceOf[js.Any])
    
    inline def setLocalBgpAsnUndefined: Self = StObject.set(x, "LocalBgpAsn", js.undefined)
    
    inline def setLocalGatewayId(value: String): Self = StObject.set(x, "LocalGatewayId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayIdUndefined: Self = StObject.set(x, "LocalGatewayId", js.undefined)
    
    inline def setLocalGatewayVirtualInterfaceId(value: LocalGatewayVirtualInterfaceId): Self = StObject.set(x, "LocalGatewayVirtualInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayVirtualInterfaceIdUndefined: Self = StObject.set(x, "LocalGatewayVirtualInterfaceId", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPeerAddress(value: String): Self = StObject.set(x, "PeerAddress", value.asInstanceOf[js.Any])
    
    inline def setPeerAddressUndefined: Self = StObject.set(x, "PeerAddress", js.undefined)
    
    inline def setPeerBgpAsn(value: Integer): Self = StObject.set(x, "PeerBgpAsn", value.asInstanceOf[js.Any])
    
    inline def setPeerBgpAsnUndefined: Self = StObject.set(x, "PeerBgpAsn", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVlan(value: Integer): Self = StObject.set(x, "Vlan", value.asInstanceOf[js.Any])
    
    inline def setVlanUndefined: Self = StObject.set(x, "Vlan", js.undefined)
  }
}
