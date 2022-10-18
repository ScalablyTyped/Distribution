package typings.awsSdk.clientsRbinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRulesResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsRbinMod.NextToken] = js.undefined
  
  /**
    * Information about the retention rules.
    */
  var Rules: js.UndefOr[RuleSummaryList] = js.undefined
}
object ListRulesResponse {
  
  inline def apply(): ListRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRulesResponse]
  }
  
  extension [Self <: ListRulesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRules(value: RuleSummaryList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: RuleSummary*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
