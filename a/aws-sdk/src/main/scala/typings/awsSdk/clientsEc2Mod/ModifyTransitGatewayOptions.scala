package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTransitGatewayOptions extends StObject {
  
  /**
    * Adds IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4, or a size /64 CIDR block or larger for IPv6.
    */
  var AddTransitGatewayCidrBlocks: js.UndefOr[TransitGatewayCidrBlockStringList] = js.undefined
  
  /**
    * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs. The modify ASN operation is not allowed on a transit gateway with active BGP sessions. You must first delete all transit gateway attachments that have BGP configured prior to modifying the ASN on the transit gateway.
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.undefined
  
  /**
    * The ID of the default association route table.
    */
  var AssociationDefaultRouteTableId: js.UndefOr[TransitGatewayRouteTableId] = js.undefined
  
  /**
    * Enable or disable automatic acceptance of attachment requests.
    */
  var AutoAcceptSharedAttachments: js.UndefOr[AutoAcceptSharedAttachmentsValue] = js.undefined
  
  /**
    * Enable or disable automatic association with the default association route table.
    */
  var DefaultRouteTableAssociation: js.UndefOr[DefaultRouteTableAssociationValue] = js.undefined
  
  /**
    * Enable or disable automatic propagation of routes to the default propagation route table.
    */
  var DefaultRouteTablePropagation: js.UndefOr[DefaultRouteTablePropagationValue] = js.undefined
  
  /**
    * Enable or disable DNS support.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.undefined
  
  /**
    * The ID of the default propagation route table.
    */
  var PropagationDefaultRouteTableId: js.UndefOr[TransitGatewayRouteTableId] = js.undefined
  
  /**
    * Removes CIDR blocks for the transit gateway.
    */
  var RemoveTransitGatewayCidrBlocks: js.UndefOr[TransitGatewayCidrBlockStringList] = js.undefined
  
  /**
    * Enable or disable Equal Cost Multipath Protocol support.
    */
  var VpnEcmpSupport: js.UndefOr[VpnEcmpSupportValue] = js.undefined
}
object ModifyTransitGatewayOptions {
  
  inline def apply(): ModifyTransitGatewayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTransitGatewayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyTransitGatewayOptions] (val x: Self) extends AnyVal {
    
    inline def setAddTransitGatewayCidrBlocks(value: TransitGatewayCidrBlockStringList): Self = StObject.set(x, "AddTransitGatewayCidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setAddTransitGatewayCidrBlocksUndefined: Self = StObject.set(x, "AddTransitGatewayCidrBlocks", js.undefined)
    
    inline def setAddTransitGatewayCidrBlocksVarargs(value: String*): Self = StObject.set(x, "AddTransitGatewayCidrBlocks", js.Array(value*))
    
    inline def setAmazonSideAsn(value: Long): Self = StObject.set(x, "AmazonSideAsn", value.asInstanceOf[js.Any])
    
    inline def setAmazonSideAsnUndefined: Self = StObject.set(x, "AmazonSideAsn", js.undefined)
    
    inline def setAssociationDefaultRouteTableId(value: TransitGatewayRouteTableId): Self = StObject.set(x, "AssociationDefaultRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setAssociationDefaultRouteTableIdUndefined: Self = StObject.set(x, "AssociationDefaultRouteTableId", js.undefined)
    
    inline def setAutoAcceptSharedAttachments(value: AutoAcceptSharedAttachmentsValue): Self = StObject.set(x, "AutoAcceptSharedAttachments", value.asInstanceOf[js.Any])
    
    inline def setAutoAcceptSharedAttachmentsUndefined: Self = StObject.set(x, "AutoAcceptSharedAttachments", js.undefined)
    
    inline def setDefaultRouteTableAssociation(value: DefaultRouteTableAssociationValue): Self = StObject.set(x, "DefaultRouteTableAssociation", value.asInstanceOf[js.Any])
    
    inline def setDefaultRouteTableAssociationUndefined: Self = StObject.set(x, "DefaultRouteTableAssociation", js.undefined)
    
    inline def setDefaultRouteTablePropagation(value: DefaultRouteTablePropagationValue): Self = StObject.set(x, "DefaultRouteTablePropagation", value.asInstanceOf[js.Any])
    
    inline def setDefaultRouteTablePropagationUndefined: Self = StObject.set(x, "DefaultRouteTablePropagation", js.undefined)
    
    inline def setDnsSupport(value: DnsSupportValue): Self = StObject.set(x, "DnsSupport", value.asInstanceOf[js.Any])
    
    inline def setDnsSupportUndefined: Self = StObject.set(x, "DnsSupport", js.undefined)
    
    inline def setPropagationDefaultRouteTableId(value: TransitGatewayRouteTableId): Self = StObject.set(x, "PropagationDefaultRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setPropagationDefaultRouteTableIdUndefined: Self = StObject.set(x, "PropagationDefaultRouteTableId", js.undefined)
    
    inline def setRemoveTransitGatewayCidrBlocks(value: TransitGatewayCidrBlockStringList): Self = StObject.set(x, "RemoveTransitGatewayCidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setRemoveTransitGatewayCidrBlocksUndefined: Self = StObject.set(x, "RemoveTransitGatewayCidrBlocks", js.undefined)
    
    inline def setRemoveTransitGatewayCidrBlocksVarargs(value: String*): Self = StObject.set(x, "RemoveTransitGatewayCidrBlocks", js.Array(value*))
    
    inline def setVpnEcmpSupport(value: VpnEcmpSupportValue): Self = StObject.set(x, "VpnEcmpSupport", value.asInstanceOf[js.Any])
    
    inline def setVpnEcmpSupportUndefined: Self = StObject.set(x, "VpnEcmpSupport", js.undefined)
  }
}
