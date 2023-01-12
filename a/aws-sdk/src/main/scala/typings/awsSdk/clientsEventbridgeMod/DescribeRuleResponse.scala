package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRuleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var Arn: js.UndefOr[RuleArn] = js.undefined
  
  /**
    * The account ID of the user that created the rule. If you use PutRule to put a rule on an event bus in another account, the other account is the owner of the rule, and the rule ARN includes the account ID for that account. However, the value for CreatedBy is the account ID as the account that created the rule in the other account.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.CreatedBy] = js.undefined
  
  /**
    * The description of the rule.
    */
  var Description: js.UndefOr[RuleDescription] = js.undefined
  
  /**
    * The name of the event bus associated with the rule.
    */
  var EventBusName: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.EventBusName] = js.undefined
  
  /**
    * The event pattern. For more information, see Events and Event Patterns in the Amazon EventBridge User Guide.
    */
  var EventPattern: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.EventPattern] = js.undefined
  
  /**
    * If this is a managed rule, created by an Amazon Web Services service on your behalf, this field displays the principal name of the Amazon Web Services service that created the rule.
    */
  var ManagedBy: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ManagedBy] = js.undefined
  
  /**
    * The name of the rule.
    */
  var Name: js.UndefOr[RuleName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the rule.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.RoleArn] = js.undefined
  
  /**
    * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ScheduleExpression] = js.undefined
  
  /**
    * Specifies whether the rule is enabled or disabled.
    */
  var State: js.UndefOr[RuleState] = js.undefined
}
object DescribeRuleResponse {
  
  inline def apply(): DescribeRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: RuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setDescription(value: RuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventBusName(value: EventBusName): Self = StObject.set(x, "EventBusName", value.asInstanceOf[js.Any])
    
    inline def setEventBusNameUndefined: Self = StObject.set(x, "EventBusName", js.undefined)
    
    inline def setEventPattern(value: EventPattern): Self = StObject.set(x, "EventPattern", value.asInstanceOf[js.Any])
    
    inline def setEventPatternUndefined: Self = StObject.set(x, "EventPattern", js.undefined)
    
    inline def setManagedBy(value: ManagedBy): Self = StObject.set(x, "ManagedBy", value.asInstanceOf[js.Any])
    
    inline def setManagedByUndefined: Self = StObject.set(x, "ManagedBy", js.undefined)
    
    inline def setName(value: RuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpressionUndefined: Self = StObject.set(x, "ScheduleExpression", js.undefined)
    
    inline def setState(value: RuleState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
