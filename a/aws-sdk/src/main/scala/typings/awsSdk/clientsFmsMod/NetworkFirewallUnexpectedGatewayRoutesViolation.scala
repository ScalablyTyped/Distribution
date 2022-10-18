package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFirewallUnexpectedGatewayRoutesViolation extends StObject {
  
  /**
    * Information about the gateway ID.
    */
  var GatewayId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * Information about the route table.
    */
  var RouteTableId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The routes that are in violation.
    */
  var ViolatingRoutes: js.UndefOr[Routes] = js.undefined
  
  /**
    * Information about the VPC ID.
    */
  var VpcId: js.UndefOr[ResourceId] = js.undefined
}
object NetworkFirewallUnexpectedGatewayRoutesViolation {
  
  inline def apply(): NetworkFirewallUnexpectedGatewayRoutesViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallUnexpectedGatewayRoutesViolation]
  }
  
  extension [Self <: NetworkFirewallUnexpectedGatewayRoutesViolation](x: Self) {
    
    inline def setGatewayId(value: ResourceId): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    inline def setRouteTableId(value: ResourceId): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    inline def setRouteTableIdUndefined: Self = StObject.set(x, "RouteTableId", js.undefined)
    
    inline def setViolatingRoutes(value: Routes): Self = StObject.set(x, "ViolatingRoutes", value.asInstanceOf[js.Any])
    
    inline def setViolatingRoutesUndefined: Self = StObject.set(x, "ViolatingRoutes", js.undefined)
    
    inline def setViolatingRoutesVarargs(value: Route*): Self = StObject.set(x, "ViolatingRoutes", js.Array(value*))
    
    inline def setVpcId(value: ResourceId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
