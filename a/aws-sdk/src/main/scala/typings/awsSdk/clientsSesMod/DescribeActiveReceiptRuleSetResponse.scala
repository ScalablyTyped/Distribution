package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeActiveReceiptRuleSetResponse extends StObject {
  
  /**
    * The metadata for the currently active receipt rule set. The metadata consists of the rule set name and a timestamp of when the rule set was created.
    */
  var Metadata: js.UndefOr[ReceiptRuleSetMetadata] = js.undefined
  
  /**
    * The receipt rules that belong to the active rule set.
    */
  var Rules: js.UndefOr[ReceiptRulesList] = js.undefined
}
object DescribeActiveReceiptRuleSetResponse {
  
  inline def apply(): DescribeActiveReceiptRuleSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActiveReceiptRuleSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeActiveReceiptRuleSetResponse] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: ReceiptRuleSetMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setRules(value: ReceiptRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: ReceiptRule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
