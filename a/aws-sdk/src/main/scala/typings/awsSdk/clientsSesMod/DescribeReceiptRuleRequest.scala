package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReceiptRuleRequest extends StObject {
  
  /**
    * The name of the receipt rule.
    */
  var RuleName: ReceiptRuleName
  
  /**
    * The name of the receipt rule set that the receipt rule belongs to.
    */
  var RuleSetName: ReceiptRuleSetName
}
object DescribeReceiptRuleRequest {
  
  inline def apply(RuleName: ReceiptRuleName, RuleSetName: ReceiptRuleSetName): DescribeReceiptRuleRequest = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReceiptRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReceiptRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setRuleName(value: ReceiptRuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    inline def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
  }
}
