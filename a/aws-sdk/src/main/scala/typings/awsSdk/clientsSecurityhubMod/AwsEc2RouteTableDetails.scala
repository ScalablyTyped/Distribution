package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2RouteTableDetails extends StObject {
  
  /**
    *  The associations between a route table and one or more subnets or a gateway. 
    */
  var AssociationSet: js.UndefOr[AssociationSetList] = js.undefined
  
  /**
    *  The ID of the Amazon Web Services account that owns the route table. 
    */
  var OwnerId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Describes a virtual private gateway propagating route. 
    */
  var PropagatingVgwSet: js.UndefOr[PropagatingVgwSetList] = js.undefined
  
  /**
    *  The routes in the route table. 
    */
  var RouteSet: js.UndefOr[RouteSetList] = js.undefined
  
  /**
    *  The ID of the route table. 
    */
  var RouteTableId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ID of the virtual private cloud (VPC). 
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2RouteTableDetails {
  
  inline def apply(): AwsEc2RouteTableDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2RouteTableDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2RouteTableDetails] (val x: Self) extends AnyVal {
    
    inline def setAssociationSet(value: AssociationSetList): Self = StObject.set(x, "AssociationSet", value.asInstanceOf[js.Any])
    
    inline def setAssociationSetUndefined: Self = StObject.set(x, "AssociationSet", js.undefined)
    
    inline def setAssociationSetVarargs(value: AssociationSetDetails*): Self = StObject.set(x, "AssociationSet", js.Array(value*))
    
    inline def setOwnerId(value: NonEmptyString): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPropagatingVgwSet(value: PropagatingVgwSetList): Self = StObject.set(x, "PropagatingVgwSet", value.asInstanceOf[js.Any])
    
    inline def setPropagatingVgwSetUndefined: Self = StObject.set(x, "PropagatingVgwSet", js.undefined)
    
    inline def setPropagatingVgwSetVarargs(value: PropagatingVgwSetDetails*): Self = StObject.set(x, "PropagatingVgwSet", js.Array(value*))
    
    inline def setRouteSet(value: RouteSetList): Self = StObject.set(x, "RouteSet", value.asInstanceOf[js.Any])
    
    inline def setRouteSetUndefined: Self = StObject.set(x, "RouteSet", js.undefined)
    
    inline def setRouteSetVarargs(value: RouteSetDetails*): Self = StObject.set(x, "RouteSet", js.Array(value*))
    
    inline def setRouteTableId(value: NonEmptyString): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    inline def setRouteTableIdUndefined: Self = StObject.set(x, "RouteTableId", js.undefined)
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
