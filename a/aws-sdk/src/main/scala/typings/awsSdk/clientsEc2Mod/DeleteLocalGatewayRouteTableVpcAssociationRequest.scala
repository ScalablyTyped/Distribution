package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLocalGatewayRouteTableVpcAssociationRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the association.
    */
  var LocalGatewayRouteTableVpcAssociationId: typings.awsSdk.clientsEc2Mod.LocalGatewayRouteTableVpcAssociationId
}
object DeleteLocalGatewayRouteTableVpcAssociationRequest {
  
  inline def apply(LocalGatewayRouteTableVpcAssociationId: LocalGatewayRouteTableVpcAssociationId): DeleteLocalGatewayRouteTableVpcAssociationRequest = {
    val __obj = js.Dynamic.literal(LocalGatewayRouteTableVpcAssociationId = LocalGatewayRouteTableVpcAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLocalGatewayRouteTableVpcAssociationRequest]
  }
  
  extension [Self <: DeleteLocalGatewayRouteTableVpcAssociationRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setLocalGatewayRouteTableVpcAssociationId(value: LocalGatewayRouteTableVpcAssociationId): Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociationId", value.asInstanceOf[js.Any])
  }
}
