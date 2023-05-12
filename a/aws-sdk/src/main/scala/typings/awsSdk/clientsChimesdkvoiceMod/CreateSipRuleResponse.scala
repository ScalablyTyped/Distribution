package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSipRuleResponse extends StObject {
  
  /**
    * The SIP rule information, including the rule ID, triggers, and target applications.
    */
  var SipRule: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.SipRule] = js.undefined
}
object CreateSipRuleResponse {
  
  inline def apply(): CreateSipRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSipRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSipRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setSipRule(value: SipRule): Self = StObject.set(x, "SipRule", value.asInstanceOf[js.Any])
    
    inline def setSipRuleUndefined: Self = StObject.set(x, "SipRule", js.undefined)
  }
}
