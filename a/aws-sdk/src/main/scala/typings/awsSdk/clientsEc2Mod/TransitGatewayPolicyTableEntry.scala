package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayPolicyTableEntry extends StObject {
  
  /**
    * The policy rule associated with the transit gateway policy table.
    */
  var PolicyRule: js.UndefOr[TransitGatewayPolicyRule] = js.undefined
  
  /**
    * The rule number for the transit gateway policy table entry.
    */
  var PolicyRuleNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the target route table.
    */
  var TargetRouteTableId: js.UndefOr[TransitGatewayRouteTableId] = js.undefined
}
object TransitGatewayPolicyTableEntry {
  
  inline def apply(): TransitGatewayPolicyTableEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayPolicyTableEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitGatewayPolicyTableEntry] (val x: Self) extends AnyVal {
    
    inline def setPolicyRule(value: TransitGatewayPolicyRule): Self = StObject.set(x, "PolicyRule", value.asInstanceOf[js.Any])
    
    inline def setPolicyRuleNumber(value: String): Self = StObject.set(x, "PolicyRuleNumber", value.asInstanceOf[js.Any])
    
    inline def setPolicyRuleNumberUndefined: Self = StObject.set(x, "PolicyRuleNumber", js.undefined)
    
    inline def setPolicyRuleUndefined: Self = StObject.set(x, "PolicyRule", js.undefined)
    
    inline def setTargetRouteTableId(value: TransitGatewayRouteTableId): Self = StObject.set(x, "TargetRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setTargetRouteTableIdUndefined: Self = StObject.set(x, "TargetRouteTableId", js.undefined)
  }
}
