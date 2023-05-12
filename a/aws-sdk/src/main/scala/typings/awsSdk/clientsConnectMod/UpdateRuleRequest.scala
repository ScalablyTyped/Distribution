package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRuleRequest extends StObject {
  
  /**
    * A list of actions to be run when the rule is triggered.
    */
  var Actions: RuleActions
  
  /**
    * The conditions of the rule.
    */
  var Function: RuleFunction
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The name of the rule. You can change the name only if TriggerEventSource is one of the following values: OnZendeskTicketCreate | OnZendeskTicketStatusUpdate | OnSalesforceCaseCreate 
    */
  var Name: RuleName
  
  /**
    * The publish status of the rule.
    */
  var PublishStatus: RulePublishStatus
  
  /**
    * A unique identifier for the rule.
    */
  var RuleId: typings.awsSdk.clientsConnectMod.RuleId
}
object UpdateRuleRequest {
  
  inline def apply(
    Actions: RuleActions,
    Function: RuleFunction,
    InstanceId: InstanceId,
    Name: RuleName,
    PublishStatus: RulePublishStatus,
    RuleId: RuleId
  ): UpdateRuleRequest = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PublishStatus = PublishStatus.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setActions(value: RuleActions): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: RuleAction*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setFunction(value: RuleFunction): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: RuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPublishStatus(value: RulePublishStatus): Self = StObject.set(x, "PublishStatus", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: RuleId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
  }
}
