package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationSetDetails extends StObject {
  
  /**
    *  The state of the association between a route table and a subnet or gateway. 
    */
  var AssociationState: js.UndefOr[AssociationStateDetails] = js.undefined
  
  /**
    *  The ID of the internet gateway or virtual private gateway. 
    */
  var GatewayId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Indicates whether this is the main route table. 
    */
  var Main: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The ID of the association. 
    */
  var RouteTableAssociationId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ID of the route table. 
    */
  var RouteTableId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ID of the subnet. A subnet ID is not returned for an implicit association. 
    */
  var SubnetId: js.UndefOr[NonEmptyString] = js.undefined
}
object AssociationSetDetails {
  
  inline def apply(): AssociationSetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationSetDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociationSetDetails] (val x: Self) extends AnyVal {
    
    inline def setAssociationState(value: AssociationStateDetails): Self = StObject.set(x, "AssociationState", value.asInstanceOf[js.Any])
    
    inline def setAssociationStateUndefined: Self = StObject.set(x, "AssociationState", js.undefined)
    
    inline def setGatewayId(value: NonEmptyString): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    inline def setMain(value: Boolean): Self = StObject.set(x, "Main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "Main", js.undefined)
    
    inline def setRouteTableAssociationId(value: NonEmptyString): Self = StObject.set(x, "RouteTableAssociationId", value.asInstanceOf[js.Any])
    
    inline def setRouteTableAssociationIdUndefined: Self = StObject.set(x, "RouteTableAssociationId", js.undefined)
    
    inline def setRouteTableId(value: NonEmptyString): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    inline def setRouteTableIdUndefined: Self = StObject.set(x, "RouteTableId", js.undefined)
    
    inline def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
