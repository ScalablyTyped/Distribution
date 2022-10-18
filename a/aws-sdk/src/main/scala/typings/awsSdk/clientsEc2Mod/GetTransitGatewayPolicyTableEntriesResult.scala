package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayPolicyTableEntriesResult extends StObject {
  
  /**
    * The entries for the transit gateway policy table.
    */
  var TransitGatewayPolicyTableEntries: js.UndefOr[TransitGatewayPolicyTableEntryList] = js.undefined
}
object GetTransitGatewayPolicyTableEntriesResult {
  
  inline def apply(): GetTransitGatewayPolicyTableEntriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayPolicyTableEntriesResult]
  }
  
  extension [Self <: GetTransitGatewayPolicyTableEntriesResult](x: Self) {
    
    inline def setTransitGatewayPolicyTableEntries(value: TransitGatewayPolicyTableEntryList): Self = StObject.set(x, "TransitGatewayPolicyTableEntries", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPolicyTableEntriesUndefined: Self = StObject.set(x, "TransitGatewayPolicyTableEntries", js.undefined)
    
    inline def setTransitGatewayPolicyTableEntriesVarargs(value: TransitGatewayPolicyTableEntry*): Self = StObject.set(x, "TransitGatewayPolicyTableEntries", js.Array(value*))
  }
}
