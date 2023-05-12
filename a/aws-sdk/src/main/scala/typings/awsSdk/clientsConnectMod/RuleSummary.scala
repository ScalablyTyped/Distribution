package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleSummary extends StObject {
  
  /**
    * A list of ActionTypes associated with a rule. 
    */
  var ActionSummaries: typings.awsSdk.clientsConnectMod.ActionSummaries
  
  /**
    * The timestamp for when the rule was created. 
    */
  var CreatedTime: js.Date
  
  /**
    * The name of the event source.
    */
  var EventSourceName: typings.awsSdk.clientsConnectMod.EventSourceName
  
  /**
    * The timestamp for when the rule was last updated.
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
}
object RuleSummary {
  
  inline def apply(
    ActionSummaries: ActionSummaries,
    CreatedTime: js.Date,
    EventSourceName: EventSourceName,
    LastUpdatedTime: js.Date,
    Name: RuleName,
    PublishStatus: RulePublishStatus,
    RuleArn: ARN,
    RuleId: RuleId
  ): RuleSummary = {
    val __obj = js.Dynamic.literal(ActionSummaries = ActionSummaries.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], EventSourceName = EventSourceName.asInstanceOf[js.Any], LastUpdatedTime = LastUpdatedTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PublishStatus = PublishStatus.asInstanceOf[js.Any], RuleArn = RuleArn.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleSummary] (val x: Self) extends AnyVal {
    
    inline def setActionSummaries(value: ActionSummaries): Self = StObject.set(x, "ActionSummaries", value.asInstanceOf[js.Any])
    
    inline def setActionSummariesVarargs(value: ActionSummary*): Self = StObject.set(x, "ActionSummaries", js.Array(value*))
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setEventSourceName(value: EventSourceName): Self = StObject.set(x, "EventSourceName", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: RuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPublishStatus(value: RulePublishStatus): Self = StObject.set(x, "PublishStatus", value.asInstanceOf[js.Any])
    
    inline def setRuleArn(value: ARN): Self = StObject.set(x, "RuleArn", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: RuleId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
  }
}
