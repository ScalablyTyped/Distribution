package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSafetyRuleResponse extends StObject {
  
  /**
    * The assertion rule updated.
    */
  var AssertionRule: js.UndefOr[typings.awsSdk.clientsRoute53recoverycontrolconfigMod.AssertionRule] = js.undefined
  
  /**
    * The gating rule updated.
    */
  var GatingRule: js.UndefOr[typings.awsSdk.clientsRoute53recoverycontrolconfigMod.GatingRule] = js.undefined
}
object UpdateSafetyRuleResponse {
  
  inline def apply(): UpdateSafetyRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSafetyRuleResponse]
  }
  
  extension [Self <: UpdateSafetyRuleResponse](x: Self) {
    
    inline def setAssertionRule(value: AssertionRule): Self = StObject.set(x, "AssertionRule", value.asInstanceOf[js.Any])
    
    inline def setAssertionRuleUndefined: Self = StObject.set(x, "AssertionRule", js.undefined)
    
    inline def setGatingRule(value: GatingRule): Self = StObject.set(x, "GatingRule", value.asInstanceOf[js.Any])
    
    inline def setGatingRuleUndefined: Self = StObject.set(x, "GatingRule", js.undefined)
  }
}
