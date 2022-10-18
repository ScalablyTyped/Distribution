package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDirectConnectGatewayAssociationResult extends StObject {
  
  /**
    * The association to be created.
    */
  var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.undefined
}
object CreateDirectConnectGatewayAssociationResult {
  
  inline def apply(): CreateDirectConnectGatewayAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationResult]
  }
  
  extension [Self <: CreateDirectConnectGatewayAssociationResult](x: Self) {
    
    inline def setDirectConnectGatewayAssociation(value: DirectConnectGatewayAssociation): Self = StObject.set(x, "directConnectGatewayAssociation", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayAssociationUndefined: Self = StObject.set(x, "directConnectGatewayAssociation", js.undefined)
  }
}
