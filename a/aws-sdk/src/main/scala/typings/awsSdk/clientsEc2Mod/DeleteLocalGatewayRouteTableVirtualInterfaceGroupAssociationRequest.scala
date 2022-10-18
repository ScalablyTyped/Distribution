package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The ID of the local gateway route table virtual interface group association. 
    */
  var LocalGatewayRouteTableVirtualInterfaceGroupAssociationId: typings.awsSdk.clientsEc2Mod.LocalGatewayRouteTableVirtualInterfaceGroupAssociationId
}
object DeleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest {
  
  inline def apply(
    LocalGatewayRouteTableVirtualInterfaceGroupAssociationId: LocalGatewayRouteTableVirtualInterfaceGroupAssociationId
  ): DeleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest = {
    val __obj = js.Dynamic.literal(LocalGatewayRouteTableVirtualInterfaceGroupAssociationId = LocalGatewayRouteTableVirtualInterfaceGroupAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest]
  }
  
  extension [Self <: DeleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setLocalGatewayRouteTableVirtualInterfaceGroupAssociationId(value: LocalGatewayRouteTableVirtualInterfaceGroupAssociationId): Self = StObject.set(x, "LocalGatewayRouteTableVirtualInterfaceGroupAssociationId", value.asInstanceOf[js.Any])
  }
}
