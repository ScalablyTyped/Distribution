package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteHasOutOfScopeEndpointViolation extends StObject {
  
  /**
    * The route table associated with the current firewall subnet.
    */
  var CurrentFirewallSubnetRouteTable: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The current route table associated with the Internet Gateway.
    */
  var CurrentInternetGatewayRouteTable: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The ID of the firewall subnet.
    */
  var FirewallSubnetId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The list of firewall subnet routes.
    */
  var FirewallSubnetRoutes: js.UndefOr[Routes] = js.undefined
  
  /**
    * The ID of the Internet Gateway.
    */
  var InternetGatewayId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The routes in the route table associated with the Internet Gateway.
    */
  var InternetGatewayRoutes: js.UndefOr[Routes] = js.undefined
  
  /**
    * The ID of the route table.
    */
  var RouteTableId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The subnet's Availability Zone.
    */
  var SubnetAvailabilityZone: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The ID of the subnet's Availability Zone.
    */
  var SubnetAvailabilityZoneId: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The ID of the subnet associated with the route that violates the policy scope.
    */
  var SubnetId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The list of routes that violate the route table.
    */
  var ViolatingRoutes: js.UndefOr[Routes] = js.undefined
  
  /**
    * The VPC ID of the route that violates the policy scope.
    */
  var VpcId: js.UndefOr[ResourceId] = js.undefined
}
object RouteHasOutOfScopeEndpointViolation {
  
  inline def apply(): RouteHasOutOfScopeEndpointViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteHasOutOfScopeEndpointViolation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteHasOutOfScopeEndpointViolation] (val x: Self) extends AnyVal {
    
    inline def setCurrentFirewallSubnetRouteTable(value: ResourceId): Self = StObject.set(x, "CurrentFirewallSubnetRouteTable", value.asInstanceOf[js.Any])
    
    inline def setCurrentFirewallSubnetRouteTableUndefined: Self = StObject.set(x, "CurrentFirewallSubnetRouteTable", js.undefined)
    
    inline def setCurrentInternetGatewayRouteTable(value: ResourceId): Self = StObject.set(x, "CurrentInternetGatewayRouteTable", value.asInstanceOf[js.Any])
    
    inline def setCurrentInternetGatewayRouteTableUndefined: Self = StObject.set(x, "CurrentInternetGatewayRouteTable", js.undefined)
    
    inline def setFirewallSubnetId(value: ResourceId): Self = StObject.set(x, "FirewallSubnetId", value.asInstanceOf[js.Any])
    
    inline def setFirewallSubnetIdUndefined: Self = StObject.set(x, "FirewallSubnetId", js.undefined)
    
    inline def setFirewallSubnetRoutes(value: Routes): Self = StObject.set(x, "FirewallSubnetRoutes", value.asInstanceOf[js.Any])
    
    inline def setFirewallSubnetRoutesUndefined: Self = StObject.set(x, "FirewallSubnetRoutes", js.undefined)
    
    inline def setFirewallSubnetRoutesVarargs(value: Route*): Self = StObject.set(x, "FirewallSubnetRoutes", js.Array(value*))
    
    inline def setInternetGatewayId(value: ResourceId): Self = StObject.set(x, "InternetGatewayId", value.asInstanceOf[js.Any])
    
    inline def setInternetGatewayIdUndefined: Self = StObject.set(x, "InternetGatewayId", js.undefined)
    
    inline def setInternetGatewayRoutes(value: Routes): Self = StObject.set(x, "InternetGatewayRoutes", value.asInstanceOf[js.Any])
    
    inline def setInternetGatewayRoutesUndefined: Self = StObject.set(x, "InternetGatewayRoutes", js.undefined)
    
    inline def setInternetGatewayRoutesVarargs(value: Route*): Self = StObject.set(x, "InternetGatewayRoutes", js.Array(value*))
    
    inline def setRouteTableId(value: ResourceId): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    inline def setRouteTableIdUndefined: Self = StObject.set(x, "RouteTableId", js.undefined)
    
    inline def setSubnetAvailabilityZone(value: LengthBoundedString): Self = StObject.set(x, "SubnetAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setSubnetAvailabilityZoneId(value: LengthBoundedString): Self = StObject.set(x, "SubnetAvailabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setSubnetAvailabilityZoneIdUndefined: Self = StObject.set(x, "SubnetAvailabilityZoneId", js.undefined)
    
    inline def setSubnetAvailabilityZoneUndefined: Self = StObject.set(x, "SubnetAvailabilityZone", js.undefined)
    
    inline def setSubnetId(value: ResourceId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setViolatingRoutes(value: Routes): Self = StObject.set(x, "ViolatingRoutes", value.asInstanceOf[js.Any])
    
    inline def setViolatingRoutesUndefined: Self = StObject.set(x, "ViolatingRoutes", js.undefined)
    
    inline def setViolatingRoutesVarargs(value: Route*): Self = StObject.set(x, "ViolatingRoutes", js.Array(value*))
    
    inline def setVpcId(value: ResourceId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
