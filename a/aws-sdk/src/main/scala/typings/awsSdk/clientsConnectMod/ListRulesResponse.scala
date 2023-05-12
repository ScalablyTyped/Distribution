package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRulesResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * Summary information about a rule.
    */
  var RuleSummaryList: typings.awsSdk.clientsConnectMod.RuleSummaryList
}
object ListRulesResponse {
  
  inline def apply(RuleSummaryList: RuleSummaryList): ListRulesResponse = {
    val __obj = js.Dynamic.literal(RuleSummaryList = RuleSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRulesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRulesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRuleSummaryList(value: RuleSummaryList): Self = StObject.set(x, "RuleSummaryList", value.asInstanceOf[js.Any])
    
    inline def setRuleSummaryListVarargs(value: RuleSummary*): Self = StObject.set(x, "RuleSummaryList", js.Array(value*))
  }
}
