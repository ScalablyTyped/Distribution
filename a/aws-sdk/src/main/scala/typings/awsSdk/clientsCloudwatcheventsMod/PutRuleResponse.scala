package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRuleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.RuleArn] = js.undefined
}
object PutRuleResponse {
  
  inline def apply(): PutRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRuleResponse]
  }
  
  extension [Self <: PutRuleResponse](x: Self) {
    
    inline def setRuleArn(value: RuleArn): Self = StObject.set(x, "RuleArn", value.asInstanceOf[js.Any])
    
    inline def setRuleArnUndefined: Self = StObject.set(x, "RuleArn", js.undefined)
  }
}
