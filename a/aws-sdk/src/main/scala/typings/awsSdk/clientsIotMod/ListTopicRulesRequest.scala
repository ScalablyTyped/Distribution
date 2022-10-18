package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTopicRulesRequest extends StObject {
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[TopicRuleMaxResults] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
  
  /**
    * The topic.
    */
  var topic: js.UndefOr[Topic] = js.undefined
}
object ListTopicRulesRequest {
  
  inline def apply(): ListTopicRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicRulesRequest]
  }
  
  extension [Self <: ListTopicRulesRequest](x: Self) {
    
    inline def setMaxResults(value: TopicRuleMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRuleDisabled(value: IsDisabled): Self = StObject.set(x, "ruleDisabled", value.asInstanceOf[js.Any])
    
    inline def setRuleDisabledUndefined: Self = StObject.set(x, "ruleDisabled", js.undefined)
    
    inline def setTopic(value: Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
