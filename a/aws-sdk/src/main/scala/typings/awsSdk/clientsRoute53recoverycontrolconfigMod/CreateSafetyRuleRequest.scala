package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSafetyRuleRequest extends StObject {
  
  /**
    * The assertion rule requested.
    */
  var AssertionRule: js.UndefOr[NewAssertionRule] = js.undefined
  
  /**
    * A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an action, specify a client token in the request.
    */
  var ClientToken: js.UndefOr[stringMin1Max64PatternS] = js.undefined
  
  /**
    * The gating rule requested.
    */
  var GatingRule: js.UndefOr[NewGatingRule] = js.undefined
  
  /**
    * The tags associated with the safety rule.
    */
  var Tags: js.UndefOr[mapOfStringMin0Max256PatternS] = js.undefined
}
object CreateSafetyRuleRequest {
  
  inline def apply(): CreateSafetyRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSafetyRuleRequest]
  }
  
  extension [Self <: CreateSafetyRuleRequest](x: Self) {
    
    inline def setAssertionRule(value: NewAssertionRule): Self = StObject.set(x, "AssertionRule", value.asInstanceOf[js.Any])
    
    inline def setAssertionRuleUndefined: Self = StObject.set(x, "AssertionRule", js.undefined)
    
    inline def setClientToken(value: stringMin1Max64PatternS): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setGatingRule(value: NewGatingRule): Self = StObject.set(x, "GatingRule", value.asInstanceOf[js.Any])
    
    inline def setGatingRuleUndefined: Self = StObject.set(x, "GatingRule", js.undefined)
    
    inline def setTags(value: mapOfStringMin0Max256PatternS): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
