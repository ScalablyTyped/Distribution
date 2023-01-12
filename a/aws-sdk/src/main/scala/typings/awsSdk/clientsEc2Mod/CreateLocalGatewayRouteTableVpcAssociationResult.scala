package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocalGatewayRouteTableVpcAssociationResult extends StObject {
  
  /**
    * Information about the association.
    */
  var LocalGatewayRouteTableVpcAssociation: js.UndefOr[typings.awsSdk.clientsEc2Mod.LocalGatewayRouteTableVpcAssociation] = js.undefined
}
object CreateLocalGatewayRouteTableVpcAssociationResult {
  
  inline def apply(): CreateLocalGatewayRouteTableVpcAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalGatewayRouteTableVpcAssociationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLocalGatewayRouteTableVpcAssociationResult] (val x: Self) extends AnyVal {
    
    inline def setLocalGatewayRouteTableVpcAssociation(value: LocalGatewayRouteTableVpcAssociation): Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociation", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableVpcAssociationUndefined: Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociation", js.undefined)
  }
}
