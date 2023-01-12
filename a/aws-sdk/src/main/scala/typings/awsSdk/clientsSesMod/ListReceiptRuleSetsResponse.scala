package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReceiptRuleSetsResponse extends StObject {
  
  /**
    * A token indicating that there are additional receipt rule sets available to be listed. Pass this token to successive calls of ListReceiptRuleSets to retrieve up to 100 receipt rule sets at a time.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSesMod.NextToken] = js.undefined
  
  /**
    * The metadata for the currently active receipt rule set. The metadata consists of the rule set name and the timestamp of when the rule set was created.
    */
  var RuleSets: js.UndefOr[ReceiptRuleSetsLists] = js.undefined
}
object ListReceiptRuleSetsResponse {
  
  inline def apply(): ListReceiptRuleSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReceiptRuleSetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReceiptRuleSetsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRuleSets(value: ReceiptRuleSetsLists): Self = StObject.set(x, "RuleSets", value.asInstanceOf[js.Any])
    
    inline def setRuleSetsUndefined: Self = StObject.set(x, "RuleSets", js.undefined)
    
    inline def setRuleSetsVarargs(value: ReceiptRuleSetMetadata*): Self = StObject.set(x, "RuleSets", js.Array(value*))
  }
}
