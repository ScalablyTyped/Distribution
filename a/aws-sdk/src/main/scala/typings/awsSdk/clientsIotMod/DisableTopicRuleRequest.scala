package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableTopicRuleRequest extends StObject {
  
  /**
    * The name of the rule to disable.
    */
  var ruleName: RuleName
}
object DisableTopicRuleRequest {
  
  inline def apply(ruleName: RuleName): DisableTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableTopicRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableTopicRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setRuleName(value: RuleName): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
