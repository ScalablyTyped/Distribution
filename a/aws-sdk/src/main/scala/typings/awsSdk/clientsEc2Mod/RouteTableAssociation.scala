package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteTableAssociation extends StObject {
  
  /**
    * The state of the association.
    */
  var AssociationState: js.UndefOr[RouteTableAssociationState] = js.undefined
  
  /**
    * The ID of the internet gateway or virtual private gateway.
    */
  var GatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether this is the main route table.
    */
  var Main: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the association.
    */
  var RouteTableAssociationId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the route table.
    */
  var RouteTableId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the subnet. A subnet ID is not returned for an implicit association.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
}
object RouteTableAssociation {
  
  inline def apply(): RouteTableAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteTableAssociation]
  }
  
  extension [Self <: RouteTableAssociation](x: Self) {
    
    inline def setAssociationState(value: RouteTableAssociationState): Self = StObject.set(x, "AssociationState", value.asInstanceOf[js.Any])
    
    inline def setAssociationStateUndefined: Self = StObject.set(x, "AssociationState", js.undefined)
    
    inline def setGatewayId(value: String): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    inline def setMain(value: Boolean): Self = StObject.set(x, "Main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "Main", js.undefined)
    
    inline def setRouteTableAssociationId(value: String): Self = StObject.set(x, "RouteTableAssociationId", value.asInstanceOf[js.Any])
    
    inline def setRouteTableAssociationIdUndefined: Self = StObject.set(x, "RouteTableAssociationId", js.undefined)
    
    inline def setRouteTableId(value: String): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    inline def setRouteTableIdUndefined: Self = StObject.set(x, "RouteTableId", js.undefined)
    
    inline def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
