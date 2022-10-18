package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRuleInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: typings.awsSdk.clientsElbv2Mod.RuleArn
}
object DeleteRuleInput {
  
  inline def apply(RuleArn: RuleArn): DeleteRuleInput = {
    val __obj = js.Dynamic.literal(RuleArn = RuleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRuleInput]
  }
  
  extension [Self <: DeleteRuleInput](x: Self) {
    
    inline def setRuleArn(value: RuleArn): Self = StObject.set(x, "RuleArn", value.asInstanceOf[js.Any])
  }
}
