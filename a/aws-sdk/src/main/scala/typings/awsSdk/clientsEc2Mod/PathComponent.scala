package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathComponent extends StObject {
  
  /**
    * The network ACL rule.
    */
  var AclRule: js.UndefOr[AnalysisAclRule] = js.undefined
  
  /**
    * The additional details.
    */
  var AdditionalDetails: js.UndefOr[AdditionalDetailList] = js.undefined
  
  /**
    * The resource to which the path component is attached.
    */
  var AttachedTo: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The component.
    */
  var Component: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The destination VPC.
    */
  var DestinationVpc: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The load balancer listener.
    */
  var ElasticLoadBalancerListener: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The explanation codes.
    */
  var Explanations: js.UndefOr[ExplanationList] = js.undefined
  
  /**
    * The inbound header.
    */
  var InboundHeader: js.UndefOr[AnalysisPacketHeader] = js.undefined
  
  /**
    * The outbound header.
    */
  var OutboundHeader: js.UndefOr[AnalysisPacketHeader] = js.undefined
  
  /**
    * The route table route.
    */
  var RouteTableRoute: js.UndefOr[AnalysisRouteTableRoute] = js.undefined
  
  /**
    * The security group rule.
    */
  var SecurityGroupRule: js.UndefOr[AnalysisSecurityGroupRule] = js.undefined
  
  /**
    * The sequence number.
    */
  var SequenceNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * The source VPC.
    */
  var SourceVpc: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The subnet.
    */
  var Subnet: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The transit gateway.
    */
  var TransitGateway: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The route in a transit gateway route table.
    */
  var TransitGatewayRouteTableRoute: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayRouteTableRoute] = js.undefined
  
  /**
    * The component VPC.
    */
  var Vpc: js.UndefOr[AnalysisComponent] = js.undefined
}
object PathComponent {
  
  inline def apply(): PathComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathComponent] (val x: Self) extends AnyVal {
    
    inline def setAclRule(value: AnalysisAclRule): Self = StObject.set(x, "AclRule", value.asInstanceOf[js.Any])
    
    inline def setAclRuleUndefined: Self = StObject.set(x, "AclRule", js.undefined)
    
    inline def setAdditionalDetails(value: AdditionalDetailList): Self = StObject.set(x, "AdditionalDetails", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDetailsUndefined: Self = StObject.set(x, "AdditionalDetails", js.undefined)
    
    inline def setAdditionalDetailsVarargs(value: AdditionalDetail*): Self = StObject.set(x, "AdditionalDetails", js.Array(value*))
    
    inline def setAttachedTo(value: AnalysisComponent): Self = StObject.set(x, "AttachedTo", value.asInstanceOf[js.Any])
    
    inline def setAttachedToUndefined: Self = StObject.set(x, "AttachedTo", js.undefined)
    
    inline def setComponent(value: AnalysisComponent): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    inline def setDestinationVpc(value: AnalysisComponent): Self = StObject.set(x, "DestinationVpc", value.asInstanceOf[js.Any])
    
    inline def setDestinationVpcUndefined: Self = StObject.set(x, "DestinationVpc", js.undefined)
    
    inline def setElasticLoadBalancerListener(value: AnalysisComponent): Self = StObject.set(x, "ElasticLoadBalancerListener", value.asInstanceOf[js.Any])
    
    inline def setElasticLoadBalancerListenerUndefined: Self = StObject.set(x, "ElasticLoadBalancerListener", js.undefined)
    
    inline def setExplanations(value: ExplanationList): Self = StObject.set(x, "Explanations", value.asInstanceOf[js.Any])
    
    inline def setExplanationsUndefined: Self = StObject.set(x, "Explanations", js.undefined)
    
    inline def setExplanationsVarargs(value: Explanation*): Self = StObject.set(x, "Explanations", js.Array(value*))
    
    inline def setInboundHeader(value: AnalysisPacketHeader): Self = StObject.set(x, "InboundHeader", value.asInstanceOf[js.Any])
    
    inline def setInboundHeaderUndefined: Self = StObject.set(x, "InboundHeader", js.undefined)
    
    inline def setOutboundHeader(value: AnalysisPacketHeader): Self = StObject.set(x, "OutboundHeader", value.asInstanceOf[js.Any])
    
    inline def setOutboundHeaderUndefined: Self = StObject.set(x, "OutboundHeader", js.undefined)
    
    inline def setRouteTableRoute(value: AnalysisRouteTableRoute): Self = StObject.set(x, "RouteTableRoute", value.asInstanceOf[js.Any])
    
    inline def setRouteTableRouteUndefined: Self = StObject.set(x, "RouteTableRoute", js.undefined)
    
    inline def setSecurityGroupRule(value: AnalysisSecurityGroupRule): Self = StObject.set(x, "SecurityGroupRule", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRuleUndefined: Self = StObject.set(x, "SecurityGroupRule", js.undefined)
    
    inline def setSequenceNumber(value: Integer): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
    
    inline def setSourceVpc(value: AnalysisComponent): Self = StObject.set(x, "SourceVpc", value.asInstanceOf[js.Any])
    
    inline def setSourceVpcUndefined: Self = StObject.set(x, "SourceVpc", js.undefined)
    
    inline def setSubnet(value: AnalysisComponent): Self = StObject.set(x, "Subnet", value.asInstanceOf[js.Any])
    
    inline def setSubnetUndefined: Self = StObject.set(x, "Subnet", js.undefined)
    
    inline def setTransitGateway(value: AnalysisComponent): Self = StObject.set(x, "TransitGateway", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableRoute(value: TransitGatewayRouteTableRoute): Self = StObject.set(x, "TransitGatewayRouteTableRoute", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableRouteUndefined: Self = StObject.set(x, "TransitGatewayRouteTableRoute", js.undefined)
    
    inline def setTransitGatewayUndefined: Self = StObject.set(x, "TransitGateway", js.undefined)
    
    inline def setVpc(value: AnalysisComponent): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
