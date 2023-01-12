package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRuleInput extends StObject {
  
  /**
    * The actions.
    */
  var Actions: typings.awsSdk.clientsElbv2Mod.Actions
  
  /**
    * The conditions.
    */
  var Conditions: RuleConditionList
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: typings.awsSdk.clientsElbv2Mod.ListenerArn
  
  /**
    * The rule priority. A listener can't have multiple rules with the same priority.
    */
  var Priority: RulePriority
  
  /**
    * The tags to assign to the rule.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateRuleInput {
  
  inline def apply(Actions: Actions, Conditions: RuleConditionList, ListenerArn: ListenerArn, Priority: RulePriority): CreateRuleInput = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Conditions = Conditions.asInstanceOf[js.Any], ListenerArn = ListenerArn.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRuleInput] (val x: Self) extends AnyVal {
    
    inline def setActions(value: Actions): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setConditions(value: RuleConditionList): Self = StObject.set(x, "Conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: RuleCondition*): Self = StObject.set(x, "Conditions", js.Array(value*))
    
    inline def setListenerArn(value: ListenerArn): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: RulePriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
