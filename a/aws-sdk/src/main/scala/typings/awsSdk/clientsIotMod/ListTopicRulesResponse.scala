package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTopicRulesResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The rules.
    */
  var rules: js.UndefOr[TopicRuleList] = js.undefined
}
object ListTopicRulesResponse {
  
  inline def apply(): ListTopicRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicRulesResponse]
  }
  
  extension [Self <: ListTopicRulesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRules(value: TopicRuleList): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: TopicRuleListItem*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
