package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSipRuleResponse extends StObject {
  
  /**
    * The SIP rule details.
    */
  var SipRule: js.UndefOr[typings.awsSdk.chimeMod.SipRule] = js.undefined
}
object GetSipRuleResponse {
  
  inline def apply(): GetSipRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSipRuleResponse]
  }
  
  extension [Self <: GetSipRuleResponse](x: Self) {
    
    inline def setSipRule(value: SipRule): Self = StObject.set(x, "SipRule", value.asInstanceOf[js.Any])
    
    inline def setSipRuleUndefined: Self = StObject.set(x, "SipRule", js.undefined)
  }
}
