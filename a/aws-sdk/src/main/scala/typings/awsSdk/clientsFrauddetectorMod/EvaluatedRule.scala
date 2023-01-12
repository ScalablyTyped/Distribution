package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluatedRule extends StObject {
  
  /**
    *  Indicates whether the rule was evaluated. 
    */
  var evaluated: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The rule expression. 
    */
  var expression: js.UndefOr[sensitiveString] = js.undefined
  
  /**
    *  The rule expression value. 
    */
  var expressionWithValues: js.UndefOr[sensitiveString] = js.undefined
  
  /**
    *  Indicates whether the rule matched. 
    */
  var matched: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The rule outcome. 
    */
  var outcomes: js.UndefOr[ListOfStrings] = js.undefined
  
  /**
    *  The rule ID. 
    */
  var ruleId: js.UndefOr[identifier] = js.undefined
  
  /**
    *  The rule version. 
    */
  var ruleVersion: js.UndefOr[wholeNumberVersionString] = js.undefined
}
object EvaluatedRule {
  
  inline def apply(): EvaluatedRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluatedRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluatedRule] (val x: Self) extends AnyVal {
    
    inline def setEvaluated(value: Boolean): Self = StObject.set(x, "evaluated", value.asInstanceOf[js.Any])
    
    inline def setEvaluatedUndefined: Self = StObject.set(x, "evaluated", js.undefined)
    
    inline def setExpression(value: sensitiveString): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setExpressionWithValues(value: sensitiveString): Self = StObject.set(x, "expressionWithValues", value.asInstanceOf[js.Any])
    
    inline def setExpressionWithValuesUndefined: Self = StObject.set(x, "expressionWithValues", js.undefined)
    
    inline def setMatched(value: Boolean): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    
    inline def setMatchedUndefined: Self = StObject.set(x, "matched", js.undefined)
    
    inline def setOutcomes(value: ListOfStrings): Self = StObject.set(x, "outcomes", value.asInstanceOf[js.Any])
    
    inline def setOutcomesUndefined: Self = StObject.set(x, "outcomes", js.undefined)
    
    inline def setOutcomesVarargs(value: String*): Self = StObject.set(x, "outcomes", js.Array(value*))
    
    inline def setRuleId(value: identifier): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
    
    inline def setRuleVersion(value: wholeNumberVersionString): Self = StObject.set(x, "ruleVersion", value.asInstanceOf[js.Any])
    
    inline def setRuleVersionUndefined: Self = StObject.set(x, "ruleVersion", js.undefined)
  }
}
