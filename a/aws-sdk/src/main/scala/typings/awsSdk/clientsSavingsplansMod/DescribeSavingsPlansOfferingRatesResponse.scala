package typings.awsSdk.clientsSavingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSavingsPlansOfferingRatesResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about the Savings Plans offering rates.
    */
  var searchResults: js.UndefOr[SavingsPlanOfferingRatesList] = js.undefined
}
object DescribeSavingsPlansOfferingRatesResponse {
  
  inline def apply(): DescribeSavingsPlansOfferingRatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlansOfferingRatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSavingsPlansOfferingRatesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSearchResults(value: SavingsPlanOfferingRatesList): Self = StObject.set(x, "searchResults", value.asInstanceOf[js.Any])
    
    inline def setSearchResultsUndefined: Self = StObject.set(x, "searchResults", js.undefined)
    
    inline def setSearchResultsVarargs(value: SavingsPlanOfferingRate*): Self = StObject.set(x, "searchResults", js.Array(value*))
  }
}
