package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableInsightRulesInput extends StObject {
  
  /**
    * An array of the rule names to enable. If you need to find out the names of your rules, use DescribeInsightRules.
    */
  var RuleNames: InsightRuleNames
}
object EnableInsightRulesInput {
  
  inline def apply(RuleNames: InsightRuleNames): EnableInsightRulesInput = {
    val __obj = js.Dynamic.literal(RuleNames = RuleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableInsightRulesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableInsightRulesInput] (val x: Self) extends AnyVal {
    
    inline def setRuleNames(value: InsightRuleNames): Self = StObject.set(x, "RuleNames", value.asInstanceOf[js.Any])
    
    inline def setRuleNamesVarargs(value: InsightRuleName*): Self = StObject.set(x, "RuleNames", js.Array(value*))
  }
}
