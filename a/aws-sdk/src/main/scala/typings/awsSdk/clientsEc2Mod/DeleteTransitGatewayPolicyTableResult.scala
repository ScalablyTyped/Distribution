package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayPolicyTableResult extends StObject {
  
  /**
    * Provides details about the deleted transit gateway policy table.
    */
  var TransitGatewayPolicyTable: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayPolicyTable] = js.undefined
}
object DeleteTransitGatewayPolicyTableResult {
  
  inline def apply(): DeleteTransitGatewayPolicyTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayPolicyTableResult]
  }
  
  extension [Self <: DeleteTransitGatewayPolicyTableResult](x: Self) {
    
    inline def setTransitGatewayPolicyTable(value: TransitGatewayPolicyTable): Self = StObject.set(x, "TransitGatewayPolicyTable", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPolicyTableUndefined: Self = StObject.set(x, "TransitGatewayPolicyTable", js.undefined)
  }
}
