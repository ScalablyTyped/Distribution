package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTopicRuleRequest extends StObject {
  
  /**
    * The name of the rule.
    */
  var ruleName: RuleName
}
object DeleteTopicRuleRequest {
  
  inline def apply(ruleName: RuleName): DeleteTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTopicRuleRequest]
  }
  
  extension [Self <: DeleteTopicRuleRequest](x: Self) {
    
    inline def setRuleName(value: RuleName): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
