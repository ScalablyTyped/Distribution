package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSipRulesResponse extends StObject {
  
  /**
    * The token used to return the next page of results.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
  
  /**
    * The list of SIP rules and details.
    */
  var SipRules: js.UndefOr[SipRuleList] = js.undefined
}
object ListSipRulesResponse {
  
  inline def apply(): ListSipRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSipRulesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSipRulesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSipRules(value: SipRuleList): Self = StObject.set(x, "SipRules", value.asInstanceOf[js.Any])
    
    inline def setSipRulesUndefined: Self = StObject.set(x, "SipRules", js.undefined)
    
    inline def setSipRulesVarargs(value: SipRule*): Self = StObject.set(x, "SipRules", js.Array(value*))
  }
}
