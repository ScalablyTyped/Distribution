package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnGateway extends StObject {
  
  /**
    * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.undefined
  
  /**
    * The Availability Zone where the virtual private gateway was created, if applicable. This field may be empty or not returned.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the virtual private gateway.
    */
  var State: js.UndefOr[VpnState] = js.undefined
  
  /**
    * Any tags assigned to the virtual private gateway.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The type of VPN connection the virtual private gateway supports.
    */
  var Type: js.UndefOr[GatewayType] = js.undefined
  
  /**
    * Any VPCs attached to the virtual private gateway.
    */
  var VpcAttachments: js.UndefOr[VpcAttachmentList] = js.undefined
  
  /**
    * The ID of the virtual private gateway.
    */
  var VpnGatewayId: js.UndefOr[String] = js.undefined
}
object VpnGateway {
  
  inline def apply(): VpnGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGateway]
  }
  
  extension [Self <: VpnGateway](x: Self) {
    
    inline def setAmazonSideAsn(value: Long): Self = StObject.set(x, "AmazonSideAsn", value.asInstanceOf[js.Any])
    
    inline def setAmazonSideAsnUndefined: Self = StObject.set(x, "AmazonSideAsn", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setState(value: VpnState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: GatewayType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVpcAttachments(value: VpcAttachmentList): Self = StObject.set(x, "VpcAttachments", value.asInstanceOf[js.Any])
    
    inline def setVpcAttachmentsUndefined: Self = StObject.set(x, "VpcAttachments", js.undefined)
    
    inline def setVpcAttachmentsVarargs(value: VpcAttachment*): Self = StObject.set(x, "VpcAttachments", js.Array(value*))
    
    inline def setVpnGatewayId(value: String): Self = StObject.set(x, "VpnGatewayId", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewayIdUndefined: Self = StObject.set(x, "VpnGatewayId", js.undefined)
  }
}
