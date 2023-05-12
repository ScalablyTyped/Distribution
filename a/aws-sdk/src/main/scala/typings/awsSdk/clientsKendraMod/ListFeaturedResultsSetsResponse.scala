package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFeaturedResultsSetsResponse extends StObject {
  
  /**
    * An array of summary information for one or more featured results sets.
    */
  var FeaturedResultsSetSummaryItems: js.UndefOr[typings.awsSdk.clientsKendraMod.FeaturedResultsSetSummaryItems] = js.undefined
  
  /**
    * If the response is truncated, Amazon Kendra returns a pagination token in the response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKendraMod.NextToken] = js.undefined
}
object ListFeaturedResultsSetsResponse {
  
  inline def apply(): ListFeaturedResultsSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFeaturedResultsSetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFeaturedResultsSetsResponse] (val x: Self) extends AnyVal {
    
    inline def setFeaturedResultsSetSummaryItems(value: FeaturedResultsSetSummaryItems): Self = StObject.set(x, "FeaturedResultsSetSummaryItems", value.asInstanceOf[js.Any])
    
    inline def setFeaturedResultsSetSummaryItemsUndefined: Self = StObject.set(x, "FeaturedResultsSetSummaryItems", js.undefined)
    
    inline def setFeaturedResultsSetSummaryItemsVarargs(value: FeaturedResultsSetSummary*): Self = StObject.set(x, "FeaturedResultsSetSummaryItems", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
