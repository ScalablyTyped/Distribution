package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSafetyRuleRequest extends StObject {
  
  /**
    * The assertion rule to update.
    */
  var AssertionRuleUpdate: js.UndefOr[typings.awsSdk.clientsRoute53recoverycontrolconfigMod.AssertionRuleUpdate] = js.undefined
  
  /**
    * The gating rule to update.
    */
  var GatingRuleUpdate: js.UndefOr[typings.awsSdk.clientsRoute53recoverycontrolconfigMod.GatingRuleUpdate] = js.undefined
}
object UpdateSafetyRuleRequest {
  
  inline def apply(): UpdateSafetyRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSafetyRuleRequest]
  }
  
  extension [Self <: UpdateSafetyRuleRequest](x: Self) {
    
    inline def setAssertionRuleUpdate(value: AssertionRuleUpdate): Self = StObject.set(x, "AssertionRuleUpdate", value.asInstanceOf[js.Any])
    
    inline def setAssertionRuleUpdateUndefined: Self = StObject.set(x, "AssertionRuleUpdate", js.undefined)
    
    inline def setGatingRuleUpdate(value: GatingRuleUpdate): Self = StObject.set(x, "GatingRuleUpdate", value.asInstanceOf[js.Any])
    
    inline def setGatingRuleUpdateUndefined: Self = StObject.set(x, "GatingRuleUpdate", js.undefined)
  }
}
