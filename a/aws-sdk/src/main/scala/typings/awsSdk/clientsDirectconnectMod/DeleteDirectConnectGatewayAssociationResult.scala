package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDirectConnectGatewayAssociationResult extends StObject {
  
  /**
    * Information about the deleted association.
    */
  var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.undefined
}
object DeleteDirectConnectGatewayAssociationResult {
  
  inline def apply(): DeleteDirectConnectGatewayAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationResult]
  }
  
  extension [Self <: DeleteDirectConnectGatewayAssociationResult](x: Self) {
    
    inline def setDirectConnectGatewayAssociation(value: DirectConnectGatewayAssociation): Self = StObject.set(x, "directConnectGatewayAssociation", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayAssociationUndefined: Self = StObject.set(x, "directConnectGatewayAssociation", js.undefined)
  }
}
