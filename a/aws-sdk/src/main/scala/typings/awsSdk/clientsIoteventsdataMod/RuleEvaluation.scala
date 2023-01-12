package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleEvaluation extends StObject {
  
  /**
    * Information needed to compare two values with a comparison operator.
    */
  var simpleRuleEvaluation: js.UndefOr[SimpleRuleEvaluation] = js.undefined
}
object RuleEvaluation {
  
  inline def apply(): RuleEvaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleEvaluation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleEvaluation] (val x: Self) extends AnyVal {
    
    inline def setSimpleRuleEvaluation(value: SimpleRuleEvaluation): Self = StObject.set(x, "simpleRuleEvaluation", value.asInstanceOf[js.Any])
    
    inline def setSimpleRuleEvaluationUndefined: Self = StObject.set(x, "simpleRuleEvaluation", js.undefined)
  }
}
