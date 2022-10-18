package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReceiptRuleRequest extends StObject {
  
  /**
    * A data structure that contains the updated receipt rule information.
    */
  var Rule: ReceiptRule
  
  /**
    * The name of the receipt rule set that the receipt rule belongs to.
    */
  var RuleSetName: ReceiptRuleSetName
}
object UpdateReceiptRuleRequest {
  
  inline def apply(Rule: ReceiptRule, RuleSetName: ReceiptRuleSetName): UpdateReceiptRuleRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReceiptRuleRequest]
  }
  
  extension [Self <: UpdateReceiptRuleRequest](x: Self) {
    
    inline def setRule(value: ReceiptRule): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    inline def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
  }
}
