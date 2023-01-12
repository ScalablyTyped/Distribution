package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2TransitGatewayDetails extends StObject {
  
  /**
    * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. 
    */
  var AmazonSideAsn: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the default association route table. 
    */
  var AssociationDefaultRouteTableId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Turn on or turn off automatic acceptance of attachment requests. 
    */
  var AutoAcceptSharedAttachments: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Turn on or turn off automatic association with the default association route table. 
    */
  var DefaultRouteTableAssociation: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Turn on or turn off automatic propagation of routes to the default propagation route table. 
    */
  var DefaultRouteTablePropagation: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The description of the transit gateway. 
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Turn on or turn off DNS support. 
    */
  var DnsSupport: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the transit gateway. 
    */
  var Id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether multicast is supported on the transit gateway. 
    */
  var MulticastSupport: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the default propagation route table. 
    */
  var PropagationDefaultRouteTableId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The transit gateway Classless Inter-Domain Routing (CIDR) blocks. 
    */
  var TransitGatewayCidrBlocks: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * Turn on or turn off Equal Cost Multipath Protocol (ECMP) support. 
    */
  var VpnEcmpSupport: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2TransitGatewayDetails {
  
  inline def apply(): AwsEc2TransitGatewayDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2TransitGatewayDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2TransitGatewayDetails] (val x: Self) extends AnyVal {
    
    inline def setAmazonSideAsn(value: Integer): Self = StObject.set(x, "AmazonSideAsn", value.asInstanceOf[js.Any])
    
    inline def setAmazonSideAsnUndefined: Self = StObject.set(x, "AmazonSideAsn", js.undefined)
    
    inline def setAssociationDefaultRouteTableId(value: NonEmptyString): Self = StObject.set(x, "AssociationDefaultRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setAssociationDefaultRouteTableIdUndefined: Self = StObject.set(x, "AssociationDefaultRouteTableId", js.undefined)
    
    inline def setAutoAcceptSharedAttachments(value: NonEmptyString): Self = StObject.set(x, "AutoAcceptSharedAttachments", value.asInstanceOf[js.Any])
    
    inline def setAutoAcceptSharedAttachmentsUndefined: Self = StObject.set(x, "AutoAcceptSharedAttachments", js.undefined)
    
    inline def setDefaultRouteTableAssociation(value: NonEmptyString): Self = StObject.set(x, "DefaultRouteTableAssociation", value.asInstanceOf[js.Any])
    
    inline def setDefaultRouteTableAssociationUndefined: Self = StObject.set(x, "DefaultRouteTableAssociation", js.undefined)
    
    inline def setDefaultRouteTablePropagation(value: NonEmptyString): Self = StObject.set(x, "DefaultRouteTablePropagation", value.asInstanceOf[js.Any])
    
    inline def setDefaultRouteTablePropagationUndefined: Self = StObject.set(x, "DefaultRouteTablePropagation", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDnsSupport(value: NonEmptyString): Self = StObject.set(x, "DnsSupport", value.asInstanceOf[js.Any])
    
    inline def setDnsSupportUndefined: Self = StObject.set(x, "DnsSupport", js.undefined)
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMulticastSupport(value: NonEmptyString): Self = StObject.set(x, "MulticastSupport", value.asInstanceOf[js.Any])
    
    inline def setMulticastSupportUndefined: Self = StObject.set(x, "MulticastSupport", js.undefined)
    
    inline def setPropagationDefaultRouteTableId(value: NonEmptyString): Self = StObject.set(x, "PropagationDefaultRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setPropagationDefaultRouteTableIdUndefined: Self = StObject.set(x, "PropagationDefaultRouteTableId", js.undefined)
    
    inline def setTransitGatewayCidrBlocks(value: NonEmptyStringList): Self = StObject.set(x, "TransitGatewayCidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayCidrBlocksUndefined: Self = StObject.set(x, "TransitGatewayCidrBlocks", js.undefined)
    
    inline def setTransitGatewayCidrBlocksVarargs(value: NonEmptyString*): Self = StObject.set(x, "TransitGatewayCidrBlocks", js.Array(value*))
    
    inline def setVpnEcmpSupport(value: NonEmptyString): Self = StObject.set(x, "VpnEcmpSupport", value.asInstanceOf[js.Any])
    
    inline def setVpnEcmpSupportUndefined: Self = StObject.set(x, "VpnEcmpSupport", js.undefined)
  }
}
