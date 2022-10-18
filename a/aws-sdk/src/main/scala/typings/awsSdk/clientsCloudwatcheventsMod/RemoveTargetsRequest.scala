package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTargetsRequest extends StObject {
  
  /**
    * The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[EventBusNameOrArn] = js.undefined
  
  /**
    * If this is a managed rule, created by an Amazon Web Services service on your behalf, you must specify Force as True to remove targets. This parameter is ignored for rules that are not managed rules. You can check whether a rule is a managed rule by using DescribeRule or ListRules and checking the ManagedBy field of the response.
    */
  var Force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of the targets to remove from the rule.
    */
  var Ids: TargetIdList
  
  /**
    * The name of the rule.
    */
  var Rule: RuleName
}
object RemoveTargetsRequest {
  
  inline def apply(Ids: TargetIdList, Rule: RuleName): RemoveTargetsRequest = {
    val __obj = js.Dynamic.literal(Ids = Ids.asInstanceOf[js.Any], Rule = Rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTargetsRequest]
  }
  
  extension [Self <: RemoveTargetsRequest](x: Self) {
    
    inline def setEventBusName(value: EventBusNameOrArn): Self = StObject.set(x, "EventBusName", value.asInstanceOf[js.Any])
    
    inline def setEventBusNameUndefined: Self = StObject.set(x, "EventBusName", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    inline def setIds(value: TargetIdList): Self = StObject.set(x, "Ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: TargetId*): Self = StObject.set(x, "Ids", js.Array(value*))
    
    inline def setRule(value: RuleName): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
  }
}
