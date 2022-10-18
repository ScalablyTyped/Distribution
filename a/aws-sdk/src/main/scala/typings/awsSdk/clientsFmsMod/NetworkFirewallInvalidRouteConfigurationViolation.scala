package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFirewallInvalidRouteConfigurationViolation extends StObject {
  
  /**
    * The actual firewall endpoint.
    */
  var ActualFirewallEndpoint: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The actual subnet ID for the firewall.
    */
  var ActualFirewallSubnetId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The actual firewall subnet routes that are expected.
    */
  var ActualFirewallSubnetRoutes: js.UndefOr[Routes] = js.undefined
  
  /**
    * The actual internet gateway routes.
    */
  var ActualInternetGatewayRoutes: js.UndefOr[Routes] = js.undefined
  
  /**
    * The subnets that are affected.
    */
  var AffectedSubnets: js.UndefOr[ResourceIdList] = js.undefined
  
  /**
    * The subnet route table for the current firewall.
    */
  var CurrentFirewallSubnetRouteTable: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The route table for the current internet gateway.
    */
  var CurrentInternetGatewayRouteTable: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The firewall endpoint that's expected.
    */
  var ExpectedFirewallEndpoint: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The expected subnet ID for the firewall.
    */
  var ExpectedFirewallSubnetId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The firewall subnet routes that are expected.
    */
  var ExpectedFirewallSubnetRoutes: js.UndefOr[ExpectedRoutes] = js.undefined
  
  /**
    * The expected routes for the internet gateway.
    */
  var ExpectedInternetGatewayRoutes: js.UndefOr[ExpectedRoutes] = js.undefined
  
  /**
    * The internet gateway ID.
    */
  var InternetGatewayId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * Information about whether the route table is used in another Availability Zone.
    */
  var IsRouteTableUsedInDifferentAZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The route table ID.
    */
  var RouteTableId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The route that's in violation.
    */
  var ViolatingRoute: js.UndefOr[Route] = js.undefined
  
  /**
    * Information about the VPC ID.
    */
  var VpcId: js.UndefOr[ResourceId] = js.undefined
}
object NetworkFirewallInvalidRouteConfigurationViolation {
  
  inline def apply(): NetworkFirewallInvalidRouteConfigurationViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallInvalidRouteConfigurationViolation]
  }
  
  extension [Self <: NetworkFirewallInvalidRouteConfigurationViolation](x: Self) {
    
    inline def setActualFirewallEndpoint(value: ResourceId): Self = StObject.set(x, "ActualFirewallEndpoint", value.asInstanceOf[js.Any])
    
    inline def setActualFirewallEndpointUndefined: Self = StObject.set(x, "ActualFirewallEndpoint", js.undefined)
    
    inline def setActualFirewallSubnetId(value: ResourceId): Self = StObject.set(x, "ActualFirewallSubnetId", value.asInstanceOf[js.Any])
    
    inline def setActualFirewallSubnetIdUndefined: Self = StObject.set(x, "ActualFirewallSubnetId", js.undefined)
    
    inline def setActualFirewallSubnetRoutes(value: Routes): Self = StObject.set(x, "ActualFirewallSubnetRoutes", value.asInstanceOf[js.Any])
    
    inline def setActualFirewallSubnetRoutesUndefined: Self = StObject.set(x, "ActualFirewallSubnetRoutes", js.undefined)
    
    inline def setActualFirewallSubnetRoutesVarargs(value: Route*): Self = StObject.set(x, "ActualFirewallSubnetRoutes", js.Array(value*))
    
    inline def setActualInternetGatewayRoutes(value: Routes): Self = StObject.set(x, "ActualInternetGatewayRoutes", value.asInstanceOf[js.Any])
    
    inline def setActualInternetGatewayRoutesUndefined: Self = StObject.set(x, "ActualInternetGatewayRoutes", js.undefined)
    
    inline def setActualInternetGatewayRoutesVarargs(value: Route*): Self = StObject.set(x, "ActualInternetGatewayRoutes", js.Array(value*))
    
    inline def setAffectedSubnets(value: ResourceIdList): Self = StObject.set(x, "AffectedSubnets", value.asInstanceOf[js.Any])
    
    inline def setAffectedSubnetsUndefined: Self = StObject.set(x, "AffectedSubnets", js.undefined)
    
    inline def setAffectedSubnetsVarargs(value: ResourceId*): Self = StObject.set(x, "AffectedSubnets", js.Array(value*))
    
    inline def setCurrentFirewallSubnetRouteTable(value: ResourceId): Self = StObject.set(x, "CurrentFirewallSubnetRouteTable", value.asInstanceOf[js.Any])
    
    inline def setCurrentFirewallSubnetRouteTableUndefined: Self = StObject.set(x, "CurrentFirewallSubnetRouteTable", js.undefined)
    
    inline def setCurrentInternetGatewayRouteTable(value: ResourceId): Self = StObject.set(x, "CurrentInternetGatewayRouteTable", value.asInstanceOf[js.Any])
    
    inline def setCurrentInternetGatewayRouteTableUndefined: Self = StObject.set(x, "CurrentInternetGatewayRouteTable", js.undefined)
    
    inline def setExpectedFirewallEndpoint(value: ResourceId): Self = StObject.set(x, "ExpectedFirewallEndpoint", value.asInstanceOf[js.Any])
    
    inline def setExpectedFirewallEndpointUndefined: Self = StObject.set(x, "ExpectedFirewallEndpoint", js.undefined)
    
    inline def setExpectedFirewallSubnetId(value: ResourceId): Self = StObject.set(x, "ExpectedFirewallSubnetId", value.asInstanceOf[js.Any])
    
    inline def setExpectedFirewallSubnetIdUndefined: Self = StObject.set(x, "ExpectedFirewallSubnetId", js.undefined)
    
    inline def setExpectedFirewallSubnetRoutes(value: ExpectedRoutes): Self = StObject.set(x, "ExpectedFirewallSubnetRoutes", value.asInstanceOf[js.Any])
    
    inline def setExpectedFirewallSubnetRoutesUndefined: Self = StObject.set(x, "ExpectedFirewallSubnetRoutes", js.undefined)
    
    inline def setExpectedFirewallSubnetRoutesVarargs(value: ExpectedRoute*): Self = StObject.set(x, "ExpectedFirewallSubnetRoutes", js.Array(value*))
    
    inline def setExpectedInternetGatewayRoutes(value: ExpectedRoutes): Self = StObject.set(x, "ExpectedInternetGatewayRoutes", value.asInstanceOf[js.Any])
    
    inline def setExpectedInternetGatewayRoutesUndefined: Self = StObject.set(x, "ExpectedInternetGatewayRoutes", js.undefined)
    
    inline def setExpectedInternetGatewayRoutesVarargs(value: ExpectedRoute*): Self = StObject.set(x, "ExpectedInternetGatewayRoutes", js.Array(value*))
    
    inline def setInternetGatewayId(value: ResourceId): Self = StObject.set(x, "InternetGatewayId", value.asInstanceOf[js.Any])
    
    inline def setInternetGatewayIdUndefined: Self = StObject.set(x, "InternetGatewayId", js.undefined)
    
    inline def setIsRouteTableUsedInDifferentAZ(value: Boolean): Self = StObject.set(x, "IsRouteTableUsedInDifferentAZ", value.asInstanceOf[js.Any])
    
    inline def setIsRouteTableUsedInDifferentAZUndefined: Self = StObject.set(x, "IsRouteTableUsedInDifferentAZ", js.undefined)
    
    inline def setRouteTableId(value: ResourceId): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    inline def setRouteTableIdUndefined: Self = StObject.set(x, "RouteTableId", js.undefined)
    
    inline def setViolatingRoute(value: Route): Self = StObject.set(x, "ViolatingRoute", value.asInstanceOf[js.Any])
    
    inline def setViolatingRouteUndefined: Self = StObject.set(x, "ViolatingRoute", js.undefined)
    
    inline def setVpcId(value: ResourceId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
