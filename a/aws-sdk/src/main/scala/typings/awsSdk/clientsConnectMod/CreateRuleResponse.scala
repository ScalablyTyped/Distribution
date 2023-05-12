package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRuleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: ARN
  
  /**
    * A unique identifier for the rule.
    */
  var RuleId: typings.awsSdk.clientsConnectMod.RuleId
}
object CreateRuleResponse {
  
  inline def apply(RuleArn: ARN, RuleId: RuleId): CreateRuleResponse = {
    val __obj = js.Dynamic.literal(RuleArn = RuleArn.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setRuleArn(value: ARN): Self = StObject.set(x, "RuleArn", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: RuleId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
  }
}
