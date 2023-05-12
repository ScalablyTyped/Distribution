package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRuleRequest extends StObject {
  
  /**
    * A list of actions to be run when the rule is triggered.
    */
  var Actions: RuleActions
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see Making retries safe with idempotent APIs.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsConnectMod.ClientToken] = js.undefined
  
  /**
    * The conditions of the rule.
    */
  var Function: RuleFunction
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * A unique name for the rule.
    */
  var Name: RuleName
  
  /**
    * The publish status of the rule.
    */
  var PublishStatus: RulePublishStatus
  
  /**
    * The event source to trigger the rule.
    */
  var TriggerEventSource: RuleTriggerEventSource
}
object CreateRuleRequest {
  
  inline def apply(
    Actions: RuleActions,
    Function: RuleFunction,
    InstanceId: InstanceId,
    Name: RuleName,
    PublishStatus: RulePublishStatus,
    TriggerEventSource: RuleTriggerEventSource
  ): CreateRuleRequest = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PublishStatus = PublishStatus.asInstanceOf[js.Any], TriggerEventSource = TriggerEventSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setActions(value: RuleActions): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: RuleAction*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setFunction(value: RuleFunction): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: RuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPublishStatus(value: RulePublishStatus): Self = StObject.set(x, "PublishStatus", value.asInstanceOf[js.Any])
    
    inline def setTriggerEventSource(value: RuleTriggerEventSource): Self = StObject.set(x, "TriggerEventSource", value.asInstanceOf[js.Any])
  }
}
