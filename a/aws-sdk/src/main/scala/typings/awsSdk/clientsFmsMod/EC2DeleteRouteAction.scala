package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2DeleteRouteAction extends StObject {
  
  /**
    * A description of the DeleteRoute action.
    */
  var Description: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * Information about the IPv4 CIDR range for the route. The value you specify must match the CIDR for the route exactly.
    */
  var DestinationCidrBlock: js.UndefOr[CIDR] = js.undefined
  
  /**
    * Information about the IPv6 CIDR range for the route. The value you specify must match the CIDR for the route exactly.
    */
  var DestinationIpv6CidrBlock: js.UndefOr[CIDR] = js.undefined
  
  /**
    * Information about the ID of the prefix list for the route.
    */
  var DestinationPrefixListId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * Information about the ID of the route table.
    */
  var RouteTableId: ActionTarget
}
object EC2DeleteRouteAction {
  
  inline def apply(RouteTableId: ActionTarget): EC2DeleteRouteAction = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2DeleteRouteAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EC2DeleteRouteAction] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: LengthBoundedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDestinationCidrBlock(value: CIDR): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    inline def setDestinationIpv6CidrBlock(value: CIDR): Self = StObject.set(x, "DestinationIpv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationIpv6CidrBlockUndefined: Self = StObject.set(x, "DestinationIpv6CidrBlock", js.undefined)
    
    inline def setDestinationPrefixListId(value: ResourceId): Self = StObject.set(x, "DestinationPrefixListId", value.asInstanceOf[js.Any])
    
    inline def setDestinationPrefixListIdUndefined: Self = StObject.set(x, "DestinationPrefixListId", js.undefined)
    
    inline def setRouteTableId(value: ActionTarget): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
  }
}
