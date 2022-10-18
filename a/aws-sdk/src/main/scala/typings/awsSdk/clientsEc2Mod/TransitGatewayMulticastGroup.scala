package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayMulticastGroup extends StObject {
  
  /**
    * The IP address assigned to the transit gateway multicast group.
    */
  var GroupIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that the resource is a transit gateway multicast group member.
    */
  var GroupMember: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that the resource is a transit gateway multicast group member.
    */
  var GroupSource: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The member type (for example, static).
    */
  var MemberType: js.UndefOr[MembershipType] = js.undefined
  
  /**
    * The ID of the transit gateway attachment.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    *  The ID of the Amazon Web Services account that owns the transit gateway multicast domain group resource.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of resource, for example a VPC attachment.
    */
  var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType] = js.undefined
  
  /**
    * The source type.
    */
  var SourceType: js.UndefOr[MembershipType] = js.undefined
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the transit gateway attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.undefined
}
object TransitGatewayMulticastGroup {
  
  inline def apply(): TransitGatewayMulticastGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayMulticastGroup]
  }
  
  extension [Self <: TransitGatewayMulticastGroup](x: Self) {
    
    inline def setGroupIpAddress(value: String): Self = StObject.set(x, "GroupIpAddress", value.asInstanceOf[js.Any])
    
    inline def setGroupIpAddressUndefined: Self = StObject.set(x, "GroupIpAddress", js.undefined)
    
    inline def setGroupMember(value: Boolean): Self = StObject.set(x, "GroupMember", value.asInstanceOf[js.Any])
    
    inline def setGroupMemberUndefined: Self = StObject.set(x, "GroupMember", js.undefined)
    
    inline def setGroupSource(value: Boolean): Self = StObject.set(x, "GroupSource", value.asInstanceOf[js.Any])
    
    inline def setGroupSourceUndefined: Self = StObject.set(x, "GroupSource", js.undefined)
    
    inline def setMemberType(value: MembershipType): Self = StObject.set(x, "MemberType", value.asInstanceOf[js.Any])
    
    inline def setMemberTypeUndefined: Self = StObject.set(x, "MemberType", js.undefined)
    
    inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceOwnerId(value: String): Self = StObject.set(x, "ResourceOwnerId", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerIdUndefined: Self = StObject.set(x, "ResourceOwnerId", js.undefined)
    
    inline def setResourceType(value: TransitGatewayAttachmentResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setSourceType(value: MembershipType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    inline def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setTransitGatewayAttachmentId(value: String): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
  }
}
