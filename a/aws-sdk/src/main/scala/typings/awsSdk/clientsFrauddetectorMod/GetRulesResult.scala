package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRulesResult extends StObject {
  
  /**
    * The next page token to be used in subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The details of the requested rule.
    */
  var ruleDetails: js.UndefOr[RuleDetailList] = js.undefined
}
object GetRulesResult {
  
  inline def apply(): GetRulesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRulesResult]
  }
  
  extension [Self <: GetRulesResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRuleDetails(value: RuleDetailList): Self = StObject.set(x, "ruleDetails", value.asInstanceOf[js.Any])
    
    inline def setRuleDetailsUndefined: Self = StObject.set(x, "ruleDetails", js.undefined)
    
    inline def setRuleDetailsVarargs(value: RuleDetail*): Self = StObject.set(x, "ruleDetails", js.Array(value*))
  }
}
