package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReceiptRuleSetRequest extends StObject {
  
  /**
    * The name of the receipt rule set to describe.
    */
  var RuleSetName: ReceiptRuleSetName
}
object DescribeReceiptRuleSetRequest {
  
  inline def apply(RuleSetName: ReceiptRuleSetName): DescribeReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal(RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReceiptRuleSetRequest]
  }
  
  extension [Self <: DescribeReceiptRuleSetRequest](x: Self) {
    
    inline def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
  }
}
