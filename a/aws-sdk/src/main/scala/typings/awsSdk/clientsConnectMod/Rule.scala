package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  /**
    * A list of actions to be run when the rule is triggered.
    */
  var Actions: RuleActions
  
  /**
    * The timestamp for when the rule was created.
    */
  var CreatedTime: js.Date
  
  /**
    * The conditions of the rule.
    */
  var Function: RuleFunction
  
  /**
    * The Amazon Resource Name (ARN) of the user who last updated the rule.
    */
  var LastUpdatedBy: ARN
  
  /**
    * The timestamp for the when the rule was last updated.
    */
  var LastUpdatedTime: js.Date
  
  /**
    * The name of the rule.
    */
  var Name: RuleName
  
  /**
    * The publish status of the rule.
    */
  var PublishStatus: RulePublishStatus
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: ARN
  
  /**
    * A unique identifier for the rule.
    */
  var RuleId: typings.awsSdk.clientsConnectMod.RuleId
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The event source to trigger the rule.
    */
  var TriggerEventSource: RuleTriggerEventSource
}
object Rule {
  
  inline def apply(
    Actions: RuleActions,
    CreatedTime: js.Date,
    Function: RuleFunction,
    LastUpdatedBy: ARN,
    LastUpdatedTime: js.Date,
    Name: RuleName,
    PublishStatus: RulePublishStatus,
    RuleArn: ARN,
    RuleId: RuleId,
    TriggerEventSource: RuleTriggerEventSource
  ): Rule = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], LastUpdatedBy = LastUpdatedBy.asInstanceOf[js.Any], LastUpdatedTime = LastUpdatedTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PublishStatus = PublishStatus.asInstanceOf[js.Any], RuleArn = RuleArn.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any], TriggerEventSource = TriggerEventSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    inline def setActions(value: RuleActions): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: RuleAction*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: RuleFunction): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedBy(value: ARN): Self = StObject.set(x, "LastUpdatedBy", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: RuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPublishStatus(value: RulePublishStatus): Self = StObject.set(x, "PublishStatus", value.asInstanceOf[js.Any])
    
    inline def setRuleArn(value: ARN): Self = StObject.set(x, "RuleArn", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: RuleId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTriggerEventSource(value: RuleTriggerEventSource): Self = StObject.set(x, "TriggerEventSource", value.asInstanceOf[js.Any])
  }
}
