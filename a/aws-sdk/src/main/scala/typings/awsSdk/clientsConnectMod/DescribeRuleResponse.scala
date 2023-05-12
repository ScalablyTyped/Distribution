package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRuleResponse extends StObject {
  
  /**
    * Information about the rule.
    */
  var Rule: typings.awsSdk.clientsConnectMod.Rule
}
object DescribeRuleResponse {
  
  inline def apply(Rule: Rule): DescribeRuleResponse = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setRule(value: Rule): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
  }
}
