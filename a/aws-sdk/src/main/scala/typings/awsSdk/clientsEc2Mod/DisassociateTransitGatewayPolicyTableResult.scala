package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTransitGatewayPolicyTableResult extends StObject {
  
  /**
    * Returns details about the transit gateway policy table disassociation.
    */
  var Association: js.UndefOr[TransitGatewayPolicyTableAssociation] = js.undefined
}
object DisassociateTransitGatewayPolicyTableResult {
  
  inline def apply(): DisassociateTransitGatewayPolicyTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateTransitGatewayPolicyTableResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateTransitGatewayPolicyTableResult] (val x: Self) extends AnyVal {
    
    inline def setAssociation(value: TransitGatewayPolicyTableAssociation): Self = StObject.set(x, "Association", value.asInstanceOf[js.Any])
    
    inline def setAssociationUndefined: Self = StObject.set(x, "Association", js.undefined)
  }
}
