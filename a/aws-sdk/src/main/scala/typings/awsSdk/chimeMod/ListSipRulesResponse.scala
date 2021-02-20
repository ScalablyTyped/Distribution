package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSipRulesResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.native
  
  /**
    * List of SIP rules and rule details.
    */
  var SipRules: js.UndefOr[SipRuleList] = js.native
}
object ListSipRulesResponse {
  
  @scala.inline
  def apply(): ListSipRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSipRulesResponse]
  }
  
  @scala.inline
  implicit class ListSipRulesResponseMutableBuilder[Self <: ListSipRulesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSipRules(value: SipRuleList): Self = StObject.set(x, "SipRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipRulesUndefined: Self = StObject.set(x, "SipRules", js.undefined)
    
    @scala.inline
    def setSipRulesVarargs(value: SipRule*): Self = StObject.set(x, "SipRules", js.Array(value :_*))
  }
}
