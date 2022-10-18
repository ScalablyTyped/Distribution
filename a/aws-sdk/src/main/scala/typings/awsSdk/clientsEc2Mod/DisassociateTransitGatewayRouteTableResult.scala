package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTransitGatewayRouteTableResult extends StObject {
  
  /**
    * Information about the association.
    */
  var Association: js.UndefOr[TransitGatewayAssociation] = js.undefined
}
object DisassociateTransitGatewayRouteTableResult {
  
  inline def apply(): DisassociateTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateTransitGatewayRouteTableResult]
  }
  
  extension [Self <: DisassociateTransitGatewayRouteTableResult](x: Self) {
    
    inline def setAssociation(value: TransitGatewayAssociation): Self = StObject.set(x, "Association", value.asInstanceOf[js.Any])
    
    inline def setAssociationUndefined: Self = StObject.set(x, "Association", js.undefined)
  }
}
