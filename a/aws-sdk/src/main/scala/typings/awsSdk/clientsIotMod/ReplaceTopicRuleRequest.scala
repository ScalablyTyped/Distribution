package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceTopicRuleRequest extends StObject {
  
  /**
    * The name of the rule.
    */
  var ruleName: RuleName
  
  /**
    * The rule payload.
    */
  var topicRulePayload: TopicRulePayload
}
object ReplaceTopicRuleRequest {
  
  inline def apply(ruleName: RuleName, topicRulePayload: TopicRulePayload): ReplaceTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any], topicRulePayload = topicRulePayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceTopicRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplaceTopicRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setRuleName(value: RuleName): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    inline def setTopicRulePayload(value: TopicRulePayload): Self = StObject.set(x, "topicRulePayload", value.asInstanceOf[js.Any])
  }
}
