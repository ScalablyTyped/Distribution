package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetsByRuleRequest extends StObject {
  
  /**
    * The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[EventBusNameOrArn] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.NextToken] = js.undefined
  
  /**
    * The name of the rule.
    */
  var Rule: RuleName
}
object ListTargetsByRuleRequest {
  
  inline def apply(Rule: RuleName): ListTargetsByRuleRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTargetsByRuleRequest]
  }
  
  extension [Self <: ListTargetsByRuleRequest](x: Self) {
    
    inline def setEventBusName(value: EventBusNameOrArn): Self = StObject.set(x, "EventBusName", value.asInstanceOf[js.Any])
    
    inline def setEventBusNameUndefined: Self = StObject.set(x, "EventBusName", js.undefined)
    
    inline def setLimit(value: LimitMax100): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRule(value: RuleName): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
  }
}
