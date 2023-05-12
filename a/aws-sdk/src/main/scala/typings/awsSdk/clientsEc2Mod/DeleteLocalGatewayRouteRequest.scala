package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLocalGatewayRouteRequest extends StObject {
  
  /**
    * The CIDR range for the route. This must match the CIDR for the route exactly.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    *  Use a prefix list in place of DestinationCidrBlock. You cannot use DestinationPrefixListId and DestinationCidrBlock in the same request. 
    */
  var DestinationPrefixListId: js.UndefOr[PrefixListResourceId] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: LocalGatewayRoutetableId
}
object DeleteLocalGatewayRouteRequest {
  
  inline def apply(LocalGatewayRouteTableId: LocalGatewayRoutetableId): DeleteLocalGatewayRouteRequest = {
    val __obj = js.Dynamic.literal(LocalGatewayRouteTableId = LocalGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLocalGatewayRouteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLocalGatewayRouteRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    inline def setDestinationPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "DestinationPrefixListId", value.asInstanceOf[js.Any])
    
    inline def setDestinationPrefixListIdUndefined: Self = StObject.set(x, "DestinationPrefixListId", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setLocalGatewayRouteTableId(value: LocalGatewayRoutetableId): Self = StObject.set(x, "LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
  }
}
