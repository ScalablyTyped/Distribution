package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRuleRequest extends StObject {
  
  /**
    * A description of the rule.
    */
  var Description: js.UndefOr[RuleDescription] = js.undefined
  
  /**
    * The name or ARN of the event bus to associate with this rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[EventBusNameOrArn] = js.undefined
  
  /**
    * The event pattern. For more information, see Events and Event Patterns in the Amazon EventBridge User Guide.
    */
  var EventPattern: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.EventPattern] = js.undefined
  
  /**
    * The name of the rule that you are creating or updating.
    */
  var Name: RuleName
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the rule. If you're setting an event bus in another account as the target and that account granted permission to your account through an organization instead of directly by the account ID, you must specify a RoleArn with proper permissions in the Target structure, instead of here in this parameter.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.RoleArn] = js.undefined
  
  /**
    * The scheduling expression. For example, "cron(0 20 * * ? *)" or "rate(5 minutes)".
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.ScheduleExpression] = js.undefined
  
  /**
    * Indicates whether the rule is enabled or disabled.
    */
  var State: js.UndefOr[RuleState] = js.undefined
  
  /**
    * The list of key-value pairs to associate with the rule.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object PutRuleRequest {
  
  inline def apply(Name: RuleName): PutRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRuleRequest]
  }
  
  extension [Self <: PutRuleRequest](x: Self) {
    
    inline def setDescription(value: RuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventBusName(value: EventBusNameOrArn): Self = StObject.set(x, "EventBusName", value.asInstanceOf[js.Any])
    
    inline def setEventBusNameUndefined: Self = StObject.set(x, "EventBusName", js.undefined)
    
    inline def setEventPattern(value: EventPattern): Self = StObject.set(x, "EventPattern", value.asInstanceOf[js.Any])
    
    inline def setEventPatternUndefined: Self = StObject.set(x, "EventPattern", js.undefined)
    
    inline def setName(value: RuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpressionUndefined: Self = StObject.set(x, "ScheduleExpression", js.undefined)
    
    inline def setState(value: RuleState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
