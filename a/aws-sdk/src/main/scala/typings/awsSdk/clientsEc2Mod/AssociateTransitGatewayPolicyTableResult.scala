package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTransitGatewayPolicyTableResult extends StObject {
  
  /**
    * Describes the association of a transit gateway and a transit gateway policy table.
    */
  var Association: js.UndefOr[TransitGatewayPolicyTableAssociation] = js.undefined
}
object AssociateTransitGatewayPolicyTableResult {
  
  inline def apply(): AssociateTransitGatewayPolicyTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTransitGatewayPolicyTableResult]
  }
  
  extension [Self <: AssociateTransitGatewayPolicyTableResult](x: Self) {
    
    inline def setAssociation(value: TransitGatewayPolicyTableAssociation): Self = StObject.set(x, "Association", value.asInstanceOf[js.Any])
    
    inline def setAssociationUndefined: Self = StObject.set(x, "Association", js.undefined)
  }
}
