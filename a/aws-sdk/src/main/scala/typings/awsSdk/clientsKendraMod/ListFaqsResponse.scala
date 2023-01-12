package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFaqsResponse extends StObject {
  
  /**
    * information about the FAQs associated with the specified index.
    */
  var FaqSummaryItems: js.UndefOr[typings.awsSdk.clientsKendraMod.FaqSummaryItems] = js.undefined
  
  /**
    * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to retrieve the next set of FAQs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKendraMod.NextToken] = js.undefined
}
object ListFaqsResponse {
  
  inline def apply(): ListFaqsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFaqsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFaqsResponse] (val x: Self) extends AnyVal {
    
    inline def setFaqSummaryItems(value: FaqSummaryItems): Self = StObject.set(x, "FaqSummaryItems", value.asInstanceOf[js.Any])
    
    inline def setFaqSummaryItemsUndefined: Self = StObject.set(x, "FaqSummaryItems", js.undefined)
    
    inline def setFaqSummaryItemsVarargs(value: FaqSummary*): Self = StObject.set(x, "FaqSummaryItems", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
