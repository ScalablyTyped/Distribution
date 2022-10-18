package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleResult extends StObject {
  
  /**
    * The outcomes of the matched rule, based on the rule execution mode.
    */
  var outcomes: js.UndefOr[ListOfStrings] = js.undefined
  
  /**
    * The rule ID that was matched, based on the rule execution mode.
    */
  var ruleId: js.UndefOr[String] = js.undefined
}
object RuleResult {
  
  inline def apply(): RuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleResult]
  }
  
  extension [Self <: RuleResult](x: Self) {
    
    inline def setOutcomes(value: ListOfStrings): Self = StObject.set(x, "outcomes", value.asInstanceOf[js.Any])
    
    inline def setOutcomesUndefined: Self = StObject.set(x, "outcomes", js.undefined)
    
    inline def setOutcomesVarargs(value: String*): Self = StObject.set(x, "outcomes", js.Array(value*))
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
  }
}
