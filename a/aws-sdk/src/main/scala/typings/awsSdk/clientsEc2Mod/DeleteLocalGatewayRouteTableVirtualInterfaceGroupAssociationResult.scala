package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationResult extends StObject {
  
  var LocalGatewayRouteTableVirtualInterfaceGroupAssociation: js.UndefOr[
    typings.awsSdk.clientsEc2Mod.LocalGatewayRouteTableVirtualInterfaceGroupAssociation
  ] = js.undefined
}
object DeleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationResult {
  
  inline def apply(): DeleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationResult] (val x: Self) extends AnyVal {
    
    inline def setLocalGatewayRouteTableVirtualInterfaceGroupAssociation(value: LocalGatewayRouteTableVirtualInterfaceGroupAssociation): Self = StObject.set(x, "LocalGatewayRouteTableVirtualInterfaceGroupAssociation", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableVirtualInterfaceGroupAssociationUndefined: Self = StObject.set(x, "LocalGatewayRouteTableVirtualInterfaceGroupAssociation", js.undefined)
  }
}
